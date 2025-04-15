public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private static Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
    private static int countMahasiswa = 0;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public static void tambahMahasiswa(Mahasiswa mhs) {
        if (countMahasiswa < daftarMahasiswa.length) {
            daftarMahasiswa[countMahasiswa] = mhs;
            countMahasiswa++;
        }
    }

    public static void tampilkanDaftarMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i] != null) {
                System.out.println("NIM: " + daftarMahasiswa[i].getNim() + " | Nama: " + daftarMahasiswa[i].getNama() + " | Prodi: " + daftarMahasiswa[i].getProdi());
            }
        }
    } public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public static Mahasiswa cariMahasiswa(String nim) {
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i] != null && daftarMahasiswa[i].getNim().equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }
    
     
}