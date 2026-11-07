public class KipasPintar extends PerangkatIoT implements BisaDikontrol {

    private int kecepatan;

    public KipasPintar(String idPerangkat) {
        super(idPerangkat);
        this.kecepatan = 1;
    }

    public KipasPintar(String idPerangkat, String namaPerangkat, int kecepatan) {
        super(idPerangkat, namaPerangkat);
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public void ubahStatus(boolean status) {
        if (status == true) {
            setStatusAktif(true);
            System.out.println("Kipas berhasil dinyalakan.");
        } else {
            setStatusAktif(false);
            System.out.println("Kipas berhasil dimatikan.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kecepatan kipas : " + kecepatan);
    }

    @Override
    public void kontrol(boolean status) {
        ubahStatus(status);
    }
}
