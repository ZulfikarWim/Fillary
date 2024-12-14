package Fillary;

//Arsa Maulana Adhyasta (235150201111030)
//Aang Maulana (235150200111036)
//Muhammad Zulfikar Raditya Wimbyarto (235150201111034)
//Ahmad Muzaki Ulumuddin (235150207111040)

public class Main {
    public static void main(String[] args) {
        SistemFillary sistem = new SistemFillary();

        Buku buku1 = new Buku("1", "Pemrograman Java", "John Doe", "Programming", 5);
        sistem.tambahBuku(buku1);

        Mahasiswa mahasiswa = new Mahasiswa("user1", "pass1", "Arsa Maulana", "235150201111030");
        if (mahasiswa.login("user1", "pass1")) {
            mahasiswa.mencariBuku("Pemrograman Java", sistem);
            mahasiswa.meminjamBuku("1", sistem);
            mahasiswa.logout();
        }
    }
}

