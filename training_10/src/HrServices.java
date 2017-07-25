public class HrServices {
    public HrServices() {
    }

    public static void updateSalary(double salary) {
        System.out.println("salary is updated " + salary);
    }

    public static boolean eligibleForPromotion(String desig) {
        if (desig == "Manager")
            return true;
        else
            return false;
    }

    public void changeProject() {
        System.out.println("change project");
    }

    public void changeDesignation() {
        System.out.println("Designation change to");
    }
}