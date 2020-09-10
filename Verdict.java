class Verdict
{
    static void result(int diseaseScore[], String diseaseNames[])
    {
        
        System.out.println();
        int serial=1;
        for(int i=0; i<35; i++)
        {
            
                        
            if(diseaseScore[i]>=1 && i==0)
            {System.out.println("Possible illnesses in order of probability :");
            }
            
            
            if(diseaseScore[i]>=1)
            {
                System.out.println(serial+". "+diseaseNames[i]);
                serial++;
            }
                        
        }
        
        if(serial==1)
            {
                System.out.println("No disease detected.");
            }
    }
}
            
            