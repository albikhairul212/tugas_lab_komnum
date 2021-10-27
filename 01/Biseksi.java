import java.lang.Math;
import java.util.Scanner;

public class Biseksi {

    /*
    nama: Khairul Umam Albi
    NPM = 2008107010072


    F(x)= 3^x - 10x + 8 ................................................1
    batas bawah (a) = 2.4  .............................................2
    batas atas (b) = 2.7  ..............................................3
    nilai toleransi eror (e) = 0.02   ..................................4
    iterasi maksimum(N) = 5   ..........................................5
    


    */

    public static double fungsi( Double x){
        //mencari nilai f(x)
        double hasil;
        hasil = Math.pow(x , 3) - (10 * x) + 8; // f(X) = 3^x - 10x + 8
        return hasil;
    }

    public static double exer( Double a, Double b) {
        // mencari Xr
        double hasil;
        hasil = (a + b) / 2; //rumus mencari xr
        return hasil;
        
    }

    public static void main(String[] args) {
        // nilai bawah,atas,eror
        double A =2.4;
        double B = 2.7;
        double E =0.02;
        int N = 5; // iterasi maksimum
        int i = 0; //iterasi awal

        double hasilA; //f(a)
        double hasilB;// f(b)
        hasilA = fungsi(A);
        hasilB = fungsi(B);
        double hasilXr = 0;
        double hasilFXr = 0;
        boolean kondisi = true;

        //rumus f(a).f(b)<0
        if(hasilA*hasilB > 0){//true
            System.out.println("Tidak ada akar");
        }else // false
        {
            while(kondisi)
            {
                i++;
                hasilXr = exer(A,B); // X = (a+b) /2
                hasilFXr = fungsi(hasilXr); //F(Xr)

                double abs;

                abs = Math.abs(B-A); // |b-a|

                if (abs < E || i > N)
                {
                    kondisi = false;
                }else
                {
                    // true
                    if(hasilA * hasilFXr < 0){
                        // maka 
                        B = hasilXr;
                        hasilB = hasilFXr;
                    }else
                    {
                        A = hasilXr;
                        hasilA = hasilFXr;
                    }
                }
                

            }
            System.out.print("Akar dari xr:" + hasilXr);
            System.out.print("nilai dari F(Xr):" + hasilFXr);
            
        }
        
        
        

        
        
        
        
        
    }

}