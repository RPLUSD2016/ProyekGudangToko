package pojos;
// Generated 14-Nov-2018 13:53:41 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TabelTransaksi generated by hbm2java
 */
public class TabelTransaksi  implements java.io.Serializable {


     private Integer idtransaksi;
     private String namaBarang;
     private int hargaBarang;
     private int jumlahBarang;
     private int hargaTotal;
     private Date tanggal;

    public TabelTransaksi() {
    }

    public TabelTransaksi(String namaBarang, int hargaBarang, int jumlahBarang, int hargaTotal, Date tanggal) {
       this.namaBarang = namaBarang;
       this.hargaBarang = hargaBarang;
       this.jumlahBarang = jumlahBarang;
       this.hargaTotal = hargaTotal;
       this.tanggal = tanggal;
    }
   
    public Integer getIdtransaksi() {
        return this.idtransaksi;
    }
    
    public void setIdtransaksi(Integer idtransaksi) {
        this.idtransaksi = idtransaksi;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getHargaBarang() {
        return this.hargaBarang;
    }
    
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public int getJumlahBarang() {
        return this.jumlahBarang;
    }
    
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public int getHargaTotal() {
        return this.hargaTotal;
    }
    
    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
    public Date getTanggal() {
        return this.tanggal;
    }
    
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }




}


