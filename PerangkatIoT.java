public abstract class PerangkatIoT {
    public static final String NAMA_SISTEM = "SMART HOME IoT";

    private final String idPerangkat;
    private String namaPerangkat;
    private boolean statusAktif;

    // Konstruktor pertama
    public PerangkatIoT(String idPerangkat) {
        this.idPerangkat = idPerangkat;
        this.namaPerangkat = "Perangkat";
        this.statusAktif = false;
    }

    // Konstruktor kedua (overloading)
    public PerangkatIoT(String idPerangkat, String namaPerangkat) {
        this.idPerangkat = idPerangkat;
        this.namaPerangkat = namaPerangkat;
        this.statusAktif = false;
    }

    // Getter dan setter
    public String getIdPerangkat() {
        return idPerangkat;
    }

    public String getNamaPerangkat() {
        return namaPerangkat;
    }

    public void setNamaPerangkat(String namaPerangkat) {
        this.namaPerangkat = namaPerangkat;
    }

    public boolean getStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    // Method prosedur
    public void tampilkanInfo() {
        System.out.println("ID Perangkat : " + idPerangkat);
        System.out.println("Nama         : " + namaPerangkat);
        System.out.println("Status       : " + (statusAktif ? "Aktif" : "Mati"));
    }

    // Method abstract
    public abstract void ubahStatus(boolean status);
}
