/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

//import java.sql.Date;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.TabelKirimBarang;
import util.RPLHibernateUtil;

/**
 *
 * @author Windows
 */
public class KirimBarangHelper {

    public KirimBarangHelper() {
    }
    
    public List<TabelKirimBarang> getAllKirimBarang(){
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        String query = "from TabelKirimBarang";
        Query q = session.createQuery(query);
        List<TabelKirimBarang> list = q.list();
        session.close();
        return list;
    }
    
    public void kirimBarang(int idtoko, String namaBarang, 
            int jumlahBarang, Date tanggal){
        
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        TabelKirimBarang kirim = new TabelKirimBarang(idtoko, namaBarang, jumlahBarang, tanggal);
        session.saveOrUpdate(kirim);
        transaction.commit();
        session.close();
    }
    
    public List<TabelKirimBarang> cariKirimBarang(int idtoko) {
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        String query = "from TabelKirimBarang kr where kr.idtoko=:idtoko";
        Query q = session.createQuery(query);
        q.setParameter("idtoko", idtoko);
        List<TabelKirimBarang> list = q.list();
        ts.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
    
    public List<TabelKirimBarang> cariNamaKirimBarang(String namaBarang) {
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        String query = "from TabelKirimBarang kr where kr.namaBarang=:namaBarang";
        Query q = session.createQuery(query);
        q.setParameter("namaBarang", namaBarang);
        List<TabelKirimBarang> list = q.list();
        tr.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
