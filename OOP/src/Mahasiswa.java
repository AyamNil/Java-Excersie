public class Mahasiswa {
    private String nama;
    private int semester;

    public Mahasiswa(String nama, int semester) {
        this.nama = nama;
        this.semester = semester;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
