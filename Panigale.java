// class named after the Ducati Panigalie V4 with specs mirror'd off of the motorcycle

public class Panigale extends RacingBike {

    // extended RacingBike parent class to inherit the methods
    //unique information to this sports bike are noted below

    public static void main(String[] args) {
        Panigale pan = new Panigale();
        pan.setManufacturer("Ducati");
        pan.setModel("Panigale V4");

        System.out.println("**** " + pan.getManufacturer() + " " + pan.getModel() + " ****");
        pan.engine_size(1103);
        pan.dry_weight((int) 381);
        pan.speed(190);
        pan.price((int) 40000);
    }
}
