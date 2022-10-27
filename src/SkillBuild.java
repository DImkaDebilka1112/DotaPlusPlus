public class SkillBuild extends Methods {
    int gold = 26000;
    int powerTreads = 1400;
    int battleFury = 4100;
    int desolator = 3500;
    int abyssalBlade = 6250;
    int blackKingBar = 4050;
    int  eyeOfSkadi = 5600;

    public void stringDagger() {
        System.out.println();

        stringDagger = 65 ;
        stringDaggerDamage = stringDaggerDamage + 25;
        stringDaggerDamageTwo = stringDaggerDamageTwo + 40 ;
        stringDaggerDamageThree = stringDaggerDamageThree + 55 ;
        stringDaggerDamageFour = stringDaggerDamageFour + 70;
        System.out.println("maximum string dagger damage level 4 - " + maximumStringDaggerDamageLevel );
        System.out.println("string dagger damage one level -  " +  stringDaggerDamage);
        System.out.println("string dagger Damage two level -  " +  stringDaggerDamageTwo);
        System.out.println("string dagger damage three level - " + stringDaggerDamageThree);
        System.out.println("string dagger damage four level - " + stringDaggerDamageFour);
    }
    public void phantomStrike(){
        System.out.println();

        phantomStrike = 10 ;
        phantomStrikeAttackSpeed = phantomStrikeAttackSpeed + 75;
        phantomStrikeAttackSpeedTwo = phantomStrikeAttackSpeedTwo  + 100;
        phantomStrikeAttackSpeedThree = phantomStrikeAttackSpeedThree + 125;
        phantomStrikeAttackSpeedFour = phantomStrikeAttackSpeedFour + 150;
        System.out.println("maximum strike attack speed level 4 - " + maximumStringDaggerDamageLevel);
        System.out.println("phantom strike attack speed One level - " + phantomStrikeAttackSpeed);
        System.out.println("phantom Strike Attack Speed Two level - " + phantomStrikeAttackSpeedTwo);
        System.out.println("phantom Strike Attack Speed Three level - " +  phantomStrikeAttackSpeedThree);
        System.out.println("phantom Strike Attack Speed four level - " + phantomStrikeAttackSpeedFour );
    }
    public void blurEvasion(){
        System.out.println();

        blur =  20  ;
        blurEvasion = blurEvasion + 30 ;
        blurEvasionTwo = blurEvasionTwo + 40 ;
        blurEvasionThree = blurEvasionThree + 50;
        blurEvasionFour = blurEvasionFour + 60 ;
        System.out.println("maximum blur evasion level 4 - " + blur);
        System.out.println("blur evasion one level - " + blurEvasion);
        System.out.println("blur evasion two level - " + blurEvasionTwo);
        System.out.println("blur evasion three level - " + blurEvasionThree);
        System.out.println("blur evasion four level - " + blurEvasionFour);

    }
    public  void coupDeGraceCriticalDamage(){

        System.out.println();
        coupDeGrace = coupDeGrace + 0;
        coupDeGraceCriticalDamage = coupDeGraceCriticalDamage + 80 ;
        coupDeGraceCriticalDamageTwo = coupDeGraceCriticalDamageTwo + 325 ;
        coupDeGraceCriticalDamageThree = coupDeGraceCriticalDamageThree + 450;
        System.out.println("maximum coup grace critical damage level 3 - " + coupDeGrace );
        System.out.println("coup DeGrace Critical Damage one level - " + coupDeGraceCriticalDamage);
        System.out.println("coup DeGrace Critical Damage two level - " + coupDeGraceCriticalDamageTwo);
        System.out.println("coup DeGrace Critical Damage three level - " + coupDeGraceCriticalDamageThree);
    }
}