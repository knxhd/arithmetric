package com.mikasa.arithmetric.sort;

import java.util.List;

/**
 * @ClassName BucketSort
 * @description 桶排序, 前提是知道最大值的情况下,优点：快速。不足：浪费大量的空间
 * @author: tianluhua
 * @date 2019/3/25 12:42
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] x=new int[100000];
        for (int i =99999; i >0 ; i--) {
            x[i]=i;
        }
        long l = System.currentTimeMillis();
        int[] ints = testBucketSort(x, 100000);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                for (int j = 0; j < ints[i]; j++) {
                    System.out.print(i + "  ");
                }
            }
        }
        System.out.println();
    }

    /**
     * 测试桶排序
     */
    public static int[] testBucketSort(int[] dataList, int maxNum) {
        int[] bucket = new int[maxNum + 1];
        for (int i = 0; i < dataList.length; i++) {
            bucket[dataList[i]] = bucket[dataList[i]] + 1;
        }
        return bucket;
    }

}
