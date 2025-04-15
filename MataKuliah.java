class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private static MataKuliah[] daftarMataKuliah = new MataKuliah[3];
    private static int countMataKuliah = 0;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public static void tambahMataKuliah(MataKuliah mk) {
        if (countMataKuliah < daftarMataKuliah.length) {
            daftarMataKuliah[countMataKuliah] = mk;
            countMataKuliah++;
        }
    }

    public static void tampilkanDaftarMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < daftarMataKuliah.length; i++) {
            if (daftarMataKuliah[i] != null) {
                System.out.println("Kode MK: " + daftarMataKuliah[i].getKodeMK() + " | Nama: " + daftarMataKuliah[i].getNamaMK() + " | SKS: " + daftarMataKuliah[i].getSks());
            }
        }
    }

    public static MataKuliah[] getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }
}