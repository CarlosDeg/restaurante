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
public class validaciones {
    public String Nombre;
    public String Apellidop;
    public String Apellidom;
    public String Correo;
    public String Contrasena;
    public  String Clave;
     public  String Telefono;

    public validaciones(String Nom, String Ap, String Apm, String Cor, String Con,String cla,String tel) {

        this.Nombre = Nom;
        this.Apellidop = Ap;
        this.Apellidom = Apm;
        this.Correo = Cor;
        this.Contrasena = Con;
        this.Clave=cla;
        this.Telefono=tel;
        
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }

    public String getApellidom() {
        return Apellidom;
    }

    public void setApellidom(String Apellidom) {
        this.Apellidom = Apellidom;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
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
    public String validar_ap(){
        
        
        String mensaje =" ";
        Pattern pat2= Pattern.compile("([a-z A-Z]{5,13}+[ ]?){1,3}$");  
         Matcher mat2=pat2.matcher(Apellidop);
        if(mat2.find()){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Apellidop.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
          
         return mensaje;
    }
     public String validar_am(){
         
             String mensaje=" ";
        Pattern pat3= Pattern.compile("([a-z A-Z]{5,13}+[ ]?){1,3}$");  
         Matcher mat3=pat3.matcher(Apellidom);
        if(mat3.find()){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Apellidom.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
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
     public String validar_pass()
     {
         String mensaje="";
        if(Contrasena.length()>=6||Contrasena.length()<=8){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Contrasena.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
        


         return mensaje;
     }
        
    public String validar_clave()
     {
         String mensaje="";
         
        if(Clave.length()>=4){
           mensaje="correcto";
        }else{
               mensaje="erroneo";            
        }
           if(Clave.equals("")){
            mensaje ="Los campos no pueden quedar vacios";
        }
    
     return mensaje;
}
    public String valtel(){
            
        
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
}
