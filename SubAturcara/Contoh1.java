package SubAturcara;

import java.util.Scanner;

public class Contoh1 {
    public static void main(String[] args) {

        //Panggil semula
        namaAnda();
        soalan();
        ucapan();

    }
    //Sub 1
    static void soalan(){
        Scanner input = new Scanner(System.in);
        System.out.println("MAsukkan satu nombor bulat");
        int nombor = input.nextInt();
        input.close();

        //Tentukan nombor genap dan ganjil
        if (nombor % 2 ==0){
            System.out.println(nombor + " adalah nombor genap. ");
        } else {
            System.out.println(nombor + " adalah nombor ganjil. ");
        }
    }
    //Sub 2
    static void ucapan(){
        System.out.println("Terima kasih, sila cuba lagi");
    }
    //Sub 3
    static void namaAnda(){
        System.out.println("TENTUKAN NOMBOR GENAP/GANJIL");
        Scanner nama = new Scanner(System.in);
        System.out.println("Nama anda : ");
        String namaSendiri = nama.next();
        System.out.println("Terima Kasih : " +namaSendiri);
}
}

