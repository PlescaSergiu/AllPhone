package oop.phone;

public abstract class Samsung extends Phone {

    public Samsung() {
    }

    private String material ;
    private String color ;

    public Samsung(String material, String color) {
        this.material = material;
        this.color = color;
    }


    static class SamsungGalaxy6 extends Samsung {

        private static int battery = 21;

        public SamsungGalaxy6() {

        }

        public SamsungGalaxy6(String material, String color, long IMEI ) {
            super(material, color);
            setIMEI(IMEI);
            setBatterylevel(battery);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class SamsungNote9 extends Samsung {
        private static int battery = 25;

        public SamsungNote9() {

        }

        public SamsungNote9(String material, String color, long IMEI ) {
            super(material, color);
            setIMEI(IMEI);
            setBatterylevel(battery);
        }



    }

}