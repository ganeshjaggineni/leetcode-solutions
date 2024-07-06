class Solution {
    public int mostWordsFound(String[] sentences) {

        int max_words = 0;
        for(int i=0;i<sentences.length;i++)
        {
            int valid_words = 1;
            for(char ch : sentences[i].toCharArray())
            {
                if(ch ==' ')
                    valid_words++;
            }
            max_words = Math.max(valid_words,max_words);
        }
        return max_words;
        
    }
}