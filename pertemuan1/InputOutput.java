import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Judul Buku: ");
        String judulBuku = input.nextLine();

        System.out.print("Masukkan Jumlah Halaman: ");
        int jumlahHalaman = input.nextInt();

        System.out.println("\n--- DATA BUKU ---");
        System.out.println("Judul          : " + judulBuku);
        System.out.println("Jumlah Halaman : " + jumlahHalaman + " halaman");

        input.close();
    }
}
