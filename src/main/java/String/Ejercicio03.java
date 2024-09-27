package String;

public class Ejercicio03 {

    /*
        Escriba una aplicación que utilice la generación de números aleatorios para crear enunciados. Use cuatro arreglos
        de cadenas llamados articulo, sustantivo, verbo y preposición. Cree un oración seleccionando una palabra al azar
        de cada uno de los arreglos, en el siguiente orden: artículo, sustantivo, verbo, preposición, articulo y sustantivo.
        A medida que se elija cada palabra, concaténala con las palabras anteriores en el enunciado. Las palabras  deberán
        separarse mediante espacios. Cuando se muestre el resultado final, deberá empezar con una letra mayúscula y
        terminar en un punto. El programa deberá generar 20 enunciados y mostrarlos.
     */

    public static void main(String[] args) {

        String articulos[] = {"el", "la", "lo", "los"};
        String sustantivos[] = {"coche", "mapa", "cama", "camisa", "tenedor"};
        String verbos[] = {"come", "bebe", "estudia", "practica"};
        String preposiciones[] = {"a", "con", "de", "desde", "hacia", "por"};

        String frase = "";

        for (int i=0; i<20; i++) {
            String articulo = articulos[(int)(Math.random()*articulos.length)];
            String primeraLetraMayuscula = String.valueOf(articulo.toUpperCase().charAt(0));
            String restoArticulo = articulo.substring(1, articulo.length());
            String articuloPrimeraMayuscula = primeraLetraMayuscula + restoArticulo;

            frase = frase + articuloPrimeraMayuscula;

            String sustantivo = sustantivos[(int)(Math.random()*sustantivos.length)];

            frase = frase + " " + sustantivo;

            String verbo = verbos[(int)(Math.random()*verbos.length)];

            frase = frase + " " + verbo;

            String preposicion = preposiciones[(int)(Math.random()*preposiciones.length)];

            frase = frase + " " + preposicion;

            String segundoArticulo = articulos[(int)(Math.random()*articulos.length)];

            frase = frase + " " + segundoArticulo;

            String segundoSustantivo = sustantivos[(int)(Math.random()*sustantivos.length)];

            frase = frase + " " + segundoSustantivo + ".";

            //System.out.println(articuloPrimeraMayuscula + " " + sustantivo + " " + verbo + " " + preposicion +
            //           " " + segundoArticulo + " " + segundoSustantivo + ".");

            System.out.println(frase);
            frase = "";
        }

    }
}
