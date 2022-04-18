import java.util.ArrayList;

public class InheritanceDemo {

    public static <ExceptionInInitializeError extends Throwable> void main(String[] args) throws ExceptionInInitializeError {
        Worker worker1 = new Worker("000001", "Joe", "Johnson", "Mr.", 1993, 20);
        Worker worker2 = new Worker("000002", "Michelle", "Obama", "Mrs", 1964, 40);
        Worker worker3 = new Worker("000003", "Ean", "White", "Mr.", 2002, 50);

        SalaryWorker salaryworker1 = new SalaryWorker("000004", "Jane", "Doe","Mrs", 1990, 25, 52000 );
        SalaryWorker salaryworker2 = new SalaryWorker("000005", "Taylor","Swift","Ms",1990, 30, 60000);
        SalaryWorker salaryworker3 = new SalaryWorker("000006", "Bob","Thompson", "Mr", 1970, 40,80000);

        ArrayList<Person> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryworker1);
        workers.add(salaryworker2);
        workers.add(salaryworker3);

        for (int i=0; i < workers.size(); i++)
        {
            if (!(workers.get(i) instanceof SalaryWorker)) {
                Worker worker = (Worker) workers.get(i);
                System.out.println("Worker: ");
                System.out.println(worker.formalName() + "        " + "ID: " + worker.getIdNum());

                System.out.println(worker.displayWeeklyPay(40));
                System.out.println("\n");

                System.out.println(worker.displayWeeklyPay(50));
                System.out.println("\n");

                System.out.println(worker.displayWeeklyPay(40));
            }
            System.out.println("\n");
        }
    }
}
