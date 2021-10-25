/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parent;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 *
 * @author me
 */
public class GlobalVar {
//    private String[][] data_gaji = new String[2][100];
    private LinkedList gaji_karyawan = new LinkedList();

    public LinkedList getGaji_karyawan() {
        return gaji_karyawan;
    }
    
    public void inputGaji(String nama, int gaji){
        LinkedHashMap data_gaji = new LinkedHashMap();
        data_gaji.put("nama", nama);
        data_gaji.put("gaji", gaji);
        
        gaji_karyawan.add(data_gaji);
    }
    
    public void editGaji(int index, String nama, int gaji){
        LinkedHashMap ubah_gaji = new LinkedHashMap();
        ubah_gaji.put("nama", nama);
        ubah_gaji.put("gaji", gaji);
        
        gaji_karyawan.set(index, ubah_gaji);
    }
    
    public void removeGaji(int index){
        gaji_karyawan.remove(index);
    }
}
