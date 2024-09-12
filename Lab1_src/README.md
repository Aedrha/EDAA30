# Laboration 1 EDAA30

## Syfte
Öva på testdriven utveckling, arv och polymorphism.

## Kod om papegojor
I den här laborationen finns test och kod som anger hur fort 
tre olika sorters papegojor flyger.
Uppgiften är att först lägga till funktionalitet genom att 
koda testdrivet.
Sedan är det dags att refaktorisera så att varje papegojsort 
har en egen klass som ärver Parrot.
I uppgift tre skrivs koden om så att Parrot istället är ett interface,
och de specifika papegojorna är av typen Record.

## Frågor att fundera på
- Hur väljs var logik hamnar i koden?
- Vilka poänger finns med arv?
- Vad är största skillnaden mellan gränssnitt och arv?
- Vad avgör om arv eller gränssnitt är rätt val?
- Vilken lösning tycker du bäst om?

## Material som kan hjälpa
- [En film om att få in kod i Eclipse](https://lu.instructuremedia.com/embed/3210fbfe-42e5-4840-9505-572270292da3)
- [En film om testdriven utveckling](https://lu.instructuremedia.com/embed/d7dbc7e8-7ff2-4f47-b71d-03cdb471c7c0 )

## Uppgift 1, TDD
Lägg till var papegojorna bor. 

Skriv en metod på Parrot-klassen som returnerar var papegojan bor.
Öva på att testdriva utvecklingen.

### Specifikation
- Afrikanska papegojor bor i hål i träd.
- Europeiska papegojor bor i ett bo byggt av pinnar.
- Norwegian blue bor i en bur, om den är fastspikad.
Är den inte fastspikad bor den ingenstans.


## Uppgift 2, arv

Skriv om lösningen så att den använder arv. 
Använd testerna för att se till att koden fortfarande fungerar.
Jobba i så små steg som möjligt.

TIPS: Det här är anledningen att det finns en `getParrot` i testklassen.
Målet är att den enda användningen av `ParrotTypeEnum` är i den metoden,
när du är klar med uppgift 2.

## Uppgift 3, gränssnitt
Börja med att spara undan lösning 2 så att den går att redovisa.
Lös det på ett sätt som fungerar för dig.
Förslag är:
- Ta en bild av skärmen
- Spara undan filerna på en annan plats
- Byt namn på dem
- Använd Git (det är den mest professionella lösningen, men inget jag hunnit lära er än.)

Skriv om lösningen så att varje papegoja är ett Record.
Parrot är ett interface.
Record-klassen kan du läsa om [här](https://blogs.oracle.com/javamagazine/post/records-come-to-java).


## Referenser
Den här övningen bygger på en kata från Emily Bache.
Hon inspirerades av Martin Fowlers bok "Refactoring". 
Innehållet kan också härledas till Monty Pythons sketch
"Dead Parrot".