/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.LinkedList;

/**
 *
 * @author me
 */
public interface GlobalVar {
    public LinkedList data_gaji = new LinkedList();
    
    public void inputGaji(String nama, int gaji);
    public void removeGaji(int index);
    public void tampilGaji();
}
