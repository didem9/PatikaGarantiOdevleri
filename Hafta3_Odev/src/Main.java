
public class Main {
    public static void main(String[] args) throws Exception {

        DeviceOperation device = new DeviceOperation();
        Computer computer = new Computer();
        computer.open();

        IGameController cont = new Xbox();          // Kontrölcü bilgisayara bağlanırsa, (playstation sınıfı da bağlanabilir)
        device.addController(cont);
        device.open();
        device.playGame();
        device.shutDown();

        System.out.println("--------");

        DeviceOperation xbox = new DeviceOperation();       // Xbox kullanılırsa
        IGameController xboxCont = new Xbox();
        xbox.addController(xboxCont);
        xbox.open();
        xbox.playGame();
        xbox.shutDown();

        System.out.println("--------");

        DeviceOperation playstation = new DeviceOperation();        // Playstation kullanılırsa
        IGameController playstationCont = new Playstation();
        playstation.addController(playstationCont);
        playstation.open();
        playstation.playGame();
        playstation.shutDown();

    }
}
