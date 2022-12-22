//Import class
import java.util.Scanner;

public class Inputpengguna {
    public static void main (String[] args){

        //Pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner (System.in);

        //Papar teks pertanyaan
        System.out.println("Masukkan nilai jejari bulatan: ");

        //Pengisytiharan pembolehubah yang memegang nilai input 
        double jejari = input.nextDouble();
        input.close();

        //Membuat pengiraan dan bundar kepada 2 tempat perpuluhan 
        double luas = Math.round ((jejari * jejari  * 3.14159) * 100.0)/100.0;

        //Papar output
        System.out.println("Luas bulatan dengan jejari " + jejari + " adalah " + luas +" persegi");
    }
}