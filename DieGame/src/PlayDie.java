/**********ONEMLI*********

 Kodun su anki hali bilgisayar tarafindan otomatik olarak oynanmasi icin hazir haldedir.
 Eger kullanici tarafindan oynanmak istenirse "UserDiePlayer.java" ve "DieGame.java" classlarında
 comment olarak hangi satirlarin kullanilacagini belirttim.
 Kullanici tarafindan oynanmak istenmesi cok fazla zaman alacagi icin boyle bir yola basvurdum.


 *********ONEMLI**********/


/**
 * Project 3(HW1) -- DIEGAME (ZAR OYUNU)
 *
 * Bu oyun belirli stratejiler dogrultusunda oynanan bir zar oyunudur
 *
 * @author Emirhan Simsek
 *
 * @class BIL 122
 *
 * @date 05.05.2021   19.45
 *
 **/



import java.util.Scanner;

public class PlayDie
{


    public static void main ( String[] args )
    {
        // write your code here
        DiePlayer p = new userDiePlayer ( );
        DiePlayer p1 = new holdAt20Player ( );
        DiePlayer p2 = new HoldAt25Player ( );
        DiePlayer p3 = new RaceToGoalPlayer ( );
        DiePlayer p4=  new MyDiePlayer ();
        DiePlayer[] players = {p1,p2,p3,p4};
        DieGame dg=new DieGame (players);
        dg.play ();
        dg.printScores ();
        PlayDie playDie=new PlayDie ();
        //playDie.stats (players);

    }





    public void stats(DiePlayer[]players1){
        int i,a,b,count;
        Scanner sc=new Scanner (System.in);
        System.out.println ("Kac kere denemek istiyorsunuz?" );
        int deneySayisi=sc.nextInt (  );
        int[] kazananlarListesi = new int[deneySayisi];
        for ( i = 0 ; i < deneySayisi ; i++ )
        {
            DieGame dg = new DieGame (players1);
            kazananlarListesi[i] = dg.play ( );
        }

        for( a = 0; a <= players1.length ; a++ )
        {
            count = 0;
            for( b = 0 ; b < kazananlarListesi.length ; b++ )
            {
                if( a == kazananlarListesi[b] )
                {
                    count++;
                }
            }
            if( count != 0 )
            {
                System.out.print( "Player  "+(a+1)+" " + count + "  kere kazandı.  Kazanma oranı :  %"+((count*100)/deneySayisi) );

            }
            System.out.println ();
        }
    }


}