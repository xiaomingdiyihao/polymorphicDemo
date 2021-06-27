package com.example.demo;

import com.example.demo.action.AbstractSing;
import com.example.demo.people.Jack;
import com.example.demo.people.Susan;

/**
 * 多态：
 *      父类引用指向子类对象
 * @author yxm
 */
public class Test {
    public void runTest(AbstractSing sing){
        sing.theMusic();
    }
    public static void main (String[] args){
        Test run = new Test();
        run.runTest(new Jack());
        run.runTest(new Susan());
    }
}
