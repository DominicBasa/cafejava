public class Cafe {

  public static void main(String[] args) {
    // APP VARIABLES
    // Lines of text that will appear in the app.
    String generalGreeting = "Welcome to Cafe Java, ";
    String orderedMessage = ", ordered a ";
    String pendingMessage = ", your order will be ready shortly ";
    String readyMessage = ", your order is ready ";
    String displayTotalMessage = "Your total is $";

    // Menu variables (add yours below)
    double mochaPrice = 3.5;
    double dripCoffeePrice = 3.25;
    double lattePrice = 4.5;
    double cappuccinoPrice = 4.75;

    // Customer name variables (add yours below)
    String customer1 = "Cindhuri ";
    String customer2 = "Sam ";
    String customer3 = "Jimmy ";
    String customer4 = "Noah ";

    // Order completions (add yours below)
    boolean isReadyOrder1 = false;
    boolean isReadyOrder2 = false;
    boolean isReadyOrder3 = true;
    boolean isReadyOrder4 = true;

    // APP INTERACTION SIMULATION (Add your code for the challenges below
    System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

    System.out.println(customer1 + "Ordered a coffee");

    System.out.println(customer4 + "Ordered a cacppuccino");
    if (isReadyOrder4) {
      System.out.println(pendingMessage);
    }
    //
    System.out.println(
      customer2 + "Ordered 2 lattes " + displayTotalMessage + 9
    );
    if (isReadyOrder2) {
      System.out.println(readyMessage);
    }

    System.out.println(generalGreeting + customer4);
    System.out.println(customer4 + orderedMessage + "Coffee");
    System.out.println(displayTotalMessage + dripCoffeePrice);
    System.out.println(customer3 + orderedMessage + "Latte instead of a coffee");
    System.out.println("Latte " + displayTotalMessage + lattePrice);

  }
}
