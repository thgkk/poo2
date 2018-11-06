import javax.swing.*;

public class Control {
    public static void main(String args[]){
        View k = new View();

        k.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        k.setSize(400, 400);

        k.setVisible(true);
    }
}
