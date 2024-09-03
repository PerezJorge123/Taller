import java.util.Scanner;

public class MenuP {
    public static void main(String[] args) {

        int opt;
        Scanner sc = new Scanner(System.in);
        Punto1 a = new Punto1();
        Punto2 b = new Punto2();
        Punto3 c = new Punto3();
        Punto4 d = new Punto4();
        Punto5 e = new Punto5();
        Punto6 f = new Punto6();
        Punto7 g = new Punto7();
        //Punto8 h = new Punto8();
        Punto9 i = new Punto9();
        Punto10 j = new Punto10();
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
            case 5:
                e.EjecutarPunto5();
                break;
            case 6:
                f.EjecutarPunto6();
                break;
            case 7:
                g.EjecutarPunto7();
                break;
            case 8:
                //h.EjecutarPunto8();
                break;
            case 9:
                i.EjecutarPunto9();
                break;
            case 10:
                j.EjecutarPunto10();
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}