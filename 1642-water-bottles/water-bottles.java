class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drink = numBottles;
        int exchangedbottles = 0;
        while(numBottles >= numExchange)
        {
            exchangedbottles =  (numBottles/numExchange);
            drink = drink + exchangedbottles;
            numBottles = exchangedbottles + (numBottles%numExchange);
        }
        return drink;
        
    }
        //BY GANESH JAGGINENI
}