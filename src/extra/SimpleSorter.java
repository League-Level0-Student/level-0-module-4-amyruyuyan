package extra;

import javax.swing.JOptionPane;

public class SimpleSorter {
public static void main(String[] args) {
String number1 = JOptionPane.showInputDialog("Choose a number between 0 and 10.");
String number2 = JOptionPane.showInputDialog("Choose another number between 0 and 10");
String number3 = JOptionPane.showInputDialog("no choose another number between 0 and ten");
int set1 = Integer.parseInt(number1);
int set2 = Integer.parseInt(number2);
int set3 = Integer.parseInt(number3);
int extra;
if (set1 > set2) {
extra = set1;
set1 = set2;
set2 = extra;
}
if (set2 > set3) {
extra = set2;
set2 = set3;
set3 = extra;
}
if (set1 > set2) {
extra = set1;
set1 = set2;
set2 = extra;
}
System.out.println(set1 + " " + set2 + " " + set3);
if (set1 < set2) {
extra = set1;
set1 = set2;
set2 = extra;
}
if (set2 < set3) {
extra = set2;
set2 = set3;
set3 = extra;
}
if (set1 < set2) {
extra = set1;
set1 = set2;
set2 = extra;
}
System.out.println(set1 + " " + set2 + " " + set3);
}
}

