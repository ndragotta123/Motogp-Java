// class named after the Ducati Desmosedici with specs mirror'd off of the motorcycle

public class Duc extends RacingBike {

    // extended RacingBike parent class to inherit the methods
    //unique information to this sports bike are noted below
    //Motogp bikes have regulations for racing so some information is the same: engine size & dry weight

    public static void main(String[] args) {
        Duc duc = new Duc();
        duc.setManufacturer("Ducati");
        duc.setModel("Desmosedici");

        System.out.println("**** " + duc.getManufacturer() + " " + duc.getModel() + " ****");
        duc.engine_size(1000);
        duc.dry_weight((int) 346.12);
        duc.speed(225);
        duc.price((int) 2000000);
    }
}
