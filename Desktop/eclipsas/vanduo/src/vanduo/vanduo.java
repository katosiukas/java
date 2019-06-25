
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
	    System.out.println("Ávedam: bala, tvekinys, ezeras, upe, jura arba vandenynas");

	    String apr = Ivedimas.nextLine();  
 
		
	    if (apr.equals("bala")) {
		System.out.println("Apraðymas: " + bala_dat.aprasymas +" jos dydis: "+ bala_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_1);
	    }
	    
	    if (apr.equals("tvenkinys")) {
		System.out.println("Apraðymas: " + tvenk_dat.aprasymas +" jos dydis: "+ tvenk_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_1);
	    }
	    
	    if (apr.equals("ezeras")) {
		System.out.println("Apraðymas: " + ezer_dat.aprasymas +" jos dydis: "+ ezer_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_2);
	    }
	    
	    if (apr.equals("upe")) {
		System.out.println("Apraðymas: " + upe_dat.aprasymas +" jos dydis: "+ upe_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_2);
	    }
	    
	    if (apr.equals("jura")) {
		System.out.println("Apraðymas: " + jura_dat.aprasymas +" jos dydis: "+ jura_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_3);
	    }
	    
	    if (apr.equals("vandenynas")) {
		System.out.println("Apraðymas: " + vanden_dat.aprasymas +" jos dydis: "+ vanden_dat.dydis + " Dydþio klasifikacija: " + dydis_dat.dydis_4);
	    }
	}
}
