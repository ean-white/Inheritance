import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;
    @BeforeEach
    void setUp()
    {
        w1 = new Worker("00000A", "Bilbo", "Smith", "Mister", 1990, 40);
    }
    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(50);
        assertEquals(50, w1.getHourlyPayRate());
    }



}