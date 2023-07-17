package test;

import src.Fizzbuzz2;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fizzbuzz2Test {

    @Test
    public void testDecompte() {
        // Rediriger la sortie standard vers un flux de sortie
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Créer une instance de la classe Fizzbuzz2
        Fizzbuzz2 fizzbuzz = new Fizzbuzz2();

        // Appeler la méthode decompte()
        fizzbuzz.decompte();

        // Récupérer la sortie de la méthode decompte()
        String output = outContent.toString();

        // Vérifier les résultats attendus
        String[] lines = output.split(System.lineSeparator());
        assertEquals("1", lines[0]);
        assertEquals("Fizz", lines[2]);
        assertEquals("Buzz", lines[4]);
        assertEquals("FizzBuzz", lines[14]);
        // ... Ajouter d'autres assertions pour vérifier les résultats attendus
    }
}

