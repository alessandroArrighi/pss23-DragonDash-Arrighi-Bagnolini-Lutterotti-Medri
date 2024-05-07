package it.unibo.dragondash.model.api.game;

import it.unibo.dragondash.view.api.GameView.Sprite;

public abstract class Entity {
    protected  float x,y;

    public Sprite sprite;
    
    protected int width, height;

    public Entity(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
