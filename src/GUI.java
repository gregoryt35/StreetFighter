import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GUI implements ActionListener {

    private JFrame setupFrame;
    private JTextField player1Name;
    private JTextField player2Name;

    public GUI() {
        setupFrame = new JFrame("Street Fighter");
        player1Name = new JTextField(8);
        player2Name = new JTextField(8);
        setup();
        play();
    }

    private void setup() {
        setupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel top = new JPanel();
        JLabel intro = new JLabel("Welcome to Street Fighter!");
        intro.setFont(new Font("Chalkboard", Font.PLAIN, 20));
        intro.setForeground(Color.MAGENTA);
        top.add(intro);

        JPanel mid = new JPanel();
        JLabel names = new JLabel("Please enter your usernames:");
        player1Name.setText("player1");
        player2Name.setText("player2");
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        mid.add(names);
        mid.add(player1Name);
        mid.add(player2Name);
        mid.add(submit);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setupFrame.add(top, BorderLayout.NORTH);
        setupFrame.add(mid, BorderLayout.CENTER);

        setupFrame.pack();
        setupFrame.setVisible(true);

    }

    private void play() {
        JFrame gameFrame = new JFrame("Street Fighter");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) (e.getSource());
        String text = button.getText();

        if (text.equals("Submit")) {
            String userName1 = player1Name.getText();
            Player player1 = new Player(userName1);

            String userName2 = player2Name.getText();
            Player player2 = new Player(userName2);

            // test
            System.out.println("Player 1 name set to: " + player1.getName());
            System.out.println("Player 2 name set to: " + player2.getName());

            setupFrame.setVisible(false);
        }

    }
}
