public class Switch {
    public static void main(String[] args) {
        int pilihan = 2;

        switch (pilihan) {
            case 1:
                System.out.println("Tambah Buku");
                break;
            case 2:
                System.out.println("Pinjam Buku");
                break;
            case 3:
                System.out.println("Kembalikan Buku");
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
                break;
        }
    }
}
