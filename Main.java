public class Main {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     " + PerangkatIoT.NAMA_SISTEM);
        System.out.println("================================");

        // Membuat objek lampu dan kipas
        LampuPintar lampu = new LampuPintar("L001", "Lampu Ruang Tamu", 80);
        KipasPintar kipas = new KipasPintar("K001", "Kipas Kamar", 2);

        // Menampilkan informasi awal
        System.out.println("\n--- Informasi Perangkat ---");
        lampu.tampilkanInfo();
        System.out.println();
        kipas.tampilkanInfo();

        // Menguji method kontrol
        System.out.println("\n--- Mengontrol Perangkat ---");
        BisaDikontrol kontrolLampu = new LampuPintar("L002", "Lampu Dapur", 60);
        BisaDikontrol kontrolKipas = kipas;

        kontrolLampu.kontrol(true);
        kontrolKipas.kontrol(true);

        // Menguji interface kedua
        System.out.println("\n--- Koneksi Internet ---");
        BisaTerhubungInternet koneksi = lampu;
        koneksi.hubungkanInternet();

        // Mengubah tingkat cahaya dan kecepatan
        System.out.println("\n--- Mengubah Pengaturan ---");
        lampu.setTingkatCahaya(100);
        kipas.setKecepatan(3);

        // Mematikan perangkat
        System.out.println("\n--- Mematikan Perangkat ---");
        lampu.ubahStatus(false);
        kipas.ubahStatus(false);

        // Menampilkan informasi akhir
        System.out.println("\n--- Kondisi Akhir ---");
        lampu.tampilkanInfo();
        System.out.println();
        kipas.tampilkanInfo();

        System.out.println("\nProgram selesai.");
    }
}
