import java.util.Scanner;


public class calc {
    
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("Welcome to the Calculator ");
        System.out.println("=====================================================\n");

        boolean check = true;
        boolean clear = true;
        String convertor;
        float num1 = 0;
        float num2 = 0;
        while (check) {

            if(clear) {
                System.out.println("Select a Number: ");

                Scanner in1 = new Scanner(System.in);
                convertor = in1.nextLine();
                num1 = Float.parseFloat(convertor);
            }

            System.out.println("Select another Number: ");
            
            Scanner in2 = new Scanner(System.in);
            convertor = in2.nextLine();
            num2 = Float.parseFloat(convertor);

            System.out.println("\n=====================================================");
            System.out.println("What would you like to do? (Select the Number) ");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Clear");
            System.out.println("6: Exit");
            System.out.println("=====================================================");

            Scanner in3 = new Scanner(System.in);
            convertor = in3.nextLine();
            int option = Integer.parseInt(convertor);
            float solution = 0;

            switch (option) {
                case 1: solution = num1 + num2;
                        num1 = solution;
                        System.out.println("=====================================================");
                        System.out.println("Solution: " + solution);
                        System.out.println("=====================================================\n");
                        clear = false;
                        break;
                case 2: solution = num1 - num2;
                        num1 = solution;
                        System.out.println("=====================================================");
                        System.out.println("Solution: " + solution);
                        System.out.println("=====================================================\n");
                        clear = false;
                        break;
                case 3: solution = num1 * num2;
                        num1 = solution;
                        System.out.println("=====================================================");
                        System.out.println("Solution: " + solution);
                        System.out.println("=====================================================\n");
                        clear = false;
                        break;
                case 4: solution = num1 / num2;
                        num1 = solution;
                        System.out.println("=====================================================");
                        System.out.println("Solution: " + solution);
                        System.out.println("=====================================================\n");
                        clear = false;
                        break;
                case 5: num1 = 0;
                        num2 = 0;
                        clear = true;
                        break;
                case 6: check = false;
                        break;
            }

            
        }

    }
}
