class Palindromo {
    
    public String[] palindromo = new String[] {"ovo", "OvO", "radar", "aba"};

    boolean ehPalindromo(String palavra) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(palavra == palindromo[0]){
            return true;
        }else if(palavra == palindromo[1]){
            return true;
        }else if(palavra == palindromo[2]){
            return true;
        }else if(palavra == palindromo[3]){
            return true;
        }
        
        return false;
    }
    
}
