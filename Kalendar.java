//Import class
import java.util.Scanner;

public class Kalendar {
    public static void main (String[] args){

        //Paparan outpun-makluman awal aturcara
        System.out.println(" ATURCARA MENGIRA KALENDAR CINA"); 

        //Pengisytiharan 
        Scanner input = new Scanner(System.in);

        //Papar teks pertanyaan
        System.out.println(" Masukkan tahun:");

        //Input dan pengiraan
        int tahun_masihi = input.nextInt();
        int tahun_cina = tahun_masihi % 12;
        input.close();

        //Guna kawalan switch-case
        switch (tahun_cina) {

            case 0:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Monyet"); break;

            case 1:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Ayam"); break;

            case 2:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Anjing"); break;

            case 3:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Babi"); break;

            case 4:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Tikus"); break;

            case 5:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Lembu"); break;

            case 6:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Harimau"); break;

            case 7:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Arnab"); break;

            case 8:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Naga"); break;

            case 9:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Ular"); break;

            case 10:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Kuda"); break; 

            case 11:
            System.out.println("Tahun "+ tahun_masihi +" adalah "+" Tahun Kambing"); break;
        }
    }
}
