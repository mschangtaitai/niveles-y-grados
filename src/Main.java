import java.util.Scanner;

public class Main {
    private static String getMenu(){
        return "" +
                "Menu:\n" +
                "1. Agregar nivel\n" +
                "2. Agregar grado\n" +
                "3. Agregar estudiante\n" +
                "4. Ver grados en un nivel\n" +
                "5. Ver estudiantes en un grado\n" +
                "6. Salir";
    }

    public static void main (String[] args) {
        int n = 1;
        Colegio colegio = new Colegio("Colegio abc");
        boolean continuar = true;
        do {
            // Mostrar menu
            System.out.println(getMenu());

            // Leer del teclado
            System.out.println("Ingrese una opcion: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Ingrese un nombre para el nivel: ");
                    String nameNivel = input.next();
                    Nivel nivel = new Nivel(nameNivel);
                    colegio.addNivel(nivel);
                    break;
                case 2:
                    if (colegio.getNiveles().isEmpty()) {
                        System.out.println("No existen niveles para agregar grados...");
                    } else {
                    System.out.println("Ingrese un nombre para el grado: ");
                    String nameGrado = input.next();
                    Grado grado = new Grado(nameGrado);
                    System.out.println("A qué nivel desea agregar el grado?");
                    n = 1;
                    for (Nivel i : colegio.getNiveles()) {
                        System.out.println(n + ".) " + i.getName());
                        n++;
                    }
                    System.out.println("Ingrese una opcion: ");
                    int optionNivel = input.nextInt();
                    colegio.getNiveles().elementAt(optionNivel - 1).addGrado(grado);
                    }
                    break;
                case 3:
                    if (colegio.getNiveles().isEmpty()) {
                        System.out.println("No existen niveles para agregar estudiantes ...");
                    } else {
                        System.out.println("Ingrese un nombre para el estudiante: ");
                        String nameStud = input.next();
                        Estudiante estudiante = new Estudiante(nameStud);
                        System.out.println("En qué nivel se encuentra el grado del estudiante?");
                        n = 1;
                        for (Nivel i : colegio.getNiveles()) {
                            System.out.println(n + ".) " + i.getName());
                            n++;
                        }
                        System.out.println("Ingrese una opcion: ");
                        int optionNivelStu = input.nextInt();
                        if (colegio.getNiveles().elementAt(optionNivelStu - 1).getGrades().isEmpty()) {
                            System.out.println("No existen grados en este nivel");
                        } else {
                            System.out.println("A qué grado desea agregar al estudiante?");
                            n = 1;
                            for (Grado i : colegio.getNiveles().elementAt(optionNivelStu - 1).getGrades()) {
                                System.out.println(n + ".) " + i.getName());
                                n++;
                            }
                            System.out.println("Ingrese una opcion: ");
                            int optionGradoStu = input.nextInt();
                            colegio.getNiveles().elementAt(optionNivelStu - 1).getGrades().elementAt(optionGradoStu - 1).addStud(estudiante);
                        }
                    }
                    break;
                case 4:
                    if (colegio.getNiveles().isEmpty()) {
                        System.out.println("No existen niveles para ver grados ...");
                    } else {
                        System.out.println("De qué nivel desea ver los grados?");
                        n = 1;
                        for (Nivel i : colegio.getNiveles()) {
                            System.out.println(n + ".) " + i.getName());
                            n++;
                        }
                        System.out.println("Ingrese una opcion: ");
                        int verNivel = input.nextInt();
                        n = 1;
                        if (colegio.getNiveles().elementAt(verNivel - 1).getGrades().isEmpty()) {
                            System.out.println("No existen grados en este nivel");
                        } else {
                            System.out.println("Los grados son: ");
                            for (Grado i : colegio.getNiveles().elementAt(verNivel - 1).getGrades()) {
                                System.out.println(n + ".) " + i.getName());
                                n++;
                            }
                        }
                    }
                    break;
                case 5:
                    if (colegio.getNiveles().isEmpty()) {
                        System.out.println("No existen niveles para ver estudiantes ...");
                    } else {
                        System.out.println("De qué nivel desea ver el grado?");
                        n = 1;
                        for (Nivel i : colegio.getNiveles()) {
                            System.out.println(n + ".) " + i.getName());
                            n++;
                        }
                        System.out.println("Ingrese una opcion: ");
                        int getNivel = input.nextInt();
                        if (colegio.getNiveles().elementAt(getNivel - 1).getGrades().isEmpty()) {
                            System.out.println("No existen grados en este nivel");
                        } else {
                            System.out.println("De qué grado desea ver los estudiantes?");
                            n = 1;
                            for (Grado i : colegio.getNiveles().elementAt(getNivel - 1).getGrades()) {
                                System.out.println(n + ".) " + i.getName());
                                n++;
                            }
                            System.out.println("Ingrese una opcion: ");
                            int optionGrado = input.nextInt();
                            n = 1;
                            System.out.println("Los estudiantes en este grado son: 1");
                            for (Estudiante i : colegio.getNiveles().elementAt(getNivel - 1).getGrades().elementAt(optionGrado - 1).getStuds()) {
                                System.out.println(n + ".) " + i.getName());
                                n++;
                            }
                        }
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Esta opcion no es valida!");
                    break;
            }
            System.out.println("---------------------------------------");
        } while (continuar);
        System.out.println("Adios");
    }
}