
//Se tiene un matriz con n productos y se requiere saber cuántos productos están en oferta
import java.util.Scanner;

public class Punto10 {
    String producto = "";
    boolean oferta = false;
    Scanner sc = new Scanner(System.in);

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public void EjecutarPunto10 () {
        int x, y;
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto10 [][] punto10 = new Punto10[x][y];
        Punto10 [][] oferta = new Punto10[x][y];
        Punto10 p10 = new Punto10();
        punto10 = p10.productos(x, y);
        oferta = p10.enOferta(punto10);
        p10.mostrarMatrizO(oferta);
    }

    public Punto10 [][] productos (int x, int y) {
        Punto10 [][] matriz = new Punto10[x][y];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Punto10 a = new Punto10();
                System.out.println("ingrese el nombre del producto");
                a.setProducto(sc.next());
                System.out.println("ingrese si el producto esta en oferta: (true/false)");
                a.setOferta(sc.nextBoolean());

                matriz[i][j] = a;
            }
        }
        return matriz;
    }

    public Punto10 [][] enOferta (Punto10 [][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isOferta() == true) {
                    contador ++;
                }
            }
        }

        Punto10 [][] mo = new Punto10[contador][1];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isOferta() == true) {
                    mo [index][0] = matriz [i][j];
                    index ++;
                }
            }
        }
        return mo;
    }

    public void mostrarMatrizO(Punto10 [][] mo) {
        for (int i = 0; i < mo.length; i++) {
            for (int j = 0; j < mo[i].length; j++) {
                if (mo[i][j] != null) {
                    System.out.println("productos en oferta: " +mo[i][j].getProducto());
                }
            }
        }
    }
}