package pl.socketbyte.opensectors.system.json;

import pl.socketbyte.opensectors.system.json.controllers.SQLController;
import pl.socketbyte.opensectors.system.json.controllers.ServerController;

public class JSONConfig {

    public String password;
    public int sectorSize;
    public int sectors;
    public int portTCP;
    public int portUDP;
    public long bukkitTimeFrequency;
    public int bukkitTimeIncremental;
    public int border;
    public SQLController sqlController;
    public ServerController[] serverControllers;

}
