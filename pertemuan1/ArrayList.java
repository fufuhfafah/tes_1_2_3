public class ArrayList {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        CONTOH 2: JAVA ARRAYLIST          ");
        System.out.println("==========================================");

        java.util.ArrayList<String> daftarBuku = new java.util.ArrayList<>();

        daftarBuku.add("Pemrograman Java");
        daftarBuku.add("Struktur Data");
        daftarBuku.add("Basis Data");
        daftarBuku.add("Jaringan Komputer");

        System.out.println("Jumlah Elemen Terisi   : " + daftarBuku.size());
        System.out.println("------------------------------------------");

        System.out.println("Daftar Buku di ArrayList:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("Indeks ke-" + i + " : " + daftarBuku.get(i));
        }
    }
}
