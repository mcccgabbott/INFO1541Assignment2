public final class HourlyEmployeeTest {

    public static void main(String[] args) {
        HourlyEmployeeTest tonyStark = new HourlyEmployeeTest("Tony", "Stark", 5749, "Service",
                "Lead Service Manager", 32.85);
        tonyStark.increaseHours(35);
        double weeklyPay = tonyStark.calculateWeeklyPay();
        System.out.println("Weekly pay: $" + weeklyPay);

        double newWage = tonyStark.annualRaise();
        System.out.println("New wage: $" + newWage);

    }
    private double wage;
    private double hoursWorked;

    public HourlyEmployeeTest(String fn, String ln, int i, String dept, String job, double w) {
        wage = w;
        hoursWorked = 0.0;
    }

    public void increaseHours() {
        hoursWorked += 1;
    }

    public void increaseHours(double h) {
        if (h > 0) {
            hoursWorked += h;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public double calculateWeeklyPay() {
        double pay = wage * hoursWorked;
        if (hoursWorked > 40) {
            pay = wage * 40 + (wage * 1.5) * (hoursWorked - 40);
        }
        return pay;
    }

    public double annualRaise() {
        double raisePercentage = 0.05;
        double raiseAmount = wage * raisePercentage;
        double newWage = wage + raiseAmount;
        wage = newWage; // Update the instance variable with the new wage
        return newWage;
    }

}
