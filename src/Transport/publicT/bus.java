package Transport.publicT;
import Transport.transport;

import java.util.HashSet;

public class bus extends transport implements publicT {
    private HashSet<String> map;
    private int ticketPrice;
    @Override
    public void setRoadMap(HashSet<String> map) {
        this.map = map;
    }

    @Override
    public HashSet<String> getRoadMap() {
        return this.map;
    }


    @Override
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int getTicketPrice() {
        return this.ticketPrice;
    }
}
