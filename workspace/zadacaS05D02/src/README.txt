TASK 1 (sa vjezbi)
Napisati klasu koja opisuje jedan printer. Printer ima sljedece atribute:
 * Ime printera
 * Kolicina papira u printeru
 * Kolicina tinte u printeru
 * Ukupno isprintano stranica
 Printer ima sljedece konstruktore:
 * Prazni konstruktor koji inicijalizira ime na DefaultPrintere, a kolicinu papira i tinte na 0
 * Konstruktor koji inicijalizira ime na dati parametar, a kolicinu papira i tinte na 0
 * Oba konstruktora inicijaliziraju ukupno isprintano stranica na 0 Printer ima sljedece metode:
 * Metoda koja vraca da li ima tinte (true/false)
 * Metoda koja vraca da li ima papira (true/false)
 * Metoda koja vraca koliko je ukupno isprintano stranica od tog printera
 * Metoda koja dodaje papira u printer (void metoda)
 * Uzeti u obzir da se ne moze imati vise od 100 papira u printeru 
 * Metoda koja napuni tintu na max. (void metoda)
 * Maksimalno tinte je 100
 * Metoda koja printa stranice papira (void metoda)
 * Metoda prima int parametar koji predstavlja koliko stranica isprintati 
 * Za svaku isprintanu stranicu oduzeti jedan papir iz printera
 * Za svaku isprintanu stranicu oduzeti tri iz atributa tinta
 * Ukoliko nema papira ili ako nema tinte onda ne treba printati
 Pored toga Printer klasa sadrzi sljedece:
 * toString metodu koja printa ime printera i trenutno stanje
 * Stanje moze biti Ready, No ink, No paper, No ink nor paper
 * static varijablu koja biljezi koliko ukupno stranica je isprintano
 * Napisati i metodu koja vraca vrijednost te varijable
 * Napisati malu demonstraciju rada vaše klase u main metodi.

TASK 2
Napisati klasu koja opisuje jednu firmu. Firmu opisuju sljedeci atributi:
1. Ime firme
2. Direktor firme (koristiti Employee klasu)
3. Niz zaposlenih radnika (koristiti Employee klasu)
Bitno je naglasiti da se i direktor smatra zaposlenikom u firmi, ali se ne nalazi u nizu 
zaposlenih radnika.
Svaki radnik (Employee) je objekat opisan sljedecim atributima:
1. Ime osobe
2. Spol
3. Mjesecna plata
Svaki atribut je private i svaki ima get metodu. Samo atribut koji opisuje mjesecnu platu ima
set metodu. Pored toga, klasa Employee treba sadrzavati i konstruktor koji inicijalizira sve 
atribute.
Metode koje se nalaze u klasi koja opisuje firmu su:
1. Metoda koja vraca koliko je zaposlenih u firmi
2. Metoda koja vraca koliko ukupno se daje novca za zaposlene, tj. njihove plate
3. Metoda koja odredjuje koliko ima zaposlenih zena u firmi
4. Metoda koja povecava svim zaposlenim platu za datu sumu novca
5. toString metoda koja stavlja ime firme, ime direktora i broj radnika u String