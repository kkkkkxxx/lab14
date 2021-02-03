package lab14;
import java.awt.*;
import java.awt.event.*;

public class SumCalc extends Frame {
    SumCalc(){
        setTitle("Sum of two digits");
        setLayout(null);

        Label labelA = new Label("a");
        Label labelB = new Label("b");
        Label labelSum = new Label("sum");

        labelA.setBounds(25, 55, 30, 20);
        labelB.setBounds(25, 85, 30, 20);
        labelSum.setBounds(25, 115, 30, 20);

        TextField a = new TextField();
        TextField b = new TextField();
        TextField sum = new TextField();

        a.setBounds(65, 55, 50, 20);
        b.setBounds(65, 85, 50, 20);
        sum.setBounds(65, 115, 50, 20);

        Button calc = new Button("Calculate");
        Button clear = new Button("Clear");

        calc.setBounds(40, 140, 70, 30);
        clear.setBounds(40, 170, 70, 30);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aNum = Double.parseDouble(a.getText());
                double bNum = Double.parseDouble(b.getText());
                sum.setText(Double.toString(aNum + bNum));
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                sum.setText("");
            }
        });

        add(calc);
        add(clear);
        add(a);
        add(b);
        add(sum);
        add(labelA);
        add(labelB);
        add(labelSum);

        setSize(200, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SumCalc simpleCalc = new SumCalc();
    }
}
