package View;

import java.util.Map;

public class Progress {

    private Progress() {}

    public static void drawStatus(Map<String, Integer> carInfo) {
        for (String key : carInfo.keySet()) {
            System.out.println(key + " : " + makeProgressBar(carInfo.get(key)));
        }
    }

    private static StringBuilder makeProgressBar(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append('-');
        }
        return sb;
    }
}
