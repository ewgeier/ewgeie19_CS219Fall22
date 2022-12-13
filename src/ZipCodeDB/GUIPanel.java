package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class
public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;
    private JButton Northernmost;

    private Database db; // The zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);
        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());
        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.Northernmost = new JButton("Northernmost");
        this.add(this.Northernmost);
        this.Northernmost.addActionListener(new NorthernmostButtonListener());
        this.db = new Database(); // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // this function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();
            output.setText(code);

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }

    class NorthernmostButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // this function will get called when the user presses Northernmost
            Zipcode zc = db.getNorthern();
            output.setText(zc.toString());
            System.out.println(zc);

        }
    }

}
