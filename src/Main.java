import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mahasiswa id1 = new Mahasiswa(
                "Galang Darma", "24078423", "Teknik Industri", 3.58

        );
        Mahasiswa id2 = new Mahasiswa(
                "Zahra Fadil", "23079343", "Antropologi Budaya", 3.87

        );
        Mahasiswa id3 = new Mahasiswa(
                "Asep Supriatna", "24075323", "Teknik Elektro", 3.77

        );
        Mahasiswa id4 = new Mahasiswa(
                "Rico Parnando", "23078924", "Teknik Metalurgi", 3.60
        );
        Mahasiswa id5 = new Mahasiswa(
                "Leticia Tessa Bilqis", "24074252", "Teknik Industri", 3.93
        );

        System.out.println(" === DATA MAHASISWA TERSIMPAN === ");
        System.out.println();

        id1.tampilkanInfo();
        id1.cekKelulusan();

        id2.tampilkanInfo();
        id2.cekKelulusan();

        id3.tampilkanInfo();
        id3.cekKelulusan();

        id4.tampilkanInfo();
        id4.cekKelulusan();

        id5.tampilkanInfo();
        id5.cekKelulusan();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM yang ingin dicari: ");
        String nim = input.nextLine();

        Mahasiswa id = null;

        if (id1.getNim().equals(nim)) {
            id = id1;
        } else if (id2.getNim().equals(nim)) {
            id = id2;
        } else if (id3.getNim().equals(nim)) {
            id = id3;
        } else if (id4.getNim().equals(nim)) {
            id = id4;
        } else if (id5.getNim().equals(nim)) {
            id = id5;
        }

        if (id != null) {
            System.out.println("\n=== DATA MAHASISWA DITEMUKAN ===");
            id.tampilkanInfo();

            System.out.print("Masukkan IPK baru: ");
            double ipkBaru = input.nextDouble();

            id.updateIpk(ipkBaru);

            System.out.println("\n=== DATA SETELAH UPDATE ===");
            id.tampilkanInfo();
            id.cekKelulusan();
        } else {
            System.out.println("NIM tidak ditemukan.");
        }

        input.close();
    }

}