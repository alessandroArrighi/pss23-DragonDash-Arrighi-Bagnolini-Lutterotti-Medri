package it.unibo.dragondash.model.api.game;

public class Entity {
    protected int x,y;
    protected int width, height;

    public Entity(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
