package it.unibo.dragondash.view.api.GameView;

import java.awt.*;

public class Sprite {
    
    public Image image;

    public Sprite(Image image) {
        this.image = image;
    }

    public int getWidth() {
        return image.getWidth(null);
    }

    public int getHeight() {

        return image.getHeight(null);
    }
}
