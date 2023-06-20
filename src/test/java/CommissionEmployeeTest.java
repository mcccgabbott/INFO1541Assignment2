public final class CommissionEmployeeTest {
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private String jobTitle;
    public double commissionRate;
    private double sales;

    public CommissionEmployeeTest(String fn, String ln, int i, String dept, String job, double rate) {
        firstName = fn;
        lastName = ln;
        id = i;
        department = dept;
        jobTitle = job;
        commissionRate = rate;
        sales = 0.0;
    }

    public void increaseSales(double s) {
        if (s > 0) {
            sales += s;
        }
    }

    public double getSales() {
        return sales;
    }
    public double annualRaise() {
        return commissionRate += 0.002;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Commission Rate: " + commissionRate + "\n" +
                "Sales: $" + sales;
    }
}

class EmployeeCommissionTest {
    public static void main(String[] args) {
        CommissionEmployeeTest emp = new CommissionEmployeeTest("Clint", "Barton", 6847, "Sales",
                "Customer Representative", 0.0265);

        testIncreaseSales(emp, + 500.0);
        testIncreaseSales(emp, - 200);
        testIncreaseSales(emp,  + 1000);

        emp.annualRaise();
        emp.annualRaise();

        System.out.println("Updated Commission Rate: " + emp.commissionRate);

    }

    public static void testIncreaseSales(CommissionEmployeeTest emp, double amount) {
        System.out.println("Adding sales: $" + amount);
        emp.increaseSales(amount);
        System.out.println(emp);
        System.out.println();
    }
}