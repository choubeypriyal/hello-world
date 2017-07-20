import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by choubeyp on 7/18/2017.
 */

public class Employee {

    private int empId;
    private String name;
    private Date dob;
    private Date doj;
    private SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MMM-dd") ;
    private int deptid;




    public Employee(int empId, String name, Date dob, Date doj, int deptid) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.deptid = deptid;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Date getDoj() {
        return doj;
    }

    public int getDeptid() {
        return deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                ", deptid=" + deptid +
                '}';
    }
}


