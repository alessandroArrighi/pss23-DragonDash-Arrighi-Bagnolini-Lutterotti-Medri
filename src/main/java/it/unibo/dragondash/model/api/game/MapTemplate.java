package it.unibo.dragondash.model.api.game;

import org.apache.commons.lang3.time.StopWatch;

public abstract class MapTemplate {
    
    private long speed;
    private boolean state;

    public MapTemplate(final long speed) {
        this.speed = speed;
        this.state = false;
    }
}
