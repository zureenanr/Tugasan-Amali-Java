package Kawalan_ulangan;

//Import class 
import java.util.Scanner;

public class Permainan {
    public static void main(String[] args) {

        //Paparan output-makluman awal aturcara
        System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI TAMBAH");

        //Pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner (System.in);

        //Istihar pembolehubah dan Papar teks pertanyaan
        int nom1 = (int)(Math.random()*101);
        int nom2 = (int)(Math.random()*101);

        System.out.println("Nyatakan Jawapan " + nom1 + " + " + nom2 + " = ");
        int jawapan = input.nextInt();
        input.close();

        //Kawalan ulangan guna while
        while (nom1 + nom2 != jawapan) {

            //Papar output
            System.out.println(" Jawapan anda salah! Sila cuba lagi... \n Nyatakan Jawapan " + nom1 +" + " + nom2 + " = ");
        }
        
        //Papar output jawapan betul
        System.out.println("Tahniah, jawapan anda betul! ");
    }
}

