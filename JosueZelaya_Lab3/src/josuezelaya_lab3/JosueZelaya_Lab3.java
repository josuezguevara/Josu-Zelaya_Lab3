package josuezelaya_lab3;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JosueZelaya_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList();
        String opcion = " ";
        while (!opcion.equals("e")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar\n"
                    + "b- Modificar\n"
                    + "c- Eliminar\n"
                    + "d- Ventas\n"
                    + "e- Salir!\n");
            if (opcion.equalsIgnoreCase("a")) {
                String opcion2 = " ";
                while (!opcion2.equals("c")) {
                    opcion2 = JOptionPane.showInputDialog("\n"
                            + "Que Desea Agregar?\n"
                            + "a. Carros\n"
                            + "b. Personas\n"
                            + "c. Salir\n");
                    if (opcion2.equalsIgnoreCase("a")) {//carros
                        String opcion3 = " ";
                        while (!opcion3.equals("e")) {
                            opcion3 = JOptionPane.showInputDialog("Que Modelo desea?\n"
                                    + "a.Maybach\n"
                                    + "b.Morgan Aero 8\n"
                                    + "c.Fisker Automotive\n"
                                    + "d.Tramontana\n"
                                    + "e.Salir\n");
                            if (opcion3.equalsIgnoreCase("a")) {
                                int llantas_respuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de llantas de respuestos[1 o 2]: "));
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (velocidad_maxima >= 155 && velocidad_maxima <= 160 && km_galon >= 50 && km_galon <= 55 && precio_venta >= 400000 && precio_venta <= 600000) {
                                    carros.add(new Maybach(llantas_respuesto, serie, fecha, color, marca_llantas, polarizado, velocidad_maxima, km_galon, precio_venta));
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                            if (opcion3.equalsIgnoreCase("b")) {
                                String convertible = JOptionPane.showInputDialog("Ingrese si es convertible o no[si,no]: ");
                                String cabina = JOptionPane.showInputDialog("Ingrese si es cabina unica o doble: ");
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (velocidad_maxima >= 140 && velocidad_maxima <= 145 && km_galon >= 35 && km_galon <= 40 && precio_venta >= 500000 && precio_venta <= 700000) {
                                    carros.add(new Morgan_Aero8(convertible, cabina, serie, fecha, color, marca_llantas, polarizado, velocidad_maxima, km_galon, precio_venta));
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                            if (opcion3.equalsIgnoreCase("c")) {
                                String tipo = JOptionPane.showInputDialog("Ingrese si es camioneta o turismo: ");
                                String convertible = JOptionPane.showInputDialog("Ingrese si es convertible o no lo es[si,,no]: ");
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (velocidad_maxima >= 160 && velocidad_maxima <= 165 && km_galon >= 55 && km_galon <= 60 && precio_venta >= 450000 && precio_venta <= 650000) {
                                    carros.add(new Fisker_Automotive(tipo, convertible, serie, fecha, color, marca_llantas, polarizado, velocidad_maxima, km_galon, precio_venta));
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }

                            }
                            if (opcion3.equalsIgnoreCase("d")){
                                double peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso: "));
                                double transmision=Double.parseDouble(JOptionPane.showInputDialog("Ingrese transmision de 6 a 7 velocidades: "));
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (peso>=1276 && peso<=1376 && velocidad_maxima >= 175 && velocidad_maxima <= 180 && km_galon >= 50 && km_galon <= 55 && precio_venta >= 800000 && precio_venta <= 1000000){
                                    carros.add(new Tramontana(peso,transmision,serie, fecha, color, marca_llantas, polarizado, velocidad_maxima, km_galon, precio_venta));
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                        }

                    }
                    if (opcion2.equals("b")){//personas
                        String opcion4=" ";
//                        while ()
                    }
                }

            }
        }

    }

}
