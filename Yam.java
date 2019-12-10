public class Yam extends RacingBike {
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
