package NFP121E;

import static org.junit.Assert.*;

import org.junit.Test;

public class testJUnit {

    @Test
    public void testConfiguration() {
        //Situation de depart
        // test échoué le cas n'a pas été pris en compte, il semble que le paramètre Alpha n'est pas passé correctement
        String commande = "-K 10 -A .90 -K 20 -P -K 30 -C";
        Configuration configuration = CLIClassique.configuration(commande);
        System.out.println("test mode " + configuration.getMode() + " indice " + configuration.getIndice());
        assertEquals(0.9, configuration.getAlpha());
        assertEquals(-1, configuration.getEpsilon(), 0.05);
        assertEquals(30, configuration.getIndice(), 0.05);
        assertEquals(Mode.CREUSE, configuration.getMode());


    }


}
