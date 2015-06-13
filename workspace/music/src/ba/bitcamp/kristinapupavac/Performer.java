package ba.bitcamp.kristinapupavac;
/*Napisati klasu koja predstavlja jednog izvodjaca pjesama. Sve atribute staviti public i nije 
 * potrebno praviti konstruktor. Izvodjac sadrzi sljedece atribute:
 * Ime izvodjaca
 * Da li je u pitanju grupa?
 * Od koje su godine aktivni
 * Zanr muzike (ako ima vise onda glavni zanr samo
 */
public class Performer {
	String name;
	boolean isGroup;
	int since;
	String genere;
	@Override
	public String toString() {
		return "Performer [name=" + name + ", isGroup=" + isGroup + ", since="
				+ since + ", genere=" + genere + "]";
	}

}
