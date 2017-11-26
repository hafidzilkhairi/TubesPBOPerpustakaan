package tubespbo;
public class Petugas extends Manusia{
    private double gaji;
    private String kode;
    private String status;
    public Petugas(String nama, String ktp, String alamat, String kode, double gaji){
        super(nama,ktp,alamat);
        this.kode=kode;
        this.gaji=gaji;
    }   
    public void setGaji(double gaji){
        this.gaji=gaji;
    }
    public double getGaji(){
        return gaji;
    }
    @Override
    public void setstatus(String status) {
        this.status=status;
    }
    @Override
    public String getstatus() {
        return status;
    }
    @Override
    public void setnomorinduk(String kode) {
        this.kode=kode;
    }
    @Override
    public String getnomorinduk() {
        return kode;
    }
}
