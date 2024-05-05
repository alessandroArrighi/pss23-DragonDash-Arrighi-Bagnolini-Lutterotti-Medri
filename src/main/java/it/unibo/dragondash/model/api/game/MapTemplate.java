package it.unibo.dragondash.model.api.game;

import java.lang.IllegalStateException;

public abstract class MapTemplate {

    private final int STARTING_SPEED = 0;
    
    private long speed;
    private boolean state;
    private boolean pause;

    public MapTemplate() {
        this.speed = this.STARTING_SPEED;
        this.state = false;
        this.pause = false;
    }

    abstract public void computeSpeed();

    public long getSpeed() {
        return this.speed;
    }

    protected boolean getState() {
        return this.state;
    }

    protected boolean isPause() {
        return this.pause;
    }

    public void start() {
        if(!this.state) {
            this.state = true;
            this.computeSpeed();
        }
        else {
            throw new IllegalStateException("Map is already started");
        }
    }

    public void stop() {
        if(this.state) {
            this.speed = this.STARTING_SPEED;
            this.state = false;
        }
        else {
            throw new IllegalStateException("Map is already stopped");
        }
    }

}
