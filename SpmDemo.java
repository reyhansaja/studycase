import java.util.Scanner;

public class SpmDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
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
                    System.out.println("Menampilkan daftar mahasiswa...");
                    break;
                case 2:
                    System.out.println("Menampilkan daftar mata kuliah...");
                    break;
                case 3:
                    System.out.println("Menampilkan data penilaian...");
                    break;
                case 4:
                    System.out.println("Mengurutkan mahasiswa berdasarkan nilai akhir...");
                    break;
                case 5:
                    System.out.println("Mencari mahasiswa berdasarkan NIM...");
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