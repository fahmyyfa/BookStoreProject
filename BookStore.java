package org.SistemTokoBuku;

/**
 * Kelas ini mengelola toko buku, menampilkan daftar buku dan menghitung total harga termasuk pajak.
 * Berisi metode untuk menampilkan dan mengambil harga buku berdasarkan pilihan pelanggan.
 *
 * @version 1.0
 */
public class BookStore {
    /**
     * Konstanta untuk menentukan tarif pajak.
     */
    public static final double TAX_RATE = 0.1;

    /**
     * Harga buku Java.
     */
    private double priceJava = 50000.0;

    /**
     * Harga buku Python.
     */
    private double pricePython = 60000.0;

    /**
     * Menampilkan daftar buku yang tersedia beserta harga masing-masing.
     */
    public void displayBooks() {
        System.out.println("1. Buku Java - Rp" + priceJava);
        System.out.println("2. Buku Python - Rp" + pricePython);
    }

    /**
     * Mendapatkan harga buku berdasarkan pilihan pengguna.
     *
     * @param choice Nomor buku yang dipilih (1 untuk Java, 2 untuk Python).
     * @return Harga buku yang dipilih. Jika pilihan tidak valid, mengembalikan 0.0.
     */
    public double getPrice(int choice) {
        if (choice == 1) {
            return priceJava;
        } else if (choice == 2) {
            return pricePython;
        }
        System.out.println("Pilihan tidak valid.");
        return 0.0;
    }
}
