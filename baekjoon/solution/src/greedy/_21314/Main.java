package greedy._21314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mk = br.readLine();

        System.out.println(getMax(mk));
        System.out.println(getMin(mk));
    }

    private static String getMax(String mk) {
        String result = mk;

        Pattern pattern = Pattern.compile("M+K");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()) {
            String matchStr = matcher.group();
            result = result.replaceFirst(matchStr, "5" + "0".repeat(matchStr.length() - 1));
        }

        pattern = Pattern.compile("M+");
        matcher = pattern.matcher(result);

        while (matcher.find()) {
            String matchStr = matcher.group();
            result = result.replaceFirst(matchStr, "1".repeat(matchStr.length()));
        }

        return result.replaceAll("M", "1")
                    .replaceAll("K", "5");
    }

    private static String getMin(String mk) {
        String result = mk;

        result = result.replaceAll("K", "5");

        Pattern pattern = Pattern.compile("M+");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()) {
            String matchStr = matcher.group();
            result = result.replaceFirst(matchStr, "1" + "0".repeat(matchStr.length() - 1));
        }

        return result;
    }
}
