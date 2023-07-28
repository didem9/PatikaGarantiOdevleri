public class Computer extends DeviceOperation {

    String name = "Computer";

    public Computer() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void open() throws Exception {
        if (isOpen == true){
            throw new Exception("Bilgisayar zaten açık");
        }
        System.out.println("Bilgisayar açıldı");
        isOpen = true;
    }
}
