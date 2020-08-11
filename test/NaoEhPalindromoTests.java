import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NaoEhPalindromoTests {

    @Parameters
    public static Collection<Object[]> naoEhPalindromoCases(){
        return Arrays.asList(new Object[][] { 

            { "cabelo" },
            { "azeite" },
            { "azul" },
            { "vanderlei" },
            { "974464" },
            { "___9" }
        });
    }

    private final String palavra;

    public NaoEhPalindromoTests(String palavra) {
        this.palavra = palavra;
    }

    @Test
    public void test() throws Exception {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.ehPalindromo(palavra);
        assertFalse(resultado);
    }
}