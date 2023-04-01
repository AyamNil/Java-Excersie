import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();

        scanner.nextLine();

        String[] mataKuliah = new String[3];
        double[] nilai = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Matkul %d: ", i+1);
            mataKuliah[i] = scanner.nextLine();

            System.out.printf("Nilai %d: ", i+1);
            nilai[i] = scanner.nextDouble();
            scanner.nextLine();
        }


        System.out.println("========================REPORT============================");
        Nilai dataMahasiswa = new Nilai(nama, semester, mataKuliah, nilai);

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + dataMahasiswa.getNama());
        System.out.println("Semester: " + dataMahasiswa.getSemester());
        System.out.println("Mata kuliah:");
        for (int i = 0; i < 3; i++) {
            System.out.println(mataKuliah[i] + ": " + nilai[i]);
        }
        System.out.println("Rata-rata: " + dataMahasiswa.getRataRata());
    }
}
