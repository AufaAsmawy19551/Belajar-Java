package test;

public class Contoh extends Object{
    private String nama;
    private Integer umur;

    public Contoh(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Contoh{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }
}
