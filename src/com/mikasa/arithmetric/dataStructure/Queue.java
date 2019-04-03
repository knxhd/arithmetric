package com.mikasa.arithmetric.dataStructure;

import org.junit.Test;

/**
 * @ClassName Queue
 * @description 队列
 * @author: tianluhua
 * @date 2019/3/29 12:21
 */
public class Queue {


    /**
     * 将第一个数删除，第二个数放到数组末尾，将第三个数删除，将第四个数放到数的末尾。。。。
     * 直到删除最后一个数，删除数的顺序就是解密后的QQ号
     *
     * @param
     * @return int[]
     * @date 2019/3/29 12:30
     */
    public int[] testQQ(int[] dataArray) {
        int[] deleteArray = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            deleteArray[i] = dataArray[i];
            for (int j = i; j < dataArray.length - i - 1; j++) {
                dataArray[j] = dataArray[j + 1];
            }
            System.out.println(dataArray);
        }
        return deleteArray;
    }

    @Test
    public void testQQ(){
        int[] dataArray={6,3,1,7,5,8,9,2,4};
        int[] ints = testQQ(dataArray);
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.print(anInt+"  ");
        }
        System.out.println();
    }

}
