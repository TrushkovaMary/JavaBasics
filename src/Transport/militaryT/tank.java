package Transport.militaryT;

import Transport.transport;

import java.util.HashSet;

public class tank extends transport implements militaryT {
    private HashSet<String> map;
    private int countBombs;
    @Override
    public void setRoadMap(HashSet<String> map) {
        this.map = map;
    }

    @Override
    public HashSet<String> getRoadMap() {
        return this.map;
    }

    @Override
    public void setCountBombs(int countBombs) {
        this.countBombs = countBombs;
    }

    @Override
    public int getCountBombs() {
        return this.countBombs;
    }
}
