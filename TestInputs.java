import java.util.Scanner;
class TestInputs
{
    
   static void generalTest(double testNum [] )
   {
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Enter BMI :  ");
     testNum[0]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.println("Enter Blood Pressure:    ");
     testNum[1]=sc.nextDouble();
     System.out.println("/");
     testNum[2]=sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Enter Temperature:   ");
     testNum[3]=sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Enter Respiratory Rate:  ");
     testNum[4]=sc.nextDouble();
     
     System.out.println();
     System.out.println();
   }
   
   static void bloodTest(double testNum [] )
   {
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Haemoglobin:  ");
     testNum[5]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("TC:  ");
     testNum[6]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("DC:  ");
     testNum[7]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("ESR: ");
     testNum[8]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Platelete Count: ");
     testNum[9]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
   
   }
   
   static void liverTest(double testNum [] )
   {
     Scanner sc = new Scanner (System.in);
       
     System.out.print("Bilirubin:   ");
     testNum[10]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("SGOT:    ");
     testNum[11]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("SGPT:    ");
     testNum[12]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Alakaline Phosphate: ");
     testNum[13]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Total Protein:   ");
     testNum[14]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("GGT: ");
     testNum[15]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
   
   }
   
   static void kidneyTest(double testNum [] )
   {
       Scanner sc = new Scanner (System.in);
       
     System.out.print("Urea:    ");
     testNum[16]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("Creatinine:  ");
     testNum[17]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
   
   }
   
   static void thyroidTest(double testNum [] )
   {
       Scanner sc = new Scanner (System.in);
       
     System.out.print("T3:  ");
     testNum[18]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("T4:  ");
     testNum[19]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("TSH: ");
     testNum[20]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
   
   }
   
   static void sugarTest(double testNum [] )
   {
       Scanner sc = new Scanner (System.in);
       
     System.out.print("Fasting:  ");
     testNum[21]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
     
     System.out.print("PP:  ");
     testNum[22]= sc.nextDouble();
     
     System.out.println();
     System.out.println();
             
   }
}
   