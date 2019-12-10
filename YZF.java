public class YZF extends RacingBike {
    public static void main(String[] args) {
        YZF yzf = new YZF();
        yzf.setManufacturer("Yamaha");
        yzf.setModel("YZF R1");

        System.out.println("**** " + yzf.getManufacturer() + " " + yzf.getModel() + " ****");
        //System.out.println(duc.getModel());
        yzf.engine_size(998);
        yzf.dry_weight((int) 414);
        yzf.speed(182);
        yzf.price((int) 17399);
    }
}

