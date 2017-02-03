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
        ArrayList<Personas> personas = new ArrayList();
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
                            opcion3 = JOptionPane.showInputDialog("Que Modelo desea agregar?\n"
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
                            if (opcion3.equalsIgnoreCase("d")) {
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso: "));
                                double transmision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese transmision de 6 a 7 velocidades: "));
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (peso >= 1276 && peso <= 1376 && velocidad_maxima >= 175 && velocidad_maxima <= 180 && km_galon >= 50 && km_galon <= 55 && precio_venta >= 800000 && precio_venta <= 1000000) {
                                    carros.add(new Tramontana(peso, transmision, serie, fecha, color, marca_llantas, polarizado, velocidad_maxima, km_galon, precio_venta));
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                        }

                    }
                    if (opcion2.equals("b")) {//personas
                        String opcion4 = " ";
                        while (!opcion.equalsIgnoreCase("c")) {
                            opcion4 = JOptionPane.showInputDialog("Que tipo de persona desea Agregar:? \n"
                                    + "a. Empleados\n"
                                    + "b. Clientes\n"
                                    + "c. Salir!\n");
                            if (opcion4.equalsIgnoreCase("a")) {
                                String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                                double id = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su ID: "));
                                double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad: "));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
                                int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas: "));
                                personas.add(new Empleados(horas, new Clientes(), nombre, id, edad, altura, peso));
//                                Empleados nuevo_empleado=new Empleados(horas,new Clientes(),nombre,id,edad,altura,peso);

                            }
                            if (opcion4.equalsIgnoreCase("b")) {
                                String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                                double id = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su ID: "));
                                double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad: "));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
                                int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dinero que lleva: "));
                                personas.add(new Clientes(dinero, nombre, id, edad, altura, peso));
//                                Clientes nuevo_cliente=new Clientes(dinero,nombre,id,edad,altura,peso);

                            }
                        }
                    }
                }

            }
            if (opcion.equalsIgnoreCase("b")) {
                String opcion2 = " ";
                while (!opcion2.equals("c")) {
                    opcion2 = JOptionPane.showInputDialog("\n"
                            + "Que Desea Modificar?\n"
                            + "a. Carros\n"
                            + "b. Personas\n"
                            + "c. Salir\n");
                    if (opcion2.equalsIgnoreCase("a")) {//carros
                        String opcion3 = " ";
                        while (!opcion3.equals("e")) {
                            opcion3 = JOptionPane.showInputDialog("Que Modelo desea modificar?\n"
                                    + "a.Maybach\n"
                                    + "b.Morgan Aero 8\n"
                                    + "c.Fisker Automotive\n"
                                    + "d.Tramontana\n"
                                    + "e.Salir\n");
                            if (opcion3.equalsIgnoreCase("a")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Maybach) {
                                        p1 += carros.indexOf(t1) + " " + ((Maybach) t1) + "\n";
                                    }

                                }
                                JOptionPane.showMessageDialog(null, p1);
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
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
                                    if (carros.get(posicion) instanceof Maybach) {
                                        ((Maybach) carros.get(posicion)).setLlantas_respuesto(llantas_respuesto);
                                        ((Maybach) carros.get(posicion)).setSerie(serie);
                                        ((Maybach) carros.get(posicion)).setFecha(fecha);
                                        ((Maybach) carros.get(posicion)).setColor(color);
                                        ((Maybach) carros.get(posicion)).setMarca_llantas(marca_llantas);
                                        ((Maybach) carros.get(posicion)).setPolarizado(polarizado);
                                        ((Maybach) carros.get(posicion)).setVelocidad_max(velocidad_maxima);
                                        ((Maybach) carros.get(posicion)).setKm_galon(km_galon);
                                        ((Maybach) carros.get(posicion)).setPrecio_venta(precio_venta);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }

                            }
                            if (opcion3.equalsIgnoreCase("b")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Morgan_Aero8) {
                                        p1 += carros.indexOf(t1) + " " + ((Morgan_Aero8) t1) + "\n";
                                    }

                                }
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
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
                                    if (carros.get(posicion) instanceof Morgan_Aero8) {
                                        ((Morgan_Aero8) carros.get(posicion)).setConvertible(convertible);
                                        ((Morgan_Aero8) carros.get(posicion)).setCabina(cabina);
                                        ((Morgan_Aero8) carros.get(posicion)).setSerie(serie);
                                        ((Morgan_Aero8) carros.get(posicion)).setFecha(fecha);
                                        ((Morgan_Aero8) carros.get(posicion)).setColor(color);
                                        ((Morgan_Aero8) carros.get(posicion)).setMarca_llantas(marca_llantas);
                                        ((Morgan_Aero8) carros.get(posicion)).setPolarizado(polarizado);
                                        ((Morgan_Aero8) carros.get(posicion)).setVelocidad_max(velocidad_maxima);
                                        ((Morgan_Aero8) carros.get(posicion)).setKm_galon(km_galon);
                                        ((Morgan_Aero8) carros.get(posicion)).setPrecio_venta(precio_venta);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                            if (opcion3.equalsIgnoreCase("c")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Fisker_Automotive) {
                                        p1 += carros.indexOf(t1) + " " + ((Fisker_Automotive) t1) + "\n";
                                    }

                                }
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
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
                                    if (carros.get(posicion) instanceof Fisker_Automotive) {
                                        ((Fisker_Automotive) carros.get(posicion)).setTipo(tipo);
                                        ((Fisker_Automotive) carros.get(posicion)).setConvertible(convertible);
                                        ((Fisker_Automotive) carros.get(posicion)).setSerie(serie);
                                        ((Fisker_Automotive) carros.get(posicion)).setFecha(fecha);
                                        ((Fisker_Automotive) carros.get(posicion)).setColor(color);
                                        ((Fisker_Automotive) carros.get(posicion)).setMarca_llantas(marca_llantas);
                                        ((Fisker_Automotive) carros.get(posicion)).setPolarizado(polarizado);
                                        ((Fisker_Automotive) carros.get(posicion)).setVelocidad_max(velocidad_maxima);
                                        ((Fisker_Automotive) carros.get(posicion)).setKm_galon(km_galon);
                                        ((Fisker_Automotive) carros.get(posicion)).setPrecio_venta(precio_venta);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                            if (opcion3.equalsIgnoreCase("d")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Tramontana) {
                                        p1 += carros.indexOf(t1) + " " + ((Tramontana) t1) + "\n";
                                    }

                                }
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso: "));
                                double transmision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese transmision de 6 a 7 velocidades: "));
                                int serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Serie: "));
                                Date fecha = new Date();
                                Color color = Color.BLUE;
                                String marca_llantas = JOptionPane.showInputDialog("Ingrese Marca de llantas: ");
                                String polarizado = JOptionPane.showInputDialog("Ingrese Si tiene o no polarizado[Si,No]: ");
                                double velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad maxima(km/hr): "));
                                double km_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese kilometros por galon(km/gal): "));
                                double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de venta: "));
                                if (peso >= 1276 && peso <= 1376 && velocidad_maxima >= 175 && velocidad_maxima <= 180 && km_galon >= 50 && km_galon <= 55 && precio_venta >= 800000 && precio_venta <= 1000000) {
                                    if (carros.get(posicion) instanceof Tramontana) {
                                        ((Tramontana) carros.get(posicion)).setPeso(peso);
                                        ((Tramontana) carros.get(posicion)).setTransmision(transmision);
                                        ((Tramontana) carros.get(posicion)).setSerie(serie);
                                        ((Tramontana) carros.get(posicion)).setFecha(fecha);
                                        ((Tramontana) carros.get(posicion)).setColor(color);
                                        ((Tramontana) carros.get(posicion)).setMarca_llantas(marca_llantas);
                                        ((Tramontana) carros.get(posicion)).setPolarizado(polarizado);
                                        ((Tramontana) carros.get(posicion)).setVelocidad_max(velocidad_maxima);
                                        ((Tramontana) carros.get(posicion)).setKm_galon(km_galon);
                                        ((Tramontana) carros.get(posicion)).setPrecio_venta(precio_venta);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No cumple algunos requisitos");
                                }
                            }
                        }
                    }
                    if (opcion2.equalsIgnoreCase("b")) {//personas
                        String opcion4 = " ";
                        while (!opcion.equalsIgnoreCase("c")) {
                            opcion4 = JOptionPane.showInputDialog("Que tipo de persona desea modificar:? \n"
                                    + "a. Empleados\n"
                                    + "b. Clientes\n"
                                    + "c. Salir!\n");
                            if (opcion4.equalsIgnoreCase("a")) {
                                String p1 = "";
                                for (Object t1 : personas) {
                                    if (t1 instanceof Empleados) {
                                        p1 += personas.indexOf(t1) + " " + ((Empleados) t1) + "\n";
                                    }

                                }
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                                String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                                double id = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su ID: "));
                                double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad: "));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
                                int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas: "));
                                if (personas.get(posicion) instanceof Empleados) {
                                    ((Empleados) personas.get(posicion)).setNombre(nombre);
                                    ((Empleados) personas.get(posicion)).setId(id);
                                    ((Empleados) personas.get(posicion)).setEdad(edad);
                                    ((Empleados) personas.get(posicion)).setAltura(altura);
                                    ((Empleados) personas.get(posicion)).setPeso(peso);
                                    ((Empleados) personas.get(posicion)).setHora_trabajadas(horas);

                                }

                            }
                            if (opcion4.equalsIgnoreCase("b")) {
                                String p1 = "";
                                for (Object t1 : personas) {
                                    if (t1 instanceof Clientes) {
                                        p1 += personas.indexOf(t1) + " " + ((Clientes) t1) + "\n";
                                    }

                                }
                                String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                                double id = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su ID: "));
                                double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad: "));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
                                int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dinero que lleva: "));
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                                if (personas.get(posicion) instanceof Clientes) {
                                    ((Clientes) personas.get(posicion)).setNombre(nombre);
                                    ((Clientes) personas.get(posicion)).setId(id);
                                    ((Clientes) personas.get(posicion)).setEdad(edad);
                                    ((Clientes) personas.get(posicion)).setAltura(altura);
                                    ((Clientes) personas.get(posicion)).setPeso(peso);
                                    ((Clientes) personas.get(posicion)).setDinero(dinero);
                                }
                            }
                        }
                    }
                }
            }
            if (opcion.equalsIgnoreCase("c")) {//eliminar
                String opcion2 = " ";
                while (!opcion2.equals("c")) {
                    opcion2 = JOptionPane.showInputDialog("\n"
                            + "Que Desea Eliminar?\n"
                            + "a. Carros\n"
                            + "b. Personas\n"
                            + "c. Salir\n");
                    if (opcion2.equalsIgnoreCase("a")) {//carros
                        String opcion3 = " ";
                        while (!opcion3.equals("e")) {
                            opcion3 = JOptionPane.showInputDialog("Que Modelo desea modificar?\n"
                                    + "a.Maybach\n"
                                    + "b.Morgan Aero 8\n"
                                    + "c.Fisker Automotive\n"
                                    + "d.Tramontana\n"
                                    + "e.Salir\n");
                            if (opcion3.equalsIgnoreCase("a")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Maybach) {
                                        p1 += carros.indexOf(t1) + " " + ((Maybach) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (carros.get(pos) instanceof Maybach) {
                                    carros.remove(pos);
                                }
                            }
                            if (opcion3.equalsIgnoreCase("b")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Morgan_Aero8) {
                                        p1 += carros.indexOf(t1) + " " + ((Morgan_Aero8) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (carros.get(pos) instanceof Morgan_Aero8) {
                                    carros.remove(pos);
                                }
                            }
                            if (opcion3.equalsIgnoreCase("c")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Fisker_Automotive) {
                                        p1 += carros.indexOf(t1) + " " + ((Fisker_Automotive) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (carros.get(pos) instanceof Fisker_Automotive) {
                                    carros.remove(pos);
                                }
                            }
                            if (opcion3.equalsIgnoreCase("d")) {
                                String p1 = "";
                                for (Object t1 : carros) {
                                    if (t1 instanceof Tramontana) {
                                        p1 += carros.indexOf(t1) + " " + ((Tramontana) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (carros.get(pos) instanceof Tramontana) {
                                    carros.remove(pos);
                                }
                            }
                        }
                    }
                    if (opcion2.equalsIgnoreCase("b")) {
                        String opcion4 = " ";
                        while (!opcion.equalsIgnoreCase("c")) {
                            opcion4 = JOptionPane.showInputDialog("Que tipo de persona desea modificar:? \n"
                                    + "a. Empleados\n"
                                    + "b. Clientes\n"
                                    + "c. Salir!\n");
                            if (opcion4.equalsIgnoreCase("a")) {
                                String p1 = "";
                                for (Object t1 : personas) {
                                    if (t1 instanceof Empleados) {
                                        p1 += personas.indexOf(t1) + " " + ((Empleados) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (personas.get(pos) instanceof Empleados) {
                                    personas.remove(pos);
                                }
                            }
                            if (opcion4.equalsIgnoreCase("b")) {
                                String p1 = "";
                                for (Object t1 : personas) {
                                    if (t1 instanceof Clientes) {
                                        p1 += personas.indexOf(t1) + " " + ((Clientes) t1) + "\n";
                                    }

                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                                if (personas.get(pos) instanceof Clientes) {
                                    personas.remove(pos);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
