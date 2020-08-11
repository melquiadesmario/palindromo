class Palindromo {

    boolean ehPalindromo(String palavra) {
        String palindromo = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(palindromo)){
            return true;
        }
        return false;
    }
    
}
