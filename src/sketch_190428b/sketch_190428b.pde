void setup(){
PImage face = loadImage("spongebobeyes.jpeg");  
    size(800, 600);
    face.resize(800, 600);
    background(face); 
}
void draw(){
  fill (#FFFFFF);
  ellipse (410, 225, 105, 105);
  fill (#7DCCEA);
  ellipse (407, 225, 50, 50);
  fill (#000000);
  ellipse (mouseX, mouseY, 20, 20);
  fill (#FFFFFF);
  ellipse (505, 225, 105, 105);
  fill (#7DCCEA);
  ellipse (505, 225, 50, 50);
  fill (#000000);
  ellipse (mouseX+100, mouseY, 20, 20);
  if (mouseX < 360) {
  mouseX = 360;
  }
  if (mouseX > 440){
   mouseX = 440;
  } 
  if (mouseY < 185) {
   mouseY = 185;
  } 
  if (mouseY > 260) {
   mouseY = 260;
  }
}