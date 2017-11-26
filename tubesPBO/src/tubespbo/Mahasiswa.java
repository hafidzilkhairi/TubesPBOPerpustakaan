package tubespbo;
public class Mahasiswa extends Manusia {
    private String nim;
    private String jurusan;
    private String angkatan;
    private String organisasi;
    private String status;
    
    public Mahasiswa(String nama, String ktp, String alamat,String nim,String jurusan,String angkatan){
        super(nama,ktp,alamat);
        this.nim=nim;
        this.jurusan=jurusan;
        this.angkatan=angkatan;
    }
    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }
    public String getJurusan(String jurusan ){
        return jurusan;
    }
    public void setAngakatan(String angkatan){
        this.angkatan=angkatan;
    }
    public String getAngakatan(){
        return angkatan;
    }
    public void setOrganisasi(String organisasi){
        this.organisasi=organisasi;
    }
    public String getOrganisasi(){
        return organisasi;
    }
    @Override
    public void setnomorinduk(String nim){
        this.nim=nim;
    }
    @Override
    public String getnomorinduk(){
        return nim;
    }
    @Override
    public void setstatus(String status) {
        this.status=status;
    }
    @Override
    public String getstatus() {
        return status;
    } 
}
