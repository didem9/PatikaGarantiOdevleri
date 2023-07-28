public class Playstation extends DeviceOperation implements IGameController{

    String name = "Playstation";

    public Playstation() {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
