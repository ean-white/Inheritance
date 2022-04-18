import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    @BeforeEach
    void setUp()
    {
        p1 = new Person("00000A", "Bilbo", "Smith", "Mister", 1990);
    }

    @Test
    void setIdNum() {
        p1.setIdNum("123123");
        assertEquals("123123", p1.getIdNum());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Ean");
        assertEquals("Ean", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("White");
        assertEquals("White", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Mr");
        assertEquals("Mr", p1.getTitle());
    }

    @Test
    void setYOB()
    {
        p1.setYOB(2002);
        assertEquals(2002, p1.getYOB());
    }

    @Test
    void getFullName() {
        p1.setFirstName("Ean");
        p1.setLastName("White");
        assertEquals("Ean White", p1.getFullName());
    }

    @Test
    void formalName() {
        p1.setFirstName("Ean");
        p1.setLastName("White");
        p1.setTitle("Mr");
        assertEquals("Mr Ean White", p1.formalName());
    }


}