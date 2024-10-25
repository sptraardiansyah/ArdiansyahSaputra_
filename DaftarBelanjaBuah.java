import java.util.Scanner;
public class DaftarBelanjaBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Buah = {"Apel","Jeruk","Mangga","Duku","Semangka"};
        int[] Harga = {35000,50000,25000,15000,20000};
        int[] TotalHarga = new int[Buah.length];

        int total = 0;

        while (true){
            System.out.print("Pilih Buah 1-4:");
            int BelanjaBuah = sc.nextInt();

            if(BelanjaBuah < 0 || BelanjaBuah >= Buah.length){
                System.out.println("Pilihan tidak valid");
                continue;
            }

            System.out.print("Masukkan Jumlah Buah:");
            int quantity = sc.nextInt();
            TotalHarga[BelanjaBuah]+= quantity;
            total+= Harga[BelanjaBuah]*quantity;
            System.out.print("Input lagi? (y/n):");
            String input = sc.next();

            if (!input.equalsIgnoreCase("y")){
                break;
            }
        }

        System.out.println("Daftar Belanja:");
        System.out.println("=======================================================");
        System.out.println("No.\t\tNama Buah \t\tJumlah \t\tHarga \t\tSubtotal");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < Buah.length;i++){
            if (TotalHarga[i] > 0){
                System.out.printf("%d.\t\t%s\t\t%d\t\t%d\t\t%d\n",i+0,Buah[i],TotalHarga[i],Harga[i],Harga[i]*TotalHarga[i]);
            }

        }System.out.println("======================================================");

        System.out.println("Total:\t\t"+total);
        int discount = (int) (total*0.15);
        System.out.println("Discount(15%):\t"+discount);
        System.out.println("Total bayar:\t"+(total-discount));

        sc.close();
    }
}