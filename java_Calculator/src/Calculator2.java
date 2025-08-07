import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    //Buttons
    JButton sevenButton, eightButton, nineButton,
            plusButton, minusButton, fourButton, fiveButton, sixButton,
            threeButton, twoButton, oneButton, dotButton, zeroButton, mulButton,
            divButton, equalButton, clearButton;
    //Special color for the Equal to sign.
    public static final Color starkGreen = new Color(0, 168, 0);
    boolean isOparetoclicked = false;
    double newValue, oldValue;
    int operation;

    public Calculator2() {
        //Window frame which is main component
        jf = new JFrame("Calculator app By Shishir");
        jf.setBounds(100, 100, 500, 650);
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.GRAY);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display Label
        displayLabel = new JLabel();
        displayLabel.setBounds(15, 20, 450, 150);
        displayLabel.setBackground(Color.WHITE);
        displayLabel.setOpaque(true); //Brings it forward
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.RED);
        displayLabel.setFont(new Font("arial", Font.PLAIN, 30));
        displayLabel.setVisible(true);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(20, 200, 70, 70);
        sevenButton.setFont(new Font("arial", Font.PLAIN, 20));
        sevenButton.addActionListener(this);
        sevenButton.setBackground(Color.white);
        sevenButton.setOpaque(true);
        sevenButton.setText("7");
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(110, 200, 70, 70);
        eightButton.setFont(new Font("arial", Font.PLAIN, 20));
        eightButton.addActionListener(this);
        eightButton.setBackground(Color.white);
        eightButton.setOpaque(true);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(200, 200, 70, 70);
        nineButton.setFont(new Font("arial", Font.PLAIN, 20));
        nineButton.addActionListener(this);
        nineButton.setBackground(Color.white);
        nineButton.setOpaque(true);
        jf.add(nineButton);

        plusButton = new JButton("+");
        plusButton.setBounds(290, 200, 75, 70);
        plusButton.setFont(new Font("arial", Font.PLAIN, 30));
        plusButton.addActionListener(this);
        plusButton.setBackground(Color.YELLOW);
        plusButton.setOpaque(true);
        jf.add(plusButton);

        minusButton = new JButton("-");
        minusButton.setBounds(385, 200, 75, 70);
        minusButton.setFont(new Font("arial", Font.PLAIN, 35));
        minusButton.addActionListener(this);
        minusButton.setBackground(Color.YELLOW);
        minusButton.setOpaque(true);
        jf.add(minusButton);

        fourButton = new JButton("4");
        fourButton.setBounds(20, 300, 70, 70);
        fourButton.setFont(new Font("arial", Font.PLAIN, 20));
        fourButton.addActionListener(this);
        fourButton.setBackground(Color.white);
        fourButton.setOpaque(true);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(110, 300, 70, 70);
        fiveButton.setFont(new Font("arial", Font.PLAIN, 20));
        fiveButton.addActionListener(this);
        fiveButton.setBackground(Color.white);
        fiveButton.setOpaque(true);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(200, 300, 70, 70);
        sixButton.setFont(new Font("arial", Font.PLAIN, 20));
        sixButton.addActionListener(this);
        sixButton.setBackground(Color.white);
        sixButton.setOpaque(true);
        jf.add(sixButton);

        mulButton = new JButton("x");
        mulButton.setBounds(290, 300, 170, 70);
        mulButton.setFont(new Font("arial", Font.PLAIN, 30));
        mulButton.addActionListener(this);
        mulButton.setBackground(Color.YELLOW);
        mulButton.setOpaque(true);
        jf.add(mulButton);

        oneButton = new JButton("1");
        oneButton.setBounds(20, 400, 70, 70);
        oneButton.setFont(new Font("arial", Font.PLAIN, 20));
        oneButton.addActionListener(this);
        oneButton.setBackground(Color.white);
        oneButton.setOpaque(true);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(110, 400, 70, 70);
        twoButton.setFont(new Font("arial", Font.PLAIN, 20));
        twoButton.addActionListener(this);
        twoButton.setBackground(Color.white);
        twoButton.setOpaque(true);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(200, 400, 70, 70);
        threeButton.setFont(new Font("arial", Font.PLAIN, 20));
        threeButton.addActionListener(this);
        threeButton.setBackground(Color.white);
        threeButton.setOpaque(true);
        jf.add(threeButton);

        divButton = new JButton("/");
        divButton.setBounds(290, 400, 170, 70);
        divButton.setFont(new Font("arial", Font.PLAIN, 30));
        divButton.addActionListener(this);
        divButton.setBackground(Color.YELLOW);
        divButton.setOpaque(true);
        jf.add(divButton);

        dotButton = new JButton(".");
        dotButton.setBounds(20, 500, 70, 70);
        dotButton.setFont(new Font("arial", Font.PLAIN, 50));
        dotButton.addActionListener(this);
        dotButton.setBackground(Color.white);
        dotButton.setOpaque(true);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(110, 500, 70, 70);
        zeroButton.setFont(new Font("arial", Font.PLAIN, 30));
        zeroButton.addActionListener(this);
        zeroButton.setBackground(Color.white);
        zeroButton.setOpaque(true);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(290, 500, 170, 70);
        equalButton.setFont(new Font("arial", Font.PLAIN, 30));
        equalButton.addActionListener(this);
        equalButton.setBackground(starkGreen);
        equalButton.setOpaque(true);
        jf.add(equalButton);

        clearButton = new JButton("C");
        clearButton.setBounds(200, 500, 70, 70);
        clearButton.setFont(new Font("sans-serif", Font.PLAIN, 25));
        clearButton.addActionListener(this);
        clearButton.setBackground(Color.RED);
        clearButton.setOpaque(true);
        jf.add(clearButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object btnSource = e.getSource(); //The getSource() method returns a reference to the object that generated or "fired" the event.
        if (btnSource == sevenButton) { // e.getSource() is a method belongs to the Object class. So only Object class' instance will here.
            if (isOparetoclicked == true) {
                displayLabel.setText("7");
                isOparetoclicked = false;
            } else {
                displayLabel.setText("7" + displayLabel.getText());
            }
        } else if (btnSource == eightButton) {
            if (isOparetoclicked == true) {
                displayLabel.setText("8");
                isOparetoclicked = false;
            } else {
                displayLabel.setText("8" + displayLabel.getText());
            }
        } else if (btnSource == nineButton) {
            if (isOparetoclicked == true) {
                displayLabel.setText("9");
                isOparetoclicked = false;
            } else {
                displayLabel.setText("9" + displayLabel.getText());
            }
        } else if (btnSource == plusButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            operation = 1;
        } else if (btnSource == minusButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            operation = 2;
        } else if (btnSource == fourButton) {
            if (isOparetoclicked) {
                displayLabel.setText("4");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (btnSource == fiveButton) {
            if (isOparetoclicked) {
                displayLabel.setText("5");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (btnSource == sixButton) {
            if (isOparetoclicked) {
                displayLabel.setText("6");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (btnSource == oneButton) {
            if (isOparetoclicked) {
                displayLabel.setText("1");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (btnSource == twoButton) {
            if (isOparetoclicked) {
                displayLabel.setText("2");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (btnSource == threeButton) {
            if (isOparetoclicked) {
                displayLabel.setText("3");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (btnSource == zeroButton) {
            if (isOparetoclicked) {
                displayLabel.setText("0");
                isOparetoclicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (btnSource == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (btnSource == mulButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            operation = 3;
        } else if (btnSource == divButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            operation = 4;
        } else if (btnSource == clearButton) {
            displayLabel.setText("");
        } else if (btnSource == equalButton) {
            
            //For the operations like {+,-,/,*}
            switch (operation) {
                case 1: {
                    newValue = oldValue + Double.parseDouble(displayLabel.getText());
                    if (Double.toString(newValue).endsWith(".0")) {
                        displayLabel.setText(Double.toString(newValue).replace(".0", ""));
                    } else {
                        displayLabel.setText(Double.toString(newValue));
                    }
                    break;
                }
                case 2: {
                    newValue = oldValue - Double.parseDouble(displayLabel.getText());
                    if (Double.toString(newValue).endsWith(".0")) {
                        displayLabel.setText(Double.toString(newValue).replace(".0", ""));
                    } else {
                        displayLabel.setText(Double.toString(newValue));
                    }
                    break;
                }
                case 3: {
                    newValue = oldValue * Double.parseDouble(displayLabel.getText());
                    if (Double.toString(newValue).endsWith(".0")) {
                        displayLabel.setText(Double.toString(newValue).replace(".0", ""));
                    } else {
                        displayLabel.setText(Double.toString(newValue));
                    }
                    break;
                }
                case 4: {
                    newValue = oldValue / Double.parseDouble(displayLabel.getText());
                    if (Double.toString(newValue).endsWith(".0")) {
                        displayLabel.setText(Double.toString(newValue).replace(".0", ""));
                    } else {
                        displayLabel.setText(Double.toString(newValue));
                    }
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + operation);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Calculator2......");
        //For the output of any Swing component,
        // we need to just create the object for the Constructor in Main()
        new Calculator2();
    }
}
