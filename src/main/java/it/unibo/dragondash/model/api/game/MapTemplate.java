package it.unibo.dragondash.model.api.game;

import org.apache.commons.lang3.time.StopWatch;
import java.lang.IllegalStateException;

public abstract class MapTemplate {
    
    private long speed;
    private boolean state;

    public MapTemplate(final long speed) {
        this.speed = speed;
        this.state = false;
    }

    public void start() {
        if(!this.state) {
            this.state = true;
        }
        else {
            throw new IllegalStateException("Map is already started");
        }
    }

    public void stop() {
        if(this.state) {
            this.state = false;
        }
        else {
            throw new IllegalStateException("Map is already stopped");
        }
    }

}
