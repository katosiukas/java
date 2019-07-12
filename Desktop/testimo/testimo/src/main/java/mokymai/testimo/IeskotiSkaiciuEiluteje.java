package mokymai.testimo;

public class IeskotiSkaiciuEiluteje {

	private String[] skaitmenys = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	private String[] dalys_skaiciaus = { ".", ",", "-", "e", "E", "+", "/", "%" };
	private String[] zodzio_pabaigos = { ".", ",", " ", "\n", ";", ":" };
	private String[] ne_zodzio_dalis = { ")", ",", ";", "." , "/" };
	boolean pries_tai_buvo_skaitmuo = false;
	boolean yra_zodis_po_skaitmens = false;	
	public String simb;
	public String eilute_is_failo;
	public int kiekis_skaiciu;
	
	public static boolean priklausoAibei ( String simbolis, String[] aibe ) {
		
		boolean priklauso = false;
		
		for (int i = 0; i < aibe.length; i++ ) {
		
			if ( simbolis.equals ( aibe [ i ] ) ) {
			
				priklauso = true;
			}
		}
		return priklauso;
	}
	
/*	public void setSkaitmenys (String[] skaitmenys) {       < cia setteris karkasui >
		this.skaitmenys = skaitmenys;
	} */
	
	public IeskotiSkaiciuEiluteje() {}
		
	public int ieskojimas (String eilute_is_failo, int kiekis_skaiciu, String[] vnt_po_skaiciu, String[] skaiciai) { 
		
		for ( int i = 0; i < eilute_is_failo.length(); i++ ) {
			
			simb =  eilute_is_failo.substring( i, i+1 );
		
			if ( 
					priklausoAibei ( simb, skaitmenys ) 
				|| 
					( 
							pries_tai_buvo_skaitmuo  
						&& 
							priklausoAibei ( simb, dalys_skaiciaus )
					) 
				||
					yra_zodis_po_skaitmens
			) {
				
				if ( pries_tai_buvo_skaitmuo || yra_zodis_po_skaitmens ) { 				
					
					if ( yra_zodis_po_skaitmens ) {
						
						vnt_po_skaiciu [ kiekis_skaiciu - 1 ] += simb;  
						
					} else {
				
						skaiciai [ kiekis_skaiciu - 1 ] += simb;
					}
					
				} else {
					
					skaiciai [ kiekis_skaiciu ] = simb;
					vnt_po_skaiciu [ kiekis_skaiciu ] = "";
					kiekis_skaiciu++;
				}
				
				if ( ! yra_zodis_po_skaitmens ) {
					
					pries_tai_buvo_skaitmuo = true;
					
				} else {
				
					if ( priklausoAibei ( simb, zodzio_pabaigos ) ) {
						
						yra_zodis_po_skaitmens = false;
					}
				}
				
			} else {
				
				if ( pries_tai_buvo_skaitmuo ) {
					
					if ( ! priklausoAibei ( simb, ne_zodzio_dalis ) ) {
				
						yra_zodis_po_skaitmens = true;
						vnt_po_skaiciu [ kiekis_skaiciu - 1 ] += simb;
					}
				}
				pries_tai_buvo_skaitmuo = false;
			}
		}		
		
		return kiekis_skaiciu;
	}

}
