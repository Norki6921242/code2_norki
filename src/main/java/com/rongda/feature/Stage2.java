package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Stage2 {

    @Test
    public void test1() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();
        Stage2.test(input);*/
        Stage2.test("aabcccbbad");
    }



    /**
     * 与第一道题相同，只是将删除字符串的操作改为替换成前一个字母，遇到字母a则跳过
     * @param input
     */
    public static void test(String input) {
        //用于记录最后打印的字符串，因为若没有超过3的可能重复打印
        String lastPrint = "";
        while (true) {
            int i = 0;
            //字符串转字符数组
            char[] chars = input.toCharArray();
            //输入字符串长度
            int inputLength = input.length();
            //窗口左边界
            int leftIndex = 0;
            //窗口右边界
            int rightIndex = 1;

            //循环扩大有边界
            for (; rightIndex < inputLength; ) {
                //若相等，则扩大窗口
                if (chars[leftIndex] == chars[rightIndex]) {
                    //有一种特殊情况，如果窗口右边界已经到了数组边界，则也需要剔除 此时判断窗口大小是否大于3，注意此处+1
                    if (rightIndex == inputLength - 1 && rightIndex + 1 - leftIndex >= 3) {
                        String replaceString = input.substring(leftIndex, rightIndex);
                        if (replaceString.charAt(0) - 1 >= 'a') {
                            char replaceWord = (char) (replaceString.charAt(0) - 1);
                            input = input.substring(0, leftIndex) + replaceWord;
                            System.out.print(input + ", " + replaceString + " is replaced by " + replaceWord);
                            System.out.println();
                        } else {
                            input = input.substring(0, leftIndex);
                            System.out.println(input);
                        }
                        lastPrint = new String(input);
                        break;
                    }
                    rightIndex++;
                    continue;
                } else {
                    //不相等则判断窗口大小是否大于等于3了，是则将这个窗口的字母去掉;
                    if (rightIndex - leftIndex >= 3) {
                        //已经找到一组数量超过3，剔除，从头开始便利,并打印
                        String replaceString = input.substring(leftIndex, rightIndex);
                        if (replaceString.charAt(0) - 1 >= 'a') {
                            char replaceWord = (char) (replaceString.charAt(0) - 1);
                            input = input.substring(0, leftIndex) + replaceWord + input.substring(rightIndex, input.length());
                            System.out.print(input + ", " + replaceString + " is replaced by " + replaceWord);
                            System.out.println();
                        } else {
                            input = input.substring(0, leftIndex) + input.substring(rightIndex, input.length());
                            System.out.println(input);
                        }
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
