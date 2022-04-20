package com.rongda.feature;

import com.rongda.feature.Stage2;
import org.junit.jupiter.api.Test;

/**
 * @class: APITest.class
 * @description: 挨批增强
 * @author: acao
 * @create: 2020-11-19 10:43
 **/
public class Stage2Test {


    @Test
    public void test() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();
        Stage2.test(input);*/
        //传入多个字符串进行测试
        Stage2.test("aabcccbbad");
    }


    @Test
    public void test1() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();
        Stage2.test(input);*/
        //传入1个字符串进行测试
        Stage2.test("a");
    }


    @Test
    public void test2() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();
        Stage2.test(input);*/
        //传入一个空白的字符串进行测试
        Stage2.test("");
    }


}
