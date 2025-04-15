import java.util.Scanner;

public class SpmDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        Mahasiswa.tambahMahasiswa(new Mahasiswa("22001", "ALI RAHMAN", "Informatika"));
        Mahasiswa.tambahMahasiswa(new Mahasiswa("22002", "BUDI SANTOSO", "Informatika"));
        Mahasiswa.tambahMahasiswa(new Mahasiswa("22003", "CITRA DEWI", "Sistem Informasi Bisnis"));
        
        MataKuliah.tambahMataKuliah(new MataKuliah("MK001", "Struktur Data", 3));
        MataKuliah.tambahMataKuliah(new MataKuliah("MK002", "Basis Data", 3));
        MataKuliah.tambahMataKuliah(new MataKuliah("MK003", "Desain Web", 3));

        Mahasiswa[] mahasiswas = new Mahasiswa[]{Mahasiswa.cariMahasiswa("22001"), Mahasiswa.cariMahasiswa("22002"), Mahasiswa.cariMahasiswa("22003")};
        MataKuliah[] mataKuliahs = MataKuliah.getDaftarMataKuliah();
        Penilaian.tambahPenilaian(new Penilaian(mahasiswas[0], mataKuliahs[0], 80, 85, 90));
        Penilaian.tambahPenilaian(new Penilaian(mahasiswas[0], mataKuliahs[1], 60, 75, 70));
        Penilaian.tambahPenilaian(new Penilaian(mahasiswas[1], mataKuliahs[0], 75, 70, 80));
        Penilaian.tambahPenilaian(new Penilaian(mahasiswas[2], mataKuliahs[1], 85, 90, 95));
        Penilaian.tambahPenilaian(new Penilaian(mahasiswas[2], mataKuliahs[2], 80, 90, 65));

        do{
            System.out.println("========== MENU SISTEM AKADEMIK ============");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan daftar mata kuliah");
            System.out.println("3. Tampilkan data Penilaian");
            System.out.println("4. Urutkan Mahasiswa berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu:");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    Mahasiswa.tampilkanDaftarMahasiswa();
                    break;
                case 2:
                    MataKuliah.tampilkanDaftarMataKuliah();
                    break;
                case 3:
                    Penilaian.tampilkanDaftarPenilaian();
                    break;
                case 4:
                    Penilaian.urutkanBerdasarkanNilaiAkhir();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    input.nextLine(); 
                    String cariNIM = input.nextLine();
                    Mahasiswa mhs = Mahasiswa.cariMahasiswa(cariNIM);
                    if (mhs != null) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mhs.getNim());
                        System.out.println("Nama: " + mhs.getNama());
                        System.out.println("Prodi: " + mhs.getProdi());
                        Penilaian.tampilkanPenilaianMahasiswa(mhs.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
    
            System.out.println();
        
        } while (menu != 0);
    }
}