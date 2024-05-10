package it.unibo.dragondash.model.api.game;

import org.apache.commons.lang3.time.StopWatch;

public abstract class RectangleModel extends Entity {

    private StopWatch watch;

    public RectangleModel(float x, float y, int width, int height) {
        super(x, y, width, height);
    }

    protected void getWatch(final StopWatch w) {
        this.watch = w;
    }

    protected abstract void setSpeed();

    /*
     * Methods to set new coordinates
     */
    protected abstract void setCoordinate();

}
