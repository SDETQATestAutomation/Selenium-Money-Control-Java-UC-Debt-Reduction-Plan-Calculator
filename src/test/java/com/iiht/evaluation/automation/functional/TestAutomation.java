package com.iiht.evaluation.automation.functional;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

import com.iiht.evaluation.automation.Activities;
import com.iiht.evaluation.automation.App;
import com.iiht.evaluation.automation.testutils.MasterData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import com.iiht.evaluation.automation.SubActivities;
import org.testng.annotations.*;

import static com.iiht.evaluation.automation.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.automation.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.automation.testutils.TestUtils.yakshaAssert;

public class TestAutomation extends App {

    @Test
    public void test_debt_reduction_plan_calculator_open_submenu() throws IOException {
        boolean testcase_status = true;
        try {
            boolean select_submenu_from_menu_succeed = Activities.select_submenu_from_menu(driver, "Personal Finance", "Debt Reduction Planner");
            System.out.println("select_submenu_from_menu_succeed " + select_submenu_from_menu_succeed);
            if (!select_submenu_from_menu_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_debt_reduction_plan_calculator_enter_rate_of_interest_per_annum() throws IOException {
        boolean testcase_status = true;
        String rate_of_interest_per_annum = MasterData.test_debt_reduction_plan_calculator_master_data.get("rate_of_interest_per_annum");
        try {
            boolean debt_reduction_plan_calculator_enter_rate_of_interest_per_annum_succeed = Activities.debt_reduction_plan_calculator_enter_rate_of_interest_per_annum(driver, Double.parseDouble(rate_of_interest_per_annum));
            System.out.println("debt_reduction_plan_calculator_enter_rate_of_interest_per_annum_succeed " + debt_reduction_plan_calculator_enter_rate_of_interest_per_annum_succeed);
            if (!debt_reduction_plan_calculator_enter_rate_of_interest_per_annum_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month() throws IOException {
        boolean testcase_status = true;
        String how_much_can_you_repay_every_month = MasterData.test_debt_reduction_plan_calculator_master_data.get("how_much_can_you_repay_every_month");
        try {
            boolean debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month_succeed = Activities.debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month(driver, Double.parseDouble(how_much_can_you_repay_every_month));
            System.out.println("debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month_succeed " + debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month_succeed);
            if (!debt_reduction_plan_calculator_enter_how_much_can_you_repay_every_month_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_debt_reduction_plan_calculator_click_calculate_button() throws IOException {
        boolean testcase_status = true;
        try {
            boolean debt_reduction_plan_calculator_click_calculate_button_succeed = Activities.debt_reduction_plan_calculator_click_calculate_button(driver);
            System.out.println("debt_reduction_plan_calculator_click_calculate_button_succeed " + debt_reduction_plan_calculator_click_calculate_button_succeed);
            if (!debt_reduction_plan_calculator_click_calculate_button_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_debt_reduction_plan_calculator_check_result() throws IOException {
        boolean testcase_status = true;
        String final_result = MasterData.test_debt_reduction_plan_calculator_master_data.get("final_result");
        try {
            boolean debt_reduction_plan_calculator_check_result_succeed = Activities.debt_reduction_plan_calculator_check_result(driver, final_result);
            System.out.println("debt_reduction_plan_calculator_check_result_succeed " + debt_reduction_plan_calculator_check_result_succeed);
            if (!debt_reduction_plan_calculator_check_result_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }



}

