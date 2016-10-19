package com.basiccalculator.mybasiccalculator;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;
import android.view.View;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private String testCaseName = null;
    public ApplicationTest() {
        super(MainActivity.class);
    }
     MainActivity obj=new MainActivity();
    @Test
    public void testSuit()
    {
       int num1=8;
        int num2=6;
        int a;
        a=obj.Add(num1,num2);


        assertEquals((num1+num2),a);
    }

    @Test
    public void testSuit1()
    {
        int num1=8;
        int num2=6;
        int a;
        a=obj.Sub(num1,num2);


        assertEquals((num1-num2),a);
    }

    @Test
    public void testSuit3()
    {
        int num1=8;
        int num2=6;
        int a;
        a=obj.Mul(num1,num2);


        assertEquals((num1*num2),a);
    }


}