package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                result += i;
            }   
        }
        
        return result;

    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                result += i;
            }   
        }
        
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        
        for (int i = start; i < stop; i += step) {
            result += i * i;
            }
        
        return result;
    }

    
    public static String getRange(int stop) {
        String range = "";
            for(int i=0; i<stop; i++){
                range = String.valueOf(i);
            }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
            for(int i=start; i<stop; i++){
                range = String.valueOf(i);
            }
        return range;
    
    }
    

    public static String getRange(int start, int stop, int step) {
        String result = String.valueOf(start) + "";
        for(int i = start; i < stop; i = i + step)
        {
            result = String.valueOf(i);
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        
        for (int i = start; i < stop; i += step) {
            result += (int) Math.pow(i, exponent);
            }
        
        return result;
    }
}
