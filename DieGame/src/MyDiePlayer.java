public class MyDiePlayer implements DiePlayer{
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        DiePlayer isRoll= new userDiePlayer ();

        if((maxScore-myScore)<50){
            isRoll.isRolling (myScore, turnTotal, maxScore, rolls);
            if(turnTotal>25){
                return false;
            }
            return true;
        }
        else if ( isRoll.isRolling (myScore, turnTotal, maxScore, rolls) )
        {
            return false;
        }


        else{
            if(turnTotal>15){
                return false;
            }

            else{
                return true;
            }
        }


    }
}