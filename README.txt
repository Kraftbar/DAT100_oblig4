�ving 7: Polymorfisme

L�ringsm�l- Du skal l�re hvordan � bruke grensesnitt og abstrakte klasser. Du skal f� �ving i hvordan � bruke
polymorfiske metodekall.


I denne �vingen skal du lage et enkelt spill. Spillerne starter p� den ene enden av en vei som er 20
ruter lang. Hver runde kaster spilleren en terning og flytter s� mange ruter framover som terningen
viser. Hva som skjer deretter avhenger av hva slags rute spilleren havner i:
- Vanlig Rute: Spilleren flytter til ruta og turen g�r til neste spiller
- Tilbake til start: Spilleren rykker tilbake til start
- Frivillig: Hinder: Spilleren blir st�ende i den forrige ruta
- Frivillig: Ekstrakast: Spilleren f�r et ekstra kast og g�r videre framover. Husk at du m� sjekke
den nye ruta for hva som skjer med spilleren etter flyttet.
- Frivillig: St� over tur: Som hinder med det tillegget at spilleren m� st� over sin neste tur.
En spiller vinner om vedkommende kommer til eller forbi enden av veien.

Klassen Spiller er delt ut.

Oppgaver
a) Lag et grensesnitt Rute for rutene. Grensesnittet spesifiserer metoden flyttHit. Metoden
flyttHit tar et spillerobjekt som innparameter. Signatur: public void flyttHit(Spiller spilleren).
Metoden kalles n�r en spiller har kastet terningen og skal pr�ve � flytte til ruta.

b) Lag en abstrakt klasse AbstraktRute som implementerer grensesnittet Rute. AbstraktRute
klassen har felles funksjonalitet for alle ruter. Denne klassen skal lagre ruta sin posisjon langs
veien. Klassen skal ha en konstrukt�r som tar posisjonen som innparameter og skal ha
metoden getPosisjon for � hente ut posisjonen.

c) Lag en klasse VanligRute som arver fra AbstraktRute og implementerer flyttHit metoden ved
� flytte spilleren til ruta og skrive ut en beskjed om at spilleren er flyttet og til hvilken rute.

d) Lag en klasse TilbakeTilStart som arver fra AbstraktRute og implementerer flyttHit metoden
ved � sette posisjonen til spilleren til 0 (starten av veien). Metoden skal ogs� skrive ut en
beskjed om hvilken rute spilleren pr�vde � flytte til (posisjonen til denne ruta) men at
spilleren m� rykke tilbake til start.

e) Lag en main() metode som spiller spillet med �n spiller. Lag en vei (array eller arraylist) med
20 Rute referanser. Fyll arrayen eller arraylisten med en kombinasjon av de ulike typene rute.
Det skal v�re flest vanlige ruter og f�rrest Rykk tilbake til start ruter.

f) Lag en main() metode som spiller spillet med flere spillere. Metoden skal avslutte n�r en
spiller har vunnet. En spiller vinner n�r vedkommende kommer enten til slutten eller forbi
slutten av veien.