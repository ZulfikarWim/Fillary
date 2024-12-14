package Fillary;

//Arsa Maulana Adhyasta (235150201111030)
//Aang Maulana (235150200111036)
//Muhammad Zulfikar Raditya Wimbyarto (235150201111034)
//Ahmad Muzaki Ulumuddin (235150207111040)

public class Buku {
    private String ID;
    private String judul;
    private String pengarang;
    private String kategori;
    private int stok;

    public Buku(String ID, String judul, String pengarang, String kategori, int stok) {
        this.ID = ID;
        this.judul = judul;
        this.pengarang = pengarang;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getID() {
        return ID;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

