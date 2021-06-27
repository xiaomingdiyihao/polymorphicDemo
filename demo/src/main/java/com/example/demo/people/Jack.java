package com.example.demo.people;

import com.example.demo.action.AbstractSing;

/**
 * @author yxm
 */
public class Jack extends AbstractSing {
    @Override
    public void theMusic(){
        System.out.println("this is Jack's music");
    }
    @Override
    public void theCd(){
        System.out.println("For Jack past a cd.");
    }
}
