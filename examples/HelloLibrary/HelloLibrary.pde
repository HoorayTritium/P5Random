import p5.random.*;

XorShiftRandom random = new XorShiftRandom();

void setup() {
  size(400, 400);
  double d = random.random(height);
  for (int i=0; i<width-1; i++) {
    line(i, (float)d, i+1, (float)(d=random.random(height)));
  }
}
