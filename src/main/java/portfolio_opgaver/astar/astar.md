## Labyrint

Kig på labyrinten og find vejen fra S til M.

Noter undervejs:

Hvilke celler kigger du på?
Hvilke celler vælger du at gå til?
Hvilken strategi bruger du — går du bare frem, eller tænker du dig om?

Hvad ville Djikstra gøre? Hvert skridt fra ét felt til et andet koster 1 og murene er ikke en del af
grafen idet vi ikke kan gå på dem.

![img_2.png](img_2.png)

# Portfolioopgave: A*

## Opgavebeskrivelse
Lav en implementering af A* der finder den korteste vej mellem byer i et grid.

---

## Krav

### Grid
- Design selv dit grid
- Gridet skal være mindst **8x8**
- Placér byer i nogle af cellerne
- Lav veje mellem byerne

### Byer
Giv dine byer navne, for eksempel:

- Nordby
- Sydby
- Østby
- Vestby

Du må selvfølgelig også finde på dine egne navne.

### Korteste vej
Find den korteste vej fra én by til en anden ved hjælp af A*-algoritmen.

---

## Visualisering

Lav en visualisering der hjælper med at forstå hvordan algoritmen arbejder.

Tænk over:
- Hvad er nyttigt at kunne se?
- Hvordan kan man følge algoritmens beslutninger?
- Hvordan kan man se hvilke noder der er undersøgt?

### Mulige idéer

#### Konsol-output
Print information i hvert trin, for eksempel:

```text
Afstanden fra Nordby til Sydby er nu 13
Sydby er nu visited
