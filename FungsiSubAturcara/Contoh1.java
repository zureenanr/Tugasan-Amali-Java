package FungsiSubAturcara;

public class Contoh1 {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main (String[] args){

        //istihar pembolehubah
        double papar;

        //umpuk nilai dengan sub aturcara fungsi
        papar= kiraLuas();

        //Panggil semula nilai 
        System.out.println("Isipadu bagi kuboid yang adalah "+ papar +" padu ");
    }

    //sub aturcara
    static double kiraLuas(){

    //istihar pembolehubah 
    double panjang, lebar, tinggi, isipadu;
    System.out.println("Panjang kuboid: ?");
    panjang = taip.nextDouble();
    System.out.println("Lebar kuboid : ?");
    lebar = taip.nextDouble();
    System.out.println("Tinggi kuboid : ?");
    tinggi = taip.nextDouble();

    //Lakukan operasi pengiraan
    isipadu = panjang*lebar*tinggi;

    //hantar data
    return Math.round(isipadu);
}
}
