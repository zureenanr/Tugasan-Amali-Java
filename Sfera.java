//Import class
import java.util.Scanner;

public class Sfera {
    public static void main (String [] args){
        System.out.println("ATURCARA PENGIRAAN MENCARI ISIPADU SEBUAH SFERA ");
        
        //Pembolehubah Scanner
        Scanner input = new Scanner(System.in);
        final double jumlah;

        //Paparan makluman
        System.out.println("Masukkan nilai jejari anda: ");
        int jejari = input.nextInt();
        input.close();

        //Proses pengiraan
        jumlah = 1.3 * 3.142 * (jejari * jejari * jejari); 

        //Output
        System.out.println("Masukkan jumlah isipadu sfera: " +jumlah);
    }
}

