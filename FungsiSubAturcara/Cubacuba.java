package FungsiSubAturcara;

import java.text.DecimalFormat;

public class Cubacuba {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String[] args){

        double harga, bayaran = 0;
        int kuantiti;
        System.out.println("Harga barang satu unit RM: ");
        harga=taip.nextDouble();
        System.out.println("Unit yang dibeli: ");
        kuantiti=taip.nextInt();
        

        double papar = dapatBayaran ( harga, kuantiti, bayaran);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Harga yang perlu dibayar adalah RM" + df.format(papar));
}
static double dapatBayaran (double harga, int kuantiti, double bayaran){
    bayaran=harga*kuantiti;
    return bayaran;
}
}
