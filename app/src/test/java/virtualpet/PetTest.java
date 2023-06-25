package virtualpet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PetTest {
    private Pet testPet;

    @BeforeAll
    void Setup() {
        testPet = new Pet();
    }

    @Test
    public void Pet_Constructor_Should_Instantiate_Pet_Object() {
        assertNotNull(testPet, "Constructor Failed");
    }

    @Test
    public void Pet_Should_Have_Name() {
        // testPet.Name = "Pet Name";
        // assertEquals("Pet Name", testPet.Name);
    }

    @Test
    public void Pet_Should_Have_Species() {
        // testPet.Species = "Pet Species";
        // assertEquals("Pet Species", testPet.Species);
    }

    @Test
    public void Constructor_Should_Return_Initial_Hunger_Level_Of_60() {
        // assertEquals(60, testPet.Hunger);
    }

    @Test
    public void Constructor_Should_Return_Initial_Boredom_Level_Of_60() {
        // assertEquals(60, testPet.Boredom);
    }

    @Test
    public void Constructor_Should_Return_Initial_Health_Level_Of_60() {
        // assertEquals(60, testPet.Health);
    }

    @Test
    public void Feed_Should_Decrease_Hunger_By_10() {
        // testPet.Feed();
        // assertEquals(50, testPet.GetHunger());
    }
   @Test
        public void SeeDoctor_Should_Increase_Health_By_30()
        {
            // testPet.SeeDoctor();
            // assertEquals(90, testPet.GetHealth());
        }
      @Test
        public void Play_Should_Increase_Hunger_By_10()
        {
            // testPet.Play();
            // assertEquals(70, testPet.GetHunger());
        }  
          @Test
        public void Play_Should_Decrease_Boredom_By_20()
        {
            // testPet.Play();
            // assertEquals(40, testPet.GetBoredom());
        }

        @Test
        public void Play_Should_Increase_Health_By_10()
        {
            // testPet.Play();
            // assertEquals(70, testPet.GetHealth());
        }

        @Test
        public void Tick_Should_Increase_Hunger_By_5()
        {
            // testPet.Tick();
            // assertEquals(65, testPet.GetHunger());
        }

        @Test
        public void Tick_Should_Increase_Boredom_By_5()
        {
            // testPet.Tick();
            // assertEquals(65, testPet.GetBoredom());
        }

        @Test
        public void Tick_Should_Decrease_Health_By_5()
        {
            // testPet.Tick();
            // assertEquals(55, testPet.GetHealth());
        } 
}
