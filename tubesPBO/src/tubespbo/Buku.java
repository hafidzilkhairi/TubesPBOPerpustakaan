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
public class Buku {
    private String pengarang;
    private String penerbit;
    private String judul;
    private double harga;
    private String tahun;
    private int jumlah=0;
    
    public Buku(String pengarang,String penerbit,String judul){
        this.pengarang=pengarang;
        this.penerbit=penerbit;
        this.judul=judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang=pengarang;
    }    
    public void setPenerbit(String penerbit){
        this.penerbit=penerbit;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public void setHarga(double harga){
        this.harga=harga;
    }
    public void setTahun(String tahun){
        this.tahun=tahun;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public String getJudul(){
        return judul;
    }
    public double getHarga(){
        return harga;
    }
    public String getTahun(){
        return tahun;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
}