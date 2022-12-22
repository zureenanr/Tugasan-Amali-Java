public class Belian {
    public static void main (String[] args) {
        
        //Pengisytiharan jenis data bagi pembolehubah
        String barangan;
        int kuantiti;
        double harga,jumlah;

        //Umpukan nilai
        barangan = "Cheesekut";
        kuantiti = 10;
        harga = 7.50;
        
        //Operasi
        jumlah = harga*kuantiti;

        //Paparan output
        System.out.println("Info item:" +barangan);
        System.out.println("Unit dibeli:" +kuantiti);
        System.out.println("Harga Seunit: RM" +harga);
        System.out.println("Jumlah:" +jumlah);
    }
}