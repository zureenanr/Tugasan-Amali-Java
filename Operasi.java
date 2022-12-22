public class Operasi {
    public static void main (String [] args){

        //Pengisytiharan jenis data bagi peembolehubah
        int nom1,nom2;
        int op1,op2,op3,op4,op5;

        //Umpukan nilai bagi pembolehubah
        nom1=15;
        nom2=2;

        //Operasi aritmetik
        op1=nom1+nom2;
        op2=nom1-nom2;
        op3=nom1*nom2;
        op4=nom1/nom2;
        op5=nom1%nom2;

        //Paparan output
        System.out.println("Hasil tambah:" +nom1+ '+' +nom2+ '=' +op1);
        System.out.println("Hasil tolak:" +nom1+ '-' +nom2+ '=' +op2);
        System.out.println("Hasil darab:" +nom1+ '*' +nom2+ '=' +op3);
        System.out.println("Hasil bahagi:" +nom1+ '/' +nom2+ '=' +op4);
        System.out.println("Hasil modulus:" +nom1+ '%' +nom2+ '=' +op5);
    }
    
}
