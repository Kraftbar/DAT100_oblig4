Øving 7: Polymorfisme

Læringsmål- Du skal lære hvordan å bruke grensesnitt og abstrakte klasser. Du skal få øving i hvordan å bruke
polymorfiske metodekall.


I denne øvingen skal du lage et enkelt spill. Spillerne starter på den ene enden av en vei som er 20
ruter lang. Hver runde kaster spilleren en terning og flytter så mange ruter framover som terningen
viser. Hva som skjer deretter avhenger av hva slags rute spilleren havner i:
- Vanlig Rute: Spilleren flytter til ruta og turen går til neste spiller
- Tilbake til start: Spilleren rykker tilbake til start
- Frivillig: Hinder: Spilleren blir stående i den forrige ruta
- Frivillig: Ekstrakast: Spilleren får et ekstra kast og går videre framover. Husk at du må sjekke
den nye ruta for hva som skjer med spilleren etter flyttet.
- Frivillig: Stå over tur: Som hinder med det tillegget at spilleren må stå over sin neste tur.
En spiller vinner om vedkommende kommer til eller forbi enden av veien.

Klassen Spiller er delt ut.

Oppgaver
a) Lag et grensesnitt Rute for rutene. Grensesnittet spesifiserer metoden flyttHit. Metoden
flyttHit tar et spillerobjekt som innparameter. Signatur: public void flyttHit(Spiller spilleren).
Metoden kalles når en spiller har kastet terningen og skal prøve å flytte til ruta.

b) Lag en abstrakt klasse AbstraktRute som implementerer grensesnittet Rute. AbstraktRute
klassen har felles funksjonalitet for alle ruter. Denne klassen skal lagre ruta sin posisjon langs
veien. Klassen skal ha en konstruktør som tar posisjonen som innparameter og skal ha
metoden getPosisjon for å hente ut posisjonen.

c) Lag en klasse VanligRute som arver fra AbstraktRute og implementerer flyttHit metoden ved
å flytte spilleren til ruta og skrive ut en beskjed om at spilleren er flyttet og til hvilken rute.

d) Lag en klasse TilbakeTilStart som arver fra AbstraktRute og implementerer flyttHit metoden
ved å sette posisjonen til spilleren til 0 (starten av veien). Metoden skal også skrive ut en
beskjed om hvilken rute spilleren prøvde å flytte til (posisjonen til denne ruta) men at
spilleren må rykke tilbake til start.

e) Lag en main() metode som spiller spillet med én spiller. Lag en vei (array eller arraylist) med
20 Rute referanser. Fyll arrayen eller arraylisten med en kombinasjon av de ulike typene rute.
Det skal være flest vanlige ruter og færrest Rykk tilbake til start ruter.

f) Lag en main() metode som spiller spillet med flere spillere. Metoden skal avslutte når en
spiller har vunnet. En spiller vinner når vedkommende kommer enten til slutten eller forbi
slutten av veien.