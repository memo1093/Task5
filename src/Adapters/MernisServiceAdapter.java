package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean CheckPlayer(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		long nationalityId = Long.parseLong(player.getNationalityId());
		boolean result;
		try {
			result = client.TCKimlikNoDogrula(nationalityId ,player.getFirstName().toUpperCase() ,player.getLastName().toUpperCase(), player.getBirthDate().getYear()) ;
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
