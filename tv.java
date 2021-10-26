
package javaapplication5;

public class Tv 
{
    
   boolean on = false;
    int channel;
int volumeLevel ;

    public Tv() 
    {

    }


    public void turnOf()
    {
        on = false;
    }

    public void turnOn() 
    {
        on = true;
    }
    public void setVolume(int newVolumeLevel ) {
        if ( newVolumeLevel >= 1 &&newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }


    public void setChannel(int newChannel)
    {
        if (newChannel >= 0 && newChannel <= 100) {
            channel = newChannel;
        }
    }

    public void channelDown() {
        if ( channel > 0) { channel--;
        }
    }
public void volumeUp() 
    {
        if ( volumeLevel < 7) { volumeLevel++;
        }
    }

    public void volumeDown() {
        if ( volumeLevel > 0) {            volumeLevel--;
        }
    }


    public void channelUp() {
        if (channel < 100) {channel++;
        }
    }

    
}

package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args)
    {
    
   
       Tv tv = new Tv ();
        tv.turnOn();
        tv.setChannel(22);
        tv.setVolume(4);

        Tv tv1 = new Tv();
        tv1.turnOn()tv1.channelUp();
        tv1.channelUp();tv1.volumeUp();

        System.out.println(" channel is "  tv.channel " volume is "  tv.volumeLevel)
        System.out.println(" channel is "  tv1.channel  " volume level)
}
    
