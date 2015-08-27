package map;

/**
 * Created by Hongquan Long on 8/27/2015.
 */
public class MapDescriptor implements MapLayout {
    private int[][] twoDimentionMap;

    public MapDescriptor() {

    }

    public String toString() {
        String mapString = "";
        for (int i = 0; i < twoDimentionMap.length; i++) {
            for (int j = 0; j < twoDimentionMap[0].length; j++) {
                mapString += String.valueOf(twoDimentionMap[i][j]);
            }
        }
        return mapString;
    }

    public String toString(int[][] twoDimentionMap) {
        String mapString = "";
        for (int i = 0; i < twoDimentionMap.length; i++) {
            for (int j = 0; j < twoDimentionMap[0].length; j++) {
                mapString += String.valueOf(twoDimentionMap[i][j]);
            }
        }
        return mapString;
    }
}
