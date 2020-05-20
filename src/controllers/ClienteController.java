/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modules.Cliente;

/**
 *
 * @author INTEL POWER USER
 */
public class ClienteController {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Cliente> clientesBusqueda;
    private ArrayList<Integer[]> datos;

    public ClienteController() {
        clientes = new ArrayList<>();
        clientesBusqueda = new ArrayList<>();
        datos = new ArrayList<>();
    }
    
    public DefaultTableModel datosTablaClienteBusqueda(DefaultTableModel modelo) {
        int i = 1;
        String [] datos = new String[15];
        Iterator iter = clientesBusqueda.iterator();
        while (iter.hasNext()) {
            Cliente temp = (Cliente) iter.next();
            datos[0] = " "+i;
            datos[1] = " "+temp.getNombre();
            datos[2] = " "+temp.getFech_nacimiento();
            datos[3] = " "+temp.getSocialSecurity();
            datos[4] = " "+temp.getTelefono();
            datos[5] = " "+temp.getDireccion();
            datos[6] = " "+temp.getCiudad();
            datos[7] = " "+temp.getEstado();
            datos[8] = " "+temp.getEstado_civil();
            datos[9] = " "+temp.getHijos();
            datos[10] = " "+temp.getTipo_estatus();
            datos[11] = " "+temp.getEmpleador();
            datos[12] = " "+temp.getMiembros();
            datos[13] = " "+temp.getMetodo();
            datos[14] = " "+temp.getNombre_banco();
            i++;
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    public DefaultTableModel datosTablaAtencionClienteBusqueda(DefaultTableModel modelo) {
        int i = 1;
        String [] datos = new String[12];
        Iterator iter = clientesBusqueda.iterator();
        while (iter.hasNext()) {
            Cliente temp = (Cliente) iter.next();
            datos[0] = " "+i;
            datos[1] = " "+temp.getNombre();
            datos[2] = " "+temp.getFech_nacimiento();
            datos[3] = " "+temp.getMercado_salud();
            datos[4] = " "+temp.getTelefono();
            datos[5] = " "+temp.getFecha_revision();
            datos[6] = " "+"REVISADO";
            datos[7] = " "+temp.getTipo_documentacion();
            datos[8] = " "+temp.getFecha_entrega();
            datos[9] = " "+"REVISADO";
            datos[10] = " "+temp.getFecha_enviado();
            datos[11] = " "+temp.getFecha_verificado();
            i++;
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    public DefaultTableModel datosTablaAtencionCliente(DefaultTableModel modelo) {
        int i = 1;
        String [] datos = new String[12];
        Iterator iter = clientes.iterator();
        while (iter.hasNext()) {
            Cliente temp = (Cliente) iter.next();
            datos[0] = " "+i;
            datos[1] = " "+temp.getNombre();
            datos[2] = " "+temp.getFech_nacimiento();
            datos[3] = " "+temp.getMercado_salud();
            datos[4] = " "+temp.getTelefono();
            datos[5] = " "+temp.getFecha_revision();
            datos[6] = " "+"REVISADO";
            datos[7] = " "+temp.getTipo_documentacion();
            datos[8] = " "+temp.getFecha_entrega();
            datos[9] = " "+"REVISADO";
            datos[10] = " "+temp.getFecha_enviado();
            datos[11] = " "+temp.getFecha_verificado();
            i++;
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    public DefaultTableModel datosTablaCliente(DefaultTableModel modelo) {
        int i = 1;
        String [] datos = new String[15];
        Iterator iter = clientes.iterator();
        while (iter.hasNext()) {
            Cliente temp = (Cliente) iter.next();
            datos[0] = " "+i;
            datos[1] = " "+temp.getNombre();
            datos[2] = " "+temp.getFech_nacimiento();
            datos[3] = " "+temp.getSocialSecurity();
            datos[4] = " "+temp.getTelefono();
            datos[5] = " "+temp.getDireccion();
            datos[6] = " "+temp.getCiudad();
            datos[7] = " "+temp.getEstado();
            datos[8] = " "+temp.getEstado_civil();
            datos[9] = " "+temp.getHijos();
            datos[10] = " "+temp.getTipo_estatus();
            datos[11] = " "+temp.getEmpleador();
            datos[12] = " "+temp.getMiembros();
            datos[13] = " "+temp.getMetodo();
            datos[14] = " "+temp.getNombre_banco();
            i++;
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    public String generadorTextoPDF(Cliente cliente) {
        String texto = "";
        texto += "Nombre: " + cliente.getNombre() + "\n";
        texto += "Fecha de nacimiento: " + cliente.getFech_nacimiento()+ "\n";
        texto += "Sexo: " + cliente.getSexo()+ "\n";
        texto += "Telefono: " + cliente.getTelefono()+ "\n";
        texto += "Direccion: " + cliente.getDireccion()+ "\n";
        texto += "Ciudad: " + cliente.getCiudad()+ "\n";
        texto += "Estado: " + cliente.getEstado()+ "\n";
        texto += "Zip Code: " + cliente.getZip_code()+ "\n";
        texto += "Estado Civil: " + cliente.getEstado_civil()+ "\n";
        texto += "Cantidad de hijos: " + cliente.getHijos()+ "\n";
        return texto;
    }
    
    public void eliminarCliente(int index) {
        clientes.remove(index);
    }
    
    public void modificarCliente(Cliente cliente, int index) {
        clientes.remove(index);
        clientes.add(index, cliente);
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void guardar() throws IOException {
        guardarClientes();
    }
    
    public void cargar() throws IOException, FileNotFoundException, ClassNotFoundException {
        cargarClientes();
        cargarFederalPoverty();
    }
    
    public String hoy() {
        Calendar c = Calendar.getInstance();
        return c.get(c.MONTH) + "/" + c.get(c.DAY_OF_MONTH) + "/" + c.get(c.YEAR);
    }
    
    private void guardarClientes() throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
        out.writeObject(clientes);
        out.close();
    }

    private void cargarClientes() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("clientes.dat"));
        clientes = (ArrayList<Cliente>) in.readObject();
    }

    private void cargarFederalPoverty() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("federalpoverty.dat"));
        datos = (ArrayList<Integer[]>) in.readObject();
    }

    public void buscar(String criterio) {
        clientesBusqueda = new ArrayList<>();
        Iterator iter = clientes.iterator();
        while (iter.hasNext()) {
            Cliente temp = (Cliente) iter.next();
            if (temp.getNombre().toLowerCase().contains(criterio)
                    || temp.getFech_nacimiento().toLowerCase().contains(criterio)
                    || temp.getSocialSecurity().toLowerCase().contains(criterio)
                    || temp.getTelefono().toLowerCase().contains(criterio)
                    || temp.getDireccion().toLowerCase().contains(criterio)
                    || temp.getCiudad().toLowerCase().contains(criterio)
                    || temp.getEstado().toLowerCase().contains(criterio)
                    || temp.getZip_code().toLowerCase().contains(criterio)
                    || temp.getEstado_civil().toLowerCase().contains(criterio)
                    || temp.getHijos().toLowerCase().contains(criterio)
                    || temp.getTipo_estatus().toLowerCase().contains(criterio)
                    || temp.getAlien_number().toLowerCase().contains(criterio)
                    || temp.getCard_passport_number().toLowerCase().contains(criterio)
                    || temp.getCard_expires().toLowerCase().contains(criterio)
                    || temp.getCategoria().toLowerCase().contains(criterio)
                    || temp.getNaturalizacion().toLowerCase().contains(criterio)
                    || temp.getParol_number().toLowerCase().contains(criterio)
                    || temp.getEmpleador().toLowerCase().contains(criterio)
                    || temp.getE_telefono().toLowerCase().contains(criterio)
                    || temp.getMiembros().toLowerCase().contains(criterio)
                    || Integer.toString(temp.getIngresos()).toLowerCase().contains(criterio)
                    || temp.getMetodo().toLowerCase().contains(criterio)
                    || temp.getNombre_banco().toLowerCase().contains(criterio)
                    || temp.getNumero_ruta().toLowerCase().contains(criterio)
                    || temp.getNumero_cuenta().toLowerCase().contains(criterio)
                    || temp.getTipo_tarjeta().toLowerCase().contains(criterio)
                    || temp.getNombre_tarjeta().toLowerCase().contains(criterio)
                    || temp.getNumero_tarjeta().toLowerCase().contains(criterio)
                    || temp.getFecha_expira().toLowerCase().contains(criterio)
                    || temp.getCvc().toLowerCase().contains(criterio)
                    || temp.getMercado_salud().toLowerCase().contains(criterio)) {
                clientesBusqueda.add(temp);
            }
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Cliente> getClientesBusqueda() {
        return clientesBusqueda;
    }

    public ArrayList<Integer[]> getDatos() {
        return datos;
    }
}
