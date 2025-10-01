/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class CuentaAhorros {
    String nombre;
    String codigo;
    int saldo;

    public CuentaAhorros(String nombre, String codigo, int saldo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public String tipoCuenta(){
    String message = "Cuenta";
    return message;
    }
}
