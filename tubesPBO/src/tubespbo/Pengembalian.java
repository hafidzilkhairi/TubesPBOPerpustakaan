/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubespbo;

/**
 *
 * @author farhan
 */
public class Pengembalian {
    private String tgl_pengembalian;
    private double denda;
    
    public  Pengembalian(double denda){
        this.denda=denda;
    }
    public void setDenda(double denda){
        this.denda=denda;
    }
    public void setTgl_Pengembalian(String tgl_pengembalian){
        this.tgl_pengembalian=tgl_pengembalian;
    }
    public double getDenda(){
        return denda;
    }
    public String getTgl_Pengembalian(){
        return tgl_pengembalian;
    }
    
}
