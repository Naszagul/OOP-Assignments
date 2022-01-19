public abstract class Shape {
    double height;
    double volume;
    double baseArea;

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }
}