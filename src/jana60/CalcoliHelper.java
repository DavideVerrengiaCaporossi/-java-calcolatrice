package jana60;
/*Consegna
Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare la classe in modo che non possa essere istanziata (cioè non posso creare oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i seguenti metodi static:
- Somma di due numeri interi
- Differenza tra due numeri interi
- Moltiplicazione di due numeri interi
- Valore assoluto di un numero intero
- Minimo tra due numeri interi
- Massimo tra due numeri interi
Create anche una classe CalcoliTest con il metodo main in cui testate tutti i metodi della vostra classe di helper (con un esempio per ogni casistica)
BONUS 1: per ogni metodo scrivetene una versione che esegue le stesse operazioni ma su parametri double.
Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica uno dei principi di programmazione ad oggetti…Quale? Scrivetelo in un commento all’interno del vostro codice! :faccia_nerd:
BONUS2: aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) e ritorna la base elevata all’esponente. Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi! (caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)
Buon lavoro! :muscolo:*/
public class CalcoliHelper {
	private CalcoliHelper() {
	}
	
	public static int somma(int a, int b) {
		return a + b;
	}
	
	
	public static int differenza(int a, int b) {
		return a - b;
	}
	
	
	public static int moltiplicazione(int a, int b) {
		return a * b;
	}
	
	/*public static int valoreAssoluto(int a) 
	{
		if(a<0) {
			return a;
		}else {
			return a;
		}
	*/
	
	
		public static int valoreMinimo(int a, int b) {
			if (a > b) {
			 return  b; 
			}
			else  {
				return a;
			}
			
		}
		public static int valoreMassimo(int a, int b) {
			if (a > b) {
			 return  a; 
			}
			else   {
				return b;
			}
			
		}
		
		}

