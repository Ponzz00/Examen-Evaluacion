package Parking;

public class PR19202AU04EX02Parking_diego_ponce {
	
	private int places_no_discapacitats;
	private int places_discapacitats;
	
	
	public PR19202AU04EX02Parking_diego_ponce(int places_no_discapacitats, int places_discapacitats) {
		this.places_no_discapacitats=places_no_discapacitats;
		
		this.places_discapacitats=places_discapacitats;
	}

	public void llegirMatricules(String path) throws Exception {
	}
	public int entraCotxe(String matricula) throws Exception {
		return places_discapacitats;
		
		}
	public int entraCotxeDiscapacitat(String matricula) throws Exception {
		return places_discapacitats;
		
		}
	public void surtCotxe(String matircula) throws Exception {
		
		}
	public void surtCotxeDiscapacitats(String matircula) throws Exception {
		
		}
	public int getPlacesOcupades(TipusPlacesParking tipus) {
		
		}
	public void guardarMatricules(String path) throws Exception {
		
		}
	
}
