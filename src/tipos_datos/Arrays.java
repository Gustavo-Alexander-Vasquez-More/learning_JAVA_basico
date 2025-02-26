package tipos_datos;

public class Arrays {
    public static void main(String[] args) {
        /*Lo inicializo diciendole que este array tendrá como máximo
        5 elementos y aunque no le asigne valores, JAVA ya me reservó en memoria esos 5 espacios.*/
       //Cada int ocupa 4 bytes (32 bits) en memoria, por lo que 5 elementos me estarian ocupando un total de 20 bytes ..
        int arrayEnteros[]=new int [5];
        //Dando valores en sus posiciones específicas:
        arrayEnteros[0]=1;
        arrayEnteros[1]=2;
        arrayEnteros[2]=3;
        arrayEnteros[3]=4;
        arrayEnteros[4]=5;

        for (int i = 0; i < arrayEnteros.length; i++) {
            //Recorremos el array
            System.out.println(arrayEnteros[i]);
        }
        //Otra forma de recorrerlos más legible:
        for (int i : arrayEnteros){
            System.out.println(i);
        }

        //Array de Strings

        String names[]={"Juan", "Matías", "Joaquin"};

        for (String name: names){
            System.out.println("Hola mi nombre es: "+name);
        }


    }
}
