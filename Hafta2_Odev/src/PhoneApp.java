public class PhoneApp {

   public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double totalPrice = 0;

        for (int i = 0; i < smartPhoneArray.length; i++) {
            totalPrice += smartPhoneArray[i].price;
        }
        return totalPrice;
    }

    public static void main(String[] args) {

        SmartPhone[] smartPhoneArray = new SmartPhone[5];

        smartPhoneArray[0] = new SmartPhone(1, "Apple Iphone 11", 23798.99, "22594635", "128 GB", "4 gb", "12 MP");
        smartPhoneArray[1] = new SmartPhone(2, "Samsung Galaxy A54", 12999.49, "21546445", "128 GB", "8 GB", "12 MP");
        smartPhoneArray[2] = new SmartPhone(3, "XIAOMI Redm, 12C", 4958, "2298685", "128 GB", "4 GB", "20 MP");
        smartPhoneArray[3] = new SmartPhone(4, "Reeder P13", 2052, "2284825", "32 GB", "2 GB", "5 MP");
        smartPhoneArray[4] = new SmartPhone(5, "Oppo A16", 4649, "2177963", "64 GB", "4 GB", "5 MP");

        System.out.println("Toplam Fiyat: " + calculateTotalPrice(smartPhoneArray));
    }
}