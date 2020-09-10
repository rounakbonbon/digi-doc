class BubbleSort
{
    static void Sort(int diseaseScore[], String diseaseNames[])
    {
        int tmp;
        String tmp1;
        for(int i=0;i<35;i++)
        {
            for(int x=0;x<35-i-1;x++)
            {
                if(diseaseScore[x]<diseaseScore[x+1])
                {
                    tmp=diseaseScore[x+1];
                    diseaseScore[x+1]=diseaseScore[x];
                    diseaseScore[x]=tmp;
                    
                    tmp1=diseaseNames[x+1];
                    diseaseNames[x+1]=diseaseNames[x];
                    diseaseNames[x]=tmp1;
                }
            }
        }
        
    }
}
                    
    