/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package virtualpet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
   

    @Test void appHasAGreeting() {
        VirtualPetApp classUnderTest = new VirtualPetApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

}
