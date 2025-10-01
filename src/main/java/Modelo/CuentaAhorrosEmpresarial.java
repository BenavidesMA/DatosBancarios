/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class CuentaAhorrosEmpresarial extends CuentaAhorros{
    int nit;
    
    public CuentaAhorrosEmpresarial(String nombre, int nit, String codigo, int saldo) {
        super(nombre, codigo, saldo);
        this.nit = nit;
    }
    
}
