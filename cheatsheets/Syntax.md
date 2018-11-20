# Syntax

###### Grunnleggende syntax

* Java er _case sensitive_, som betyr at **Hello** og **hello** vil ha forskjellig betydning i Java.
* **Klassenavn** - Alle klassenavn bør starte med stor bokstav. Hvis navnet består av flere ord, bør hver første bokstav i hvert ord være stor. **Eksempel**: `class EiLittaKlasse`
* **Metodenavn** - Alle metodenavn bør starte med liten bokstav. Hvis navnet består av flere ord, bør hvert ord som følger det første ha stor første bokstav. Eksempel: `void eiLittaMetode()`
* **Filnavn** - Filnavnet bør være det samme som klassenavnet.  En klasse med _default_ tilgangsnivå vil kompilere med forskjellige navn, men vil endre navnet på den kompilerte filen til klassenavnet. En _public_ klasse vil ikke kompilere. **Eksempel**: Med klassenavn `EiLittaKlasse` bør filen hete _EiLittaKlasse.java_



###### Identifiers

Alle komponentene i Java krever navn. Navnene brukt til klasser, variabler og metoder blir kalt _identifiers_ eller _identifikatorer_ på norsk.

* Alle _identifikatorer_ bør begynne med en bokstav (A til Z eller a til z, helst unngå ÆØÅ), valuta-tegn ($) eller understrek (_).
* Etter den først karakteren, kan _identifikatorer_ ha hvilken som helst kombinasjon av karakterer.
* _Keywords_ kan ikke bli brukt som _identifikatorer_. Dette inkluderer bl.a. _public_, _private_, _abstract_, _int_, _return_ osv.
* **Eksempler på lovlige _identifikatorer_**: `alder`, `$navn`, `_verdi`, `__1_verdi`.
* **Eksempler på ulovlige _identifikatorer_**: `123abc`, `-alder`, `extends`.

