import java.util.Scanner;

/**
 * Algoritma Metode Newton Raphson :
1. Definisikan fungsi f(x) dan f '(x)
2. Tentukan toleransi error (e) dan iterasi maksimum (n)
3. Tentukan nilai pendekatan awal x0
4. Hitung f(x0) dan f '(x0 )
5. Untuk iterasi I = 1 s/d n atau |f(xi)|≥ e
xi+1 = xi − f (xi)
f '
(xi)
, Hitung f(xi) dan f '(xi)
6. Akar persamaan adalah nilai xi yang terakhir diperoleh.

 */


public class NewtonRaphson {
    
    
    //persamaan 1
    public static double f1(double x){
        double result;

        result = (4 * Math.pow(x, 3)) - (15 * Math.pow(x, 2)) + (17 * x) - 6; //4x^3 – 15x^2 + 17x^1 – 6 

        return result;
    }

    public static double f1t(double x){
        double result;
        
        result = (12 * Math.pow(x, 2)) - (30 * Math.pow(x, 1)) + (17); //12x^2 – 30x^1 + 17  

        return result;
    }

    //persamaan 2
    public static double f2(double x){
        double result;

        result = (1 * Math.pow(x, 3)) - (2 * Math.pow(x, 2)) + (3 * x) - 6; //x3 – 2x2 + 3x – 6

        return result;
    }

    
    public static double f2t(double x){
        double result;

        result = (3 * Math.pow(x, 2)) - (4 * x) + (3); //3x^2 – 4x^1 + 3 

        return result;
    }

    
    //persamaan 3
    public static double f3(double x){
        double result;

        result = (1 * Math.pow(x, 5))-(2 * Math.pow(x, 2))-4; //x5 + 2x2 – 4 = 0

        return result;
    }

    
    public static double f3t(double x){
        double result;

        result = (5 * Math.pow(x, 4))-(4 * Math.pow(x, 1)) ; //5x^4 + 4x^1 = 0

        return result;
    }

    public static void main(String[] args){

    //variable
    double e = 0.001; // eror
    double x0 = 3.0; // nilai f(x) pertama
    int n = 10; // iterasi
    int iterasi ; //
    int pilihan ; 
    String ulang;
    boolean kondisi = true;
    double absA;
    double y1,y2,xn;


try(Scanner input1 = new Scanner(System.in)){
    try(Scanner input = new Scanner(System.in)){
        while(kondisi){

    String tampilan="""
======================================================
||  NO  || List jawaban     ||                      ||
======================================================
||  1   ||  tekan tombol 1  ||  Jawaban soal no 1   ||
||  2   ||  tekan tombol 2  ||  Jawaban soal no 2   ||
||  3   ||  tekan tombol 3  ||  Jawaban soal no 3   ||
||  4   ||  tekan tombol 4  ||  Created By:         ||
======================================================
""";

System.out.println(tampilan);

System.out.println("Masukan pilihan anda ");
pilihan = input.nextInt();

//1
if (pilihan ==1 ){
    System.out.println("Soal 1");
    System.out.print("========================================================================");
    System.out.printf("\nIterasi\t\tx0\t\tf(xn)\t\tf'(xn)\n");
    iterasi = 0;
    xn = x0;
    y1 = f1(x0);
    y2 = f1t(x0);
    System.out.printf("%d\t\t%.5f\t\t%.5f\t%.5f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);

    absA = Math.abs(y1);
    while (absA >= e && iterasi <= n) {
    iterasi++;
    y1 = f1(xn);
    y2 = f1t(xn);
    System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);
    absA = Math.abs(y1);
    }
    System.out.println("========================================================================");
    System.out.printf("Akar x = %.5f\n", xn);
} 
// if 1
//2

    else if (pilihan ==2 ){
    System.out.println("Soal 2");
    System.out.print("========================================================================");
    System.out.printf("\nIterasi\t\tx0\t\tf(xn)\t\tf'(xn)\n");
    iterasi = 0;
    xn = x0;
    y1 = f2(x0);
    y2 = f2t(x0);
    System.out.printf("%d\t\t%.5f\t\t%.5f\t%.5f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);

    absA = Math.abs(y1);
    while (absA >= e && iterasi <= n) {
    iterasi++;
    y1 = f2(xn);
    y2 = f2t(xn);
    System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);
    absA = Math.abs(y1);
    }
    System.out.println("========================================================================");
    System.out.printf("Akar x = %.2f\n", xn);
} // else if 2

//3

    else if (pilihan ==3 ){
    System.out.println("Soal 3");
    System.out.print("========================================================================");
    System.out.printf("\nIterasi\t\tx0\t\tf(xn)\t\tf'(xn)\n");
    iterasi = 0;
    xn = x0;
    y1 = f3(x0);
    y2 = f3t(x0);
    System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);
    
    absA = Math.abs(y1);
    while (absA >= e && iterasi <= n) {
    iterasi++;
    y1 = f3(xn);
    y2 = f3t(xn);
    System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi,xn, y1, y2);
    xn = xn - (y1 / y2);
    absA = Math.abs(y1);
    }
    System.out.println("========================================================================");
    System.out.printf("Akar x = %.2f\n", xn);



} // else if 3
else if ( pilihan == 4) {
    System.out.println(" Nama : Khairul Umam Albi ");
    
}// else if 4
else {
    System.out.println("Eror");
}

System.out.println(" Apakah anda ingin mengulang applikasi ?");
System.out.println("=================");
System.out.println("|| Y    ||  T  ||");
System.out.println("=================");
System.out.print("masukan kata perintah :\t");
ulang = input1.nextLine();

if (ulang.equalsIgnoreCase("y" )){
    kondisi = true;
}else{
    kondisi = false;

System.out.println(" =================");
System.out.println(" || @   ||   @  ||");
System.out.println(" =================");
System.out.println(" -----------------");
System.out.println(" ((((((((()))))))))");
System.out.println(" (((Terima Kasih)))");




}

}
}// akhir try
    }// akhir while kondisi


}// psvm
}// akhir public class
