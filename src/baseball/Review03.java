package baseball;

public class Review03 {

    public static void main(String[] args) {
        //球団
        BaseBallTeam emp01 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        emp01.report();

        BaseBallTeam emp02 = new BaseBallTeam("横浜Denaベイタイガーズ",73,68,2);
        emp02.report();

        BaseBallTeam emp03 = new BaseBallTeam("阪神タイガース",68,72,3);
        emp03.report();

        BaseBallTeam emp04 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        emp04.report();

        BaseBallTeam emp05 = new BaseBallTeam("広島東洋カープ",66,74,3);
        emp05.report();

        BaseBallTeam emp06 = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        emp06.report();

    }

}
