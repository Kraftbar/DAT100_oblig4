Øving 8: Unntaksha° ndtering, Enkelt GUI

Læringsmål - Du skal lære hvordan å bruke unntak for å håndtere feilsituasjoner. Du skal lære både hvordan å
kaste unntak og hvordan å fange dem. Du skal lære hvordan å sette opp et enkelt GUI og hvordan å
håndtere hendelser fra dette GUI-et.
Beskrivelse

Gjett tallet spill: Oppgaven til spilleren er å gjette hvilket tall datamaskina har på færrest mulig trekk.
Datamaskina har et tilfeldig tall mellom 1 og 1000. For hver runde skal brukeren skrive inn et tall i
tekstfeltet og trykke «ok». Programmet skal deretter skrive ut i en Label om brukerens tall er større
enn eller mindre enn tallet programmet har, samt om det er nærmere eller lengre unna tallet enn
forrige tall brukeren gjettet. Programmet skal også skrive ut hvor mange runder spilleren har brukt til
nå. 

Oppgaver
a) Lag kode som tegner grensesnittet, som kan se ut som på bildet.
b) Lag en metode som leser ut teksten fra et tekstfelt og konverterer det til et heltall hvis mulig.
Den skal kaste et unntak hvis teksten ikke kan konverteres til et heltall eller heltallet er
utenfor grensene til spillet (mindre enn 1 eller større enn 1000).
c) Lag en EventListener<ActionEvent> som bruker metoden fra b). Hvis det ikke blir noe unntak,
skal lytteren sjekke tallet brukeren skrev mot tallet i systemet og skrive riktig beskjed til
beskjedfeltet. Hvis det blir et unntak skal lytteren vise en dialog som beskriver feilen og la
brukeren prøve på nytt.
d) Når brukeren skriver inn riktig tall (tallet datamaskina har lagd og som brukeren skal gjette)
skal EventListeneren vise en dialog «Du har gjettet riktig!» som også sier hvor mange forsøk
brukeren brukte.
e) Lag en main() metode som lager et tilfeldig tall som brukeren skal gjette og deretter setter
opp og kjører spillet. EventListeneren fra oppgave c) skal legges som lytter til OK-knappen (og
tekstfeltet om du vil).
f) Frivillig: Etter at spillet er over skal spilleren få et valg om vedkommende vil spille på nytt.
Hvis spilleren velger «ja» skal spillet startes på nytt. Spillet skal lagre en high-score og for
hver omgang skal resultatet fra omgangen sammenliknes med high-score. Hvis nåværende resultat er bedre (det vil si at spilleren brukte færre forsøk) skal spilleren få skrive inn sitt
navn, som vises sammen med high-score.