class DiagnosisCalculation
{
    static void diagnose (double testNum[], double testUpperLimit[], double testLowerLimit[], int diseaseScore[] )
    {
        //BMI-0
        
        if(testNum[0]>testUpperLimit[0])
        {
            diseaseScore[0]++;
            diseaseScore[1]++;
            diseaseScore[2]++;
        }
        
        if(testNum[0]<testLowerLimit[0])
        {
            diseaseScore[3]++;
            diseaseScore[4]++;
            diseaseScore[5]++;
            diseaseScore[6]++;
            diseaseScore[7]++;
            diseaseScore[8]++;
        }
        
        
        
        //BP-1,2
        
        if(testNum[1]>testUpperLimit[1] && testNum[2]>testUpperLimit[2])
        {
            diseaseScore[9]++;
            diseaseScore[10]++;
            diseaseScore[11]++;
            diseaseScore[0]++;
        }
        
        if(testNum[1]<testLowerLimit[1] && testNum[2]<testLowerLimit[2])
        {
            diseaseScore[12]++;
            diseaseScore[13]++;
            diseaseScore[5]++;
            diseaseScore[14]++;
            diseaseScore[15]++;
        }
        
        
        //Temp-3
        
        if(testNum[3]>testUpperLimit[3])
        {
            diseaseScore[16]++;
            diseaseScore[17]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[20]++;
            diseaseScore[21]++;
            diseaseScore[5]++;
            diseaseScore[6]++;
            diseaseScore[8]++;
        }
        
        if(testNum[3]<testLowerLimit[3])
        {
            diseaseScore[22]++;
            diseaseScore[14]++;
            diseaseScore[23]++;
            diseaseScore[12]++;
            diseaseScore[15]++;
            diseaseScore[13]++;
        }
        
        
        //RespRate-4
        
        if(testNum[4]>testUpperLimit[4])
        {
            diseaseScore[24]++;
            diseaseScore[16]++;
            diseaseScore[17]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[20]++;
            diseaseScore[21]++;
            diseaseScore[5]++;
            diseaseScore[6]++;
            diseaseScore[14]++;
        }
        
        if(testNum[4]<testLowerLimit[4])
        {
            diseaseScore[22]++;
            diseaseScore[13]++;
            diseaseScore[15]++;
            diseaseScore[12]++;
        }
        
        
        //Haemoglobin-5
        
        if(testNum[5]>testUpperLimit[5])
        {
            diseaseScore[12]++;
        }
        
        if(testNum[5]<testLowerLimit[5])
        {
            diseaseScore[25]++;
            diseaseScore[2]++;
            diseaseScore[16]++;
            diseaseScore[17]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[5]++;
            diseaseScore[7]++;
            diseaseScore[14]++;
            diseaseScore[15]++;
            diseaseScore[11]++;
        }
        
        
        //TC-6 
        
        if(testNum[6]>testUpperLimit[6])
        {
            diseaseScore[21]++;
            diseaseScore[5]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[26]++;
            
        }
        
        if(testNum[6]<testLowerLimit[6])
        {
            diseaseScore[17]++;
            diseaseScore[20]++;
        }
        
        
        //DC-7
        
        if(testNum[7]>testUpperLimit[7])
        {
            diseaseScore[21]++;
            diseaseScore[5]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[26]++;
        }
        
        if(testNum[7]<testLowerLimit[7])
        {
            diseaseScore[6]++;
            diseaseScore[8]++;
        }
        
        
        //ESR-8
        
        if(testNum[8]>testUpperLimit[8])
        {
            diseaseScore[21]++;
            diseaseScore[5]++;
            diseaseScore[18]++;
            diseaseScore[19]++;
            diseaseScore[26]++;
            diseaseScore[6]++;
            diseaseScore[8]++;
            diseaseScore[27]++;
            diseaseScore[28]++;
            diseaseScore[29]++;
            diseaseScore[2]++;
            diseaseScore[24]++;
            diseaseScore[7]++;
        }
        
        if(testNum[8]<testLowerLimit[8])
        {
            //          LOW ESR IS NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //Platelete-9
        
        if(testNum[9]>testUpperLimit[9])
        {
            diseaseScore[12]++;
        }
        
        if(testNum[9]<testLowerLimit[9])
        {
            diseaseScore[17]++;
            diseaseScore[8]++;
            diseaseScore[28]++;
            diseaseScore[29]++;
        }
        
        
        //Bilirubin-10
        
        if(testNum[10]>testUpperLimit[10])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;
        }
        
        if(testNum[10]<testLowerLimit[10])
        {
             //NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //SGOT-11
        
        if(testNum[11]>testUpperLimit[11])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;
            diseaseScore[34]++;
        }
        
        if(testNum[11]<testLowerLimit[11])
        {
            // NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //SGPT-12
        
        if(testNum[12]>testUpperLimit[12])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;
            diseaseScore[34]++;
        }
        
        if(testNum[12]<testLowerLimit[12])
        {
            // NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //Alkaline Phosphate-13
        
        if(testNum[13]>testUpperLimit[13])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;
            diseaseScore[34]++;
        }
        
        if(testNum[13]<testLowerLimit[13])
        {
            // NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //Total Potein-14
        
        if(testNum[14]>testUpperLimit[14])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;            
        }
        
        if(testNum[14]<testLowerLimit[14])
        {
            diseaseScore[32]++;
            diseaseScore[33]++;
        }
        
        
        //GGT-15
        
        if(testNum[15]>testUpperLimit[15])
        {
            diseaseScore[27]++;
            diseaseScore[30]++;
            diseaseScore[31]++;
            diseaseScore[29]++;
            diseaseScore[34]++;
        }
        
        if(testNum[15]<testLowerLimit[15])
        {
            //NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //Urea-16
        
        if(testNum[16]>testUpperLimit[16])
        {
            diseaseScore[11]++;
        }
        
        if(testNum[16]<testLowerLimit[16])
        {
            //NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //Creatinine-17
        
        if(testNum[17]>testUpperLimit[17])
        {
            diseaseScore[11]++;
        }
        
        if(testNum[17]<testLowerLimit[17])
        {
            //NOT INDICATIVE OF ANY DISEASE
        }
        
        
        //T3-18
        
        if(testNum[18]>testUpperLimit[18])
        {
            diseaseScore[4]++;
        }
        
        if(testNum[18]<testLowerLimit[18])
        {
            diseaseScore[2]++;
        }
        
        
        //T4-19
        
        if(testNum[19]>testUpperLimit[19])
        {
            diseaseScore[4]++;
        }
        
        if(testNum[19]<testLowerLimit[19])
        {
            diseaseScore[2]++;
        }
        
        
        //TSH-20
        
        if(testNum[20]>testUpperLimit[20])
        {
            diseaseScore[2]++;
        }
        
        if(testNum[20]<testLowerLimit[20])
        {
            diseaseScore[4]++;
        }
        
        
        //Fasting-21
        
        if(testNum[21]>testUpperLimit[21])
        {
            diseaseScore[1]++;
        }
        
        if(testNum[21]<testLowerLimit[21])
        {
            diseaseScore[5]++;
        }
        
        
        //PP-22
        
        if(testNum[22]>testUpperLimit[22])
        {
            diseaseScore[1]++;
        }
        
        if(testNum[22]<testLowerLimit[22])
        {
            //NOT INDICATIVE OF ANY DISEASE
        }
    }
}
        