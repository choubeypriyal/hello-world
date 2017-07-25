/**
 * Created by choubeyp on 7/25/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeService emp = new EmployeeService(55410, "Priyal", 45000, "9754266394", "Member Technical");
        System.out.println(HrServices.eligibleForPromotion(emp.getDesig()));
        HrServices.updateSalary(7000);
    }
}
