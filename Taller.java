
//1) Dada una matriz que representa un almacén donde cada celda contiene un objeto Producto con atributos 
//nombre, precio y cantidad, escribe un algoritmo que encuentre la ubicación (fila, columna) de un producto 
//en una lista de 30 productos buscar específico por su nombre.
import java.util.Scanner;

public class Taller {
    String nombre;
    double precio;
    int cantidad;
    Scanner sc = new Scanner(System.in);

    public Taller () {
        nombre = "";
        precio = 0.0;
        cantidad = 0;
    }
    
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

    
    public Taller [][] llenarMo (int x, int y) {
        Taller [][] mo = new Taller[x][y];
        for (int i = 0; i < mo.length; i++) {
            for (int j = 0; j < mo[i].length; j++) {
                Taller z = new Taller();
                System.out.println("ingrese el nombre del producto");
                z.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                z.setPrecio(sc.nextDouble());
                System.out.println("ingrese la cantidad del producto");
                z.setCantidad(sc.nextInt());
                mo [i][j] = z;
            }    
        }
        return mo;
    }
    public void buscarProducto (Taller [][] mo) {
        String producto = "";
        System.out.println("ingrese el nombre del producto a buscar");
        producto = sc.next();
        for (int i = 0; i < mo.length; i++) {
            for (int j = 0; j < mo[i].length; j++) {
                if (mo [i][j].getNombre().equals(producto)) {
                    System.out.println("producto encontrado en la fila: " + i + "columna: " + j);
                    return;
                }
            }
        }
        System.out.println("el producto no fue encontrado");
    }
}
