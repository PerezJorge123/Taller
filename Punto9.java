
//Se tiene una matriz 5*12 la cual cada fila corresponde a cada vendedor y sus ventas en el año, 
//se requiere sumar por fila e identificar cuál de todos los vendedores vendió mas en el año y se 
//debe mostrar el nombre y valor de la venta 
import java.util.Scanner;

public class Punto9 {
    String vendedor;
    Scanner sc = new Scanner(System.in);

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void EjecutarPunto9() {
        Double[][] punto9 = new Double[5][12];
        Punto9 p9 = new Punto9();
        punto9 = p9.llenarMatriz();
        p9.ventaMayor(punto9);
    }

    public Double[][] llenarMatriz() {
        Double[][] matriz = new Double[5][12];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random() * 500 + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "--");
            }
            System.out.println();
        }
        return matriz;
    }

    public void ventaMayor(Double[][] matriz) {
        Punto9[] v = new Punto9[5];
        for (int i = 0; i < v.length; i++) {
            Punto9 vendedor = new Punto9();
            System.out.println("Ingresa el nombre vendedor " + (i + 1) + ":");
            vendedor.setVendedor(sc.next());

            v[i] = vendedor;
        }
        double ventaMayor = 0;
        int indexmayorVenta = 0;
        for (int i = 0; i < matriz.length; i++) {
            double sumador = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumador += matriz[i][j];
            }
            if (sumador > ventaMayor) {
                ventaMayor = sumador;
                indexmayorVenta = i;
            }
        }
        System.out.println("el nombre de quien vendio mas es " + v[indexmayorVenta].getVendedor());
        System.out.println("la mayor venta fue de " + ventaMayor);
    }
}
