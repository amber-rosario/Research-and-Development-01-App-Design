package abstraction3;
import java.util.Scanner;

public class Utility {
    private Scanner scanner;

    public Utility() {
        scanner = new Scanner(System.in);
    }

    public String checkForName(String animalType) {
        System.out.print("Do you have a name for " + animalType + "? (Y/N): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            System.out.print("Enter the name: ");
            return scanner.nextLine();
        } else {
            return null;
        }
    }

    public Lion getLionObject(String lionName) {
        if (lionName == null) {
            return new Lion();
        } else {
            return new Lion(lionName);
        }
    }

    
    public Giraffe getGiraffeObject(String giraffeName) {
        if (giraffeName == null) {
            return new Giraffe();
        } else {
            return new Giraffe(giraffeName);
        }
    }


    public Bear getBearObject(String bearName) {
        if (bearName == null) {
            return new Bear();
        } else {
            return new Bear(bearName);
        }
    }
}

