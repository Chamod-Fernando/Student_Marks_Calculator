import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JLabel Student_marks_calculation;
    private JTextField name;
    private JButton calculateButton;
    private JTextField sub1;
    private JTextField sub2;
    private JTextField sub3;
    private JTextField total;
    private JTextField avg;
    private JTextField grade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


            int m1,m2,m3,tol;
            double av;

            m1 = Integer.parseInt(sub1.getText());
            m2 = Integer.parseInt(sub2.getText());
            m3 = Integer.parseInt(sub3.getText());

            tol = m1+m2+m3;

            total.setText(String.valueOf(tol));

            av = tol/3;

            avg.setText(String.valueOf(av));

            if(av>=50)
            {
                grade.setText("Pass");
            }
            else
            {
                grade.setText("Fail");
            }
        }
    });
}
}
