class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.80+32.00;
        double temperature[] = new double[2];
        temperature[0] = kelvin;
        temperature[1] = fahrenheit;
     return  temperature;
    }
    //BY GANESH JAGGINENI

}