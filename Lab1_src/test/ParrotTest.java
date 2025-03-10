package test;

import org.junit.Test;
import parrot.Parrot;
import parrot.ParrotTypeEnum;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    private static Parrot getParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return new Parrot(type, numberOfCoconuts, voltage, isNailed);
    }


    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = getParrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
    @Test
    public void getHabitationOfEuropeanParrot() {
    	Parrot parrot = getParrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    	assertEquals("In a nest made of sticks.",parrot.getHabitation());
    }
    
    @Test
    public void getHabitationOfAfricanParrot() {
    	Parrot parrot = getParrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
    	assertEquals("In holes in trees.",parrot.getHabitation());
    }
    @Test
    public void getHabitationNorwegianBlueParrot_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals("In cages.",parrot.getHabitation());
    }

    @Test
    public void getHabitationNorwegianBlueParrot_not_nailed() {
        Parrot parrot = getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals("Nowhere.",parrot.getHabitation());
    }
}
