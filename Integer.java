//Import class
import java.util.Scanner;

public class Integer {
    public static void main(String[] args){
        System.out.println("ATURCARA TENTUKAN NOMBOR GENAP DAN NOMBOR GANJIL");

         //Pembolehubah Scanner
         Scanner input = new Scanner(System.in);

         //Paparan makluman
         System.out.println("Sila masukkan nombor: ");
         int num = input.nextInt();
         input.close();


        if (num % 2 == 0  ) {

            //paparan output
            System.out.println("Nombor " +num+ " adalah nombor genap" );
        } else {
            System.out.println("Nombor "  +num+ " adalah nombor ganjil" );
        }
    }
}
