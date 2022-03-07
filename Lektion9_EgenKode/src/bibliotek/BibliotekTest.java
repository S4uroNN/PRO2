package bibliotek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void beregnBøde() {
        Bibliotek bibliotek = new Bibliotek();
        assertEquals(10,bibliotek.beregnBøde(LocalDate.of(2020,02,20),LocalDate.of(2020,02,21),false));
    }
}