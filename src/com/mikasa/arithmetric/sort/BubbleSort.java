package com.mikasa.arithmetric.sort;

/**
 * @ClassName BubbleSort
 * @description 冒泡排序
 * 基本思想是：每次比较相邻的两个元素，如果顺序不对，则交换这两个数
 * 优点：占用空间少  不足:速度慢
 * @author: tianluhua
 * @date 2019/3/28 12:13
 */
class BubbleSort {

    /**
     * 从小到大进行排序
     *
     * @param dataArray
     * @return int[]
     * @date 2019/3/28 12:16
     */
    static int[] testBubbleSort(int[] dataArray) {

        int tempData = 0;
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[i] > dataArray[j]) {
                    tempData = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = tempData;
                }
            }
        }
        return dataArray;
    }
}
