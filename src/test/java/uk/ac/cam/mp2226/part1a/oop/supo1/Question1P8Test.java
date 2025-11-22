package uk.ac.cam.mp2226.part1a.oop.supo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1P8Test {
    @Test
    void createMatrix() {
        assertArrayEquals(new int[][]{{1,0}, {0,1}},
                Question1P8.createMatrix(2));
        assertArrayEquals(
                new int[][]{
                        {1,0,0,0},
                        {0,1,0,0},
                        {0,0,1,0},
                        {0,0,0,1}},
                Question1P8.createMatrix(4));
        assertArrayEquals(new int[][]{{1}},
                Question1P8.createMatrix(1));
    }

    @Test
    void transposeInplace() {
        {
            int[][] a = {
                    {1,7,8,0},
                    {3,3,0,7},
                    {8,9,4,5},
                    {2,6,1,1}};
            Question1P8.transposeInplace(a);
            assertArrayEquals(
                    new int[][]{
                            {1,3,8,2},
                            {7,3,9,6},
                            {8,0,4,1},
                            {0,7,5,1}},
                    a);
        }
        {
            int[][] a = {{1}};
            Question1P8.transposeInplace(a);
            assertArrayEquals(new int[][]{{1}}, a);
        }


    }
}
