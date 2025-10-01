/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
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
                    "Menu\n"
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
    
}
