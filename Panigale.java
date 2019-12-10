public class Panigale extends RacingBike {
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
