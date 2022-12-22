//Import class
import java.util.Scanner;

public class Lulus {
    public static void main (String[] args) {
        
        //Pembolehubah Scanner
        Scanner input = new Scanner(System.in);

        //Paparan output-makluman
        System.out.println("Sila masukkan markah anda: ");
        int markah = input.nextInt();
        
        //Pengisytiharan input
        input.close();
        
        //Struktur kawalan if else
        if (markah >=45) {

            //Paparan output lulus
            System.out.println("Tahniah, anda lulus");
        }

         else {

            //Paparan output gagal
            System.out.println("Anda gagal, usaha lagi !");


        }
    }
}


        

        


    

