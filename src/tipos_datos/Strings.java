package tipos_datos;

public class Strings {
    public static void main(String[] args) {
        String texto="Hola Mundo";

        //PROPIEDADES:
        //length => Para calcular longitud de una cadena.
        System.out.println("La longitud del texto es: "+texto.length());

        //toLowerCase => Para convertir todo el texto a minúsculas.
        System.out.println(texto.toLowerCase());

        //toUpperCase => Para convertir todo en mayúsculas.
        System.out.println(texto.toUpperCase());
        //charAt() => Esto nos devuelve la letra segun la posicion que le indiquemos
        System.out.println("La letra en la posicion 9 es: "+texto.charAt(9));
        //for =>recorremos la cadena
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }



    }
}
