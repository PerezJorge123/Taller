//Dada una matriz de objetos Producto en una tienda, donde cada Producto tiene un atributo cantidad, 
//escribe un algoritmo que sume todas las cantidades para determinar el inventario total de la tienda.

import java.util.Scanner;

public class Punto2 {
    String nombre;
    double precio;
    int cantidad;
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
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void EjecutarPunto2(){
        int x, y;
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto2[][] punto2 = new Punto2[x][y];
        Punto2 p2 = new Punto2();
        punto2 = p2.llenarMo(x, y);
        p2.sumarCantidades(punto2);
    }

    public Punto2 [][] llenarMo (int x, int y) {
        Punto2 [][] m2 = new Punto2[x][y];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                Punto2 z = new Punto2();
                System.out.println("ingrese el nombre del producto");
                z.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                z.setPrecio(sc.nextDouble());
                System.out.println("ingrese la cantidad del producto");
                z.setCantidad(sc.nextInt());
                m2 [i][j] = z;
            }    
        }
        return m2;
    }

    public void sumarCantidades(Punto2 [][] m2) {
        int sumador = 0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                sumador = sumador + m2[i][j].getCantidad();
            }
        }
        System.out.println("la cantidad total de la tienda es " + sumador);
    }
}