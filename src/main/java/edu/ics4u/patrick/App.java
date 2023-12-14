package edu.ics4u.patrick;

import edu.ics4u.patrick.devices.Device;
import edu.ics4u.patrick.devices.Radio;
import edu.ics4u.patrick.devices.Tv;
import edu.ics4u.patrick.remotes.AdvancedRemote;
import edu.ics4u.patrick.remotes.BasicRemote;

public class App 
{
    public static void main( String[] args )
    {
         testDevice(new Tv());
        testDevice(new Radio());
    }
     public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

