package config;

import utility.ExcelUtils;

public class Constants {
	
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "TestSteps";
	public static final String Sheet_TestCases = "TestCases";
	
	//Keywords
	public static final String ak="Action_keyword";
	public static final String po="Page Object";
	public static final String rm="Runmode";
	public static final String res="Results";
	public static final String ds="Data Set";
public static final String tc= "TestCase ID";
	//This is the list of System Variables
    
	public static final String URL = "http://192.168.40.128:9080/maximo/webclient/login/login.jsp";
	public static final String Path_TestData = "D:\\Testing Edureka\\workspace\\KeywordDriven\\src\\dataEngine\\DataEngine.xlsx";
	public static final String Path_OR ="D:\\Testing Edureka\\workspace\\KeywordDriven\\src\\config\\OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = ExcelUtils.getCol_num(tc, Sheet_TestCases);	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject=ExcelUtils.getCol_num(po,Sheet_TestSteps);
	public static final int Col_ActionKeyword=ExcelUtils.getCol_num(ak,Sheet_TestSteps);
	public static final int Col_RunMode=ExcelUtils.getCol_num(rm,Sheet_TestCases);
	public static final int Col_Result_TS=ExcelUtils.getCol_num(res,Sheet_TestSteps);
	public static final int Col_Result_TC=ExcelUtils.getCol_num(res,Sheet_TestCases);
	public static final int Col_DataSet=ExcelUtils.getCol_num(ds,Sheet_TestSteps);

 
	// List of Test Data
	public static final String UserName = "maxadmin";
	public static final String Password = "maxadmin";
 
	public static final String KEYWORD_FAIL="FAIL";
	public static final String KEYWORD_PASS="PASS";
	
	
	

}
