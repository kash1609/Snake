package src;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        // fit JFrame snuggly arround all components added to the frame
        this.pack();
        this.setVisible(true);
        // make the frame appear in the middle of the computer
        this.setLocationRelativeTo(null);
    }
}
