package Ex1;

import java.util.*;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running = false ;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }

    public long stop() {
        if (running) {
            endTime = (System.currentTimeMillis() - getStartTime());
            return endTime;
        }
        running = false;
        return 0;
    }
}
