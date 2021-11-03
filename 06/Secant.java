import java.util.Scanner;

public class Secant {


    public static double f1(double x){
        double  result;

        result = x * Math.exp(-x) + Math.sin(2 * x);// x*exp(-x)+sin(2*x) 

        return result;
    }
    
    public static double f2(double x){
        double  result;

        result = Math.cos(x + 1) + Math.exp(-x + 2) ;// cos(x+1)+exp(-x+2)

        return result;
    }
    
    public static double f3(double x){
        double  result;

        result = Math.cos(x) - Math.sin(x); // cos(x)-sin(x)

        return result;
    }


    public static void main(String[] args) {
    
        int pilihan, N = 10, iterasi = 0;
        double x0, x1, x2 = 0.0, fx0, fx1, fx2 = 0.0, e, h, xi, yi;
        boolean kondisi = true;
        String ulang;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);


        String tampilan="""
======================================================
||  NO  || List jawaban     ||                      ||                                       
======================================================
||  1   ||  tekan tombol 1  ||  Jawaban soal no 1   ||     
||  2   ||  tekan tombol 2  ||  Jawaban soal no 2   ||
||  3   ||  tekan tombol 3  ||  Jawaban soal no 3   ||
======================================================

==================================================================================================================================
||                                        Soal                                                                                  ||
==================================================================================================================================
||    fungsi fx yaitu x*exp-x + sin 2*x dengan nilai x=1, 2.4, nilai iterasi adalah 10 dan nilai toleransi error adalah 0.002   ||
||    fungsi fx yaitu cosx+1 + exp -x+2 dengan nilai x=1,3, nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001      || 
||    fungsi fx yaitu cosx - sin x dengan nilai x=0,2, nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001           ||
==================================================================================================================================

""";


        while(kondisi){

        System.out.println("Apakah anda ingin melihat tampilan dari tabel perintah dan soal??? ");
        System.out.println("=================================");
        System.out.println("|| 0 = iya || selain 0 = tidak ||");
        System.out.println("||===============================");
        System.out.print("masukan input : ");
        pilihan = input.nextInt();

        if(pilihan == 0){
        System.out.println(tampilan);

    }else{
        System.out.println("Tidak ada Tampilan Opsi");
    }

        System.out.print("masukan input : ");
        pilihan = input.nextInt();


        // soal 1
        if( pilihan == 1){

                x0 = 1.7;
                x1 = 1.84;
                e = 0.002;
                iterasi = 1;
                h = (x1 - x0) / N;

                System.out.println("========================== SOAL NO 1 =======================================");
                System.out.printf("\nIterasi\t\tx0\t\tx1\t\tx2\t\tf(x2)\n");
                do{
                    fx0 = f1(x0);
                    fx1 = f1(x1);
                    if (fx0 == fx1){
                    System.out.println("ERROR");
                    break;   
                    }
                    x2 = x1 - (x1 - x0) * fx1 / (fx1 - fx0);
                    fx2 = f1(x2);
                    System.out.printf("%d\t\t%f\t%f\t%f\t%f\n",iterasi,x0,x1,x2,Math.abs(fx2));
                    x0 = x1;
                    x1 = x2;
                    iterasi = iterasi + 1;
                    if(iterasi > N){
                        System.out.println("Tidak konvergen");
                        break;    
                    }           
                }while(Math.abs(fx2) > e);
                System.out.println("=============================================================================");
                System.out.println("Akar Persamaan untuk soal no 2 adalah : " + x2);
                


        }

                // soal 2
                if(pilihan == 2){
                    
                x0 = 2;
                x1 = 2.2;
                e = 0.001;
                iterasi = 1;
                h = (x1 - x0) / N;

            
            System.out.println("========================== SOAL NO 2 =======================================");
            System.out.printf("\nIterasi\t\tx0\t\tx1\t\tx2\t\tf(x2)\n");
            do{
                fx0 = f2(x0);
                fx1 = f2(x1);
                if (fx0 == fx1){
                System.out.println("ERROR");
                break;   
                }
                x2 = x1 - (x1 - x0) * fx1 / (fx1 - fx0);
                fx2 = f2(x2);
                System.out.printf("%d\t\t%f\t%f\t%f\t%f\n",iterasi,x0,x1,x2,Math.abs(fx2));
                x0 = x1;
                x1 = x2;
                iterasi = iterasi + 1;
                if(iterasi > N){
                    System.out.println("Tidak konvergen");
                    break;    
                }           
            }while(Math.abs(fx2) > e);
            System.out.println("=============================================================================");
            System.out.println("Akar Persamaan untuk soal no 2 adalah : " + x2);
        }

                // soal 3
                if (pilihan == 3){

                x0 = 0.6;
                x1 = 0.8;
                e = 0.001;
                iterasi = 1;
                h = (x1 - x0) / N;

                
                System.out.println("========================== SOAL NO 3 =======================================");
                System.out.printf("\nIterasi\t\tx0\t\tx1\t\tx2\t\tf(x2)\n");
                do{
                    fx0 = f3(x0);
                    fx1 = f3(x1);
                    if (fx0 == fx1){
                    System.out.println("ERROR");
                    break;   
                    }
                    x2 = x1 - (x1 - x0) * fx1 / (fx1 - fx0);
                    fx2 = f3(x2);
                    System.out.printf("%d\t\t%f\t%f\t%f\t%f\n",iterasi,x0,x1,x2,Math.abs(fx2));
                    x0 = x1;
                    x1 = x2;
                    iterasi = iterasi + 1;
                    if(iterasi > N){
                        System.out.println("Tidak konvergen");
                        break;    
                    }           
                }while(Math.abs(fx2) > e);
                System.out.println("=============================================================================");
                System.out.println("Akar Persamaan untuk soal no 3 adalah : " + x2);
                


            }

            System.out.println(" Apakah anda ingin mengulang applikasi ?");
            System.out.println("=================");
            System.out.println("|| Y    ||  T  ||");
            System.out.println("=================");
            System.out.print("masukan kata perintah :\t");
            ulang = input1.nextLine();

            if (ulang.equalsIgnoreCase("y")){
                kondisi = true;
            }else{
                kondisi = false;

            
                System.out.println(" (((Terima Kasih)))");
            
            }



        }

}
}

