public class DeviceOperation {

    boolean isOpen;
    IGameController controller;

    public void open() throws Exception {
        if (isOpen == true){
            throw new Exception("Cihaz zaten açık");
        }
        System.out.println("Cihaz açıldı");
        isOpen = true;
    }

    public void shutDown(){
        if (isOpen == false){
            System.out.println("Cihaz zaten kapalı");
        }
        System.out.println("Cihaz kapandı");
        isOpen = false;
    }

    public void addController(IGameController controller){
        if (controller != null) {
            System.out.println(controller.getName() + " oyun kontrolcüsü eklendi.");
        } else {
            this.controller = null;
            System.out.println("Oyun kontrolcüsü eklenemedi, çünkü controller nesnesi null.");
        }
    }


    public void playGame() throws Exception {
        if (isOpen == true){
            System.out.println("Oyun başladı");
        }
       //throw new Exception("Cihaz kapalı");
    }
}
