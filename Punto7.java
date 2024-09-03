
//en una escuela, los estudiantes están organizados en una matriz, donde cada celda contiene un objeto 
//Estudiante con atributos nombre, calificación. Escribe un algoritmo que agrupe a los estudiantes en 
//diferentes matrices según su calificación (A, B, C, etc.).
import java.util.Scanner;

public class Punto7 {

    String nombre = "";
    double calificacion = 0.0;
    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void EjecutarPunto7() {
        int x, y;
        System.out.println("Ingrese la cantidad de filas que desea");
        x = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea");
        y = sc.nextInt();
        Punto7[][] punto7 = new Punto7[x][y];
        Punto7[][] grupos = new Punto7[x][y];
        Punto7 p7 = new Punto7();
        punto7 = p7.llenarMatriz(x, y);
        grupos = p7.grupoa(punto7);
        p7.mostrarMatriza(grupos);
        grupos = p7.grupob(punto7);
        p7.mostrarMatrizb(grupos);
        grupos = p7.grupoc(punto7);
        p7.mostrarMatrizc(grupos);
        grupos = p7.grupod(punto7);
        p7.mostrarMatrizd(grupos);
        grupos = p7.grupoe(punto7);
        p7.mostrarMatrize(grupos);


    }

    public Punto7[][] llenarMatriz(int x, int y) {
        Punto7[][] matriz = new Punto7[x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Punto7 p7 = new Punto7();
                System.out.println("ingrese el nombre del producto");
                p7.setNombre(sc.next());
                System.out.println("ingrese la calificación del estudiante");
                p7.setCalificacion(sc.nextDouble());

                matriz[i][j] = p7;
            }
        }
        return matriz;
    }

    public Punto7[][] grupoa (Punto7[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto7 [][] grupoa = new Punto7 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getCalificacion() > 3.9) {
                    grupoa [i][j] = matriz [i][j];
                }
            }
        }
        return grupoa;
    }

    public void mostrarMatriza (Punto7 [][] grupoa) {
        for (int i = 0; i < grupoa.length; i++) {
            for (int j = 0; j < grupoa.length; j++) {
                if (grupoa[i][j] != null) {
                    System.out.println("los estudiantes del grupo a son " + grupoa[i][j].getNombre());
                }
            }
        }
    }

    public Punto7[][] grupob (Punto7[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto7 [][] grupob = new Punto7 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getCalificacion() > 2.9) {
                    grupob [i][j] = matriz [i][j];
                }
            }
        }
        return grupob;
    }

    public void mostrarMatrizb (Punto7 [][] grupob) {
        for (int i = 0; i < grupob.length; i++) {
            for (int j = 0; j < grupob.length; j++) {
                if (grupob[i][j] != null) {
                    System.out.println("los estudiantes del grupo b son " + grupob[i][j].getNombre());
                }
            }
        }
    }

    public Punto7[][] grupoc (Punto7[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto7 [][] grupoc = new Punto7 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getCalificacion() > 1.9) {
                    grupoc [i][j] = matriz [i][j];
                }
            }
        }
        return grupoc;
    }

    public void mostrarMatrizc (Punto7 [][] grupoc) {
        for (int i = 0; i < grupoc.length; i++) {
            for (int j = 0; j < grupoc.length; j++) {
                if (grupoc[i][j] != null) {
                    System.out.println("los estudiantes del grupo c son " + grupoc[i][j].getNombre());
                }
            }
        }
    }

    public Punto7[][] grupod (Punto7[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto7 [][] grupod = new Punto7 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getCalificacion() > 0.9) {
                    grupod [i][j] = matriz [i][j];
                }
            }
        }
        return grupod;
    }

    public void mostrarMatrizd (Punto7 [][] grupod) {
        for (int i = 0; i < grupod.length; i++) {
            for (int j = 0; j < grupod.length; j++) {
                if (grupod[i][j] != null) {
                    System.out.println("los estudiantes del grupo d son " + grupod[i][j].getNombre());
                }
            }
        }
    }

    public Punto7[][] grupoe (Punto7[][] matriz) {
        int x = matriz.length;
        int y = matriz[0].length;
        Punto7 [][] grupoe = new Punto7 [x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].getCalificacion() > 0.0) {
                    grupoe [i][j] = matriz [i][j];
                }
            }
        }
        return grupoe;
    }

    public void mostrarMatrize (Punto7 [][] grupoe) {
        for (int i = 0; i < grupoe.length; i++) {
            for (int j = 0; j < grupoe.length; j++) {
                if (grupoe[i][j] != null) {
                    System.out.println("los estudiantes del grupo e son " + grupoe[i][j].getNombre());
                }
            }
        }
    }
}