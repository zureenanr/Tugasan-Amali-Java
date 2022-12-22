package AturcaraParameter;
//import class
import java.util.Scanner;

public class Contoh1 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //istihar pembolehubah
        double lebar, tinggi;
        System.out.println("KIRA LUAS SEGITIGA");

        //ambil nilai tinggi
        System.out.println("Tinggi segitiga: ");
        tinggi = keyboard.nextDouble();

        //ambil nilai lebar
        System.out.println("Lebar segitiga: ");
        lebar = keyboard.nextDouble();
        //keyboard.reset();

        //Panggil sub aturcara
        kiraSegitiga(tinggi,lebar);
    }
    //sub aturcara guna peerimeter
    public static void kiraSegitiga(double tinggi, double lebar) {
        //laksana operasi
        double luas = 0.5*tinggi*lebar;
        System.out.println("Luas segitiga adalah " + luas +" persegi.");
        
    }
}
