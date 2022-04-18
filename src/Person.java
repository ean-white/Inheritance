import java.util.Calendar;

public class Person {

    private String idNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    private void ageValidation(int YOB)
    {
        if (YOB < 1920)
            throw new ExceptionInInitializerError("YOB is less than 1920");
    }

    public Person(String idNum, String firstName, String lastName, String title, int YOB)
    {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getIdNum()
    {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYOB()
    {
        return YOB;
    }

    public void setYOB(int YOB) {
            this.YOB = YOB;
    }
    public String getFullName()
    {
        return this.firstName+ " " + lastName;
    }

    public String formalName() {
        return this.title + " " + getFullName();
    }

    public static int getAge(int YOB)
    {
        Calendar calendar = Calendar.getInstance();
        int date = calendar.get(Calendar.YEAR);
        int age = date - YOB;
        return age;
    }
    public String toCSVDataRecord()
    {
        return this.idNum + "," + this.lastName + "," + this.firstName + "," + this.title + "," + this.YOB;
    }


}
