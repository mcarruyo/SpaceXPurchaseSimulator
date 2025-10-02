import java.util.Scanner; 
import java.math.BigInteger;


public class SpaceX {
    
    public static int SelectionMenu(int entry, int incorrectEntry,
            Scanner input) {
        entry = 0;
        incorrectEntry = 0;
        
        System.out.println("Welcome to SpaceX: Choose Your Adventure:");
        System.out.println("1 - Purchase STARSHIP SMs");
        System.out.println("2 - Purchase FALCON HEAVY SMs");
        System.out.println("3 - Exit Program");
        
        do {
            entry = input.nextInt();
            
            if (entry < 1 || entry > 3) {
                incorrectEntry++;
            
            if (incorrectEntry == 5) {
                entry = 3;
                
                System.out.println("You have entered too many invalid entries."
                        + " This program will now exit.");
                break;
            }
            
        }
    } while (entry < 1 || entry > 3);
    
    return entry;
}
    
    public static double StarshipPurchase(int starshipItems,
            double totalStarshipItemCost, Scanner input) {
        
        System.out.println("How many SM starships will you purchase?");
        starshipItems = input.nextInt();
        
        if (starshipItems >= 1 && starshipItems <= 5) {
            System.out.println("Each SM starship will cost $2.5 million.");
            
            totalStarshipItemCost = starshipItems * 2500000;
            System.out.println("Your total cost will be: " 
                    + totalStarshipItemCost);
            
            System.out.println("Thank you for your purchase, fellow astronaut!"
                    + " You're out of this world!");
        }
        else if (starshipItems >= 6) {
        System.out.println("Each SM starship will cost $2.0 million.");
        
        totalStarshipItemCost = starshipItems * 2000000;
        System.out.println("Your total cost will be: " 
                    + totalStarshipItemCost);
        
        System.out.println("Thank you for your purchase, fellow astronaut!"
                    + " You're out of this world!");
    } 
        return totalStarshipItemCost;
        
    }
    
    public static double FalconHeavyPurchase(int falconHeavyItems, 
            double totalFalconHeavyItemCost, Scanner input) {
        
        System.out.println("How many Falcon Heavy starships will you purchase?");
        falconHeavyItems = input.nextInt();
        
        if (falconHeavyItems >= 1 && falconHeavyItems <= 5) {
            System.out.println("Each cost $1.5 million.");
            
            totalFalconHeavyItemCost = falconHeavyItems * 1500000;
            System.out.println("Your total cost will be: " 
                    + totalFalconHeavyItemCost);
            
            System.out.println("Thank you for your purchase, fellow astronaut!"
                    + " You're out of this world!");
        }
        else if (falconHeavyItems >= 6) {
            System.out.println("Each cost $1.0 million.");
            
            totalFalconHeavyItemCost = falconHeavyItems * 1000000;
            System.out.println("Your total cost will be: " 
                    + totalFalconHeavyItemCost);
            
            System.out.println("Thank you for your purchase, fellow astronaut!"
                    + " You're out of this world!");
        }
        return totalFalconHeavyItemCost;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hey astronomical astronaut!");
        
        int entry = 0;
        int incorrectEntry = 0;
        
        int starshipItems = 0;
        double totalStarshipItemCost = 0.0;
        
        int falconHeavyItems = 0;
        double totalFalconHeavyItemCost = 0.0;
        
        do {
            entry = SelectionMenu(entry, incorrectEntry, input);
            
            switch(entry) {
                case 1: 
                    totalStarshipItemCost = StarshipPurchase(starshipItems, 
                            totalStarshipItemCost, input);
                break;
                
                case 2: 
                    totalFalconHeavyItemCost = 
                        FalconHeavyPurchase(falconHeavyItems, 
                                totalFalconHeavyItemCost, input);
                break;
                
                case 3:
                break;
            }
        } while (entry != 3);
    
    }
}
