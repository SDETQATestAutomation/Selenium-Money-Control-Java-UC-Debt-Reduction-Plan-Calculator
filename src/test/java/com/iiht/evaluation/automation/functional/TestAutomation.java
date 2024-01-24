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
    public void test_debt_reduction_plan_calculator_master_data_open_submenu() throws IOException {
        boolean testcase_status = true;
        try {
            boolean select_submenu_from_menu_succeed = Activities.select_submenu_from_menu(driver, "Personal Finance", "Provident Fund Calculator");
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
    public void test_debt_reduction_plan_calculator_master_data_enter_medical_dental_cost() throws IOException {
        boolean testcase_status = true;
        String your_age = MasterData.test_debt_reduction_plan_calculator_master_data.get("your_age");
        try {
            boolean provident_fund_calculator_enter_your_age_succeed = Activities.provident_fund_calculator_enter_your_age(
                    driver, your_age);
            System.out.println("provident_fund_calculator_enter_your_age_succeed " + provident_fund_calculator_enter_your_age_succeed);
            if (!provident_fund_calculator_enter_your_age_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_your_basic_salary_monthly() throws IOException {
        boolean testcase_status = true;
        String your_basic_salary_monthly = MasterData.test_debt_reduction_plan_calculator_master_data.get("your_basic_salary_monthly");
        try {
            boolean provident_fund_calculator_enter_your_basic_salary_monthly_succeed = Activities.provident_fund_calculator_enter_your_basic_salary_monthly(
                    driver, your_basic_salary_monthly);
            System.out.println("provident_fund_calculator_enter_your_basic_salary_monthly_succeed " + provident_fund_calculator_enter_your_basic_salary_monthly_succeed);
            if (!provident_fund_calculator_enter_your_basic_salary_monthly_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_your_contribution_to_epf() throws IOException {
        boolean testcase_status = true;
        String your_contribution_to_epf = MasterData.test_debt_reduction_plan_calculator_master_data.get("your_contribution_to_epf");
        try {
            boolean provident_fund_calculator_enter_your_contribution_to_epf_succeed = Activities.provident_fund_calculator_enter_your_contribution_to_epf(
                    driver, your_contribution_to_epf);
            System.out.println("provident_fund_calculator_enter_your_contribution_to_epf_succeed " + provident_fund_calculator_enter_your_contribution_to_epf_succeed);
            if (!provident_fund_calculator_enter_your_contribution_to_epf_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_your_employer_contribution_to_epf() throws IOException {
        boolean testcase_status = true;
        String your_employer_contribution_to_epf = MasterData.test_debt_reduction_plan_calculator_master_data.get("your_employer_contribution_to_epf");
        try {
            boolean provident_fund_calculator_enter_your_employer_contribution_to_epf_succeed = Activities.provident_fund_calculator_enter_your_employer_contribution_to_epf(
                    driver, your_employer_contribution_to_epf);
            System.out.println("provident_fund_calculator_enter_your_employer_contribution_to_epf_succeed " + provident_fund_calculator_enter_your_employer_contribution_to_epf_succeed);
            if (!provident_fund_calculator_enter_your_employer_contribution_to_epf_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_average_annual_increase_in_salary_you_expect() throws IOException {
        boolean testcase_status = true;
        String average_annual_increase_in_salary_you_expect = MasterData.test_debt_reduction_plan_calculator_master_data.get("average_annual_increase_in_salary_you_expect");
        try {
            boolean provident_fund_calculator_enter_average_annual_increase_in_salary_you_expect_succeed = Activities.provident_fund_calculator_enter_average_annual_increase_in_salary_you_expect(
                    driver,
                    average_annual_increase_in_salary_you_expect);
            System.out.println("provident_fund_calculator_enter_average_annual_increase_in_salary_you_expect_succeed " + provident_fund_calculator_enter_average_annual_increase_in_salary_you_expect_succeed);
            if (!provident_fund_calculator_enter_average_annual_increase_in_salary_you_expect_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_age_when_you_intend_to_retire() throws IOException {
        boolean testcase_status = true;
        String age_when_you_intend_to_retire = MasterData.test_debt_reduction_plan_calculator_master_data.get("age_when_you_intend_to_retire");
        try {
            boolean provident_fund_calculator_enter_age_when_you_intend_to_retire_succeed = Activities.provident_fund_calculator_enter_age_when_you_intend_to_retire(
                    driver,
                    age_when_you_intend_to_retire);
            System.out.println("provident_fund_calculator_enter_age_when_you_intend_to_retire_succeed " + provident_fund_calculator_enter_age_when_you_intend_to_retire_succeed);
            if (!provident_fund_calculator_enter_age_when_you_intend_to_retire_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_current_epf_balance_if_any() throws IOException {
        boolean testcase_status = true;
        String current_epf_balance_if_any = MasterData.test_debt_reduction_plan_calculator_master_data.get("current_epf_balance_if_any");
        try {
            boolean provident_fund_calculator_enter_current_epf_balance_if_any_succeed = Activities.provident_fund_calculator_enter_current_epf_balance_if_any(
                    driver,
                    current_epf_balance_if_any);
            System.out.println("provident_fund_calculator_enter_current_epf_balance_if_any_succeed " + provident_fund_calculator_enter_current_epf_balance_if_any_succeed);
            if (!provident_fund_calculator_enter_current_epf_balance_if_any_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_enter_current_interest_rate() throws IOException {
        boolean testcase_status = true;
        String current_interest_rate = MasterData.test_debt_reduction_plan_calculator_master_data.get("current_interest_rate");
        try {
            boolean provident_fund_calculator_enter_current_interest_rate_succeed = Activities.provident_fund_calculator_enter_current_interest_rate(
                    driver,
                    Double.parseDouble(current_interest_rate));
            System.out.println("provident_fund_calculator_enter_current_interest_rate_succeed " + provident_fund_calculator_enter_current_interest_rate_succeed);
            if (!provident_fund_calculator_enter_current_interest_rate_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_click_submit_button() throws IOException {
        boolean testcase_status = true;
        try {
            boolean provident_fund_calculator_click_submit_button_succeed = Activities.provident_fund_calculator_click_submit_button(
                    driver);
            System.out.println("provident_fund_calculator_click_submit_button_succeed " + provident_fund_calculator_click_submit_button_succeed);
            if (!provident_fund_calculator_click_submit_button_succeed) {
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
    public void test_debt_reduction_plan_calculator_master_data_check_result() throws IOException {
        boolean testcase_status = true;
        String final_result = MasterData.test_debt_reduction_plan_calculator_master_data.get("final_result");
        try {
            boolean provident_fund_calculator_check_result_succeed = Activities.provident_fund_calculator_check_result(
                    driver, final_result);
            System.out.println("provident_fund_calculator_check_result_succeed " + provident_fund_calculator_check_result_succeed);
            if (!provident_fund_calculator_check_result_succeed) {
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

