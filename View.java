import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JButton[][] casas;
    private JPanel p1;

    public View(){
        super("Checkers");
        Icon red = new ImageIcon(getClass().getResource("redPiece.png"));
        Icon black = new ImageIcon(getClass().getResource("blackPiece.png"));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(8,8));
        casas = new JButton[8][8];
        for(int i=0; i<8; i++){
            for(int j=0;j<8;j++){
                casas[i][j] = new JButton();
                p1.add(casas[i][j]);
              /*  if(i%2 == 0 && j%2 == 0 && i<3){
                    casas[i][j] = new JButton("",red);
                }
                else if(i%2 != 0 && j%2 != 0 && i>4 && i<8){
                    casas[i][j] = new JButton("",black);
                }
                */
            }
        }
        add(p1);

        for(int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
            if(i%2 == 0 && j%2 == 0){
                casas[i][j].setBackground(Color.BLACK);
                }
                else if(i%2 != 0 && j%2 != 0){
                casas[i][j].setBackground(Color.BLACK);
            }
            else{
                casas[i][j].setBackground(Color.WHITE);
            }
            }
        }
    }
}
