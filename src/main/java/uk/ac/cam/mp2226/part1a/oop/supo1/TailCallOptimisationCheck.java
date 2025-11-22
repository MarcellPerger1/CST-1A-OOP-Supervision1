package uk.ac.cam.mp2226.part1a.oop.supo1;

public class TailCallOptimisationCheck {
    // We use the tail-recursive triangular
    // number functions from FoCS.
    static int triangle(int n, int acc) {
        return n == 0 ? acc : triangle(n - 1, acc + n);
    }
    static int triangle(int n) {
        return triangle(n, 0);
    }

    public static void main(String[] args) {
        System.out.println("triangle(1000) = " + triangle(1000));
        System.out.println("triangle(10000) = " + triangle(10000));
        System.out.println("triangle(20000) = " + triangle(20000));
        System.out.println("triangle(30000) = " + triangle(30000));
        System.out.println("triangle(50000) = " + triangle(50000));
        System.out.println("triangle(60000) = " + triangle(60000));
        System.out.println("triangle(61000) = " + triangle(61000));
        System.out.println("triangle(62000) = " + triangle(62000));
        System.out.println("triangle(63000) = " + triangle(63000));
    }
    // Results: StackOverflow somewhere between n=62000 and n=63000
    //  (exact n seems to vary). This may be platform-dependent.
}
