/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emers
 */
public class Palindromo {

    public static void main(String[] args) {        
        char[] charArray = converteParaChar(insereDados());
        printaResultado(verificaPalindromo(charArray, inverteVetor(charArray)));

    }
    //Pede pro usuário inserir uma palavra
    public static String insereDados() {        
        String digitado = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        //leitor de dados
        digitado = scan.next();
        return digitado;
    }
    //converte a String pra um vetor de Char
    public static char[] converteParaChar(String digitado) {        
        char[] convertido = digitado.toCharArray();
        return convertido;
    }
    //inverte a palavra
    public static char[] inverteVetor(char[] vetorPalavra) {
        char[] invertido = new char[vetorPalavra.length];
        int j = vetorPalavra.length;
        //o vetor invertido começa com o index 0 enquanto a palavra começa do tamano até 0 pra inverter a palavra
        for (int i = 0; i < vetorPalavra.length; i++) {
            j--;
            invertido[i] = vetorPalavra[j];
        }
        return invertido;
    }
    //verifica se a palavra é palindromo
    public static boolean verificaPalindromo(char[] vetorPalavra, char[] invertido) {          
        if (Arrays.equals(invertido, vetorPalavra)) {
            return true;
        }
        return false;
    }
    //printa o resultado da verificação do veirificaPalindromo
    public static void printaResultado(boolean resultado) {
        if (resultado) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

    }
}
