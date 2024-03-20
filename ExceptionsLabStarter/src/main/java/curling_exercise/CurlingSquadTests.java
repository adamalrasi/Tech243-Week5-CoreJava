package curling_exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CurlingSquadTests {
    @Test
    @DisplayName(("Add some curlers"))
    public void testAddSomeCurlers() {
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena"};
        Assertions.assertEquals(4, squadSparta.addCurlers(availableCurlers));
    }

    @Test
    @DisplayName(("Try to add too many curlers"))
    public void testAddTooManyCurlers() {
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena"};
        Assertions.assertEquals(4, squadSparta.addCurlers(availableCurlers));
        String[] moreCurlers = new String[]{"Parmita", "Millie", "Jasmine"};
        Assertions.assertEquals(5, squadSparta.addCurlers(moreCurlers));
    }

    @Test
    @DisplayName("verify addCurler throws exception - squad is full")
    void testAddCurlerExceptionMessage(){
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena", "Adam"};
        squadSparta.addCurlers(availableCurlers);
        Exception e = assertThrows(Exception.class, () -> squadSparta.addCurler("Alex"));
        Assertions.assertEquals("Squad is full", e.getMessage());
        System.out.println(e.getMessage());

    }


}
