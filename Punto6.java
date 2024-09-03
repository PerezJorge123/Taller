//Dada una matriz que representa las estanterías de un supermercado, donde cada celda contiene un objeto 
//Producto con atributos nombre, precio, disponibilidad (booleano), escribe un algoritmo que filtre y 
//devuelva una nueva matriz con solo los productos disponibles.

import java.util.Scanner;

public class Punto6 {

    String nombre = "";
    double precio = 0.0;
    boolean disponibilidad = false;
    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void EjecutarPunto6() {
        int x, y;
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto6[][] punto6 = new Punto6[x][y];
        Punto6[][] disponibles = new Punto6[x][y];
        Punto6 p6 = new Punto6();
        punto6 = p6.llenarMatriz(x, y);
        disponibles = p6.productosDisponibles(punto6);
        p6.mostrarMatriz(disponibles);

    }

    public Punto6[][] llenarMatriz(int x, int y) {
        Punto6[][] matriz = new Punto6[x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Punto6 p6 = new Punto6();
                System.out.println("ingrese el nombre del producto");
                p6.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                p6.setPrecio(sc.nextDouble());
                System.out.println("ingrese si esta disponible el producto (true/false):\"");
                p6.setDisponibilidad(sc.nextBoolean());

                matriz[i][j] = p6;
            }
        }
        return matriz;
    }

    public Punto6[][] productosDisponibles(Punto6[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto6[][] disponibles = new Punto6[x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isDisponibilidad()) {
                    disponibles[i][j] = matriz[i][j];
                }
            }
        }
        return disponibles;
    }

    public void mostrarMatriz (Punto6 [][] disponibles) {
        for (int i = 0; i < disponibles.length; i++) {
            for (int j = 0; j < disponibles.length; j++) {
                if (disponibles[i][j] != null) {
                    System.out.println("los productos disponibles son " + disponibles[i][j].getNombre());
                }
            }
        }
    }
}