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
public class Peminjaman {
    private String tgl_peminjaman;
    private String kode_peminjaman;
    
    public Peminjaman(String kode_peminjaman){
        this.kode_peminjaman=kode_peminjaman;
    }
    public void setKode(String kode_peminjaman){
        this.kode_peminjaman=kode_peminjaman;
    }
    public void setTgl_kode(String tgl_peminjaman){
        this.tgl_peminjaman=tgl_peminjaman;
    }   
    public String getKode_Peminjaman(){
        return kode_peminjaman;
    }
    public String getTgl_peminjaman(){
        return tgl_peminjaman;
    }
}
