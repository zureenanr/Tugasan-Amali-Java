package Kawalan_ulangan;

//Import class
import java.util.Scanner;

public class Hasildarab {
    public static void main (String[]args) {
        
        //Paparan output
        System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI DARAB");

        //Pengisytiharan pembolehubah 
        Scanner input = new Scanner(System.in);

        //Istihar pembolehubah dan Papar teks pertanyaan 
        int nom1, nom2;
        String jawab;

        //Kawalan ulangan do while 
        do{
            System.out.println("Nombor pertama: ");
            nom1 = input.nextInt();
            System.out.println("Nombor Kedua ");
            nom2 = input.nextInt();
            input.close();

            //Paparan output
            System.out.println("Hasil darab: " + nom1 + " X " + nom2 +" = " + Math.abs(nom2 * nom1));

            //Pertanyaan output
            System.out.println("Taipkan Y untuk teruskan... ");
            jawab= input.next();
            

            //Ulangan 
        } while (jawab.equals("Y") || jawab.equals("y"));

        }
    }


