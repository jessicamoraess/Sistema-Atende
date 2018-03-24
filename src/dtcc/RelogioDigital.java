/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RelogioDigital extends JFrame implements ActionListener {

    JLabel timeLabel = new JLabel();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Timer timer;

    public RelogioDigital() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeLabel.setText(sdf.format(new Date(System.currentTimeMillis())));
        timeLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        timer = new Timer(500, this);
        timer.setRepeats(true);
        timer.start();
        this.add(timeLabel);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            timeLabel.setText(sdf.format(new Date(System.currentTimeMillis())));
        }
    }

    public void run() {
        new RelogioDigital();
    }
;

}
