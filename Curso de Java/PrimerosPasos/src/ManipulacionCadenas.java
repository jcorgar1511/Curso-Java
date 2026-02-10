public class ManipulacionCadenas {


        public static void main(String[] args) {
            
            String nombre="Juan";

            System.out.println("Mi nombre es de " + nombre.length() + "letras");

            System.out.println("La última letra de mi nombre es " + nombre.charAt(3));
            


            String frase="Hola esto es un texto de prueba";

            String subcadena=frase.substring(4, 7);

            System.out.println("Hoy " + subcadena + " mañana");



            String alumno1="David";
                                    // NO IGNORA mayus
            String alumno2="david";

            System.out.println(alumno1.equals(alumno2));
            // equalsIgnoreCase para que IGNORE mayus




        }
}
