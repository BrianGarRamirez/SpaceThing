import java.awt.*;

public class Player {

   int x,y;
   double speed, dx = 4,dy;
    final int width=20,height=40;

    public Player(Board board){
        x = board.getWidth()/2;
        y=board.getHeight()- (height + 10);
    }
    public void moveRight(){
        x+=dx;
    }
    public void moveLeft(){
        x-=dx;
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,width, height);
    }

    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }
    public int getY(){
        return y;
    }
}
