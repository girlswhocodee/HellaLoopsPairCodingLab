package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int n = 5;
        int table[][] = new int[n][n];
        // get values
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                int val = (int) (x * y);
                table[x - 1][y - 1] = val;
            }
        }
        // Now print
        String result = "";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                result += String.format("%3d |", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        int n = 10;
        int table[][] = new int[n][n];
        // get values
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                int val = (int) (x * y);
                table[x - 1][y - 1] = val;
            }
        }
        // Now print
        String result = "";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                result += String.format("%3d |", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        int n = tableSize;
        int table[][] = new int[n][n];
        // get values
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                int val = (int) (x * y);
                table[x - 1][y - 1] = val;
            }
        }
        // Now print
        String result = "";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                
                result += String.format("%3d |", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        
        return result;
    }

    }
}
