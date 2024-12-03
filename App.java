import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
       int boardwidth = 360;
       int boardhight= 640;
       JFrame frame = new JFrame ("flappy bird");
       
       frame.setSize (boardwidth,boardhight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

FlappyBird flappyBird= new FlappyBird();
           frame.add(flappyBird);
           frame.pack();
           frame.setVisible (true);
 




    }
}
