package penjualanObat;

public class pembelian {
    String kode_barang, nama_barang, satuan, harga_beli, harga_jual;

    public pembelian(String kode_barang, String nama_barang, String satuan, String harga_beli, String harga_jual) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.satuan = satuan;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
    }

    public String getKodeBarang() {
        return kode_barang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public String getHargaBeli() {
        return harga_beli;
    }

    public String getHargaJual() {
        return harga_jual;
    }
}