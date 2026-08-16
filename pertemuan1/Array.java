public class Array {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     CONTOH 1: ARRAY KONVENSIONAL         ");
        System.out.println("==========================================");

        String[] daftarBuku = new String[3];

        daftarBuku[0] = "Pemrograman Java";
        daftarBuku[1] = "Struktur Data";
        daftarBuku[2] = "Basis Data";

        System.out.println("Kapasitas/Ukuran Array : " + daftarBuku.length);
        System.out.println("------------------------------------------");

        System.out.println("Daftar Buku di Array:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + daftarBuku[i]);
        }
    }
}
