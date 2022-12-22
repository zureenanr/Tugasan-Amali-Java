//Import class
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        System.out.println("ATURCARA TEKAAN HURUF SEBELUM HURUF I ");
        System.out.println("MENGGUNAKAN HURUF BESAR ");

        //Pembolehubah Scanner
        Scanner sc = new Scanner(System.in);

        //Paparan makluman
        System.out.println("Sila masukkan jawapan huruf anda: ");
        char h = sc.next().charAt(0);
        char answer = 'H';
        sc.close();
        
        //paparan output
        if(answer == h){
            System.out.println("Tahniah, Anda berjaya meneka huruf aksara!" );
        } else {
            System.out.println("Maaf, Anda silap menjawab tekaan aksara " );
        }

    }
    
}

