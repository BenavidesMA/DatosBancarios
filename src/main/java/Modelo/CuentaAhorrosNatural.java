/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class CuentaAhorrosNatural extends CuentaAhorros {
    
    public CuentaAhorrosNatural(String nombre, String codigo, int saldo) {
        super(nombre, codigo, saldo);
    }
    
    @Override
    
    public String tipoCuenta(){
    String message = "Cuenta Natural";
    return message;
    }
}
