import java.util.Scanner;

public class userDiePlayer implements DiePlayer
{
    @Override
    public boolean isRolling ( int myScore, int turnTotal, int maxScore, int rolls )
    {
        Scanner sc = new Scanner (System.in);
        //String isRoll=sc.nextLine();// eger oyunun kullanıcı tarafindan oynanması isteniyorsa bu tanımlama kullanılmalıdır.
        String isRoll = "roll"; // eger oyunun bilgisayar tarafindan otomatik oynanması isteniyorsa bu tanımlama kullanılmalıdır.
        String expected = "roll";
        String expected2="start";

        if( expected.equals (isRoll) )
        {

            System.out.println (( turnTotal > 0 )? "Bu tur alınan toplam puan: " + turnTotal :"");
            System.out.println ("Roll or Hold?" );
            return true;
        }


        else if(expected2.equals (isRoll))
        {
            //System.out.println ("Roll or Hold?" );// eger oyunun bilgisayar tarafindan otomatik oynanması isteniyorsa bu tanımlama kullanılmamalıdır.

            return false;
        }
        else{

            return false;
        }


    }
}