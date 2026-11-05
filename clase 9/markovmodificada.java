import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class markovmodificada {
    public static void main(String[] args) throws IOException {
        // 1. Creamos una lista de palabras a partir de un archivo de texto formato txt
        List<String> palabras = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));
        String linea;
        //creamos un bucle para leer cada linea del archivo que le pasemos
        while ((linea = lector.readLine()) != null) {
         for (String palabra : linea.split("\\s+")) {
         if (!palabra.isEmpty()) {
            palabras.add(palabra);
               }
            }
          }
         lector.close();
            

         
        // 2. Palabra de partida elegida al azar
        String actual = "el";
        System.out.print(actual);

        // Generamos 5 palabras siguientes
        for (int paso = 0; paso < 5; paso++) {
            
            // 3. RECUPERAR / REGISTRAR: Buscamos todas las palabras que siguieron a "actual"
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) {
                if (palabras.get(i).equals(actual)) {
                    // Anotamos la palabra que vino inmediatamente después
                    posiblesSiguientes.add(palabras.get(i + 1)); 
                }
            }

            // Si no tiene registro, salimos
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // 4. ELEGIR AL AZAR (La repetición natural en la lista da el peso estadístico)
            int indiceAleatorio = (int) (Math.random() * posiblesSiguientes.size());
            String siguiente = posiblesSiguientes.get(indiceAleatorio);

            // Imprimimos y avanzamos
            System.out.print(" " + siguiente);
            actual = siguiente;
        }
    }
}

