package tubespbo;
public abstract class Manusia {
    private String nama;
    private String ktp;
    private String alamat;
    private String jenis_kelamin;
    private String ttl;
    private String no_hp;
    private String email;
    
    public Manusia(String nama,String ktp,String alamat){
        this.nama=nama;
        this.alamat=alamat;
        this.ktp=ktp;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKtp(String ktp){
        this.ktp=ktp;
    }
    public String getktp(){
        return ktp;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setjenis_Kelamin(String jenis_kelamin){
        this.jenis_kelamin=jenis_kelamin;
    }
    public String getJenis_Kelamin(){
        return jenis_kelamin;
    }
    public void setTtl(String ttl){
        this.ttl=ttl;
    }
    public String getTtl(){
        return ttl;
    }
    public void setNo_Hp(String no_hp){
        this.no_hp=no_hp;
    }
    public String getNo_Hp(){
        return no_hp;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public abstract void setstatus(String status);
    public abstract String getstatus();
    public abstract void setnomorinduk(String a);
    public abstract String getnomorinduk();
}
