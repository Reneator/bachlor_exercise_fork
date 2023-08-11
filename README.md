# Anleitung zum Versuch

### 0. Lies dir diese ReadMe-Datei komplett durch bevor du beginnst
### 1. Erstelle einen Branch
Erstelle einen neuen Branch (Naming egal) und "öffne" ihn.
### 2. Öffne die Datei Matrix.java & starte eine Stoppuhr
### 3. Bearbeite den Code
Der Code in Matrix,java enthält Funktionen, welche die Funktion der unten genannten Experimentaufgaben erfüllen sollen.
Der Code ist in seiner derzeitigen Form lauffähig, enthält aber Fehler, bitte finde und korrigiere die Fehler.
Bitte denke daran, dass du den Code auch gern so formatieren und kommentieren kannst, wie du es gewohnt bist.
Du wirst gebeten für die Berichtigung des Codes **KEIN** ChatGPT oder genrell KI-Tools zur Unterstützung zu nutzen, aber Foren wie Stack Overflow sind natürlich kein Problem.<br>

Tipp: Falls du eine Pause einlegen möchtest, kannst du die Stoppuhr einfach pausieren, denn es ist nicht nötig alles in einem Durchlauf zu lösen.
### 4. Teste den Code (MatrixTest.java)
Es stehen Tests zu Verfügung, welche deinen Code auf richtigw Funktionalität überprüfen. Dafür musst du nur die MatrixTest.java öffnen und anschließend ausführen.
### 5. Stoppe die Stoppuhr
Wenn du den Versuch beenden willst, stoppe die Stoppuhr und notiere die Zeit.
### 6. Beantworte die Umfrage
Es gibt eine Umfrage, welche du bitte ehrlich ausfüllen sollst.
### 7. Pushe deine Ergebnisse
Einen neuen Branch erstellen und die Ergebnisse auf diesen pushen.

# Experimentaufgaben

### 1. Methode: generateRandomMatrix

Eine Methode die eine Zufallsmatrix von gegebener Größe erzeugt. Die Methode sollte zwei Parameter annehmen: die Anzahl der Zeilen (n) und die Anzahl der Spalten (m). Jedes Element in der Matrix sollte eine zufällige Ganzzahl zwischen 0 und 9 sein.

#### Beispiel:
generateRandomMatrix(3, 2);<br>
Könnte erzeugen:

2 3<br>
8 1<br>
5 6

### 2. Methode: isSquareMatrix

Eine Methode welche prüft ob eine Matrix quadratisch ist. Eine quadratische Matrix hat dieselbe Anzahl von Zeilen und Spalten. Die Methode sollte true zurückgeben, wenn die übergebene Matrix quadratisch ist, und false wenn nicht.

#### Beispiel:
2 3<br>
5 6 // Sollte true zurückgeben

2 3<br>
8 1<br>
5 6 // Sollte false zurückgeben

### 3. Methode: transpose

Eine Methode die eine Matrix transponiert, also das vertauschen von Zeilen und Spalten. Die Methode sollte die ursprüngliche Matrix als Parameter annehmen und die transponierte Matrix zurückgeben.

#### Beispiel:
1 2<br>
3 4<br>
5 6<br>

Sollte zurückgeben:<br>
1 3 5<br>
2 4 6<br>

### 4. Methode: mirrorMatrix

Eine Methode die eine Matrix an der Vertikalen spiegelt. Die Methode sollte die ursprüngliche Matrix als Parameter annehmen und die gespiegelte Matrix zurückgeben.

#### Beispiel:
2 3<br>
5 6<br>

Sollte zurückgeben:<br>
3 2<br>
6 5<br>

### 5. Methode: rotate90Degrees

Eine Methode die eine Matrix um 90 Grad im Uhrzeigersinn dreht. Die Methode sollte die ursprüngliche Matrix als Parameter annehmen und die gedrehte Matrix zurückgeben.

#### Beispiel:
2 3<br>
5 6<br>

Sollte zurückgeben:<br>
5 2<br>
6 3<br>


### 6. Methode: sumDiagonal

Eine Methode die die Summe der Elemente auf der Hauptdiagonale einer quadratischen Matrix berechnet. Die Matrix sollte als Parameter übergeben werden.

#### Beispiel:

1 2 3<br>
4 5 6<br>
7 8 9<br>
Sollte zurückgeben:
15
### 7. Methode: hadamardProduct

SEine Methode die das Hadamard-Produkt (Element für Element Multiplikation) zweier Matrizen berechnet. Beide Matrizen sollten als Parameter übergeben werden.

#### Beispiel:

1 2&nbsp;&nbsp;&nbsp;&&nbsp;&nbsp;&nbsp;5 6<br>
3 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7 8<br>

Sollte zurückgeben:<br>
05 12<br>
21 32<br>
### 8. Methode: sortMatrix

Eine Methode die die Elemente einer Matrix sortiert. Die Methode sollte die zu sortierende Matrix als Parameter akzeptieren.

#### Beispiel:

9 8 7<br>
6 5 4<br>
3 2 1<br>

Sollte zurückgeben:<br>
1 2 3<br>
4 5 6<br>
7 8 9<br>
### 9. Methode: foldMatrix

Eine Methode die eine Matrix entweder horizontal oder vertikal faltet und die aufeinanderliegenden Zahlen multiplizieren. Die Methode sollte die zu faltende Matrix und die Richtung der Faltung als Parameter akzeptieren.

Bei "horizontaler" Faltung werden die Elemente der unteren Hälfte mit denen der oberen Hälfte multipliziert und in der oberen Hälfte gespeichert. Bei ungeraden Zeilen bleibt die mittlere Zeile unverändert.

Bei "vertikaler" Faltung werden die Elemente der rechten Hälfte mit denen der linken Hälfte multipliziert und in der linken Hälfte gespeichert. Bei ungeraden Spalten bleibt die mittlere Spalte unverändert.
#### Beispiel (horizontal/ungerade):

1 2 3<br>
4 5 6<br>
7 8 9<br>

Sollte zurückgeben:<br>
07 16 27<br>
04 05 06<br>

#### Beispiel (horizontal/gerade):

1 3<br>
4 6<br>
7 9<br>

Sollte zurückgeben:<br>
03<br>
24<br>
63<br>
