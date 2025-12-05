# Java Quiz – Variablen, Schleifen, If, Ternary, Scopes & Arrays

---

### 1. Welche Aussage über Variablen in Java ist korrekt?
- (a) Variablen müssen immer initialisiert werden, bevor sie deklariert werden
- (b) Variablen müssen deklariert werden, bevor sie verwendet werden ✓
- (c) Variablen können Schlüsselwörter als Namen verwenden
- (d) Variablen sind immer global

---

### 2. Welche der folgenden Deklarationen ist korrekt?
- (a) `int x = 5;` ✓
- (b) `int 5 = x;`
- (c) `int x; = 5;`
- (d) `x int = 5;`

---

### 3. Welche Schleife wird verwendet, wenn die Anzahl der Wiederholungen bekannt ist?
- (a) while
- (b) for ✓
- (c) do-while
- (d) for-each

---

### 4. Was ist die Ausgabe?
```java
for(int i = 0; i < 3; i++) {
    System.out.print(i + " ");
}
```
- (a) 0 1 2 3
- (b) 0 1 2 ✓
- (c) 1 2 3
- (d) 0 1 2 3 4

### 5. Welche Schleife garantiert mindestens eine Ausführung?
- (a) for
- (b) while
- (c) do-while ✓
- (d) for-each

---

### 6. Welche Aussage ist korrekt?
- (a) Ein `if`-Block ohne `{}` kann mehrere Anweisungen enthalten
- (b) Ein `if`-Block ohne `{}` enthält nur **eine** Anweisung ✓
- (c) Ein `if` muss immer ein `else` besitzen
- (d) `if` ist kein gültiges Schlüsselwort

---

### 7. Was wird ausgegeben?
```java
int x = 5;
if(x > 3)
    System.out.println("A");
else
    System.out.println("B");
```
- (a) A ✓
- (b) B
- (c) 5
- (d) Fehler

---

### 8. Wie lautet die korrekte Syntax des ternären Operators?
- (a) condition ? valueIfTrue : valueIfFalse ✓
- (b) condition : valueIfTrue ? valueIfFalse
- (c) if(condition) ? valueIfTrue : valueIfFalse
- (d) condition ? valueIfFalse : valueIfTrue

---

### 9. Was wird ausgegeben?
```java
int a = 10, b = 5;
System.out.println(a > b ? "Ja" : "Nein");
```
- (a) Ja 
- (b) Nein
- (c) 10
- (d) 5

---

### 10. Welche Aussage ist korrekt?
- (a) Ternary kann verwendet werden, um eine Variable direkt zu initialisieren ✓
- (b) Ternary ersetzt alle Schleifen
- (c) Ternary funktioniert nur mit Strings
- (d) Ternary funktioniert nicht mit boolean

---

### 11. Was passiert bei folgendem Code?
```java
int x = 10;
if(true) {
    int x = 5;
}
```
- (a) Ausgabe ist 5
- (b) Ausgabe ist 10
- (c) Compilerfehler ✓
- (d) beides möglich

___

### 12. Wie initialisiert man ein Array direkt mit Werten?

- (a) `int[] arr = {1, 2, 3, 4, 5};` ✓
- (b) `int[] arr = new int[1,2,3,4,5];`
- (c) `int arr[] = new int();`
- (d) `int arr[] = {1;2;3;4;5};`

---

### 13. Wie findet man die Länge eines Arrays?

- (a) `arr.size()`
- (b) `arr.length` ✓
- (c) `arr.length()`
- (d) `arr.count()`

---
## Bonus: 
### 14. Wie greift man auf das Element in der 2. Zeile und 3. Spalte zu?
- (a) `arr[1][2]` ✓
- (b) `arr[2][3]`
- (c) `arr(1,2)`
- (d) `arr[2][1]`

---
