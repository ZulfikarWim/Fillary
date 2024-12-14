package Fillary;

//Arsa Maulana Adhyasta (235150201111030)
//Aang Maulana (235150200111036)
//Muhammad Zulfikar Raditya Wimbyarto (235150201111034)
//Ahmad Muzaki Ulumuddin (235150207111040)

import java.util.HashMap;

public class SistemFillary {
    private HashMap<String, Buku> bukuDatabase = new HashMap<>();

    public void merekomendasikanBuku(String userPreferences) {
        System.out.println("Recommended books based on preferences: " + userPreferences);
    }

    public void menampilkanKetersediaan(String bookTitle) {
        if (bukuDatabase.containsKey(bookTitle)) {
            System.out.println("Book is available: " + bookTitle);
        } else {
            System.out.println("Book is not available: " + bookTitle);
        }
    }

    public boolean checkAvailability(String bookID) {
        Buku buku = bukuDatabase.get(bookID);
        return buku != null && buku.getStok() > 0;
    }

    public void melayaniPeminjamanBuku(String bookID, String userID) {
        Buku buku = bukuDatabase.get(bookID);
        if (buku != null && buku.getStok() > 0) {
            buku.setStok(buku.getStok() - 1);
            System.out.println("Book borrowed successfully by User ID: " + userID);
        } else {
            System.out.println("Book not available");
        }
    }

    public void tambahBuku(Buku buku) {
        bukuDatabase.put(buku.getID(), buku);
    }
}

