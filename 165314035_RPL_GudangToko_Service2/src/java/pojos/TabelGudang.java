package pojos;
// Generated 14-Nov-2018 13:53:41 by Hibernate Tools 4.3.1



/**
 * TabelGudang generated by hbm2java
 */
public class TabelGudang  implements java.io.Serializable {


     private Integer idgudang;
     private String namaGudang;
     private String alamatGudang;

    public TabelGudang() {
    }

    public TabelGudang(String namaGudang, String alamatGudang) {
       this.namaGudang = namaGudang;
       this.alamatGudang = alamatGudang;
    }
   
    public Integer getIdgudang() {
        return this.idgudang;
    }
    
    public void setIdgudang(Integer idgudang) {
        this.idgudang = idgudang;
    }
    public String getNamaGudang() {
        return this.namaGudang;
    }
    
    public void setNamaGudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }
    public String getAlamatGudang() {
        return this.alamatGudang;
    }
    
    public void setAlamatGudang(String alamatGudang) {
        this.alamatGudang = alamatGudang;
    }




}


