class Solution {
    public int passThePillow(int n, int time) {

        // boolean right = true;
        // boolean left = true;
        // int var = 1;
        // while(time-- > 0)
        // {
        //     if(right)
        //     {
        //      var++;
        //     }
        //     else if(left)
        //     {
        //         var--;
        //     }
        //     if(var == n)
        //     {
        //         right = false;
        //         left = true;
        //     }
        //     if(var == 1)
        //     {
        //         left = false;
        //         right = true;
        //     }
        // }
        // return var;
          int position = 1;
        boolean forward = true;

        for (int t = 1; t <= time; t++) {
            if (forward) {
                position++;
                if (position == n) {
                    forward = false;
                }
            } else {
                position--;
                if (position == 1) {
                    forward = true;
                }
            }
        }

        return position;
    }
}