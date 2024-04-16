package me.dcdev.teste.exercicioCinco;

public class ReverterUmaString {
    private static String reverseString(String textoExemplo) {
        char[] charsOfTextoExemplo = textoExemplo.toCharArray();

        for(int i=0, j=textoExemplo.length() - 1; i < j; i++, j--) {
            char backup = charsOfTextoExemplo[i];
            charsOfTextoExemplo[i] = charsOfTextoExemplo[j];
            charsOfTextoExemplo[j] = backup;
        }

        return new String(charsOfTextoExemplo);
    }

    public static void main(String[] args) {

        String textoExemplo = "Diego Caetano Silva";

        System.out.println("String original: "+textoExemplo);
        System.out.println("String revertida: "+reverseString(textoExemplo));
    }
}
