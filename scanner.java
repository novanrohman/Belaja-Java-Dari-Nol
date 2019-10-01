import java.util.*;

public class scanner {
    public static void main(String[] args) {
        String nama;
        int umur;
        double uang;
        char huruf;
        float phi;
        boolean kondisi;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Umur: ");
        umur = input.nextInt();
        System.out.print("Masukkan jumlah uang: ");
        uang = input.nextDouble();

        System.out.println("=========================================");
        System.out.println("Nama Anda: " + nama);
        System.out.println("Umur anda: " + umur + " tahun");
        System.out.println("Uang Anda: Rp." + uang);
    }
}
