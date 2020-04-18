/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.modelo;

import java.util.Date;


public class Usuario {

    private int ID_Usuario;
    private String nameUser;
    private String pass;
    private String tipo_Usuario;
    private Date fecha_alta;
    private Date fecha_baja;
    
    public Usuario(String nameUser, String pass, String tipoUsuario, Date fecha_alta) {
        this.nameUser = nameUser;
        this.pass = pass;
        this.tipo_Usuario = tipoUsuario;
        this.fecha_alta=fecha_alta;
    }
    public Usuario() {
    }
    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }
    
    

    public int getID_Usuario() {
        return ID_Usuario;
    }

   
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRoll() {
        return tipo_Usuario;
    }

    public void setRoll(String roll) {
        this.tipo_Usuario = roll;
    }

    @Override
    public String toString() {
        return "Usuario{" + "ID_Usuario=" + ID_Usuario + ", nameUser=" + nameUser + ", pass=" + pass + ", tipo_Usuario=" + tipo_Usuario + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja + '}';
    }

    
    
}
