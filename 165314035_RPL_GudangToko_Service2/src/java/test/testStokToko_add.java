/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.StokBarangTokoHelper;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class testStokToko_add {
    public static void main(String[] args) {
        try {
            StokBarangTokoHelper toko = new StokBarangTokoHelper();
            toko.tambahStokToko(20180001, "Wafer Tanggo Vanilla", 100, 8000);
        } catch (Exception e) {
            Logger.getLogger(testStokToko_add.class.getName());
        }
    }
}
