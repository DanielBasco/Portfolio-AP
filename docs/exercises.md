# Øvelser: Kompleksitet, søgning og sortering

## 1. Leg med kompleksitet

- Kig på klassen `BigOExamples`, som viser eksempler på fire foreskellige kompleksiteter. Kør `main` og se de forskellige metoder
performe. Prøv at skrifte værdien af `n` og observer effekten.
- Kig på metoden `testComplexity()` i klassen `Main`. Her kaldes de samme metoder fra `BigOExamples` og deres performance måles med 
tidsstempler.
Kald metoden fra `main` og se forskellen i tid. (Tip: I kan udkommentere udskrift fra metoderne i `BigOExamples` så output bliver mere 
overskueligt). 
- Lav tre metoder i en ny klasse eller i klassen `BigOExamples`. Hver metode skal have én af følgende kompleksiteter: O(1), O(logn) og O(n).
Du bestemmer selv hvad metoderne skal gøre, men hold dem simple. 
- Byt kode en anden. Analyser hinandens kode og identificer kompleksitet for hver enkelt metode. 

## 2. Leg med lineær og binær søgning

- Kig på klassen `SearchExamples`, som viser eksempler på lineær søgning og binær søgning. 
- Kig på metoden `testLinearAndBinarySearch()` i klassen `Main`. Her kaldes metoderne fra `SearchExamples`og deres performance måles med tidsstempler. 
- Prøv at ændre antallet af `Student` objekter, der laves i metoden og se hvordan performance ændrer sig. Hvad sker der med responstiden for lineær hhv.
binær søgning når du sætter antallet op eller ned?
- Kig på metoderne `void guessANumberLinearly()` og `void guessANumberBinary()` i klassen `SearchExamples`.
- Implementer metoden `guessANumberLinearly()` hvor du skal gætte brugerens tal sekventielt. 
  - Starter med at spørge om tallet er 1. Spørg derefter om det er 2 osv. 
  - Spørg brugeren efter hvert gæt om det er korrekt. 
  - Fortsæt til du rammer det rigtige tal. 
- I metoden `guessANumberBinary()` skal du halvere mængden af mulige tal hver gang. 
  - Start med at gætte på tallet midt mellem lavest og højest mulige tal. 
  - Spørg brugeren om det er det korrekte tal. 
  - Hvis ikke gættet er korrekt, skal du spørge om tallet er større eller mindre.
  - Halver søgeområdet og bliv ved til du har gættet tallet.  

## 3. Kompleksitet for algoritmerne

- Kig på klassen `SortExamples`, som viser eksempler på Bubble Sort, Heap Sort, Quick Sort og Merge Sort. 
- Analyser hver af algoritmerne og angiv kompleksitet (Big-O) for dem. 