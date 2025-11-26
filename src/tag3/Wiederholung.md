## Java Wiederholungsquiz 

## Frage 1: Welche Ausgabe hat folgender Code?

```java
int a = 8;
if (a > 5) {
    System.out.println("Groß");
}
```
- A) Groß ✓
- B) Klein
- C) Nichts
- D) Fehler

## Frage 2: Welche Ausgabe hat folgender Code?
```java
int a = 3;
if (a > 5) {
    System.out.println("Groß");
} else {
    System.out.println("Klein");
}
```
- A) Groß
- B) Klein ✓
- C) Nichts
- D) Fehler

## Frage 3: Welche Ausgabe hat folgender Code?
```java
int x = 7;
int y = 2;

if (x > 5) {
    if (y > 5) {
    System.out.println("Beide groß");
    } else {
    System.out.println("Nur x groß");
    }
} else {
System.out.println("x klein");
}
```
- A) Beide groß
- B) Nur x groß ✓
- C) x klein
- D) Fehler

## Frage 4: Welche Ausgabe hat folgender Code?
```java
int tag = 2;
switch (tag) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    case 3:
        System.out.println("Mittwoch");
        break;
    default:
        System.out.println("Unbekannt");
}
```
- A) Montag
- B) Dienstag ✓
- C) Mittwoch
- D) Unbekannt

## Frage 5: Welche Ausgabe hat folgender Code?
```java
int zahl = 1;
switch (zahl) {
    case 1:
        System.out.println("Eins");
    case 2:
        System.out.println("Zwei");
    default:
        System.out.println("Default");
}
```
- A) Eins
- B) Eins Zwei
- C) Eins Zwei Default ✓
- D) Fehler

## Frage 6: 
```java
int a = 5;
int b = 10;
int max = (a > b) ? a : b;
System.out.println(max);
```
- A) 5
- B) 10 ✓
- C) a
- D) b

## Frage 7: Welcher Ausdruck ist korrekt und ersetzt diesen If-Else-Code?
```java
int a = 7;
int b;
if (a > 5) {
    b = 1;
} else {
    b = 2;
}
```
- A) int b = a > 5 ? 1 : 2; ✓
- B) int b = a < 5 ? 1 : 2;
- C) int b = a > 5 ? 2 : 1;
- D) int b = (a > 5) {1} else {2};