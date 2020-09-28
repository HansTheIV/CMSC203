/**
*The purpose of this class is to model a television
*Ethan Ringel,  9/26/20
*/


public class Television {
    String MANUFACTURER;
    int SCREEN_SIZE;
    boolean powerOn;
    int channel;
    int volume;
    public Television(String manufacturer, int size)
    {
        this.MANUFACTURER = manufacturer; //who made the tv
        this.SCREEN_SIZE = size; //how big is the tv
        this.powerOn = false; //is the tv on
        this.channel = 2; //what channel is the tv tuned to
        this.volume = 20; //what volume is the tv set to
    }

    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    public void power()
    {
        powerOn = !powerOn;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public void setChannel(int station)
    {
        channel = station;
    }
    public void increaseVolume()
    {
        volume++;
    }
    public void decreaseVolume()
    {
        volume--;
    }
}
