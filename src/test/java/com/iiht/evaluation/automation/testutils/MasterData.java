package com.iiht.evaluation.automation.testutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterData {
	public static final Map<String, String> test_success_login_master_data = new HashMap<>();
	public static final Map<String, String> test_failure_login_master_data = new HashMap<>();
	public static final Map<String, String> test_fixed_deposit_calculator_master_data = new HashMap<>();
	public static final Map<String, String> test_emergency_fund_calculator_master_data = new HashMap<>();
	public static final Map<String, String> test_provident_fund_calculator_master_data = new HashMap<>();
	public static final Map<String, String> test_debt_reduction_plan_calculator_master_data = new HashMap<>();

	
	static {


		/* **********************************/
		test_debt_reduction_plan_calculator_master_data.put("total_debt_outstanding","1500000");
		test_debt_reduction_plan_calculator_master_data.put("rate_of_interest_per_annum","15");
		test_debt_reduction_plan_calculator_master_data.put("how_much_can_you_repay_every_month","50000");
		test_debt_reduction_plan_calculator_master_data.put("final_result","15,00,000");


	}
}
