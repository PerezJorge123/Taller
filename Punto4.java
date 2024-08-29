//Dada una matriz que representa un teatro, donde cada celda contiene un objeto Asiento con atributos número, 
//fila, precio, implementa un algoritmo para ordenar los asientos dentro de cada fila según el precio en 
//orden ascendente.

import java.util.Scanner;

public class Punto4 {

    int numero = 0;
    int fila = 0;
    double precio = 0.0;
    Scanner sc = new Scanner(System.in);

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void EjecutarPunto4() {
        int x, y;
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto4[][] punto4 = new Punto4[x][y];
        Punto4 p4 = new Punto4();
        punto4 = p4.llenarMatriz(x, y);
        p4.ordenarAsientos(punto4);
        p4.mostrarMatriz(punto4);
    }

    public Punto4 [][] llenarMatriz (int x, int y) {
        Punto4 [][] matriz = new Punto4 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Punto4 p4 = new Punto4();
                System.out.println("Ingrese el número del asiento");
                p4.setNumero(sc.nextInt());
                System.out.println("Ingrese el número de la fila");
                p4.setFila(sc.nextInt());
                System.out.println("Ingrese el número del precio");
                p4.setPrecio(sc.nextDouble());
                matriz [i][j] = p4;
            }
        }
        return matriz;
    }

    public void ordenarAsientos(Punto4 matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                for (int k = 0; k < matriz[i].length - j - 1; k++) {
                    if (matriz[i][k].getPrecio() > matriz[i][k + 1].getPrecio()) {
                        Punto4 temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public void mostrarMatriz (Punto4 [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("el orden de los asientos segun precio " + matriz[i][j].getPrecio());
            }
            
        }
    }
}