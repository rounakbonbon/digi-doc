class NoInputs
{
    static void generalTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit[]   )
   {                        //if flag is 0 normal values are given
     
       if(flag==0)    
       {
         for(int x=0;x<=4;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
        }
          
   }
   
   static void bloodTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit[]  )
   {
     
       if(flag==0)    
       {  
         for(int x=5;x<=9;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
         
        }     
             
   }
   
   static void liverTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit[]  )
   {
       if(flag==0)    
       {
         for(int x=10;x<=15;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
     
        }
       
   }
   
   static void kidneyTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit[]  )
   {
       
       if(flag==0)    
        {  
         for(int x=16;x<=17;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
        }
     
     
   
   }
   
   static void thyroidTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit[]  )
   {
       
      if(flag==0)    
      { 
          for(int x=18;x<=20;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
     
      }
     
   
   }
   
   static void sugarTest(int flag, double testNum [], double testUpperLimit[], double testLowerLimit [] )
   {
      
       if(flag==0)    
       {
       for(int x=21;x<=22;x++)
            testNum[x]=(testUpperLimit[x]+testLowerLimit[x])/2;
        }
             
   }
}