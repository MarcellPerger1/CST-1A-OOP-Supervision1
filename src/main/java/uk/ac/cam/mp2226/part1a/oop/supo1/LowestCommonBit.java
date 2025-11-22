package uk.ac.cam.mp2226.part1a.oop.supo1;

public class LowestCommonBit {
    public static int lowestCommon(long a, long b) {
        long ab = a & b;
        int i;
        for (i = 0; i < 64; i++, ab >>>= 1) {
            if ((ab & 1) == 1) {
                // Using break here is just simply bad practise and
                // unnecessarily complicates the code. Use return instead!
                break; //return i;
            }
        }
        return i == 64 ? /*went all the way through*/-1 : i; //return -1;
    }
}
