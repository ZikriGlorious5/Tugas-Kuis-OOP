// Nama: Muhammad Abdurrahman Dzikri
// Kelas: Reguler B
// NPM: 231106040886
package Akatsuki;

// Superclass KarakterAkatsuki
class KarakterAkatsuki {
    protected String nama;
    protected String asalDesa;
    protected String kemampuanUtama;

    // Constructor
    public KarakterAkatsuki(String nama, String asalDesa, String kemampuanUtama) {
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.kemampuanUtama = kemampuanUtama;
    }

    // Metode serang() yang bisa di-override di subclass
    public String serang() {
        return nama + " melakukan serangan dasar.";
    }

    public String bertahan() {
        return nama + " bertahan dari serangan.";
    }
}

// Subclass Itachi
class Itachi extends KarakterAkatsuki {
    public Itachi() {
        super("Itachi Uchiha", "Konoha", "Mangekyou Sharingan");
    }

    @Override
    public String serang() {
        return nama + " menggunakan " + kemampuanUtama + " untuk menyerang!";
    }
}

// Subclass Kisame
class Kisame extends KarakterAkatsuki {
    public Kisame() {
        super("Kisame Hoshigaki", "Kirigakure", "Samehada");
    }

    @Override
    public String serang() {
        return nama + " menyerang dengan pedang " + kemampuanUtama + "!";
    }
}

// Subclass Pain
class Pain extends KarakterAkatsuki {
    public Pain() {
        super("Pain", "Amegakure", "Rinnegan dan Enam Jalur Pain");
    }

    @Override
    public String serang() {
        return nama + " menggunakan " + kemampuanUtama + " untuk mengendalikan medan perang!";
    }
}

// Subclass Konan
class Konan extends KarakterAkatsuki {
    public Konan() {
        super("Konan", "Amegakure", "Kertas Ledakan");
    }

    @Override
    public String serang() {
        return nama + " menyerang dengan teknik " + kemampuanUtama + "!";
    }
}

// Subclass Deidara
class Deidara extends KarakterAkatsuki {
    public Deidara() {
        super("Deidara", "Iwagakure", "Peledak Tanah Liat");
    }

    @Override
    public String serang() {
        return nama + " meledakkan " + kemampuanUtama + " dalam serangan seni!";
    }
}

// Subclass Sasori
class Sasori extends KarakterAkatsuki {
    public Sasori() {
        super("Sasori", "Sunagakure", "Puppet Master Jutsu");
    }

    @Override
    public String serang() {
        return nama + " menyerang dengan boneka-bonekanya menggunakan " + kemampuanUtama + "!";
    }
}

// Subclass Hidan
class Hidan extends KarakterAkatsuki {
    public Hidan() {
        super("Hidan", "Yugakure", "Jashin Ritual");
    }

    @Override
    public String serang() {
        return nama + " melakukan ritual " + kemampuanUtama + " untuk menyerang!";
    }
}

// Subclass Kakuzu
class Kakuzu extends KarakterAkatsuki {
    public Kakuzu() {
        super("Kakuzu", "Takigakure", "Jutsu Jahit dan Pengendalian Hati");
    }

    @Override
    public String serang() {
        return nama + " menyerang dengan jutsu " + kemampuanUtama + "!";
    }
}

// Subclass Tobi
class Tobi extends KarakterAkatsuki {
    public Tobi() {
        super("Tobi (Obito Uchiha)", "Konoha", "Kamui dan Manipulasi Ruang");
    }

    @Override
    public String serang() {
        return nama + " menggunakan " + kemampuanUtama + " untuk melancarkan serangan!";
    }
}

// Class utama untuk menjalankan program
public class main {
    public static void main(String[] args) {
        // Membuat array dari karakter-karakter Akatsuki
        KarakterAkatsuki[] akatsukiMembers = {
            new Itachi(),
            new Kisame(),
            new Pain(),
            new Konan(),
            new Deidara(),
            new Sasori(),
            new Hidan(),
            new Kakuzu(),
            new Tobi()
        };

        // Menampilkan serangan masing-masing anggota Akatsuki
        for (KarakterAkatsuki member : akatsukiMembers) {
            System.out.println(member.serang());
        }
    }
}
