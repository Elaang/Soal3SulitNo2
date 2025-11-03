package Sekolah.UKL;
import java.util.Scanner;
public class MenghitungMatrixBejir {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Hello hello helloo!");
        System.out.println("Ini buat ngitung penjumlahan dua matrix si.");
        System.out.println("cukup bikin STRES buatnya.");
        System.out.println("Dah, langsung aja.");
        System.out.println("================================");
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        System.out.println("================================");
        System.out.println("FYI: Baris itu menurun / kebawah, kolom itu mendatar / kesamping.");
        System.out.println("FYI: tanda kurung siku pertama ([]) merupakan baris, sedangkan tanda kurung siku kedua adalah kolom.");
        System.out.println("================================");        
        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Butuh divisualisasikan gak?");
        System.out.println("Butuh / Gak");
        String visual = input.next();
        if (visual.equalsIgnoreCase("Gak")) {
            System.out.println("Iya deh si paling pinter.");
        } else if (visual.equalsIgnoreCase("Butuh")) {
            System.out.println("Okelah, dapat dipahami.");
            System.out.println("Dari pada bingung, aku visualisasikan dah. ");
            System.out.println("================================");
            System.out.println("\nMasukkan elemen matriks A:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        System.out.print(matriksA[i][j] + "\t");
                    }
                    System.out.println();
        }
            System.out.println("\nMatriks B:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        System.out.print(matriksB[i][j] + "\t");
                    }
                    System.out.println();
                }
        System.out.println("================================");
        }

        System.out.println("Gimana? kamu tau gak cara ngitungnya?");
        System.out.println("Tau / Gak");
        String jawab = input.next();
        if (jawab.equalsIgnoreCase("Tau")) {
            System.out.println("If you already know, why did you run this program? Huh.");
            System.out.println("just get out.");
            System.exit(0);
        } else if (jawab.equalsIgnoreCase("Tidak")) {
            System.out.println("Yaelah, gitu doang gatau.");
            System.out.println("Yaudah, ku itung sini dah.");
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\nHasil penjumlahan matriks A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
