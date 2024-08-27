import java.util.Scanner;

public class MenuP {
    public static void main(String[] args) {

        int x, y;
        int opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Taller[][] taller = new Taller[x][y];
        Taller u = new Taller();
        System.out.println("ingrese la opcion que desea 1. buscar producto");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                taller = u.llenarMo(x, y);
                u.buscarProducto(taller);
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}