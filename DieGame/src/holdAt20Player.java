public class holdAt20Player implements DiePlayer
{

    @Override
    public boolean isRolling ( int myScore, int turnTotal, int maxScore, int rolls )
    {

        DiePlayer isRoll = new userDiePlayer ( );

        if ( turnTotal >= 20 )
        {
            isRoll.isRolling (myScore, turnTotal, maxScore, rolls);

            return false;
        }

        else if ( isRoll.isRolling (myScore, turnTotal, maxScore, rolls) )
        {

            return true;
        }
        else
        {
            return true;
        }
    }
}