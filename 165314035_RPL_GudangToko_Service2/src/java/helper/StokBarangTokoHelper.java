/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.TabelStokBarangToko;
import util.RPLHibernateUtil;

/**
 *
 * @author Windows
 */
public class StokBarangTokoHelper {

    public StokBarangTokoHelper() {
    }

    public List<TabelStokBarangToko> getAllBarangToko() {
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        String query = "from TabelStokBarangToko";
//        String query = "from TabelStokBarangToko tk where tk.idbarang=:idbarang";
        Query q = session.createQuery(query);
        List<TabelStokBarangToko> list = q.list();
        session.close();
        return list;
    }

    public void tambahStokToko(int idtoko, String namaBarang,
            int jumlahBarang, int hargaBarag) {

        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        TabelStokBarangToko stokToko = new TabelStokBarangToko(idtoko, namaBarang, jumlahBarang, hargaBarag);
        session.saveOrUpdate(stokToko);
        transaction.commit();
        session.close();
    }

//    public void beliBarang(String namaBarang, Integer jumlahBarang, Integer hargaBarang) {
//        Session session = RPLHibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        TabelStokBarangToko beli = new TabelStokBarangToko(namaBarang, jumlahBarang, hargaBarang);
//        session.saveOrUpdate(beli);
//        transaction.commit();
//        session.close();
//    }
    
    public List<TabelStokBarangToko> cariStokToko(int idtoko) {
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        String query = "from TabelStokBarangToko st where st.idtoko=:idtoko";
        Query q = session.createQuery(query);
        q.setParameter("idtoko", idtoko);
        List<TabelStokBarangToko> list = q.list();
        ts.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
    
    public List<TabelStokBarangToko> cariNamaBarang(String namaBarang) {
        Session session = RPLHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        String query = "from TabelStokBarangToko st where st.namaBarang=:namaBarang";
        Query q = session.createQuery(query);
        q.setParameter("namaBarang", namaBarang);
        List<TabelStokBarangToko> list = q.list();
        ts.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
