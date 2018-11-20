# Løkker

En løkke er et sett med instruksjoner/funksjoner som blir kjørt om igjen mens en betingelse er sann. Java har 3 typer løkker som har samme grunnleggende funksjonalitet, men som er forskjellige i syntaks og hvor i løkken betingelsen blir sjekket.



### while-løkke

En _while-løkke_ tillater oss å kjøre kode om igjen basert på en booleansk betingelse. Det går an å tenke på en _while-løkke_ som gjentatte _if_-utsagn. 

Syntaks:

```java
while(betingelse) {
    // Gjør noe
}
```



_while-løkker_ starter med å evaluere betingelsen som er gitt. Hvis betingelsen er sann, blir koden i blokken kjørt. Normalt sett inneholder blokken kode som oppdaterer verdier som er relevant for betingelsen til neste gjennomgang. Når koden er kjørt, blir betingelsen evaluert på nytt, og fortsetter slik helt til betingelsen blir evaluert til _false_. **Eksempel**:

```java
void loop() {
    int x = 1;
    
    while(x <= 4) {
        System.out.println(x);
        x++;
    }
}
```



### for-løkke

En _for-løkke_ gir oss en mer nøyaktig måte å definere løkken på. I motsetning til en _while-løkke_ kan en _for-løkke_ både initialisere en variabel, teste en betingelse, og øke/minste verdien av variabelen på en enkelt linje.

Syntaks:

```java
for(initialisering teller; betingelse; minske/øke teller) {
    // Gjør noe
}
```



En _for-løkke_ starter med å initialisere en variabel som fungerer som en teller. Vi kan bruke en allerede deklarert variabel, eller deklarere en ny variabel som befinner seg i _scopet_ til løkken. Deretter evaluerer vi en betingelse som må returnere en _booleansk_ verdi (true/false). Denne betingelsen blir sjekket før koden i løkken blir kjørt. Hvis betingelsen er _true_, blir koden kjørt. Når koden har kjørt, øker eller minsker vi verdien av telleren. Når betingelsen i løkken blir _false_, blir løkken avsluttet. **Eksempel**:

```java
void loop() {
    for(int i = 0; i < 100; i+=10) {
        System.out.println(i);
    }
    // 0102030405060708090
}
```



Her har vi definert at _i_ skal øke med 10 etter hver gjennomgang av løkken. Når _i_ når 100, vil betingelsen bli _false_ da 100 ikke er mindre enn 100, og løkken blir avsluttet.



### Enhanced for-løkke

En _enhanced for-løkke_ er en en type _for-løkke_ som kan gjøre det enklere å gå gjennom tabeller og andre mengder. Denne løkken er lite fleksibel, og gir oss ikke indeksen til elementene vi går gjennom, og er derfor ikke alltid like godt egnet som en vanlig _for-løkke_. 

Syntaks:

```java
for(T element: mengde) { // Hvor T er datatypen
    // Gjør noe
}
```



La oss ta et eksempel som demonstrerer hvordan en _enhanced for-løkke_ kan gjøre livet lettere. Si at vi har en tabell med navn, og at vi vil skrive ut alle disse navnene. Vi kan løse dette med både _for_- og _enhanced for_-løkker:

```java
void print() {
    String arr[] = new String[]{"Ole", "Dole", "Doffen"};
    
    for(String x : arr) {
        System.out.println(x);
    }
    
    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```



I dette tilfellet bil det være enklere og mer lesbart å bruke en _enchanced for-løkke_, da vi ikke trenger indeksen til elementet.



### do-while-løkke

En _do-while-løkke_ ligner på en _while-løkke_ hvor den eneste forskjellen er at _do-while-løkken_ sjekker betingelsen først etter

