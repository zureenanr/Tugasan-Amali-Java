//Import class
import java.util.Scanner;

public class Gred {
    public  static void main(String[] args) {

        //Pembolehubah Scanner
        Scanner input = new Scanner(System.in);

        //Paparan makluman
        System.out.println("Masukkan gred mata pelajaran Matematik: ");
        int math = input.nextInt();

        System.out.println("Masukkan gred mata pelajaran Sains: ");
        int sn = input.nextInt();
        input.close();

        if (math == sn){

            //Output sama
            System.out.println("Gred yang diperolehi adalah sama");
        }
        else { 
            
            //Output tidak sama
            System.out.println("Gred yang diperolehi adalah tidak sama");
        }
    }
}


