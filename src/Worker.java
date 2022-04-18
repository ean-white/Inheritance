public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(idNum, firstName, lastName, title, YOB);
        this.setHourlyPayRate(hourlyPayRate);
    }

    public double getHourlyPayRate()
    {
        return this.hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlypayrate)
    {
        this.hourlyPayRate = hourlypayrate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return hoursWorked = this.hourlyPayRate;
        }
        else
        {
            double regularpay = hoursWorked * this.hourlyPayRate;
            double overtimepay = (hoursWorked - 40) * (this.hourlyPayRate * 1.5);
            return regularpay + overtimepay;
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double regularhours = 0, regularpay = 0, overtimepay = 0;
        if (hoursWorked<= 40)
        {
            regularpay = hoursWorked * this.hourlyPayRate;
            regularhours = hoursWorked;
        }
        else
        {
            regularpay = 40 * this.hourlyPayRate;
            overtimepay = (hoursWorked = 40) * (this.hourlyPayRate * 1.5);
            regularhours = 40.0;
        }
        String regularpaystring = "Hours worked at regular pay rate: " + regularhours + " and they're getting: " + regularpay;
        String overtimepaystring = "Hours worked at overtime pay rate: " + (hoursWorked - regularhours) + " and they're getting: " + overtimepay;
        return regularpaystring + "\n" + overtimepaystring;
    }

}
