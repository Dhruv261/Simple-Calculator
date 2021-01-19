import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
    private JPanel contentPane;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Calculator() {
        setTitle("Calculator");
        ImageIcon img = new ImageIcon("D:\\Java Workspace\\Calculator\\src\\C.png");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 275, 420);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setForeground(Color.YELLOW);
        setJMenuBar(menuBar);



        contentPane = new JPanel();
        contentPane.setBackground(Color.GRAY);
        contentPane.setForeground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setIconImage(img.getImage());
        setResizable(false);
        JButton btnNewButton = new JButton("=");
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setBounds(190, 310, 60, 60);
        contentPane.add(btnNewButton);
        btnNewButton.setFocusable(false);
        JButton btnNewButton_1 = new JButton("+");
        btnNewButton_1.setBackground(Color.PINK);
        btnNewButton_1.setBounds(190, 250, 60, 60);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.setFocusable(false);
        JButton btnNewButton_2 = new JButton("-");
        btnNewButton_2.setBackground(Color.PINK);
        btnNewButton_2.setBounds(190, 190, 60, 60);
        contentPane.add(btnNewButton_2);
        btnNewButton_2.setFocusable(false);
        JButton btnNewButton_3 = new JButton("x");
        btnNewButton_3.setBackground(Color.PINK);
        btnNewButton_3.setForeground(Color.BLACK);
        btnNewButton_3.setBounds(190, 130, 60, 60);
        contentPane.add(btnNewButton_3);
        btnNewButton_3.setFocusable(false);
        JButton btnNewButton_3_1 = new JButton("%");
        btnNewButton_3_1.setBackground(Color.PINK);
        btnNewButton_3_1.setBounds(130, 70, 60, 60);
        contentPane.add(btnNewButton_3_1);
        btnNewButton_3_1.setFocusable(false);
        JButton btnNewButton_3_2 = new JButton("6");
        btnNewButton_3_2.setBackground(Color.YELLOW);
        btnNewButton_3_2.setBounds(130, 190, 60, 60);
        contentPane.add(btnNewButton_3_2);
        btnNewButton_3_2.setFocusable(false);
        JButton btnNewButton_3_2_1 = new JButton("3");
        btnNewButton_3_2_1.setBackground(Color.YELLOW);

        btnNewButton_3_2_1.setBounds(130, 250, 60, 60);
        contentPane.add(btnNewButton_3_2_1);
        btnNewButton_3_2_1.setFocusable(false);
        JButton btnNewButton_3_2_2 = new JButton(".");
        btnNewButton_3_2_2.setBackground(Color.YELLOW);
        btnNewButton_3_2_2.setBounds(130, 310, 60, 60);
        contentPane.add(btnNewButton_3_2_2);
        btnNewButton_3_2_2.setFocusable(false);
        JButton btnNewButton_3_2_3 = new JButton("÷");
        btnNewButton_3_2_3.setBackground(Color.PINK);
        btnNewButton_3_2_3.setForeground(new Color(0, 0, 0));
        btnNewButton_3_2_3.setBounds(190, 70, 60, 60);
        contentPane.add(btnNewButton_3_2_3);
        btnNewButton_3_2_3.setFocusable(false);
        JButton btnNewButton_3_1_1 = new JButton("9");
        btnNewButton_3_1_1.setBackground(Color.YELLOW);
        btnNewButton_3_1_1.setBounds(130, 130, 60, 60);
        contentPane.add(btnNewButton_3_1_1);
        btnNewButton_3_1_1.setFocusable(false);
        JButton btnNewButton_3_1_2 = new JButton("D");
        btnNewButton_3_1_2.setBackground(Color.PINK);
        btnNewButton_3_1_2.setBounds(70, 70, 60, 60);
        contentPane.add(btnNewButton_3_1_2);
        btnNewButton_3_1_2.setFocusable(false);
        JButton btnNewButton_3_1_3 = new JButton("8");
        btnNewButton_3_1_3.setBackground(Color.YELLOW);
        btnNewButton_3_1_3.setBounds(70, 130, 60, 60);
        contentPane.add(btnNewButton_3_1_3);
        btnNewButton_3_1_3.setFocusable(false);
        JButton btnNewButton_3_1_4 = new JButton("5");
        btnNewButton_3_1_4.setBackground(Color.YELLOW);
        btnNewButton_3_1_4.setBounds(70, 190, 60, 60);
        contentPane.add(btnNewButton_3_1_4);
        btnNewButton_3_1_4.setFocusable(false);
        JButton btnNewButton_3_1_5 = new JButton("2");
        btnNewButton_3_1_5.setBackground(Color.YELLOW);
        btnNewButton_3_1_5.setBounds(70, 250, 60, 60);
        contentPane.add(btnNewButton_3_1_5);
        btnNewButton_3_1_5.setFocusable(false);
        JButton btnNewButton_3_1_6 = new JButton("0");
        btnNewButton_3_1_6.setBackground(Color.YELLOW);
        btnNewButton_3_1_6.setBounds(70, 310, 60, 60);
        contentPane.add(btnNewButton_3_1_6);
        btnNewButton_3_1_6.setFocusable(false);
        JButton btnNewButton_3_1_2_1 = new JButton("C");
        btnNewButton_3_1_2_1.setBackground(Color.PINK);
        btnNewButton_3_1_2_1.setBounds(10, 70, 60, 60);
        contentPane.add(btnNewButton_3_1_2_1);
        btnNewButton_3_1_2_1.setFocusable(false);
        JButton btnNewButton_3_1_2_2 = new JButton("7");
        btnNewButton_3_1_2_2.setBackground(Color.YELLOW);
        btnNewButton_3_1_2_2.setBounds(10, 130, 60, 60);
        contentPane.add(btnNewButton_3_1_2_2);
        btnNewButton_3_1_2_2.setFocusable(false);
        JButton btnNewButton_3_1_2_3 = new JButton("4");
        btnNewButton_3_1_2_3.setBackground(Color.YELLOW);
        btnNewButton_3_1_2_3.setBounds(10, 190, 60, 60);
        contentPane.add(btnNewButton_3_1_2_3);
        btnNewButton_3_1_2_3.setFocusable(false);
        JButton btnNewButton_3_1_2_4 = new JButton("1");
        btnNewButton_3_1_2_4.setBackground(Color.YELLOW);
        btnNewButton_3_1_2_4.setBounds(10, 250, 60, 60);
        contentPane.add(btnNewButton_3_1_2_4);
        btnNewButton_3_1_2_4.setFocusable(false);
        JButton btnNewButton_3_1_2_5 = new JButton("00");
        btnNewButton_3_1_2_5.setBackground(Color.YELLOW);
        btnNewButton_3_1_2_5.setBounds(10, 310, 60, 60);
        contentPane.add(btnNewButton_3_1_2_5);
        btnNewButton_3_1_2_5.setFocusable(false);
        JTextArea textArea = new JTextArea();
        textArea.setWrapStyleWord(true);
        textArea.setBounds(10, 10, 240, 50);

        textArea.setEditable(false);
        contentPane.add(textArea);
        btnNewButton_3_1_2_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("1");
            }
        });
        btnNewButton_3_1_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("2");
            }
        });

        btnNewButton_3_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("3");
            }
        });

        btnNewButton_3_1_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("4");
            }
        });
        btnNewButton_3_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("5");
            }
        });
        btnNewButton_3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("6");
            }
        });
        btnNewButton_3_1_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("7");
            }
        });
        btnNewButton_3_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("8");
            }
        });
        btnNewButton_3_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("9");
            }
        });
        btnNewButton_3_1_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("0");
            }
        });
        btnNewButton_3_1_2_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("00");
            }
        });
        btnNewButton_3_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(".");
            }
        });
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("+");
            }
        });
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("-");
            }
        });
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("*");
            }
        });
        btnNewButton_3_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("/");
            }
        });
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("%");
            }
        });
        btnNewButton_3_1_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        btnNewButton_3_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numberOfCharsToRemove = 1;
                String current = textArea.getText();
                String currentMinus = current.substring(0,current.length()-numberOfCharsToRemove);
                textArea.setText(currentMinus);
            }
        });

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = textArea.getText();
                String[] splitStrings = (str.split("((?<=[+-/*])|(?=[+-/*]))"));
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine eng= mgr.getEngineByName("JavaScript");
                String result="";
                for (int i = 0; i < splitStrings.length; i++) {
                    result += splitStrings[i];
                }
                try {
                    textArea.append('\n'+""+eng.eval(result));
                } catch (ScriptException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}
