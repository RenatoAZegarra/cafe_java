public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.1;
        double lattePrice = 4.99;
        double cappuccinoPrice = 3.99;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true; 
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        // Cindhuri's order status message
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
         System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        
        // Noah's order status message and total
        if (isReadyOrder2) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        
        // Sam's total for 2 lattes
        double total = lattePrice * 2;
        System.out.println(displayTotalMessage + total);
        
        // Sam's order status message (based on isReadyOrder3 flag)
        if (isReadyOrder3) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
        
        // Jimmy's updated total message
        double updatedTotal = lattePrice - mochaPrice;
        System.out.println(displayTotalMessage + updatedTotal);
    }
}
