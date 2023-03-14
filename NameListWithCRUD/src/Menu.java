import java.util.Scanner;

class Menu {

    public void showMenu() {
        System.out.println("1. Create a new person");
        System.out.println("2. Show all people");
        System.out.println("3. Update a person");
        System.out.println("4. Delete a person");
        System.out.println("5. Exit program");
    }
    public int menuChoise(int menuStartIndex, int menuEndIndex) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while (userInput < menuStartIndex || userInput > menuEndIndex) {
            System.out.println("Enter a number between " + menuStartIndex + " and " + menuEndIndex);
            userInput = input.nextInt();
        }
        return userInput;
    }
}