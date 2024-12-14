package Fillary;

//Arsa Maulana Adhyasta (235150201111030)
//Aang Maulana (235150200111036)
//Muhammad Zulfikar Raditya Wimbyarto (235150201111034)
//Ahmad Muzaki Ulumuddin (235150207111040)

public class Mahasiswa extends User {
    private String nama;
    private String NIM;

    public Mahasiswa(String username, String password, String nama, String NIM) {
        super(username, password);
        this.nama = nama;
        this.NIM = NIM;
    }

    public void mencariBuku(String bookTitle, SistemFillary sistem) {
        sistem.menampilkanKetersediaan(bookTitle);
    }

    public void meminjamBuku(String bookID, SistemFillary sistem) {
        if (sistem.checkAvailability(bookID)) {
            sistem.melayaniPeminjamanBuku(bookID, NIM);
        } else {
            System.out.println("Book not available");
        }
    }
}
