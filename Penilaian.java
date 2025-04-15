public class Penilaian {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;
    private double nilaiAkhir;
    private static Penilaian[] daftarPenilaian = new Penilaian[5];
    private static int countPenilaian = 0;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = calculateNilaiAkhir();
    }

    private double calculateNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public static void tambahPenilaian(Penilaian penilaian) {
        if (countPenilaian < daftarPenilaian.length) {
            daftarPenilaian[countPenilaian] = penilaian;
            countPenilaian++;
        }
    }

   
    public static void urutkanBerdasarkanNilaiAkhir() {
        for (int i = 0; i < countPenilaian - 1; i++) {
            for (int j = 0; j < countPenilaian - i - 1; j++) {
                if (daftarPenilaian[j] != null && daftarPenilaian[j + 1] != null) {
                    if (daftarPenilaian[j].nilaiAkhir < daftarPenilaian[j + 1].nilaiAkhir) {

                        Penilaian temp = daftarPenilaian[j];
                        daftarPenilaian[j] = daftarPenilaian[j + 1];
                        daftarPenilaian[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("\nPerhitungan Nilai Akhir:");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                Mahasiswa mhs = daftarPenilaian[i].mahasiswa;
                MataKuliah mk = daftarPenilaian[i].mataKuliah;
                System.out.println(mhs.getNama() + " | " + mk.getNamaMK() + " | Nilai Akhir: " + daftarPenilaian[i].nilaiAkhir);
            }
        }
    }

    public static void tampilkanDaftarPenilaian() {


        System.out.println("\nData Penilaian (Urut Berdasarkan Nilai Akhir):");
        System.out.println("NO | NIM | Nama Mahasiswa | Kode MK | Nama Mata Kuliah | Nilai Tugas | Nilai UTS | Nilai UAS | Nilai Akhir");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                System.out.println((i + 1) + " | " + daftarPenilaian[i].mahasiswa.getNim() + " | " + daftarPenilaian[i].mahasiswa.getNama() + " | " +
                        daftarPenilaian[i].mataKuliah.getKodeMK() + " | " + daftarPenilaian[i].mataKuliah.getNamaMK() + " | " +
                        daftarPenilaian[i].nilaiTugas + " | " + daftarPenilaian[i].nilaiUTS + " | " + daftarPenilaian[i].nilaiUAS + " | " +
                        daftarPenilaian[i].nilaiAkhir);
            }
        }

        
    }

    public static void tampilkanPenilaianMahasiswa(String namaMahasiswa) {
        System.out.println("\nData Penilaian " + namaMahasiswa + ":");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null && daftarPenilaian[i].mahasiswa.getNama().equals(namaMahasiswa)) {
                MataKuliah mk = daftarPenilaian[i].mataKuliah;
                System.out.println(mk.getNamaMK() + " | Nilai Akhir: " + daftarPenilaian[i].nilaiAkhir);
            }
        }
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
}
