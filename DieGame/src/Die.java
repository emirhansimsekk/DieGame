import java.util.Random;

public class Die
{

    int nextRoll ( )
    {
        Random r = new Random ( );
        int dieSide;
        dieSide = r.nextInt (6) + 1;
        return dieSide;
    }
}