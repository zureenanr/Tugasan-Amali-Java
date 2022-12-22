package Increment;

import java.util.Scanner;

public class Contoh {
    public static void main (String[] args){

        //Istihar pembolehubah
        int input, i, j, k;

        //Pengisytiharan pembolehubah Scanner
        Scanner scan = new Scanner(System.in);

        //Papar teks pertanyaan
        System.out.println("Bilangan baris piramid terbalik : ");
        input = scan.nextInt();

        //Kawalan ulangan for dengan kawalan increment dan decrement
        for (i=input; i>=1; i--){
            for (j=input; j>i; j--){
                System.out.println(" ");
            }
            for(k=1;k<(i*2);k++){

                //paparan output
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
