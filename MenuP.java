import java.util.Scanner;

public class MenuP {
    public static void main(String[] args) {

        int opt;
        Scanner sc = new Scanner(System.in);
        Punto1 a = new Punto1();
        Punto2 b = new Punto2();
        Punto3 c = new Punto3();
        Punto4 d = new Punto4();
        System.out.println("ingrese la opcion que desea /n 1. buscar producto 2. sumar cantidades 3. precio mayor");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                a.EjecutarPunto1();
                break;
            case 2:
                b.EjecutarPunto2();
                break;
            case 3:
                c.EjecutarPunto3();
                break;
            case 4:
                d.EjecutarPunto4();
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}