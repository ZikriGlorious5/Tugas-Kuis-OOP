// Nama: Muhammad Abdurrahman Dzikri
// Kelas: Reguler B
// NPM: 231106040886
package perhitunganGaji;
import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // form data karyawan
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Golongan (1/2/3): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        input.nextLine(); // untuk konsumsi baris baru dari input sebelumnya
        String jabatan = input.nextLine();
        System.out.print("Masukkan Jumlah Kehadiran: ");
        int kehadiran = input.nextInt();
        // Menghitung tunjangan karyawan
        double tunjanganGolongan = 0;
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        
        double tunjanganJabatan;
        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        double tunjanganKehadiran = kehadiran * 10000;
        // Menghitung total gaji
        double gajiTotal = tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
        // Menampilkan hasil perhitungan gaji karyawan
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK            : " + nik);
        System.out.println("NAMA           : " + nama);
        System.out.println("GOLONGAN       : " + golongan);
        System.out.println("JABATAN        : " + jabatan);
        System.out.println("TUNJANGAN GOLONGAN : " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN  : " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN: " + tunjanganKehadiran);
        System.out.println("GAJI TOTAL     : " + gajiTotal);
        
        input.close();
    }
}