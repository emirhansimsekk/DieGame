public class RaceToGoalPlayer implements DiePlayer
{

    @Override
    public boolean isRolling ( int myScore, int turnTotal, int maxScore, int rolls )
    {
        DiePlayer isRoll = new userDiePlayer ( );

        if ( myScore >= 71 )
        {
            isRoll.isRolling (myScore, turnTotal, maxScore, rolls);
            if ( myScore + turnTotal >= 100 )
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        else if ( turnTotal >= ( 21 + ( ( maxScore - myScore ) / 8 ) ) )
        {
            isRoll.isRolling (myScore, turnTotal, maxScore, rolls);

            return false;
        }



        else
        {
            isRoll.isRolling (myScore, turnTotal, maxScore, rolls);
            return true;
        }

    }
}