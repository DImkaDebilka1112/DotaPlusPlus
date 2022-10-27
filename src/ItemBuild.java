
    public class ItemBuild  extends  SkillBuild{

        public ItemBuild () {

            int pt = gold - powerTreads;
            int bf = pt - battleFury;
            int ds = bf - desolator;
            int ab = ds - abyssalBlade;
            int bkb = ab - blackKingBar;
            int sk = bkb - eyeOfSkadi;

            System.out.println(" 1 " + pt);
            System.out.println("balance of gold after purchase powerTreads");
            System.out.println(" 2 " + bf);
            System.out.println("balance of gold after purchase battleFury");
            System.out.println(" 3 " + ds);
            System.out.println("balance of gold after purchase desolator");
            System.out.println(" 4 " + ab);
            System.out.println("balance of gold after purchase abyssalBlade");
            System.out.println(" 5 " + bkb);
            System.out.println("balance of gold after purchase blackBlade");
            System.out.println(" 6 " + sk);
            System.out.println("balance of gold after purchase eyeOfSkadi");


        }
    }

