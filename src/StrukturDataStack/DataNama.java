package StrukturDataStack;

public class DataNama {
    private String NamaDepan;
    private String NamaBelakang;
    private int id;

    public DataNama(String NamaDepan, String NamaBelakang, int id)
    {
        this.NamaDepan = NamaDepan;
        this.NamaBelakang = NamaBelakang;
        this.id = id;
    }

    public String getNamaDepan(){
        return NamaDepan;
    }
    public void setNamaDepan(String NamaDepan){
        this.NamaDepan = NamaDepan;
    }
    public String getNamaBelakang(){
        return NamaBelakang;
    }
    public void setNamaBelakang(String NamaBelakang){
        this.getNamaBelakang();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "DataNama (" +
                "NamaDepan='" + NamaDepan+ '\'' +
                ", NamaBelakang='" + NamaBelakang + '\'' +
                ", id=" + id +
                ')';
    }
}
