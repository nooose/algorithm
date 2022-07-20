package string._9046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            int[] alphabetCountArray = new int[26];
            String inputStr = scanner.nextLine();
            for (char tmpChar : inputStr.toCharArray()) {
                if (tmpChar >= 'a' && tmpChar <= 'z') {
                    alphabetCountArray[tmpChar - 'a']++;
                }
            }

            int max = 0;
            for (int e : alphabetCountArray) {
                if (max < e) {
                    max = e;
                }
            }

            int count = 0;
            int answerIdx = 0;
            for (int j = 0; j < 26; j++) {
                if (max == alphabetCountArray[j]) {
                    count++;
                    answerIdx = j;
                }
            }

            System.out.println((count == 1) ? (char) (answerIdx + 'a') : "?");
        }
    }
}
