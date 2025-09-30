package flyweight;

public abstract class Tile {

    public String getCharacter() {
        return switch (this.getClass().getSimpleName()) {
            case "BuildingTile" -> "B";
            case "RoadTile" -> "R";
            case "ForestTile" -> "F";
            case "SwampTile" -> "S";
            case "WaterTile" -> "W";
            default -> "?";
        };
    }

    public String getType() {
        return switch (this.getClass().getSimpleName()) {
            case "BuildingTile" -> "building";
            case "RoadTile" -> "road";
            case "ForestTile" -> "forest";
            case "SwampTile" -> "swamp";
            case "WaterTile" -> "water";
            default -> "unknown";
        };
    }
}
