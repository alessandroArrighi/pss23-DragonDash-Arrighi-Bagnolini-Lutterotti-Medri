package it.unibo.dragondash.model.api.game;

import java.lang.IllegalStateException;
import org.apache.commons.lang3.time.StopWatch;

public abstract class MapTemplate {

    private final int STARTING_SPEED = 0;
    
    private long speed;
    private boolean state;
    private boolean pause;
    private StopWatch watch;

    public MapTemplate() {
        this.speed = this.STARTING_SPEED;
        this.state = false;
        this.pause = true;
        this.watch = new StopWatch();
    }

    abstract public void computeSpeed();

    protected StopWatch getStopWatch() {
        return this.watch;
    }

    public long getSpeed() {
        return this.speed;
    }

    public void setSpeed(final long speed) {
        this.speed = speed;
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
            this.watch.start();
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
            this.watch.stop();
        }
        else {
            throw new IllegalStateException("Map is already stopped");
        }
    }

    public void pause() {
        if(this.state && !this.pause) {
            this.pause = true;
            this.watch.suspend();
        }
        else {
            throw new IllegalStateException("Map is already in pause or is stopped");
        }
    }

    public void resume() {
        if(this.state && this.pause) {
            this.pause = false;
            this.watch.resume();
        }
        else {
            throw new IllegalStateException("Map is not in pause or is stopped");
        }
    }

}
