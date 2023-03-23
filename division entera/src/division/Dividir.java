package division;

public class Dividir {

	    /**
	     * funcion para dividir
	     * @param dividendo
	     * @param divisor
	     * @return division entera
	     */
	    public int divisionEntera(int dividendo, int divisor){
	       if (divisor==0) {
	           return 0;
	       }
	       else {
	           return dividendo/divisor;
	       }
	    }
	   /*Palabra*/
	    public boolean noContieneVocales(String cadena) {
	    	boolean resultado=true;
	    	int i=0;
	    	//se comprueba si la cadena que me pasan, contiene algunos de estos caracteres
	    	for(i=0; i<=cadena.length();i++) {
	    	if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' ||cadena.charAt(i)=='u') {
	    		resultado=false;
	    		return resultado;
	    	}else {
	    		
	    	}
	    		
	    	}
	    	return resultado;
	    }
	}

