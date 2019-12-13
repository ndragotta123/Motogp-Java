// class named after the Yamaha Movistar with specs mirror'd off of the motorcycle.

public class Yam extends RacingBike {

    // extended RacingBike parent class to inherit the methods
    //unique information to this sports bike are noted below
    //Motogp bikes have regulations for racing so some information is the same: engine size & dry weight

    public static void main(String[] args) {
        Yam yam = new Yam();
        yam.setManufacturer("Yamaha");
        yam.setModel("Movistar");

        System.out.println("**** " + yam.getManufacturer() + " " + yam.getModel() + " ****");
        yam.engine_size(1000);
        yam.dry_weight((int) 346.12);
        yam.speed(211);
        yam.price((int) 2000000);
    }
}
