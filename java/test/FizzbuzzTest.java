package test;

import src.Fizzbuzz;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
  
    @Test
    public void testDecompte() {
        // Rediriger la sortie standard vers un flux de sortie
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Créer une instance de la classe Fizzbuzz
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        
        // Appeler la méthode decompte()
        fizzbuzz.decompte();
        
        // Récupérer la sortie de la méthode decompte()
        String output = outContent.toString();
        
        // Vérifier les résultats attendus
        String[] lines = output.split(System.lineSeparator());
        assertEquals("Fizzbuzz", lines[15]); // Exemple : Vérifier la 15ème ligne
        assertEquals("Fizz", lines[3]);     // Exemple : Vérifier la 3ème ligne
        assertEquals("Buzz", lines[5]);     // Exemple : Vérifier la 5ème ligne
        assertEquals("7", lines[7]);        // Exemple : Vérifier la 7ème ligne
        // ... Ajouter d'autres assertions pour vérifier les résultats attendus
    }
}

