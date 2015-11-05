package model.landTiles;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class riverTile extends MapTiles{
    /**
     * riverTile method
     */
    public riverTile() {
        super(4, 2, 0, false, true, "River", Color.BLUE, new Image("Model/Tiles/river_Tile.jpg"));
    }

}
