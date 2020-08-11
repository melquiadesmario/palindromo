import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromoTests {

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] { 
            { "ovo" },
            { "OvO" },
            { "radar" },
            { "aba" }
        });
    }

    private final String palavra;

    public PalindromoTests(String palavra) {
        this.palavra = palavra;
    }

    @Test
    public void ehPalindromo() throws Exception {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.ehPalindromo(palavra);
        assertTrue(resultado);
    }	
}