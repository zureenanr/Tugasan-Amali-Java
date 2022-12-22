//Import class
import java.time.Year;
import java.util.Scanner;
public class Peribadi {
    public static void main (String[] args) {

        //Pengisytiharan pembolehubah Scanner
        Scanner input= new Scanner (System.in);

        //Papar teks pertanyaan1 & isytihar pembolehubah nilai input1
        System.out.print("Masukkan nama anda: ");
        String nama = input.next();
        

        //Papar teks pertanyaan1 & isytihar pembolehubah nilai input2
        System.out.print("Masukkan tahun anda dilahirkan: ");
        int tahun = input.nextInt();

        //Papar teks pertanyaan1 & isytihar pembolehubah nilai input3
        System.out.print("Masukkan bandar anda dilahirkan: ");
        String negeri = input.next();
        input.close();
        
        //Pengiraan
        int tahunsemasa = Year.now() .getValue();
        int umur = tahunsemasa-tahun;

        //Memaparkan output
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Bandar Kelahiran : "+ negeri);
    }
    
}
