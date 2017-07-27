/**
 * Created by choubeyp on 7/22/2017.
 */

enum Location {
    pune, hyderabad
};

public class Employee{
    private String fName;
    private String lName;
    private int id;
    private Location loc;
    private String DeptId;

    public Employee(String fName, String lName, int id, Location loc, String deptId) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.loc = loc;
        DeptId = deptId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public String getDeptId() {
        return DeptId;
    }

    public void setDeptId(String deptId) {
        DeptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                fName + ',' +
                lName + ',' +
                id +
                "," + loc +
                "," + DeptId + ',' +
                '}';
    }

        /*if ((this.getLoc()).compareTo(p.getLoc()) == 0)
            return 1;
        else {
            if (((Employee) p).getDeptId().equals(this.getDeptId())
            return 1;
            else{
                if (this.getfName().equals(((Employee) p).getfName()))
                    return 1;
                else {
                    if (this.getlName().equals(((Employee) p).getlName()))
                        return 1;
                    else if (this.getId() > p.getId()) ;
                }
            }
        }*/

}
