package com.example.demo;

import com.example.demo.action.Sing;
import com.example.demo.people.Jack;

/**
 * 多态：
 *      父类引用指向子类对象
 * @author yxm
 */
public class Test {
    public void runTest(Sing sing){
        sing.theMusic();
    }
    public static void main (String[] args){
        Test run = new Test();
        run.runTest(new Jack());
    }
}
