/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;
import Modelo.CuentaAhorrosNatural;
import Modelo.CuentaAhorrosEmpresarial;

/**
 *
 * @author Miguel
 */
public class DatosBancarios {

    static String validacion;
    static CuentaAhorrosNatural natural;
    static CuentaAhorrosEmpresarial empresa;

    public static void main(String[] args) {
        System.out.println("Datos Bancarios");

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU BBVA\n"
                    + "1. Agregar Cuenta \n"
                    + "2. Cuenta Registrada \n"
                    + "3. Realizar Reembolso \n"
                    + "4. Realizar Consignacion \n"
                    + "5. Realizar Retiro \n"
                    + "6. Salir\n"
                    + "\nElija una opcion"
            ));

            switch (opcion) {
                case 1:
                    agregarCuenta();
                    break;
                case 2:
                    mostrarCuenta();
                    break;
                

            }

        } while (opcion != 6);

    }

    public static void agregarCuenta() {
        while (true) {
            validacion = JOptionPane.showInputDialog("Elija una opcion: \n"
                    + "1. Persona Natural\n"
                    + "2. Persona Juridica\n"
            );

            if ("1".equals(validacion)) {
                String nombre;
                String codigo;

                nombre = JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta");
                codigo = JOptionPane.showInputDialog("Ingrese el numero de la cuenta");

                JOptionPane.showMessageDialog(null, "Agregando cuenta...");
                natural = new CuentaAhorrosNatural(nombre, codigo, 1500000);
                JOptionPane.showMessageDialog(null, "Se agregó la cuenta exitosamente");
                break;
            }
            if ("2".equals(validacion)) {
                String nombre;
                String codigo;
                int nit;

                nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa");
                nit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NIT de la empresa sin puntos ni comas"));
                codigo = JOptionPane.showInputDialog("Ingrese el numero de la cuenta");

                JOptionPane.showMessageDialog(null, "Agregando cuenta...");
                empresa = new CuentaAhorrosEmpresarial(nombre, nit, codigo, 1500000);
                JOptionPane.showMessageDialog(null, "Se agregó la cuenta exitosamente");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        }

    }

    public static void mostrarCuenta() {
        if ("1".equals(validacion)) {
            String message = "Datos de la cuenta\n"
                    + "Tipo de Cuenta: " + natural.tipoCuenta() +"\n"
                    + "Titular: " + natural.getNombre() +"\n"
                    + "Codigo de la cuenta: " + natural.getCodigo() +"\n"
                    + "Saldo: " + natural.getSaldo();
            JOptionPane.showMessageDialog(null, message);
        }
        if ("2".equals(validacion)) {
            String message = "Datos de la cuenta\n"
                    + "Tipo de Cuenta: " + empresa.tipoCuenta() +"\n"
                    + "Empresa asociada: " + empresa.getNombre() +"\n"
                    + "NIT: " + empresa.getNit() +"\n"
                    + "Codigo de la cuenta: " + empresa.getCodigo() +"\n"
                    + "Saldo: " + empresa.getSaldo();
            JOptionPane.showMessageDialog(null, message);
        }if(validacion == null){
        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        }
        
        
    }

}
