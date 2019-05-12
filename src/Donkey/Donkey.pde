PImage donkey;
PImage tail;
int X;
int Y;
void setup (){
donkey = loadImage ("Even Better Donkey Image.jpeg");
tail = loadImage ("Donkey Tail Image.jpg"); 
size (587, 440);
tail.resize (100, 150);
}
void draw (){
rect (0, 0, 30, 30);
rect (490, 110, 100, 150);
dist (0, 0, mouseX, mouseY);
if (dist (0, 0, mouseX, mouseY) < 30) {
 background (donkey); 
}
else if (dist (490, 110, mouseX, mouseY) < 30) {
 background (donkey); 
}
else {
background (#A0DDE3);
}
if (mousePressed){
image(tail, X-10, Y-20);
X = mouseX;
Y = mouseY;
} 
}
