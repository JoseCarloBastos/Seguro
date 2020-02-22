/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author INTEL POWER USER
 */
public class Cliente implements Serializable {
    
    //DATOS PERSONALES
    private String Nombre;
    private String fech_nacimiento;
    private String socialSecurity;
    private char sexo;
    private int edad;
    private String telefono;
    private String direccion;
    private String ciudad;
    private String estado;
    private String zip_code;
    private String estado_civil;
    private String hijos;
    
    //ESTATUS MIGRATORIO
    private String tipo_estatus;
    private String alien_number;
    private String card_passport_number;
    private String card_expires;
    private String categoria;
    private String naturalizacion;
    private String parol_number;
    
    //EMPLEADOR
    private String empleador;
    private String e_telefono;
    
    //TAXES
    private String miembros;
    private int ingresos;
    
    //METODO DE PAGO
    private String metodo;
    private String nombre_banco;
    private String numero_ruta;
    private String numero_cuenta;
    private String tipo_tarjeta;
    private String nombre_tarjeta;
    private String numero_tarjeta;
    private String fecha_expira;
    private String cvc;
    
    //OTROS
    private String mercado_salud;
    private String fecha_revision;
    private String tipo_documentacion;
    private String fecha_entrega;
    private String fecha_enviado;
    private String fecha_verificado;

    public Cliente() {
        this.edad = calcularEdad();
    }
    
    private int calcularEdad() {
        int edad = 0;
        
        Calendar hoy = Calendar.getInstance();
        int anno_actual = hoy.get(Calendar.YEAR);
        int mes_actual = hoy.get(Calendar.MONTH);
        int dia_actual = hoy.get(Calendar.DAY_OF_MONTH);
        
//        String [] fecha = fech_nacimiento.split("/");
        
//        
//        int mes = getMes();
//        int dia = getDia();
//        int anno = getAnno();
//        
//        if (anno_actual<anno) {
//            String temp = "1"+anno_actual;
//            anno_actual = Integer.parseInt(temp);
//            edad = anno_actual - anno;
//            if (mes_actual<mes) {
//                edad = edad - 1;
//            } else if(mes_actual==mes) {
//                if (dia_actual<dia) {
//                    edad = edad - 1;
//                }
//            }
//        } else {
//            edad = anno_actual - anno;
//        }
//        
        return edad;
    }

    public String getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getFecha_enviado() {
        return fecha_enviado;
    }

    public void setFecha_enviado(String fecha_enviado) {
        this.fecha_enviado = fecha_enviado;
    }

    public String getFecha_verificado() {
        return fecha_verificado;
    }

    public void setFecha_verificado(String fecha_verificado) {
        this.fecha_verificado = fecha_verificado;
    }

    public String getTipo_documentacion() {
        return tipo_documentacion;
    }

    public void setTipo_documentacion(String tipo_documentacion) {
        this.tipo_documentacion = tipo_documentacion;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMercado_salud() {
        return mercado_salud;
    }

    public void setMercado_salud(String mercado_salud) {
        this.mercado_salud = mercado_salud;
    }

    public String getFech_nacimiento() {
        return fech_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public String getHijos() {
        return hijos;
    }

    public String getTipo_estatus() {
        return tipo_estatus;
    }

    public String getAlien_number() {
        return alien_number;
    }

    public String getCard_passport_number() {
        return card_passport_number;
    }

    public String getCard_expires() {
        return card_expires;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNaturalizacion() {
        return naturalizacion;
    }

    public String getParol_number() {
        return parol_number;
    }

    public String getEmpleador() {
        return empleador;
    }

    public String getE_telefono() {
        return e_telefono;
    }

    public String getMiembros() {
        return miembros;
    }

    public int getIngresos() {
        return ingresos;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public String getNumero_ruta() {
        return numero_ruta;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public String getNombre_tarjeta() {
        return nombre_tarjeta;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public String getFecha_expira() {
        return fecha_expira;
    }

    public String getCvc() {
        return cvc;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFech_nacimiento(String fech_nacimiento) {
        this.fech_nacimiento = fech_nacimiento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public void setTipo_estatus(String tipo_estatus) {
        this.tipo_estatus = tipo_estatus;
    }

    public void setAlien_number(String alien_number) {
        this.alien_number = alien_number;
    }

    public void setCard_passport_number(String card_passport_number) {
        this.card_passport_number = card_passport_number;
    }

    public void setCard_expires(String card_expires) {
        this.card_expires = card_expires;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNaturalizacion(String naturalizacion) {
        this.naturalizacion = naturalizacion;
    }

    public void setParol_number(String parol_number) {
        this.parol_number = parol_number;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public void setE_telefono(String e_telefono) {
        this.e_telefono = e_telefono;
    }

    public void setMiembros(String miembros) {
        this.miembros = miembros;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }

    public void setNumero_ruta(String numero_ruta) {
        this.numero_ruta = numero_ruta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public void setNombre_tarjeta(String nombre_tarjeta) {
        this.nombre_tarjeta = nombre_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public void setFecha_expira(String fecha_expira) {
        this.fecha_expira = fecha_expira;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
    
    
}
