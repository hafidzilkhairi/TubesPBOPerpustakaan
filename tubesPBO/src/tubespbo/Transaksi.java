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
public class Transaksi {
    private String tgl_transaksi;
    private String kode_transaksi;
    
    public Transaksi(String kode_transaksi){
        this.kode_transaksi=kode_transaksi;
    }
    public void setKodeTransaksi(String kode_transaksi){
        this.kode_transaksi=kode_transaksi;
    }
    public void setTgl(String tgl_transaksi){
        this.tgl_transaksi=tgl_transaksi;
    }
    public String getKodeTransaksi(){
        return kode_transaksi;
    }
    public String kode_transaksi(){
        return kode_transaksi;
    }
}
