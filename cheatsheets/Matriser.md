# Matriser

I Java kan tabeller inneholde alle datatyper, inkludert objekter. Siden en tabell er et objekt, kan en tabell også inneholde tabeller som elementer. Vi kaller slike tabeller for todimensjonale tabeller, eller _matriser_. Disse tabellene kan representeres som et regneark av rader av rader og kolonner:

|  [0]  | Element 2 |  [2]  |
| :---: | :-------: | :---: |
| [0,0] |   [1,0]   | [2,0] |
| [0,1] |   [1,1]   | [2,1] |
| [0,2] |   [1,2]   | [2,2] |
| [0,3] |   [1,3]   | [2,3] |



Syntaks:

```java
T[][] matrise = new T[størrelse][størrelse];

// Opprette matrise med verdier:

int[][] a = {
    {1, 2, 3},
    {7, 9, 8, 1},
    {7},
};
```



Eksempelet over kan settes opp i et regneark slik:

|           | Kolonne 1 | Kolonne 2 | Kolonne 3 | Kolonne 4 |
| :-------: | :-------: | :-------: | :-------: | :-------: |
| **Rad 1** |     1     |     2     |     3     |           |
| **Rad 2** |     7     |     9     |     8     |     1     |
| **Rad 3** |     7     |           |           |           |



Vi kan få tilgang til en spesifikk rekke slik:

```java
T[] = T[rekkenummer];

// f.eks. med tabeller av typen int

int[][] a = {
    {1, 2, 3},
    {7, 9, 8, 1},
    {7},
}

int[] rekke = a[1];

// rekke = [7, 9, 8, 1]

int[] annenRekke = a[0];

// annenRekke = [1, 2, 3];
```



### Gjennomgang av matriser

For å gå gjennom tabeller bruker vi for-løkker for å iterere gjennom hvert element i tabellen. Dette blir gjort med _for-løkker_:

```java
// Normal for som printer ut hvert element i tabellen
for(int i = 0; i < tabell.length; i++) {
    System.out.print(tabell[i]);
}

// Enhanced for som printer ut hvert element i tabellen
for(int element : tabell) {
    System.out.print(element);
}
```



Her bruker vi løkken til å iterere gjennom indeksene i tabellen med en enkelt tellervariabel _i_. For å få tilgang hver verdi i en matrise, trenger vi to indekser, f.eks. `int x = tabell[indeks1][indeks2]`. Dette er fordi vi går gjennom to tabeller. For å gå gjennom alle verdiene i en matrise må vi derfor først gå inn i en rekke, og deretter gå inn i hver verdi som ligger i kolonnen i denne rekken, før vi går over til neste rekke og gjør det samme. I Java kan vi derfor gjøre følgende:

```java
for(int rekke = 0; rekke < tabell.length; rekke++) {
    for(int kolonne = 0; kolonne < tabell[rekke].length; kolonne++) {
        // Printer ut hver verdi i rekken vi er i
        System.out.print(tabell[rekke][kolonne]);
    }
}
```



Alernativt, om vi ikke trenger indeksen kan vi bruke _enhanced for-løkke_:

```java
for(int rekke : tabell) {
    for(int verdi : rekke) {
        // Printer ut hver verdi i rekken i er i
        System.out.print(verdi)
    }
}
```