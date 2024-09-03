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

    public void EjecutarPunto8() {
        int x = 0;
        System.out.println("ingrese la cantidad de productos que desea");
        x = sc.nextInt();
        Punto8 [] vector = new Punto8[x];
        Punto8 u = new Punto8();
        vector = u.llenarVector(x);
        u.leerVector(vector);
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
            v[i] = z;
        }
        return v;
    }

    public void leerVector (Punto8 [] v) {
        int contCategoria = 0;
        String [] b = new String[v.length];
        for (int i = 0; i < v.length; i++) {
            String categoria = v[i].getCategoría();
            boolean encontrado = false;

            for (int j = 0; j < contCategoria; j++) {
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

        Punto8[][] matriz = new Punto8[contCategoria][v.length];
        int[] vector = new int[contCategoria];

        for (int i = 0; i < v.length; i++) {
            String categoria = v[i].getCategoría();
            int categoriaIndice = -1;
            for (int j = 0; j < contCategoria; j++) {
                if (b[j].equals(categoria)) {
                    categoriaIndice = j;
                    break;
                }
            }

            if (categoriaIndice != -1) {
                matriz[categoriaIndice][vector[categoriaIndice]] = v[i];
                vector[categoriaIndice]++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Categoría " + b[i] + ":");
            for (int j = 0; j < vector[i]; j++) {
                System.out.println(" - " + matriz[i][j].getNombre());
            }
        }
    }
}