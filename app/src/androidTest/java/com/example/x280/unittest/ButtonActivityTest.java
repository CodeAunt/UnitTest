package com.example.x280.unittest;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ButtonActivityTest {

    @Rule
    public ActivityTestRule<ButtonActivity> activityActivityTestRule = new ActivityTestRule<>(ButtonActivity.class);
    private ButtonActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("Tag","OnCreate");
    }

    @Test
    public void btn_click() {
        Log.d("Tag","OnClick");

    }

    @Test
    public void testClickButton(){
        Espresso.onView(withId(R.id.editText)).perform(replaceText("hello ResponseActivity"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
    }
}