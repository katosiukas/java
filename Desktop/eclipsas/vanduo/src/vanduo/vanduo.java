
package vanduo;

import java.util.Scanner;

public class vanduo {
	
	
	public static void main(String[] args) {
		
		
		bala bala_dat = new bala();
		tvenkinys tvenk_dat = new tvenkinys();
		upe upe_dat = new upe();
		jura jura_dat = new jura();
		ezeras ezer_dat = new ezeras();
		vandenynas vanden_dat = new vandenynas();
		dydis dydis_dat = new dydis();
		
		var Ivedimas = new Scanner(System.in);  
	    System.out.println("�vedam: bala, tvekinys, ezeras, upe, jura arba vandenynas");

	    String apr = Ivedimas.nextLine();  
 
		
	    if (apr.equals("bala")) {
		System.out.println("Apra�ymas: " + bala_dat.aprasymas +" jos dydis: "+ bala_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_1);
	    }
	    
	    if (apr.equals("tvenkinys")) {
		System.out.println("Apra�ymas: " + tvenk_dat.aprasymas +" jos dydis: "+ tvenk_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_1);
	    }
	    
	    if (apr.equals("ezeras")) {
		System.out.println("Apra�ymas: " + ezer_dat.aprasymas +" jos dydis: "+ ezer_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_2);
	    }
	    
	    if (apr.equals("upe")) {
		System.out.println("Apra�ymas: " + upe_dat.aprasymas +" jos dydis: "+ upe_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_2);
	    }
	    
	    if (apr.equals("jura")) {
		System.out.println("Apra�ymas: " + jura_dat.aprasymas +" jos dydis: "+ jura_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_3);
	    }
	    
	    if (apr.equals("vandenynas")) {
		System.out.println("Apra�ymas: " + vanden_dat.aprasymas +" jos dydis: "+ vanden_dat.dydis + " Dyd�io klasifikacija: " + dydis_dat.dydis_4);
	    }
	}
}
