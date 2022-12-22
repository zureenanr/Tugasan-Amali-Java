//Import class
import java.util.Scanner;

public class Merdeka {
    public static void main (String[] args) {
        
        //Paparan output-makluman awal aturcara
        System.out.print(" ATURCARA TENTUKAN LAHIR SEBELUM / SELEPAS MERDEKA ");

        //Pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner(System.in);
        
        //Papar teks pertanyaan
        System.out.println(" Masukkan tahun anda dilahirkan dan tekan ENTER: ");
        int lahir = input.nextInt();
        input.close();

        //Pengisytiharan pembolehubah input
        int merdeka = 1957;
        
        //Menggunakan struktur kawalan if else
        if (lahir > merdeka){

            //Papar output True 
            System.out.println(" Anda dilahirkan selepas merdeka ");
        }else{

            //Papar output False
            System.out.println(" Anda dilahirkan sebelum merdeka ");
        }

    }
}
