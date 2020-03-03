public class Television {

    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     *creates instance of Television by setting local variables to global variables
     * @param brand
     * @param size
     */
    public Television(String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        this.powerOn = false;
        this.volume = 20;
        this.channel = 2;
    }

    /**
     *
     * @return manufacturer of tv
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     *
     * @return  size of tv
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     *
     * @return  Channel # of tv
     */
    public int getChannel() {
        return channel;
    }

    /**
     *
     * @return  Volume # of tv
     */
    public int getVolume() {
        return volume;
    }

    /**
     *sets channel to station
     * @param station
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    
    public void power() {
        this.powerOn = !this.powerOn;
    }

    /**
     * increases volume by 1
     */
    public void increaseVolume() {
        this.volume++;
    }

    /**
     * decreases the volume by 1
     */
    public void decreaseVolume() {
        this.volume--;
    }
}