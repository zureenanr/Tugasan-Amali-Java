public class Markah {
    public static void main (String[] args){

        //Pengisytiharan jenis data bagi pembolehubah dan umpukan
        int bm, sj, jumlah;
     double purata, peratus;

        //Umpukan nilai
        bm= 90;
        sj= 85;

        //Operasi
        jumlah = bm + sj; 
        purata = jumlah / 2; 
        peratus = ((jumlah / 175) * 100);

        //Paparan output
        System.out.println ("Jumlah markah:" +bm+ '+' +sj+ '=' +jumlah);
        System.out.println ("Jumlah markah:" +purata );
        System.out.println ("Jumlah peratus markah:" +peratus );
    }
} 
