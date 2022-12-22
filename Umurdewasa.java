//Import class
import java.time.Year;
import java.util.Scanner;
public class Umurdewasa {
    public static void main(String [] args) {

        //Paparan output
        System.out.println("ATURCARA MENGIRA UMUR & PERINGKAT DEWASA");

        //Pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner (System.in);
        

        //Papar teks pertanyaan
        System.out.println ("Taip tahun kelahiran anda dan tekan ENTER");

        //Pengisytiharan pembolehubah input dan output
        int tahun_lahir = input.nextInt();
        int tahun_semasa;
        int umur;

        input.close();
        //Pengiraan umur
        tahun_semasa = Year.now().getValue();
        umur = tahun_semasa-tahun_lahir;

        //Menggunakan struktur kawalan if 
        if (umur < 19){

        //Papar output
        System.out.println ("Anda berumur "+ umur +", anda belum dewasa.");

        }
        
    }
}
