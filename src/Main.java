import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int loopCount=0;

        while (true){
            System.out.println("Enter a number, or any character to exit");
            String nextEntry = scanner.nextLine();
            try{
                int validNum=Integer.parseInt(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e){
                break;
            }

        }
        if(loopCount>0) {
            System.out.println("Min value is " + min);
            System.out.println("Max value is " + max);
        } else {
            System.out.println("No valid data entered.");
        }
    }
}
