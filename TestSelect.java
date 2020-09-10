  
import java.util.*;
class TestSelect
{
    public static void main()
    {
        Header obj0= new Header();
        obj0.main(); //PRINTING HEADER//
        
        ////////////////////////////////////////////////ARRAYS FOR TESTS////////////////////////////////////////////
        double testNum[]= new double [23];
        double testUpperLimit[]=new double [23];
        double testLowerLimit[]=new double[23];
        ////////////////////////////////////////////////ARRAYS FOR DISEASES/////////////////////////////////////////
        String diseaseNames[] = new String [35];
        int diseaseScore[]= new int[35];
        
        ////////////////////////////////////////////////GETTING VALUES////////////////////////////////////////////
        
        TestNormals obj1 = new TestNormals();
        obj1.happyTest(testUpperLimit,testLowerLimit);
        
        TestDiseases obj4 = new TestDiseases();
        obj4.setValues(diseaseNames, diseaseScore);
        
        //////////////////////////////////////////////////////MENU///////////////////////////////////////////////////////////////
        
        
        for(int h=1;h<40;h++)System.out.print("»»");
        System.out.println();
        System.out.println("                              WELCOME TO DIGI-DOC");
        for(int h=1;h<40;h++)System.out.print("««");
        System.out.println();
        System.out.println();
        System.out.println();
        int flag0=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0;
        while(flag0==0)
        {
                    
            System.out.println("                                TESTS                                          ");
            System.out.println();
            System.out.println("1.BMI + Blood Pressure + Temperature + Respiratory Rate");
            System.out.println("2.Blood Test");
            System.out.println("3.Liver Function Test");
            System.out.println("4.Kidney Function Test");
            System.out.println("5.Thyroid Funtion Test");
            System.out.println("6.Blood Sugar Test");
            System.out.println("0. DONE...");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("Test whose result is to be entered ?");
            System.out.println("(Enter number preceding test of your choice)");
            int testMenu = sc.nextInt();
            System.out.println();
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
            ////////////////////////////////////////////////INPUTTING PATIENT'S TEST RESULTS////////////////////////////////////////////
        
            TestInputs obj2 = new TestInputs();
        
        
        
            switch(testMenu)
            {
                case 1: 
                obj2.generalTest(testNum);
                flag1++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                
                case 2: 
                obj2.bloodTest(testNum);
                flag2++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                
                case 3: 
                obj2.liverTest(testNum);
                flag3++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                
                case 4: 
                obj2.kidneyTest(testNum);
                flag4++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                
case 5:  
                obj2.thyroidTest(testNum);
                flag5++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                 
                case 6: 
                obj2.sugarTest(testNum);
                flag6++;
                for(int h=1;h<10;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                break;
                
                case 0:
                flag0++;
                for(int h=1;h<2;h++)                           //JUST TO CLEAR SCREEN
                    System.out.println();
                
                
            
            }
        }
        
          
        //If values for any of the tests are not enterred normal values are assumed for that test-
        NoInputs obj3 = new NoInputs();
        obj3.generalTest(flag1,  testNum , testUpperLimit,  testLowerLimit );
        obj3.bloodTest(flag2,  testNum , testUpperLimit,  testLowerLimit );
        obj3.liverTest(flag3,  testNum , testUpperLimit,  testLowerLimit );
        obj3.kidneyTest(flag4,  testNum , testUpperLimit,  testLowerLimit );
        obj3.thyroidTest(flag5,  testNum , testUpperLimit,  testLowerLimit );
        obj3.sugarTest(flag6,  testNum , testUpperLimit,  testLowerLimit );
            
        //  Diagnosis based on user inputs-
        DiagnosisCalculation obj5 = new DiagnosisCalculation();
        obj5.diagnose(testNum, testUpperLimit, testLowerLimit, diseaseScore);
        
        //Ranks diseases in order of probability-
        BubbleSort obj6 = new BubbleSort();
        obj6.Sort(diseaseScore, diseaseNames);
                
        //Displays list which has been generated
        Verdict obj7 = new Verdict();
        obj7.result(diseaseScore, diseaseNames);        
        
   }
       
}
        
       