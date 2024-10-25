import java.util.Scanner;
public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        String Mahasiswa[] = new String[100];
        int nilai[] = new int[100];

        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
        do{
            System.out.print("'Masukkan nama: ");
            Mahasiswa[i] = sc.nextLine();

            System.out.print("Masukkan nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Input lagi?: (y/n) ");
            inputData = sc.nextLine();
            i++;
        }while(i<Mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukkan jumlah data: " + i);

        System.out.println(" ");
        int x=1;
        for (int j = 0; j < Mahasiswa.length; j++){
            if(Mahasiswa[j]!=null){
                System.out.println("------------------------------------------------------------");
                System.out.println("Mahasiswa ke: "+ (x++));
                System.out.println("Nama Mahasiswa: "+Mahasiswa[j]);
                System.out.println("Nilai: "+nilai[j]);
            }
        }

        System.out.println("\nDaftar Mahasiswa: ");
        System.out.println("============================================================");
        System.out.println("No \t\t Nama \t\t Nilai \t\t Keterangan");
        System.out.println("------------------------------------------------------------");
        x=1;
        for (int k = 0; k < Mahasiswa.length; k++){
            if (Mahasiswa[k] != null){
                String Keterangan = (nilai[k] >= 75) ? "Lulus" : "Tidak Lulus";
                System.out.println((x++) + "\t\t" + Mahasiswa[k] + "\t\t" + nilai[k] + "\t\t" + Keterangan);
            }
        }System.out.println("===========================================================");
        double jumlah=0;
        for(double num : nilai) {
            jumlah += num;
        }
        System.out.println("Jumlah nilai: "+jumlah);
        double rata2 = jumlah / i;
        System.out.println("Nilai rata-rata: "+rata2);
    }
}