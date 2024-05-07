package it.unibo.dragondash.model.impl.game;

import it.unibo.dragondash.model.api.game.Entity;

public class Character extends Entity{

    boolean isJumping;
    int jumpSpeed;
    int jumpHeight;

    int gravity;
    int maxHeight;

    public Character(float x, float y, int width, int height) {
        super(x, y, width, height);
        
        setDefaultValues();
    }
    
    public void setDefaultValues() {
        x = 100;
        y = 300;

        isJumping = false;
        jumpSpeed = 8;
        jumpHeight = 300;

        gravity = 2;
        maxHeight = 290;
    }

    public void jump() {
		isJumping = true;
	}
}
