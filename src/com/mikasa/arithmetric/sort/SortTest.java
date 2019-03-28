package com.mikasa.arithmetric.sort;

import org.junit.Test;

/**
 * @ClassName SortTest
 * @description
 * @author: tianluhua
 * @date 2019/3/28 12:54
 */
public class SortTest {

    @Test
    public void testBucketSort(){
        int[] x = generateArray();
        long l = System.currentTimeMillis();
        BucketSort.testBucketSort(x, 100000);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }

    @Test
    public void testBubbleSort(){
        int[] x = generateArray();
        long l = System.currentTimeMillis();
        BubbleSort.testBubbleSort(x);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }

    private int[] generateArray(){
        int[] x=new int[100000];
        for (int i =99999; i >0 ; i--) {
            x[i]=i;
        }
        return x;
    }
}
