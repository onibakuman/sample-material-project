package net.onibakuland;

public class MaterialSpeed {
    MaterialSpeed(Double distance, Integer userSelectedType) {
        this.distance = distance;
        this.userSelectedType = userSelectedType;
    }

    public double getDistance() {
        return distance;
    }

    public Double getSpeed() {
        return switch (this.userSelectedType) {
            case 1 -> distance / Constants.AIR_RATE;
            case 2 -> distance / Constants.STEEL_RATE;
            case 3 -> distance / Constants.WATER_RATE;
            default -> -1.0;
        };
    }

    public MaterialSpeed setDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    public MaterialSpeed setUserDistanceType(Integer distanceType) {
        this.userSelectedType = distanceType;
        return this;
    }

    private Double distance = -1.0;
    private Integer userSelectedType;

}
