package baseball;

public class BaseBallTeam {
    //カプセル化
    private String name; //名前
    private int win;     //勝ち数
    private int lose;    //負け数
    private int draw;    //引き分け数

    //引数
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
     return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getwin() {
      return this.win;
    }

    public void setwin(int win) {
       this.win = win;
    }

    public int getlose() {
        return this.lose;
    }

    public void setlose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return this.draw;
    }

    public void setdrow(int draw) {
        this.draw = draw;
    }

    public void report() {
    //○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッドです
    double rate = getrate();
       System.out.println(name+"の２０２２年の成績は"+this.win+"勝"+this.lose+"敗"+this.draw+"分、勝率は"+rate+"です。") ;
    }

    //この計算結果を小数値（double）で戻す getRate メソッドを BaseBallTeam に作ってください
    public double getrate() {
        double rate = (double)win / (win + lose);
        return rate;
    }

}
