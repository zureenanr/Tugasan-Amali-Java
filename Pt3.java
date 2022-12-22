//Import class
import java.util.Scanner;

public class Pt3 {
    public  static void main (String[] args) {

        //Pembolehubah Scanner
        Scanner input = new Scanner(System.in);

        //Paparan makluman
        System.out.println("Berapakah bilangan A dalam PT3 anda?: ");
        int gred = input.nextInt();

        System.out.println("Adakah Matematik dan Bahasa Inggeris anda A?: ");
        boolean result = input.nextBoolean();

        input.close();

        if ( gred >= 5) {

        if ( result == true){

            System.out.println("Tahniah, anda layak memasuki kelas 4 Sains Komputer!!");
        } else {

            System.out.println("Tahniah, anda tidak layak memasuki kelas 4 Sains Komputer");
        }
        }
    
    }
}
