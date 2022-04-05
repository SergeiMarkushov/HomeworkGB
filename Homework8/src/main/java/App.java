import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private int value;

    public App(int initialValue){
        setBounds(500,250,500,150);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD,32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.getAncestorListeners();

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);


        JButton decrementButtonTen = new JButton("-10");
        decrementButtonTen.setFont(font);



        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);


        JButton incrementButtonTen = new JButton("+10");
        incrementButtonTen.setFont(font);

        JButton clear = new JButton("clear");
        clear.setFont(font);

        JPanel decrementsPanel = new JPanel();
        decrementsPanel.add(decrementButtonTen);
        decrementsPanel.add(decrementButton);

        JPanel incrementsPanel = new JPanel();
        incrementsPanel.add(incrementButton);
        incrementsPanel.add(incrementButtonTen);

        JPanel countPanel = new JPanel();
        countPanel.add(counterValueView);

        JPanel clearPanel = new JPanel();
        clearPanel.add(clear);

        add(decrementsPanel, BorderLayout.WEST);
        add(incrementsPanel, BorderLayout.EAST);
        add(clearPanel, BorderLayout.SOUTH);
        add(countPanel, BorderLayout.CENTER);


        decrementButtonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value-=10;
                counterValueView.setText(String.valueOf(value));
            }
        });
        incrementButtonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value+=10;
                counterValueView.setText(String.valueOf(value));
            }
        });
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value=0;
                counterValueView.setText(String.valueOf(value));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new App(0);
    }
}

