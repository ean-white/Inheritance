import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
   SalaryWorker sw1;
    @BeforeEach
    void setUp()
    {
        sw1 = new SalaryWorker("00000A", "Bilbo", "Smith", "Mister", 1990, 30, 60000);
    }

    @Test
    void setAnnualSalary()
    {
        sw1.setAnnualSalary(50000);
        assertEquals(50000, sw1.getAnnualSalary());
    }


}