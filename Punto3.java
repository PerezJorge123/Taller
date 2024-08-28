//En una librería organizada como una matriz, cada celda contiene un objeto Libro con atributos 
//título, autor y precio. Escribe un algoritmo para encontrar el libro con el precio más alto.
import java.util.Scanner;

public class Punto3 {

    String titulo = "";
    String autor = "";
    double precio = 0.0;
    Scanner sc = new Scanner(System.in);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void EjecutarPunto3(){
        int cant = 0;
        System.out.println("ingrese la cantidad de registros ");
        cant = sc.nextInt();
        Punto3 [][] matriz = new Punto3[cant][cant];
        Punto3 p3 = new Punto3();
        double PrecioMayor = 0;
        matriz = p3.LlenarMatriz(cant);
        PrecioMayor = p3.PrecioMayor(matriz);
        System.out.println("el libro mas costoso es: " + PrecioMayor);
    }

    public Punto3 [][] LlenarMatriz (int cant){

        Punto3 [][] matriz = new Punto3[cant][cant];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Punto3 p3 = new Punto3();
                System.out.println("Ingrese titulo");
                p3.setTitulo(sc.next());
                System.out.println("Ingrese autor");
                p3.setAutor(sc.next());
                System.out.println("Ingrese precio");
                p3.setPrecio(sc.nextDouble());
                matriz [i][j] = p3;
            }
        }
        return matriz;
    }

    public double PrecioMayor(Punto3[][] matriz) {
        double mayorValor = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getPrecio() > mayorValor) {
                    mayorValor = matriz[i][j].getPrecio();
                }
            }
        }
        return mayorValor;
    }
}