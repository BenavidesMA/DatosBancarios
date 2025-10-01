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
                case 3:
                    realizarReembolso();
                    break;
                case 4:
                    realizarConsignacion();
                    break;
                case 5:
                    realizarRetiro();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }

        } while (opcion != 6);
         
       
        
    }
    
     public static void agregarCuenta(){
        
        String validacion = JOptionPane.showInputDialog("Elija una opcion: \n"
                + "1. Persona Natural\n"
                + "2. Persona Juridica\n"
        );
        while(true){
        if("1".equals(validacion)){
        String nombre;
        String codigo;
        
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta");
        codigo = JOptionPane.showInputDialog("Ingrese el numero de la cuenta");
        
        JOptionPane.showMessageDialog(null, "Agregando cuenta...");
        CuentaAhorrosNatural natural = new CuentaAhorrosNatural(nombre, codigo, 1500000);
        JOptionPane.showMessageDialog(null, "Se agregó la cuenta exitosamente");
        break;
        }if("2".equals(validacion)){
        String nombre;
        String codigo;
        int nit;
        
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa");
        nit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NIT de la empresa sin puntos ni comas"));
        codigo = JOptionPane.showInputDialog("Ingrese el numero de la cuenta");
        
        JOptionPane.showMessageDialog(null, "Agregando cuenta...");
        CuentaAhorrosEmpresarial empresa = new CuentaAhorrosEmpresarial(nombre, nit, codigo, 1500000);
        JOptionPane.showMessageDialog(null, "Se agregó la cuenta exitosamente");
        break;
        }else{
        JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }}
     
     }
     
    
}
