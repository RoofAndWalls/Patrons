package edu.ics4u.patrick.remotes;

import edu.ics4u.patrick.devices.Device;

public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}