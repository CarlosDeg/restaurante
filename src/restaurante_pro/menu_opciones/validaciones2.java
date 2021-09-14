/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante_pro.menu_opciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stikeroox
 */
public class validaciones2 {
    public String Hora;
    public String Fecha;
    public String Razon;
    public String Ciudad;
    public String Codigo;
    public String Produto;
    public String Cantidad;
    public String Precio;
    public String Stock;
    public String Nombre;
    public String Apellidop;
    public String Apellidom;
    public String Correo;
    public String Contrasena;
    public  String Clave;
     public  String Telefono;

    public validaciones2(String Hor, String Fec, String Raz, String Ciu, String Cod, String Pro, String Can, String Pre, String Sto, String Nom, String Ape, String Apem, String Cor, String Con, String Cla, String Tel) {
        this.Hora = Hor;
        this.Fecha = Fec;
        this.Razon = Raz;
        this.Ciudad = Ciu;
        this.Codigo = Cod;
        this.Produto = Pro;
        this.Cantidad = Can;
        this.Precio = Pre;
        this.Stock = Sto;
        this.Nombre = Nom;
        this.Apellidop = Ape;
        this.Apellidom = Apem;
        this.Correo = Cor;
        this.Contrasena = Con;
        this.Clave = Cla;
        this.Telefono = Tel;
    }

    public String getHora() {
        return Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getRazon() {
        return Razon;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getProduto() {
        return Produto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getStock() {
        return Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public String getApellidom() {
        return Apellidom;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getClave() {
        return Clave;
    }

    public String getTelefono() {
        return Telefono;
    }
       public String validar_nombre(){
          String mensaje=" ";
    Pattern pat1= Pattern.compile("([a-z A-Z]{5,13}+[ ]?){1,2}$");  
    Matcher mat1=pat1.matcher(Nombre);
       if(mat1.find ()){
          mensaje="correcto";
      }else{
            mensaje="erroneo";
           }
       if(Nombre.equals("")){
            mensaje = "Los campos no pueden quedar vacios";
          }
        return mensaje;
    }
  
  
  public String vali(){
            
        
            String mensaje=" ";
    Pattern pat7= Pattern.compile("[\\(]?[\\+]?(\\d{2}|\\d{3})[\\)]?[\\s]?((\\d{6}|\\d{8})|(\\d{3}[\\*\\.\\-\\s]){3}|(\\d{2}[\\*\\.\\-\\s]){4}|(\\d{4}[\\*\\.\\-\\s]){2})|\\d{8}|\\d{10}|\\d{10}"); 
         Matcher mat7=pat7.matcher(Telefono);
         
        if(mat7.find()){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Telefono.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
    
     return mensaje;

    }
    public String validar_hora()
     {
         String mensaje="";
         
        if(Hora.length()>=5){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Hora.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
    
     return mensaje;
}
        public String validar_dir(){
        String mensaje=" ";
         Pattern pat4= Pattern.compile("([a-z A-Z]{5,20}+[ ]?){1,7}$" );  
            Matcher mat4=pat4.matcher(Ciudad);
          if(mat4.find()){
         
           mensaje="correcto";
        }else{
            mensaje="erroneo ";            
        }
           if(Ciudad.equals(" ")){
            mensaje="campo vacio ";
        }
        
        return mensaje;
    }
    
   public String validar_correo(){
            String mensaje=" ";
    Pattern pat4 = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
         Matcher mat4=pat4.matcher(Correo);
        if(mat4.find()){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Correo.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
        return mensaje;
    }
    public String validar_fe()
     {
         String mensaje="";
        if(Fecha.length()>=10||Fecha.length()<=10){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Fecha.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
        
    return mensaje;
}
}
    
