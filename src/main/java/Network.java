import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxDevices;

    public Network(String name, int maxDevices){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.maxDevices = maxDevices;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (this.getRemainingSlots() >= 1) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int getRemainingSlots(){
        return (this.maxDevices - this.deviceCount());
    }

}