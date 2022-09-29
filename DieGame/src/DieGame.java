import java.util.Scanner;

public class DieGame
{
    public static final int GOAL_SCORE = 100;
    public DiePlayer[] players;
    public int[] Scores;
    private int turnTotal;
    int dieSide;
    Scanner sc=new Scanner (System.in);



    public DieGame (DiePlayer[] players)
    {
        Scores         = new int[players.length];
        this.players   = players;
        this.turnTotal = turnTotal;


    }


    int playTurn (DiePlayer p, int playerNum)
    {
        Die d = new Die ();
        int dieSide = 0;
        turnTotal = 0;
        int rolls = 0;
        System.out.println ("Player " + (playerNum + 1) + "'in sirasi: ");
        //System.out.println ("Baslamak icin start yaziniz\n"); //eger oyunun bilgisayar tarafindan otomatik oynanması isteniyorsa bu tanımlama kullanılmamalıdır.

        while (p.isRolling (Scores[playerNum], turnTotal, getMaxScore (), rolls) && dieSide != 1)
        {

            dieSide = d.nextRoll ();

            if (dieSide == 1)
            {

                turnTotal = 0;
                rolls++;
                //String isRoll=sc.nextLine(); //eger oyunun bilgisayar tarafindan otomatik oynanması isteniyorsa bu tanımlama kullanılmamalıdır.
                System.out.println ("1 geldigi icin puan sifirlandi");
                System.out.println ("Bu tur alinan toplam puan: " + turnTotal);
                //System.out.println ("Toplami gormek icin 'Enter'a basiniz" ); //eger oyunun bilgisayar tarafindan otomatik oynanması isteniyorsa bu tanımlama kullanılmamalıdır.

            }
            else
            {
                turnTotal += dieSide;
                rolls++;
            }
        }
        Scores[playerNum] += turnTotal;
        return turnTotal;
    }

    public int play ( )
    {
        int i = 0, a = 0, kazanan,kazananOyuncuIndex=0;

        while (getMaxScore ( ) <= GOAL_SCORE)
        {
            for ( ; i < players.length ; i++ )
            {
                Scores[i] += playTurn (players[i], i);
                System.out.println ("Player " + ( i + 1 ) + "'s: " + ( a + 1 ) + ". tur sonunda toplam puani " + Scores[i] + "\n\n");
            }
            a++;
            i = 0;

        }
        for ( kazanan = 0; kazanan < players.length ; kazanan++ )
        {
            if ( Scores[kazanan] == getMaxScore ( ) )
            {
                kazananOyuncuIndex = kazanan;
                break;

            }
        }


        return kazananOyuncuIndex;

    }


    int getMaxScore ( )
    {
        int maxScore = Scores[0];
        int i;
        for ( i = 0; i < players.length ; i++ )

            if ( Scores[i] > maxScore )
            {
                maxScore = Scores[i];
            }


        return maxScore;
    }

    void printScores ( )
    {
        int oyuncular;
        int kazananOyuncuIndex=play ();

        for (oyuncular = 0; oyuncular < players.length ; oyuncular++)
        {
            System.out.println ("Player " + (oyuncular + 1) + "'s Score: " + Scores[oyuncular]);
        }

        System.out.println ("Kazanan oyuncu: Player "+(kazananOyuncuIndex+1) );

    }

}