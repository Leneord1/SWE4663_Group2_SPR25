import java.util.Scanner;

class quadFormula {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        double num4;
        double num5;
        double num6;
        int num02;
        double numPositive;
        double numNegative;
        boolean loop = false;
        String userChoice;

        do {
            System.out.print("Enter 'A': ");
            num1 = userInput.nextInt();
            System.out.print("Enter 'B': ");
            num2 = userInput.nextInt();
            System.out.print("Enter 'C': ");
            num3 = userInput.nextInt();

            num02 = -num2;
            num4 = Math.sqrt(Math.abs((num2 * num2) - (4 * num1 * num3)));
            num5 = ((num02 + num4) / (num1 * 2));
            num6 = ((num02 - num4) / (num1 * 2));

            System.out.print("X is equal to " + num5 + " if you use + in the quadratic equation\n" + "X is equal to " + num6 + " if you use - in the quadratic equation.");
            numPositive = ((num1 * num5) * (num1 * num5)) + (num2 * num5) + num3;
            numNegative = ((num1 * num6) * (num1 * num6)) + (num2 * num6) + num3;

            System.out.print(numPositive + ", " +numNegative);

            System.out.print("\nWould you like to continue? ");
            userChoice = userInput.next();
            switch (userChoice) {
                case "yes":
                    loop = true;
                case "Yes":
                    loop = true;
                case "Y":
                    loop = true;
                case "y":
                    loop = true;
                case "True":
                    loop = true;
            }
        } while (loop == true);
    }
}

