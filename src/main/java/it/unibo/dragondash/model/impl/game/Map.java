package it.unibo.dragondash.model.impl.game;

import org.apache.commons.lang3.time.StopWatch;
import it.unibo.dragondash.model.api.game.MapTemplate;

public class Map extends MapTemplate {
    
    private StopWatch watch;

    public Map() {
        super();
        this.watch = this.getStopWatch();
    }

    @Override
    public void computeSpeed() {
        
    }
}
