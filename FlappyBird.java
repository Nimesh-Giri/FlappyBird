import java.awt.*;
import java.awt.event.*;
import java.util.*;


import java.util.random;
import javax.swing.*;
import javax.swing.Timer;

public class FlappyBird extends JPanel implements ActionListener{
    int boardwidth = 640;
    int boardheight  = 640;
    //image
    Image backgroundImg;
    Image flappybirdImg;
    Image toppipeImg;
    Image bottompipeImg;

    //Bird
    int birdX = boardwidth/8;
    int birdY = boardheight/2;
    int birdwidth = 34;
    int birdheight =24;
    class Bird{
        int X = birdX;
        int Y = birdY;
        int height = birdheight;
        int width = birdwidth;
        Image img ;
        Bird(Image img) {
            this.img = img;
    }
    
    }
    // game logic
      Bird bird;
      Timer gameLoop;

    FlappyBird (){
        setPreferredSize(new Dimension(boardwidth, boardheight));
        setBackground(Color.blue);
      //load images
      backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
      flappybirdImg= new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
      toppipeImg= new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
      bottompipeImg= new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
      
      bird = new Bird(flappybirdImg);
      gameLoop = new Timer(1000/60,this);
      gameLoop.start();
    }
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      draw(g);
      
    }
    public void  draw (Graphics g){

        // background
      g.drawImage(backgroundImg,0,0,boardheight,boardwidth,null );

        //bird
        g.drawImage(bird.img, bird.X, bird.Y, bird.width, bird.height, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       repaint();
    }
    
}
