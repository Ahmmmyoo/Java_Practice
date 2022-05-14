// Name: Ahmad Irfan Khan     Date: 30/03/2022

// The purpose of this class is to model a television
class Television {
    String manufacturer ; // TV brand
    int screenSize ; // TV Screen Size
    boolean powerOn ; // TV power status
    int channel ; // TV channel
    int volume ; // TV volume

    Television(String name, int sSize) { // constructor (takes Brand and Screen Size)
        manufacturer = name ; // assigns Brand
        screenSize = sSize ; // assigns Screen Size
        powerOn = false ; // default power is off
        channel = 2 ; // channel set to 2
        volume = 20 ; // volume set to 20
    }

    void setChannel (int station) { // assigns station to TV
        channel = station ;
    }
    void power() { // switches the power
        powerOn = !powerOn ;
    }
    void increaseVolume() { // increments volume by 1
        if(volume <= 100) volume ++ ;
        else System.out.print("\nError... can not Increase More\n");
    }
    void decreaseVolume() { // decrements volume by 1
        if(volume >= 0) volume -- ;
        else System.out.print("\nError... can not Decrease More\n");
    }
    int getChannel() { // returns the TV channel
        return channel ;
    }
    int getVolume() { // returns the TV volume
        return volume;
    }
    String getManufacturer() {  // returns the TV Brand
        return manufacturer;
    }
    int getScreenSize() { // returns the TV Size
        return screenSize;
    }
}

