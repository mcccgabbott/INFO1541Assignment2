public final class SalaryEmployeeTest {

        public static void main(String[] args) {
            SalaryEmployeeTest emp = new SalaryEmployeeTest("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
            testCalculateWeeklyPay(emp);
        }

        public static void testCalculateWeeklyPay(SalaryEmployeeTest emp) {
            double expectedWeeklyPay = 1237.02;
            double calculatedWeeklyPay = emp.calculateWeeklyPay();
            double expectedBonus = 2164.54;
            double calculatedBonus = emp.holidayBonus();
            System.out.println("Calculated Weekly Pay: $" + calculatedWeeklyPay);
            if (calculatedWeeklyPay == expectedWeeklyPay) {
                System.out.println("Weekly pay calculation is correct.");
            } else {
                System.out.println("Weekly pay calculation is incorrect.");
            }

            System.out.println("Calculated Bonus: $" + calculatedBonus);
            if (calculatedBonus == expectedBonus) {
                System.out.println("Holiday bonus calculation is correct.");
            } else {
                System.out.println("Holiday bonus calculation is incorrect.");
            }

        }

    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private String jobTitle;
    private double salary;

    public SalaryEmployeeTest(String fn, String ln, int i, String dept, String job, double sal) {
        firstName = fn;
        lastName = ln;
        id = i;
        department = dept;
        jobTitle = job;
        salary = sal;
    }

    public double calculateWeeklyPay() {
        double weeklyPay = salary / 52;
        return Math.round(weeklyPay * 100.0) / 100.0;
    }

    public double holidayBonus() {
        double bonusPercentage = 0.03365;
        double bonusAmount = salary * bonusPercentage;
        return Math.round(bonusAmount * 100.0) / 100.0;
    }


    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: $" + salary;
    }



}

