package tugas4_l_672018004;
import java.util.Arrays;
import java.util.Scanner;
public class Tugas4_L_672018004 {
public static void main(String[] args) 
    {
       while(true)
       {
       int pilihan;
       int[][]matriksa=new int[2][2];
       int[][]matriksb=new int[2][2];
       
       System.out.println("=====Tugas Pemrograman Java=====");
       System.out.println("1. Calculator Matriks <50 poin>");
       System.out.println("2. Oddities <20 poin>");
       System.out.println("3. Dice Game <20 poin>");
       System.out.println("4. Exit <10 poin>");
       Scanner scan = new Scanner(System.in);
       System.out.print("Pilihan : ");
       pilihan = scan.nextInt();
       
       
       switch(pilihan)
       {
           case 1 :
           
           System.out.println("=====Menu 1 : Matriks=====");
           System.out.println("Matriks A");
           System.out.println("Masukkan Matriks A elemen 0,0 : ");
           matriksa[0][0] = scan.nextInt();
           System.out.println("Masukkan Matriks A elemen 0,1 : ");
           matriksa[0][1] = scan.nextInt();
           System.out.println("Masukkan Matriks A elemen 1,0 : ");
           matriksa[1][0] = scan.nextInt();
           System.out.println("Masukkan Matriks A elemen 1,1 : ");
           matriksa[1][1] = scan.nextInt();
           
           System.out.println("");
           
           System.out.println("Masukkan Matriks B elemen 0,0 : ");
           matriksb[0][0] = scan.nextInt();
           System.out.println("Masukkan Matriks B elemen 0,1 : ");
           matriksb[0][1] = scan.nextInt();
           System.out.println("Masukkan Matriks B elemen 1,0 : ");
           matriksb[1][0] = scan.nextInt();
           System.out.println("Masukkan Matriks B elemen 1,1 : ");
           matriksb[1][1] = scan.nextInt();
           System.out.println("");
           System.out.println("Matriks A                Matriks B");
           System.out.format("|%d %d|                   |%d %d|",matriksa[0][0],matriksa[0][1],matriksb[0][0],matriksb[0][1]);
           System.out.println("");
           System.out.format("|%d %d|                   |%d %d|",matriksa[1][0],matriksa[1][1],matriksb[1][0],matriksb[1][1]);
           System.out.println("");
           System.out.println("");
           System.out.println("A+B = ");
           System.out.format("|%d %d|",matriksa[0][0]+matriksb[0][0],matriksa[0][1]+matriksb[0][1]);
           System.out.println("");
           System.out.format("|%d %d|",matriksa[1][0]+matriksb[1][0],matriksa[1][1]+matriksb[1][1]);
           System.out.println("");
           System.out.println("");
           System.out.println("A-B = ");
           System.out.format("|%d %d|",matriksa[0][0]-matriksb[0][0],matriksa[0][1]-matriksb[0][1]);
           System.out.println("");
           System.out.format("|%d %d|",matriksa[1][0]-matriksb[1][0],matriksa[1][1]-matriksb[1][1]);
           System.out.println("");
           System.out.println("");
           System.out.println("A*B = ");
           System.out.format("|%d %d|",(matriksa[0][0]*matriksb[0][0])+(matriksa[0][1]*matriksb[1][0]),(matriksa[0][0]*matriksb[0][1])+(matriksa[0][1]*matriksb[1][1]));
           System.out.println("");
           System.out.format("|%d %d|",(matriksa[1][0]*matriksb[0][0])+(matriksa[1][1]*matriksb[1][0]),(matriksa[1][0]*matriksb[0][1])+(matriksa[1][1]*matriksb[1][1]));
           System.out.println("");
           System.out.println("");
           break;
           
           case 2 :
               
           int isitest;
           Scanner inp = new Scanner(System.in);
           System.out.println("=====Menu 2 : Oddities=====");
           System.out.println("Masukkan jumlah Test-Case = ");
           isitest = inp.nextInt();
           int[]isiTest=new int[isitest];
           for(int a=0;a<isitest;a++)
           {
               System.out.format("Angka %d : " ,a+1);
               isiTest[a]=scan.nextInt();
           }
           for(int a=0;a<isitest;a++)
           {
               System.out.format("Testcase #%d : " ,a+1);
               if(isiTest[a]%2==0)
               {
                 System.out.println("even"); 
               }else if(isiTest[a]%2==1)
               {
                 System.out.println("Odd");
               }
           }
           System.out.println("");
           break;
           
           case 3 :
           {
               int dice,ronde;
               int jojo,juan;
               int dadujojo = 0,dadujuan = 0;
               
               System.out.println("=====Menu 2 : Dice Game=====");
               Scanner inl = new Scanner(System.in);
               System.out.println("Masukkan Jumlah Test-Case = ");
               dice = inl.nextInt();
               String[]pemenang = new String[dice];
               for(int a=0;a<dice;a++)
               {
                   jojo=1;
                   juan=1;
                   System.out.format("Testcase #%d : " ,a+1);
                   System.out.println("");
                   System.out.print("Masukkan jumlah ronde = ");
                   System.out.println("");
                   ronde=scan.nextInt();
                   
                   for(int b=0;b<ronde;b++)
                   {
                       System.out.format("Ronde #%d",b+1);
                       System.out.println("");
                       System.out.println("Masukkan angka dadu Jojo = ");
                       dadujojo=scan.nextInt();
                       System.out.println("Masukkan angka dadu Juan = ");
                       dadujuan=scan.nextInt();
                       if(dadujojo>dadujuan)
                       {
                           jojo=jojo+1;
                       }else if(dadujuan>dadujojo)
                       {
                           juan=juan+1;
                       }
                   }
                   if(dadujojo==dadujuan)
                   {
                       pemenang[a]= "Tie";
                   }else if(dadujojo>dadujuan)
                   {
                       pemenang[a]= "Jojo win";
                   }else if(dadujuan>dadujojo)
                   {
                       pemenang[a]= "Juan win";
                   }
                   }
                for(int a=0;a<dice;a++)
                {
                   System.out.format("Testcase #%d  %s",a+1, Arrays.toString(pemenang));
                   System.out.println("");
                }
                System.out.println("");
                break;
            }
            case 4 :
            {
               System.exit(0);
            }
               
        }
        }
    }
}