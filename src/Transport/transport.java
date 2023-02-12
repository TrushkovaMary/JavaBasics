package Transport;

import java.util.HashSet;

abstract public class transport {
    private String name;
    private int capacity;
    private boolean isFly;
    private boolean isSwim;
    private boolean isRide;

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void setRide(boolean ride) {
        isRide = ride;
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isRide() {
        return isRide;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    abstract public void setRoadMap(HashSet<String> map);
    abstract public HashSet<String> getRoadMap();
}
