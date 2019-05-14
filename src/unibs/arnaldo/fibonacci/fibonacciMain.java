package unibs.arnaldo.fibonacci;

import it.unibs.fp.mylib.InputDati;

public class fibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n=InputDati.leggiIntero("Inserisci un numero: ");
		
		
		fibo(n);
		
	}
	public static long fibo(long n) {
		if()
		
		
    	
	}
	
	public static int mcd(int m, int n) { 
		if (n == 0) {
			return m;
			} else {
        	return mcd(n, m % n); 
        	}
		}


}
