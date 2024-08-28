import java.util.Scanner;

public class MenuP {
    public static void main(String[] args) {

        int opt;
        Scanner sc = new Scanner(System.in);
        Punto1 u = new Punto1();
        Punto2 v = new Punto2();
        Punto3 z = new Punto3();
        System.out.println("ingrese la opcion que desea /n 1. buscar producto 2. sumar cantidades 3. precio mayor");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                u.EjecutarPunto1();
                break;
            case 2:
                v.EjecutarPunto2();
                break;
            case 3:
                z.EjecutarPunto3();
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}