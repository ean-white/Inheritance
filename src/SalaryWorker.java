public class SalaryWorker extends Worker
{
    private double annualSalary;


    public SalaryWorker(String idNum, String firstName, String lastName, String title, int YOB, double hourlypayrate, double annualsalary)
    {
        super(idNum,firstName,lastName,title,YOB,hourlypayrate);
        this.setAnnualSalary(annualSalary);
    }

    public double getAnnualSalary()
    {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualsalary)
    {
        this.annualSalary = annualsalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return this.annualSalary / 52;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        return "Weely pay: " + calculateWeeklyPay(0.0);
    }
}
