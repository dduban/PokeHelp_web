# PokeHelp_web
Frontend aplikacji internetowej PokeHelp napisanej w Java EE. 

### Technologie
- XHTML
- CSS
- JS
- PRIMEFACES

### Funkcjonalności
PokeHelp_ejb/web to pomocnik gracza Pokemon GO. Można utworzyć konto użytkownika lub zalogować się, a rola administratora może nadawać role zwykłym userom. Wszyscy mogą przeglądać aktualną listę pokemonów dostępnych w grze, ich typ oraz przy jakiej pogodzie się pojawiają. Zastosowany jest do nich lazy loading. 
W przypadku dodania nowych pokemonów do gry, gracz może wysłać propozycje dodania nowego pokemona przez odpowiedni formularz do listy, jednak musi on zostać zaakceptowany przez administratora.
Użytkownicy mogą dzielić się swoimi kodami przyjaźni z gry wpisując je do odpowiedniego formularza, a inni widzą je w tabeli z kodami. 
Administrator w swoim panelu widzi propozycje dodania do pokemonów - maksymalnie może być 20 propozycji na liście, w przypadku spamu. Administrator może też edytować aktualne rekordy i nadawać role użytkownikom.
