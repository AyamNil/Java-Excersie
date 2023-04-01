public class Nilai extends Mahasiswa {
    private String[] mataKuliah;
    private double[] nilai;

    public Nilai(String nama, int semester, String[] mataKuliah, double[] nilai) {
        super(nama, semester);
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public String[] getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public double[] getNilai() {
        return nilai;
    }

    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    public double getRataRata() {
        double totalNilai = 0;
        for (double n : nilai) {
            totalNilai += n;
        }
        return totalNilai / nilai.length;
    }
}

