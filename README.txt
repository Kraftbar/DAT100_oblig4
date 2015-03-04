�ving 8: Unntaksha� ndtering, Enkelt GUI

L�ringsm�l - Du skal l�re hvordan � bruke unntak for � h�ndtere feilsituasjoner. Du skal l�re b�de hvordan �
kaste unntak og hvordan � fange dem. Du skal l�re hvordan � sette opp et enkelt GUI og hvordan �
h�ndtere hendelser fra dette GUI-et.
Beskrivelse

Gjett tallet spill: Oppgaven til spilleren er � gjette hvilket tall datamaskina har p� f�rrest mulig trekk.
Datamaskina har et tilfeldig tall mellom 1 og 1000. For hver runde skal brukeren skrive inn et tall i
tekstfeltet og trykke �ok�. Programmet skal deretter skrive ut i en Label om brukerens tall er st�rre
enn eller mindre enn tallet programmet har, samt om det er n�rmere eller lengre unna tallet enn
forrige tall brukeren gjettet. Programmet skal ogs� skrive ut hvor mange runder spilleren har brukt til
n�. 

Oppgaver
a) Lag kode som tegner grensesnittet, som kan se ut som p� bildet.
b) Lag en metode som leser ut teksten fra et tekstfelt og konverterer det til et heltall hvis mulig.
Den skal kaste et unntak hvis teksten ikke kan konverteres til et heltall eller heltallet er
utenfor grensene til spillet (mindre enn 1 eller st�rre enn 1000).
c) Lag en EventListener<ActionEvent> som bruker metoden fra b). Hvis det ikke blir noe unntak,
skal lytteren sjekke tallet brukeren skrev mot tallet i systemet og skrive riktig beskjed til
beskjedfeltet. Hvis det blir et unntak skal lytteren vise en dialog som beskriver feilen og la
brukeren pr�ve p� nytt.
d) N�r brukeren skriver inn riktig tall (tallet datamaskina har lagd og som brukeren skal gjette)
skal EventListeneren vise en dialog �Du har gjettet riktig!� som ogs� sier hvor mange fors�k
brukeren brukte.
e) Lag en main() metode som lager et tilfeldig tall som brukeren skal gjette og deretter setter
opp og kj�rer spillet. EventListeneren fra oppgave c) skal legges som lytter til OK-knappen (og
tekstfeltet om du vil).
f) Frivillig: Etter at spillet er over skal spilleren f� et valg om vedkommende vil spille p� nytt.
Hvis spilleren velger �ja� skal spillet startes p� nytt. Spillet skal lagre en high-score og for
hver omgang skal resultatet fra omgangen sammenliknes med high-score. Hvis n�v�rende resultat er bedre (det vil si at spilleren brukte f�rre fors�k) skal spilleren f� skrive inn sitt
navn, som vises sammen med high-score.