public class SmartPhone extends Phone{
    String storage;
    String ram;
    String camera;

    /*public SmartPhone() {
        super(id, name, price, phoneNumber);

        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }*/

    public SmartPhone(int id, String name, double price, String phoneNumber, String storage,String ram, String camera){
        super(id, name, price, phoneNumber);

        this.storage = storage;
        this.ram = ram;
        this.camera = camera;

    }



}
