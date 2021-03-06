import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote interface used by client to ask for electricity from station.
 */

public interface StationInterface extends Remote {

    String getEnergy(String units) throws Exception;
}
