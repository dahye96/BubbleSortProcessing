import processing.core.PApplet;

public class Program extends PApplet {

    private int[] bar;
    private int i = 1;
    private int j = 0;

    public static void main(String[] args) {
        PApplet.main("Program");
    }

    @Override
    public void settings() {
        this.size(960, 640);
    }

    @Override
    public void setup() {
        this.background(0);
        stroke(0);
        makeRandomNum(48, 655);
    }

    @Override
    public void draw() {
        this.background(0);
        drawBar();
        bubbleSort();
        j++;
    }

    public void makeRandomNum(int number, int height) {
        bar = new int[number];
        for (int i = 0; i < number; i++) {
            bar[i] = (int) (Math.random() * height);
        }
    }

    public void drawBar() {
        for(int k = 0 ; k < bar.length ; k++) {
            if(k==j){
                this.fill(255,0,0);
            } else if(k > bar.length - i) {
                this.fill(0,255,0);
            } else{
                this.fill(255);
            }

            this.rect(k * Constants.barWidth, Constants.barPosY - bar[k], Constants.barWidth, bar[k]);
        }

        if(j < bar.length - i) {
            System.out.println("j : " + j);
        } else if(j == bar.length - i) {
            j = 0;
            i++;
            if(i == bar.length - 1) {
                i = 1;
            }
            System.out.println("i : " + i);
        }

    }

    public void bubbleSort() {
        int temp;
        /*if (bar[j] > bar[j + 1]) {
            temp = bar[j];
            bar[j] = bar[j + 1];
            bar[j + 1] = temp;
        }*/
    }
}
