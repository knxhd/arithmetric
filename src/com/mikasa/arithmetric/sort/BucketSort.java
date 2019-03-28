package com.mikasa.arithmetric.sort;

import java.util.List;

/**
 * @ClassName BucketSort
 * @description 桶排序, 前提是知道最大值的情况下,优点：快速。不足：浪费大量的空间
 * @author: tianluhua
 * @date 2019/3/25 12:42
 */
class BucketSort {

    /**
     * 测试桶排序
     */
    static int[] testBucketSort(int[] dataList, int maxNum) {
        int[] bucket = new int[maxNum + 1];
        for (int i1 : dataList) {
            bucket[i1] = bucket[i1] + 1;
        }
        return bucket;
    }

}
