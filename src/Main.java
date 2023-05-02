// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno(1, "Alan", "Tapia");
        Alumno alumno2 = new Alumno(2,"Alerto","Romero");

        System.out.println(alumno.mostrarNombre());
        System.out.println(alumno.nombre);

        alumno.setNombre("Nicolas");

        System.out.println(alumno.nombre);

        System.out.println(alumno2.mostrarNombre());





    }
}