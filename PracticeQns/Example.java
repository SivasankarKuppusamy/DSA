import java.util.Scanner;
public class Example {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        char[] accessories = new char[b + c + a];
        int index = 0;
        for (int i = 0; i < b; i++) {
            accessories[index++] = 'B';
        }
        for (int i = 0; i < c; i++) {
            accessories[index++] = 'C';
        }
        for (int i = 0; i < a; i++) {
            accessories[index++] = 'A';
        }
        generateCombinations(accessories, "");
    }
    private static void generateCombinations(char[] accessories, String currentCombination) {
        if (currentCombination.length() == accessories.length) {
            System.out.println(currentCombination);
            return;
        }
        for (char accessory : accessories) {
            if (!currentCombination.contains(String.valueOf(accessory))) {
                generateCombinations(accessories, currentCombination + accessory);
            }
        }
    }
}
