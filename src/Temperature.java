public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    public Temperature(double high, double low, String tempScale){
        this.highTemp = high;
        this.lowTemp = low;
        this.tempScale = tempScale;

    }



    public static double convertCtoF(double temp){
        return (temp * (9/5)) + 32;
    }


    public static double convertFtoC(double temp){
        return (temp - 32)*(5/9);
    }
    private static double roundToNearestTenth(double Num){
        return Math.round(Num*10)/10;
    }

    public void changeToC(){
        if (tempScale == "f"){
            highTemp = Temperature.roundToNearestTenth(Temperature.convertFtoC(highTemp));
            lowTemp = Temperature.roundToNearestTenth(Temperature.convertFtoC(lowTemp));
        }

    }

    public void changeToF(){
        if (tempScale == "C"){
            highTemp = Temperature.roundToNearestTenth(Temperature.convertCtoF(highTemp));
            lowTemp = Temperature.roundToNearestTenth(Temperature.convertCtoF(lowTemp));
        }
    }

    public String toString() {
        return "High Temp: " + highTemp + "\n" + "Lowest Temp: " + lowTemp;
    }
}
