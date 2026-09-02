public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    public void tampilkanInfo(){
        System.out.println("Nama     :" + nama);
        System.out.println("NIM      :" + nim);
        System.out.println("Jurusan  :" + jurusan);
        System.out.println("IPK      :" + ipk);
        System.out.println();
    }
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status Mahasiswa : Lulus");
        } else {
            System.out.println("Status Mahasiswa : Belum Lulus");
        }
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
    public String getNim() {
        return nim;
    }

}