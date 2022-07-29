import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x=0;
    public static void main(String[] args) {

        PApplet.main("TryProcessing" ,args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



    @Override
    public void draw() {
        int n=4;
        drawCircle(n);
    }

    private void drawCircle(int n) {
        ellipse((n*x)/5, (n*HEIGHT)/5,10,10);
        x++;
        if(n>0){
            drawCircle(n-1);
        }

    }


}