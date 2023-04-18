package latihan2;

class Karyawan {
    public String nama;

    public Karyawan(String nama) {
        this.nama = nama;
    }
}

class KaryawanTetap extends Karyawan {
    public int gajiPokok;
    public int tunjanganAnak;

    public KaryawanTetap(String nama, int gajiPokok, int tunjanganAnak) {
        super(nama);
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
    }

    void hitungGaji() {
        System.out.println("Gaji " + this.nama + " : " + String.valueOf((this.gajiPokok + this.tunjanganAnak)));
    }
}

class KaryawanKontrak extends Karyawan {
    public int upahHarian;
    public int tunjanganAnak;
    public int totalKehadiran;

    public KaryawanKontrak(String nama, int upahHarian, int totalKehadiran, int tunjanganAnak) {
        super(nama);
        this.upahHarian = upahHarian;
        this.tunjanganAnak = tunjanganAnak;
        this.totalKehadiran = totalKehadiran;
    }

    void hitungTotalUpah() {
        System.out.println("Total Upah " + this.nama + " : "
                + String.valueOf(((this.upahHarian * this.totalKehadiran) + this.tunjanganAnak)));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        KaryawanTetap kT = new KaryawanTetap("Udin", 2400000, 200000);
        kT.hitungGaji();

        KaryawanKontrak kK = new KaryawanKontrak("Budi", 80000, 24, 200000);
        kK.hitungTotalUpah();
    }
}