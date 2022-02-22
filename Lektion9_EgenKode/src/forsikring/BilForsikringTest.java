package forsikring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGrundPraemie() {
    }

    @Test
    void setGrundpaemie() {
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(100);
        assertEquals(100, forsikring.getGrundPraemie());

        //TC9
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.setGrundpaemie(-1);
        });
        assertEquals(exception.getMessage(), "grundPr skal vaere positiv");
    }

    @Test
    void beregnPraemie() {
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);
        forsikring.beregnPraemie(20, false, 2);

        //TC1
        //arrange under 25
        assertEquals(1250, forsikring.beregnPraemie(20, false, 2));

        //TC2
        //arrange over 25
        assertEquals(1000, forsikring.beregnPraemie(30, false, 2));

        //TC3
        //arrange kvinde under 25
        assertEquals(1187.5, forsikring.beregnPraemie(20, true, 2));

        //TC4
        //arrange kvinde over 25
        assertEquals(950, forsikring.beregnPraemie(30, true, 2));

        //TC5
        //arrange kvinde over 25, 9år skadefri
        assertEquals(617.5, forsikring.beregnPraemie(30, true, 9));

        //TC6
        //arrange mand over 25, 9 år skadefri
        assertEquals(650, forsikring.beregnPraemie(30, false, 9));

        //TC8
        //arrange mand/kvinde er lige blevet 25, 6 år skadefri
        assertEquals(750, forsikring.beregnPraemie(25, false, 6));
        assertEquals(712.5, forsikring.beregnPraemie(25, true, 6));
    }

    @Test
    void beregnPræmie1() {
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);

        //TC7
        //Arrange 20 år mand/kvinde w/ 9 års skadfri
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(20, true, 9);
        });
        assertEquals("Du kan ikke have kaert skadefri saelaenge",exception.getMessage());
        Exception exception1 = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(20, false, 9);
        });
        assertEquals("Du kan ikke have kaert skadefri saelaenge",exception1.getMessage());

        //TC10
        //Arrage under 18
        Exception exception2 = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(16, false, 2);
        });
        assertEquals("Du er for ung til at tegne en forsikring", exception2.getMessage());

        Exception exception3 = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(16, true, 2);
        });
        assertEquals("Du er for ung til at tegne en forsikring", exception3.getMessage());

        //TC11
        //Arrange over 18, skadefri -1
        Exception exception4 = assertThrows(RuntimeException.class,() ->{
            forsikring.beregnPraemie(19, true, -1);
        });
        assertEquals("Antal skade frie aer skal vaere positiv", exception4.getMessage());
        Exception exception5 = assertThrows(RuntimeException.class,() ->{
            forsikring.beregnPraemie(19, false, -1);
        });
        assertEquals("Antal skade frie aer skal vaere positiv", exception5.getMessage());
    }
}