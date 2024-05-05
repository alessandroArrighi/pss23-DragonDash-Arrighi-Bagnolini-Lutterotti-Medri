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
        this.pause = true;
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
            this.pause = false;
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

    public void pause() {
        if(this.state && !this.pause) {
            this.pause = true;
        }
        else {
            throw new IllegalStateException("Map is already in pause or is stopped");
        }
    }

    public void resume() {
        if(this.state && this.pause) {
            this.pause = false;
        }
        else {
            throw new IllegalStateException("Map is not in pause or is stopped");
        }
    }

}
