package com.rongda.feature;

import com.rongda.feature.Stage1;
import com.rongda.feature.Stage2;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @class: APITest.class
 * @description: 挨批增强
 * @author: acao
 * @create: 2020-11-19 10:43
 **/
public class Stage1Test {


    @Test
    public void test() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();*/
        //传入多个字符符串进行测试
        Stage1.test("aabcccbbad");
    }


    @Test
    public void test1() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();*/
        //传入1个字符符串进行测试
        Stage1.test("a");
    }


    @Test
    public void test2() {
      /*  Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String input = in.nextLine();*/
        //传入空白字符符串进行测试
        Stage1.test("");
    }


}
