//Import class
//import java.time.Year;
import java.util.Scanner;

public class Jpj {
        public  static void main (String[] args) {

            //Pembolehubah Scanner
            Scanner input = new Scanner(System.in);

            //Paparan makluman 
            System.out.println("Sila masukkan tahun kelahiran anda sahaja: ");
        
            //Pengisytiharan input
            int tahun_lahir = input.nextInt();
            //int tahun_semasa;
            input.close();
            
            //Pengiraan
            //tahun_semasa = Year.now().getValue();
            //tahun_semasa-tahun_lahir;
        
            //Struktur kawalan if else
            if ( tahun_lahir <= 2004) {

            //Paparan output lulus
            System.out.println("Anda sudah layak memohon lesen motosikal");
        }
        else {

            //Paparan output gagal
            System.out.println("Maaf, Anda belum layak memohon lesen motosikal");
        }
        }    
}
