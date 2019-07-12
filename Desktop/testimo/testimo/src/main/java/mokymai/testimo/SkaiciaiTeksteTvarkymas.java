package mokymai.testimo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SkaiciaiTeksteTvarkymas {
	
	private String eilute_is_failo;
	
	String[] skaiciai = new String [ 1000 ];
	String[] vnt_po_skaiciu = new String [ 1000 ];
	int kiekis_skaiciu = 0; 	
	
	ArrayList<String> vnt; 
	ArrayList<String> anti_vnt; 
	
	public SkaiciaiTeksteTvarkymas() {
		
		SkaitymasIsFailo sf_vnt = new SkaitymasIsFailo ( "vnt.csv" );
		vnt = sf_vnt.iMasyva();
		SkaitymasIsFailo sf_anti_vnt = new SkaitymasIsFailo ( "anti_vnt.csv" );
		anti_vnt = sf_anti_vnt.iMasyva();		
	}
	
	public void ieskotiSkaiciu( String vardas_failo ) {
		
		SkaitymasIsFailo sf = new SkaitymasIsFailo ( vardas_failo );
		
		sf.pradeti();
		
		System.out.println ( "Duomenø failas: ");
		
		while ( sf.nuskaitytaEilute() ) {
			
			eilute_is_failo = sf.paimtiEilute();
			
			System.out.println ( eilute_is_failo );
			
			kiekis_skaiciu = (new IeskotiSkaiciuEiluteje()).ieskojimas(eilute_is_failo, kiekis_skaiciu, vnt_po_skaiciu, skaiciai);
			
			sf.skaitytiEilute();
		}
	}
	
	
	public void ieskotiVienetu() {
		
		BufferedReader in_kb = new BufferedReader( new InputStreamReader ( System.in ) );		

		for ( int i = 0; i < kiekis_skaiciu; i++ ) {
			
			if ( 
					( vnt.indexOf ( vnt_po_skaiciu [ i ].trim() )  == -1 ) 
				&&  
					(  ! vnt_po_skaiciu [ i ].trim().equals( "" ) ) 
				&&
					( anti_vnt.indexOf ( vnt_po_skaiciu [ i ].trim() ) == -1 )
			) {
			
				System.out.println ( "  -- ??? " + skaiciai [ i ] + " " + vnt_po_skaiciu [ i ] + ": "  );
				System.out.println ( "átraukti á mat. vnt.? " );
				
				String ats = "";
				
				try {
				
					ats = in_kb.readLine();
					
				} catch ( Exception e ) {
					
					System.err.format ( "IOException: %s%n", e );
				}
				
				if ( ats.equals( "" ) ) {
					
					vnt.add ( vnt_po_skaiciu [ i ].trim() );
					
				} else {
				
					anti_vnt.add ( vnt_po_skaiciu [ i ].trim() );
				}
			}
		}
	}
	
	public void parodytiSkaicius() {
		
		for ( int i = 0; i < kiekis_skaiciu; i++ ) {
			
			System.out.println ( " " + skaiciai [ i ] + " " + vnt_po_skaiciu [ i ] );
		}
	}
			
	public void parodytiVienetus() {
		
		System.out.println ( "\nvienetai: \n" );
		
		for ( String value : vnt ) { 
			
			System.out.print( value ); 
			System.out.print( " " ); 
		}
	}
	
	public void surasytiVntIrAnti() {
		
		RasymasFaile rf_vnt = new RasymasFaile ( "vnt.csv" );
		rf_vnt.iEilutes( vnt );
		
		RasymasFaile rf_anti_vnt = new RasymasFaile ( "anti_vnt.csv" );
		rf_anti_vnt.iEilutes( anti_vnt );
	}
}