package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.util.Scanner;



public class Stage1 {


    @Test
    public void test1() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();*/
        Stage1.test("aabcccbbad");
    }

    /**
     * 使用滑动窗口，判断窗口中的字母是否都相同，相同则扩大窗口，直到第一个不相同的字母，
     * 此时判断窗口大小是否大于3，若大于3则将其删除，然后重新判断
     * @param input
     */
    public static void test(String input) {
        //用于记录最后打印的字符串，因为若没有超过3的可能重复打印
        String lastPrint = "";
        while (true) {
            //字符串转字符数组
            char[] chars = input.toCharArray();
            //输入字符串长度
            int inputLength = input.length();
            //窗口左边界
            int leftIndex = 0;
            //窗口右边界
            int rightIndex = 1;

            //循环扩大有边界
            for (; rightIndex < inputLength && input.length() >= 3; ) {
                //若相等，则扩大窗口
                if (chars[leftIndex] == chars[rightIndex]) {
                    //有一种特殊情况，如果窗口右边界已经到了数组边界，则也需要剔除 此时判断窗口大小是否大于3，注意此处+1
                    if (rightIndex == inputLength - 1 && rightIndex + 1 - leftIndex >= 3) {
                        input = input.substring(0, leftIndex);
                        break;
                    }
                    rightIndex++;
                    continue;
                } else {
                    //不相等则判断窗口大小是否大于等于3了，是则将这个窗口的字母去掉;
                    if (rightIndex - leftIndex >= 3) {
                        input = input.substring(0, leftIndex) + input.substring(rightIndex, input.length());
                        //已经找到一组数量超过3，剔除，从头开始便利,如果长度大于3，则打印
                        System.out.println(input);
                        lastPrint = new String(input);
                        break;
                    }
                    //做窗口边界值变为刚刚右边窗口边界 + 1
                    leftIndex = rightIndex;
                    rightIndex = leftIndex + 1;
                }
            }
            //若便利一遍未发现长度超过3的相同字母子串，则无需便利，结束
            if (inputLength == input.length()) {
                //若已经打印过一次，则无需打印
                if (!lastPrint.equals(input)) {
                    System.out.println(input);
                }
                break;
            }
        }

    }


}
