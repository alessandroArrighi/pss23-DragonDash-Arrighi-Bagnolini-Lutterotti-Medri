package it.unibo.dragondash.model.api.game;

public abstract class RectangleModel extends Entity {

    public RectangleModel(float x, float y, int width, int height) {
        super(x, y, width, height);
    }

    protected abstract void setSpeed();

    /*
     * Methods to set new coordinates
     */
    protected abstract void setCoordinate();

}
