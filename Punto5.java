//Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. 
//Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. 
//Los productos que no son idénticos los debe agregar en la matriz resultante

import java.util.Scanner;

public class Punto5 {

    String nombre = "";
    double precio = 0.0;
    int stock = 0;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void EjecutarPunto5() {
        int x = 0;
        int y = 0;
        System.out.println("ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto5 [][] punto5Matriz1 = new Punto5[x][y];
        Punto5 [][] punto5Matriz2 = new Punto5[x][y];
        Punto5 p5 = new Punto5();
        punto5Matriz1 = p5.llenarMatriz1(x, y);
        punto5Matriz2 = p5.llenarMatriz2(x, y);
        p5.matrizResultante(punto5Matriz1, punto5Matriz2);

    } 

    public Punto5[][] llenarMatriz1(int x, int y) {
        Punto5[][] matriz1 = new Punto5[x][y];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                Punto5 p5 = new Punto5();
                System.out.println("ingrese el nombre del producto");
                p5.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                p5.setPrecio(sc.nextDouble());
                System.out.println("ingrese el stock del producto");
                p5.setStock(sc.nextInt());

                matriz1[i][j] = p5;
            }
        }
        return matriz1;
    }

    public Punto5[][] llenarMatriz2(int x, int y) {
        Punto5[][] matriz2 = new Punto5[x][y];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                Punto5 p5 = new Punto5();
                System.out.println("ingrese el nombre del producto");
                p5.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                p5.setPrecio(sc.nextDouble());
                System.out.println("ingrese el stock del producto");
                p5.setStock(sc.nextInt());

                matriz2[i][j] = p5;
            }
        }
        return matriz2;
    }

    public void matrizResultante(Punto5[][] matriz1, Punto5[][] matriz2) {
        Punto5[][] matriz3 = new Punto5[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j].setNombre(matriz1[i][j].getNombre());
                matriz3[i][j].setPrecio(matriz1[i][j].getPrecio());
                matriz3[i][j].setStock(matriz1[i][j].getStock());
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                String producto = "";
                boolean encontrado = false;
                producto = matriz2[i][j].getNombre();
                for (int k = 0; k < matriz3.length; k++) {
                    for (int l = 0; l < matriz3[i].length; l++) {
                        if (producto.equals(matriz3[k][l].getNombre())) {
                            matriz3[k][l].setStock(matriz3[k][l].getStock() + matriz2[i][j].getStock());
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) break;
                }
                if (!encontrado) {
                    boolean agregado = false;
                    for (int k = 0; k < matriz3.length; k++) {
                        for (int l = 0; l < matriz3[k].length; l++) {
                            if (matriz3[k][l].getNombre() == null) {
                                matriz3[k][l] = matriz2[i][j];
                                agregado = true;
                                break;
                            }
                        }
                        if (agregado) break;
                    }
                    if (!agregado) {
                        int nuevaFila = matriz3.length + 1;
                        int nuevaColumna = matriz3[0].length + 1;
                        Punto5[][] matrizRedimensionada = new Punto5[nuevaFila][nuevaColumna];
    
                        for (int k = 0; k < matriz3.length; k++) {
                            for (int l = 0; l < matriz3[k].length; l++) {
                                matrizRedimensionada[k][l] = matriz3[k][l];
                            }
                        }   
    
                        boolean añadido = false;
                        for (int k = 0; k < matriz3.length; k++) {
                            for (int l = 0; l < matriz3[k].length; l++) {
                                if (matriz3[k][l].getNombre() == null) {
                                    matriz3[k][l] = matriz2[i][j];
                                    añadido = true;
                                    break;
                                }
                            }
                            if (añadido) break;
                        }
                        matriz3 = matrizRedimensionada;
                    }
                }   
            }
        }
    }
}
