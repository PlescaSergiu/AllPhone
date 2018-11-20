package oop.phone;

public class Nokia extends Phone {


    private String material;
    private String color;

    public Nokia() {
    }


    public Nokia(String material, String color) {
        this.material = material;
        this.color = color;
    }


    static class NokiaX1 extends Nokia {

        private static int battery = 14;

        public NokiaX1() {

        }

        public NokiaX1(String material, String color, long IMEI) {
            super(material, color);
            setIMEI(IMEI);
            setBatterylevel(battery);
        }


    }

    static class Nokia_7 extends Nokia {
        private static int battery = 31;

        public Nokia_7() {

        }

        public Nokia_7(String material, String color, long IMEI) {
            super(material, color);
            setIMEI(IMEI);
            setBatterylevel(battery);
        }


    }
}
