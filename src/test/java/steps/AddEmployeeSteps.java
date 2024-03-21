package steps;
import Utils.CommonMethods;
import Utils.ExcelReader;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    //    this step won't run because we haven't completed the logic
//     is same as the one discussed in data table
//    don't freak out if this doesn't run
    @When("user adds multiple employees from excel and verify the employee has added")
    public void user_adds_multiple_employees_from_excel_and_verify_the_employee_has_added() throws IOException {
        List<Map<String, String>> newEmployees = ExcelReader.read();
        for (Map<String, String> newEmployee : newEmployees) {
            //this newEmployee map will give me all the values based on the keys
//            sendText(newEmployee.get("firstName"), addEmployeePage.firstNameLoc);
//            sendText(newEmployee.get("middleName"), addEmployeePage.middleNameLoc);
//            sendText(newEmployee.get("lastName"), addEmployeePage.lastNameLoc);
//            sendText(newEmployee.get("Photograph"), addEmployeePage.photograph);
//send the data to webElements
        }

    }
}