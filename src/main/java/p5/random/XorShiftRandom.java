package p5.random;

import java.lang.Math;
// import processing.core.*;

public class XorShiftRandom {
  final long M = (long) Math.pow(2, 32);
  int seed = 0;

  XorShiftRandom() {
    seed = (int) xRandomSeed();
  }

  double nextDouble(int max) {
    long i = xor32();
    long l = i < 0 ? i + M : i;
    double d = max * (l / (M - .9d));
    return d;
  }

  double nextDouble() {
    return nextDouble(1);
  }

  int xor32() {
    seed = seed ^ (seed << 13);
    seed = seed ^ (seed >> 17);
    seed = seed ^ (seed << 15);
    return seed;
  }

  long xRandomSeed() {
    return System.currentTimeMillis();
  }

  void setSeed(int _s) {
    seed = _s;
  }
}
