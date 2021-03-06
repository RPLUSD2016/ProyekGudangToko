package pojos;
// Generated Nov 10, 2018 2:58:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Barang generated by hbm2java
 */
public class Barang  implements java.io.Serializable {


     private Integer idBarang;
     private String namaPengirim;
     private String namaPenerima;
     private String noHpPenerima;
     private String noHpPengirim;
     private String alamatTujuan;
     private String alamatPengirim;
     private Date tanggalMasuk;
     private String jenisPengiriman;
     private String statusBarang;
     private int totalHarga;
     private Date tanggalDiterima;
     private Date waktuDiterima;
     private String namaKurir;
     private String tableRouting;

    public Barang() {
    }

    public Barang(String namaPengirim, String namaPenerima, String noHpPenerima, String noHpPengirim, String alamatTujuan, String alamatPengirim, Date tanggalMasuk, String jenisPengiriman, String statusBarang, int totalHarga, Date tanggalDiterima, Date waktuDiterima, String namaKurir, String tableRouting) {
       this.namaPengirim = namaPengirim;
       this.namaPenerima = namaPenerima;
       this.noHpPenerima = noHpPenerima;
       this.noHpPengirim = noHpPengirim;
       this.alamatTujuan = alamatTujuan;
       this.alamatPengirim = alamatPengirim;
       this.tanggalMasuk = tanggalMasuk;
       this.jenisPengiriman = jenisPengiriman;
       this.statusBarang = statusBarang;
       this.totalHarga = totalHarga;
       this.tanggalDiterima = tanggalDiterima;
       this.waktuDiterima = waktuDiterima;
       this.namaKurir = namaKurir;
       this.tableRouting = tableRouting;
    }
   
    public Integer getIdBarang() {
        return this.idBarang;
    }
    
    public void setIdBarang(Integer idBarang) {
        this.idBarang = idBarang;
    }
    public String getNamaPengirim() {
        return this.namaPengirim;
    }
    
    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }
    public String getNamaPenerima() {
        return this.namaPenerima;
    }
    
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }
    public String getNoHpPenerima() {
        return this.noHpPenerima;
    }
    
    public void setNoHpPenerima(String noHpPenerima) {
        this.noHpPenerima = noHpPenerima;
    }
    public String getNoHpPengirim() {
        return this.noHpPengirim;
    }
    
    public void setNoHpPengirim(String noHpPengirim) {
        this.noHpPengirim = noHpPengirim;
    }
    public String getAlamatTujuan() {
        return this.alamatTujuan;
    }
    
    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }
    public String getAlamatPengirim() {
        return this.alamatPengirim;
    }
    
    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }
    public Date getTanggalMasuk() {
        return this.tanggalMasuk;
    }
    
    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
    public String getJenisPengiriman() {
        return this.jenisPengiriman;
    }
    
    public void setJenisPengiriman(String jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }
    public String getStatusBarang() {
        return this.statusBarang;
    }
    
    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }
    public int getTotalHarga() {
        return this.totalHarga;
    }
    
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    public Date getTanggalDiterima() {
        return this.tanggalDiterima;
    }
    
    public void setTanggalDiterima(Date tanggalDiterima) {
        this.tanggalDiterima = tanggalDiterima;
    }
    public Date getWaktuDiterima() {
        return this.waktuDiterima;
    }
    
    public void setWaktuDiterima(Date waktuDiterima) {
        this.waktuDiterima = waktuDiterima;
    }
    public String getNamaKurir() {
        return this.namaKurir;
    }
    
    public void setNamaKurir(String namaKurir) {
        this.namaKurir = namaKurir;
    }
    public String getTableRouting() {
        return this.tableRouting;
    }
    
    public void setTableRouting(String tableRouting) {
        this.tableRouting = tableRouting;
    }




}


