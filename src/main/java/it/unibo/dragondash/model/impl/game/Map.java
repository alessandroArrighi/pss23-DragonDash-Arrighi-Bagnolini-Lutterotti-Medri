package it.unibo.dragondash.model.impl.game;

import org.apache.commons.lang3.time.StopWatch;
import it.unibo.dragondash.model.api.game.MapTemplate;

public class Map extends MapTemplate {

    private final int INCREMENT_SPEED = 1;
    private final int INCREMENT_TIME = 500;
    
    private StopWatch watch;

    public Map() {
        super();
        this.watch = this.getStopWatch();
    }

    @Override
    public void computeSpeed() {
        if(this.watch.getTime() >= this.INCREMENT_TIME) {
            System.out.println(this.getSpeed());
            this.setSpeed(this.getSpeed() + this.INCREMENT_SPEED);
            this.watch.reset();
            this.watch.start();
        }
    }

}
