# Modifikatorer

* I Java er det 4 tilgangsnivåer. **_public_, _private_, _protected_ og _default._ Disse nøkkelordene kalles _modifikatorer_ / _modifiers._**
* Hvis ikke en _modifikator_ blir spesifisert, blir _default_ brukt. (derav navnet _default_).
* En klasse kan kun være _public_ eller _default_.
* Metoder og instansvariabler kan bruke alle 4 nivåene.
* **Viktig**: Hvis en klasse ikke er synlig for en annen klasse, vil man ikke kunne bruke variabler eller metoder fra klassen selv om disse er _public_.
* Hvis en _superklasse_ har metoder eller variabler med _public_ tilgangsnivå, vil disse arves av en _subklasse_ selv om denne er i en annen pakke.
* **_this_** refererer alltid til objektet som utfører den nåværende operasjonen.
* Et _public_ klassemedlem er tilgjengelig for alle andre klasser, selv fra andre pakker.
* Et _private_ klassemedlem er tilgjengelig kun for kode i samme klasse.
* _default_ klassemedlemer er ikke synlig til _subklasser_ utenfor pakken, mens _protected_ er synlige for _subklasser_ selv i forskjellige pakker.
* Forskjellen mellom _protected_ og _default_ har kun betydning om klassen har en _subklasse_ i en annen pakke.
* Lokale variabler har ikke tilgangsnivåer.
* Lokale variable kan ha en _final_-modifier, men denne har ingen betydning for tilgangsnivåer.



### Tilgangsnivåer for klasser

|   Synlighet    | _public_ | _default_ |
| :------------: | :------: | :-------: |
| I samme pakke  |    ✔️     |     ✔️     |
| I andre pakker |    ✔️     |     ❌     |



### Tilgangsnivåer for variabler

|            Synlighet            | _public_ | _private_ | _protected_  | _default_ |
| :-----------------------------: | :------: | :-------: | :----------: | :-------: |
|         I samme klasse          |    ✔️     |     ✔️     |      ✔️       |     ✔️     |
|    Fra klasser i samme pakke    |    ✔️     |     ❌     |      ✔️       |     ✔️     |
| Fra _subklasser_ i samme pakke  |    ✔️     |     ❌     |      ✔️       |     ✔️     |
| Fra _subklasser_ i andre pakker |    ✔️     |     ❌     | ✔️_(via arv)_ |     ❌     |
|   Fra klasser i andre pakker    |    ✔️     |     ❌     |      ❌       |     ❌     |



### Tilgangsnivåer for metoder

|            Synlighet            | _public_ | _private_ | _protected_  | _default_ |
| :-----------------------------: | :------: | :-------: | :----------: | :-------: |
|         I samme klasse          |    ✔️     |     ✔️     |      ✔️       |     ✔️     |
|    Fra klasser i samme pakke    |    ✔️     |     ❌     |      ✔️       |     ✔️     |
| Fra _subklasser_ i samme pakke  |    ✔️     |     ❌     |      ✔️       |     ✔️     |
| Fra _subklasser_ i andre pakker |    ✔️     |     ❌     | ✔️_(via arv)_ |     ❌     |
|   Fra klasser i andre pakker    |    ✔️     |     ❌     |      ❌       |     ❌     |