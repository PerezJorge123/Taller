//Dada una lista de productos con atributos nombre, peso, categoría, llena una matriz que represente 
//las estanterías de un almacén. Cada producto debe ubicarse en la sección correspondiente según su categoría.
import java.util.Scanner;

public class Punto8 {
    String nombre;
    double peso;
    String categoría;
    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCategoría() {
        return categoría;
    }
    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Punto8 [] llenarVector (int x) {
        Punto8 [] v = new Punto8[x];
        for (int i = 0; i < v.length; i++) {
            Punto8 z = new Punto8();
            System.out.println("ingrese el nombre del producto");
            z.setNombre(sc.next());
            System.out.println("ingrese el peso del producto");
            z.setPeso(sc.nextDouble());
            System.out.println("ingrese la categoria del producto");
            z.setCategoría(sc.next());
        }
        return v;
    }

    public void leerVector (Punto8 [] v) {
        int contCategoria = 0;
        String [] b = new String[v.length];
        for (int i = 0; i < v.length; i++) {
            String categoria = v[i].getCategoría();
            boolean encontrado = false;

            for (int j = 0; j < b.length; j++) {
                if (b[j].equals(categoria)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                b[contCategoria] = categoria;
                contCategoria ++;
            }
        }
        for (int i = 0; i < v.length; i++) { // itera sobre cada fila
            Punto8 [] vector = new Punto8[v.length];
            int indice = 0;
            String categoria = v[i].getCategoría();

            for (int j = 0; j < v.length; j++) { 
                if (v[j].getCategoría().equals(categoria)) { // Comparar categorías
                    vector[indice] = v[j]; // Agregar al nuevo vector
                    indice++; // Incrementar el índice del nuevo vector
                }
            }
            Punto8 [][] matriz = new Punto8[contCategoria][];
            for (int k = 0; k < matriz.length; k++) {
                for (int l = 0; l < matriz[k].length; l++) {
                    matriz [k][l] = vector[l];
                }
            }
        }
    }
    public Punto8 [] categoriaA (Punto8 [] v) {
        int conteo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("A")) {
                conteo += 1;
            }
        }

        Punto8[] categoriaA = new Punto8[conteo];
        int index = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("A")) {
                categoriaA[index] = v[i];
                index ++;
            }
        }
        return categoriaA;
    }

    public Punto8 [] categoriaB (Punto8 [] v) {
        int conteo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("B")) {
                conteo += 1;
            }
        }

        Punto8[] categoriaB = new Punto8[conteo];
        int index = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("B")) {
                categoriaB[index] = v[i];
                index ++;
            }
        }
        return categoriaB;
    }

    public Punto8 [] categoriaC (Punto8 [] v) {
        int conteo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("C")) {
                conteo += 1;
            }
        }

        Punto8[] categoriaC = new Punto8[conteo];
        int index = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i].getCategoría().equals("C")) {
                categoriaC[index] = v[i];
                index ++;
            }
        }
        return categoriaC;
    }

    public Punto8 [][] llenarMatriz (Punto8 [] v) {
        Punto8[] categoriaA = categoriaA(v);
        Punto8[] categoriaB = categoriaB(v);
        Punto8[] categoriaC = categoriaC(v);
        int index = 0;
        Punto8 [][] matriz = new Punto8[3][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (index < categoriaA.length) {
                    matriz[i][j] = categoriaA[index];
                    index ++;
                }
            }
        }
        return matriz;
    }
}