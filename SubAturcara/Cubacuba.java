package SubAturcara;

import java.util.Scanner;

public class Cubacuba {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nombor integer dan ENTER: ");
        int nom1 = input.nextInt();
        int nom2 = input.nextInt();
        int nom3 = input.nextInt();
        input.close();

        operasiTambah(nom1,nom2,nom3);
    }
    public static void operasiTambah (int nom1, int nom2, int nom3 ){
        int jumlah;
        jumlah=nom1+nom2+nom3;
        System.out.println(nom1 + " + " + nom2 + " + " + nom3 + " = " +jumlah);
}
}
