// class named after the Honda RC213V with specs mirror'd off of the motorcycle

public class Hon extends RacingBike {

    // extended RacingBike parent class to inherit the methods
    //unique information to this sports bike are noted below
    //Motogp bikes have regulations for racing so some information is the same: engine size & dry weight

    public static void main(String[] args) {
        Hon hon = new Hon();
        hon.setManufacturer("Honda");
        hon.setModel("RC213V");

        System.out.println("**** " + hon.getManufacturer() + " " + hon.getModel() + " ****");
        hon.engine_size( 1000);
        hon.dry_weight((int) 346.12);
        hon.speed(220);
        hon.price((int) 2000000);
    }
}
