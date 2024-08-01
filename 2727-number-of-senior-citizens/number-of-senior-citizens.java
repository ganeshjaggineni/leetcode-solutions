class Solution {
    public int countSeniors(String[] details) {

        int sixtyYearsOld = 0;
        for(int i=0;i<details.length;i++)
        {
            int tensPlace = details[i].charAt(11)-'0';
            int onesPlace = details[i].charAt(12)-'0';
            if(tensPlace*10 + onesPlace > 60)
                sixtyYearsOld++;
        }
        return sixtyYearsOld;
        
    }
    //BY GANESH JAGGINENI
}