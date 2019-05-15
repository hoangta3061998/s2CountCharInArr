import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        String str = "Hello abcxyz";
        Scanner scanner = new Scanner(System.in);
        int count =0;
        System.out.println("Enter a char to count:");
        char chr = scanner.nextLine().charAt(0);
        for (int i = 0; i< str.length();i++){
            char chrIn = str.charAt(i);
            if (chr ==chrIn) {
                count++;
            }
        }
        System.out.println("The char " +chr+" appear " +count+ " times in string");

    }
}
