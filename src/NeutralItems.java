public class NeutralItems {

    public int rndNum;
    public int max = 5;

    public void NeutralItems(){
         rndNum = (int) (Math.random() * max) + 1;
         switch (rndNum){
             case 1:
                 System.out.println();
                 System.out.println( " Trickster Cloak ");
                 break;
             case 2:
                 System.out.println();
                 System.out.println( " Stygian Desolator ");
                 break;
             case 3:
                 System.out.println();
                 System.out.println( " Titan Sliver " );
                 break;
             case 4 :
                 System.out.println();
                 System.out.println( " Paladin Sword ");
                 break;
             case 5:
                 System.out.println();
                 System.out.println(" nothing will fall ");
         }



    }

}
