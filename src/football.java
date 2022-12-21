import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class football extends JFrame{
    private JPanel panel;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel Result;
    private JLabel LastScore;
    private JLabel Winner;
    int Milan = 0;
    int Rm = 0;
    public football() {

        setContentPane(panel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rm++;
                Result.setText("Result: "+Milan+"X"+Rm);
                LastScore.setText("Last score: Real Madrid");
                if(Rm>Milan){
                    Winner.setText("Winner: Real Madrid");
                }
            }
        });
        ACMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                Result.setText("Result: "+Milan+"X"+Rm);
                LastScore.setText("Last score:ACMilan");
                if(Milan>Rm){
                    Winner.setText("Winner: ACMilan");
                }
            }
        });
    }

    public static void main(String[] args) {
        new football();
    }
}
