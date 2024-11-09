// Nama: Muhammad Abdurrahman Dzikri
// Kelas: Reguler B
// NPM: 231106040886
package implementasi;
//Kelas Manusia
class Manusia {
 protected String nama;
 protected int umur;

 public String getNama() {
     return nama;
 }

 public void setNama(String nama) {
     this.nama = nama;
 }

 public int getUmur() {
     return umur;
 }

 public void setUmur(int umur) {
     this.umur = umur;
 }

 public void siapaKamu() {
     System.out.println("Saya adalah manusia");
 }
}

//Kelas Dosen yang merupakan turunan dari kelas Manusia
class Dosen extends Manusia {
 private String nip;
 private String mataKuliah;

 public String getNip() {
     return nip;
 }

 public void setNip(String nip) {
     this.nip = nip;
 }

 public String getMataKuliah() {
     return mataKuliah;
 }

 public void setMataKuliah(String mataKuliah) {
     this.mataKuliah = mataKuliah;
 }

 public void mengajarApa() {
     System.out.println("Saya mengajar mata kuliah " + mataKuliah);
 }

 @Override
 public void siapaKamu() {
     System.out.println("Saya adalah dosen dengan NIP " + nip);
 }
}

//Kelas Mahasiswa yang merupakan turunan dari kelas Manusia
class Mahasiswa extends Manusia {
 private String nim;
 private String kelas;

 public String getNim() {
     return nim;
 }

 public void setNim(String nim) {
     this.nim = nim;
 }

 public String getKelas() {
     return kelas;
 }

 public void setKelas(String kelas) {
     this.kelas = kelas;
 }

 public void kelasApa() {
     System.out.println("Saya berada di kelas " + kelas);
 }

 @Override
 public void siapaKamu() {
     System.out.println("Saya adalah mahasiswa dengan NIM " + nim);
 }
}

//Kelas utama untuk menguji program
public class inheritance {
	public static void main(String[] args) {
	     // Membuat objek Dosen
	     Dosen dosen = new Dosen();
	     dosen.setNama("Budi");
	     dosen.setUmur(40);
	     dosen.setNip("123456");
	     dosen.setMataKuliah("Pemrograman Berorientasi Objek");

	     // Membuat objek Mahasiswa
	     Mahasiswa mahasiswa = new Mahasiswa();
	     mahasiswa.setNama("Andi");
	     mahasiswa.setUmur(20);
	     mahasiswa.setNim("210123456");
	     mahasiswa.setKelas("TI-1A");

	     // Menampilkan informasi Dosen
	     System.out.println("Dosen:");
	     System.out.println("Nama: " + dosen.getNama());
	     System.out.println("Umur: " + dosen.getUmur());
	     dosen.siapaKamu();
	     dosen.mengajarApa();

	     // Menampilkan informasi Mahasiswa
	     System.out.println("\nMahasiswa:");
	     System.out.println("Nama: " + mahasiswa.getNama());
	     System.out.println("Umur: " + mahasiswa.getUmur());
	     mahasiswa.siapaKamu();
	     mahasiswa.kelasApa();
	 }
	}

