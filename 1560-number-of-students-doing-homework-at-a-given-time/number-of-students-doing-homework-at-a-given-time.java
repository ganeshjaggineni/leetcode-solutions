class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int len = startTime.length;
        int doing_work = 0;
        for (int i = 0; i < len; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                doing_work++;
        }
        return doing_work;

    }
    //BY GANESH JAGGINENI
}