public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void drinkWater() {
         volume -= 10;
    }

    public void emptyBottle() {
         volume = 0;
    }

    public void fillBottle() {
         this.volume = 100;

    }
}
