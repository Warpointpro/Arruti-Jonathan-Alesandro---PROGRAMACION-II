//Experimentacion resuelta con ia pura solo para analogia 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PredictorMarkovSimplev2 {

    public static void main(String[] args) throws IOException {

        // Leer el archivo y guardar todas las palabras en una lista, en el orden en que aparecen
        List<String> palabras = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader("textito.txt"));
        String linea;
        while ((linea = lector.readLine()) != null) {
            linea = linea.toLowerCase().replaceAll("[.,;:!?\"()]", "");
            for (String palabra : linea.split("\\s+")) {
                if (!palabra.isEmpty()) {
                    palabras.add(palabra);
                }
            }
        }
        lector.close();

        // Elegir una palabra inicial al azar entre todas las del texto
        String actual = palabras.get((int) (Math.random() * palabras.size()));
        StringBuilder textoGenerado = new StringBuilder(actual);

        // Generar 20 palabras más, una por vuelta
        for (int contador = 0; contador < 20; contador++) {

            // Recorrer,
            // y guardar la palabra que la siguió en cada una de esas veces
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) {
                if (palabras.get(i).equals(actual)) {
                    posiblesSiguientes.add(palabras.get(i + 1));
                }
            }

            // Si "actual" nunca apareció seguida de otra palabra, se corta acá
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // Elegir una al azar entre las encontradas, y esa pasa a ser la nueva palabra actual
            String siguiente = posiblesSiguientes.get((int) (Math.random() * posiblesSiguientes.size()));
            textoGenerado.append(" ").append(siguiente);
            actual = siguiente;
        }

        System.out.println("Texto generado: " + textoGenerado);
    }
}

//POSIBLE SOLUCION DE UNA IA

// ============================================================
// POSIBLE SOLUCIÓN COMENTADA
// ============================================================

// Problema: el programa usa "textito.txt" relativo al directorio desde el que se ejecuta Java.
// Solución: recibir la ruta como argumento o verificar que el archivo exista.

// public static void main(String[] args) {
// Solución: envolver la lectura y evitar que la ruta sea fija.

//     if (args.length == 0) {
//         System.out.println("Debe indicar la ruta de textito.txt");
//         return;
//     }

// Problema: el programa puede leer un archivo vacío y luego ejecutar palabras.get(...).
// Solución: comprobar que la lista tenga elementos antes de generar texto.

//     try (BufferedReader lector =
//              new BufferedReader(new FileReader(args[0]))) {
//         // Leer cada línea, pasarla a minúsculas y eliminar signos.
//         // Agregar las palabras válidas a la lista.
//     } catch (IOException error) {
//         // Mostrar explícitamente que no pudo abrirse o leerse el archivo.
//         System.out.println("No se pudo leer el archivo: " + error.getMessage());
//         return;
//     }

//     if (palabras.isEmpty()) {
//         System.out.println("El archivo no contiene palabras.");
//         return;
//     }

// Problema: si el lector falla durante el proceso, el archivo podría permanecer abierto.
// Solución: utilizar try-with-resources con BufferedReader.

// Problema: una palabra final puede aparecer sin sucesora y la generación termina antes.
// Solución: comprobar que posiblesSiguientes no esté vacía en cada iteración.

//     if (posiblesSiguientes.isEmpty()) {
//         System.out.println("No hay una palabra siguiente para continuar.");
//         break;
//     }

// Problema: el programa puede quedar pegado en ciclos muy pequeños.
// Solución: aplicar Markov de dos palabras para tener más contexto.

// // Ejemplo lógico: tomar dos palabras actuales
// String clave = palabras.get(i) + " " + palabras.get(i + 1);
// // Buscar cuáles palabras aparecen inmediatamente después de esa clave
// // Elegir una siguiente palabra aleatoria entre las coincidencias
// // Limitar el texto a exactamente la cantidad solicitada
// // Repetir hasta encontrar una secuencia válida o detenerse al final del texto

// Problema: no distingue si textito.txt está en la carpeta del proyecto.
// Solución: ejecutar desde la carpeta clase 10:

// cd "clase 10"
// javac PredictorMarkovSimplev2.java
// java PredictorMarkovSimplev2 textito.txt