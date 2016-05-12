package com.example.numsai99.calculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by numsai99 on 11/5/2559.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void calculatorAdd() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText("2"));
        onView(withId(R.id.operation_add_button)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText("3.0")));
    }

    @Test
    public void calculatorSub() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText("2"));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText("1"));
        onView(withId(R.id.operation_sub_button)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText("1.0")));
    }

//    @Test
//    public void calculatorMul() {
//        onView(withId(R.id.operand_one_edit_text)).perform(typeText("1"));
//        onView(withId(R.id.operand_two_edit_text)).perform(typeText("2"));
//        onView(withId(R.id.operation_mul_button)).perform(click());
//        onView(withId(R.id.operation_result_text_view)).check(matches(withText("2.0")));
//    }
//
//    @Test
//    public void calculatorDiv() {
//        onView(withId(R.id.operand_one_edit_text)).perform(typeText("1"));
//        onView(withId(R.id.operand_two_edit_text)).perform(typeText("2"));
//        onView(withId(R.id.operation_div_button)).perform(click());
//        onView(withId(R.id.operation_result_text_view)).check(matches(withText("1.0")));
//    }
}