package Data_Modulor;

public class Contoh1 {
    public static void main(String[] args){
        String[] senaraiNama = {"Ayu", "Aiman", "Anuar", "Lina"};
        String[] senaraiRumahSukan = {"Marikh", "Pluto", "Bumi", "Marikh"};
        double[] senaraiMata = new double[4];
        senaraiMata[0]=35.2;
        senaraiMata[1]=44.2;
        senaraiMata[2]=56.1;
        senaraiMata[3]=29.4;

        System.out.println("KEDUDUKAN MARKAH UNTUK  PESERTA");
        System.out.println("PESERTA\tRUMAH\tMATA");
        for (int i=0;i<4;i++){
            System.out.println(senaraiNama[i]+"\t");
            System.out.println(senaraiRumahSukan[i]+"\t");
            System.out.println(senaraiMata[i]);
            System.out.println();

        }
    }
        
}
