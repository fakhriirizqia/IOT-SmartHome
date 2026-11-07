public class LampuPintar extends PerangkatIoT
        implements BisaDikontrol, BisaTerhubungInternet {

    private int tingkatCahaya;

    // Konstruktor pertama
    public LampuPintar(String idPerangkat) {
        super(idPerangkat);
        this.tingkatCahaya = 50;
    }

    // Konstruktor kedua
    public LampuPintar(String idPerangkat, String namaPerangkat, int tingkatCahaya) {
        super(idPerangkat, namaPerangkat);
        this.tingkatCahaya = tingkatCahaya;
    }

    public int getTingkatCahaya() {
        return tingkatCahaya;
    }

    public void setTingkatCahaya(int tingkatCahaya) {
        this.tingkatCahaya = tingkatCahaya;
    }

    @Override
    public void ubahStatus(boolean status) {
        if (status == true) {
            setStatusAktif(true);
            System.out.println("Lampu berhasil dinyalakan.");
        } else {
            setStatusAktif(false);
            System.out.println("Lampu berhasil dimatikan.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tingkat cahaya : " + tingkatCahaya + "%");
    }

    @Override
    public void kontrol(boolean status) {
        ubahStatus(status);
    }

    @Override
    public void hubungkanInternet() {
        System.out.println("Lampu terhubung ke internet.");
    }
}
