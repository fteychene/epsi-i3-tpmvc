package epsi.archi.mvc.rate;

import epsi.archi.mvc.Model;

import javax.swing.*;
import java.awt.*;

import static epsi.archi.mvc.util.GridBagContraintsUtil.*;

public class RateView {

    private JTextField usdChange;
    private JTextField gbpChange;
    private JTextField jpyChange;
    private JTextField chfChange;
    private JButton changeRate;

    public RateView(Model aModel) {
        buildIHM();
    }

    protected void buildIHM() {
        JFrame frame = new JFrame("Rate manager");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(buildInternal());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    protected Container buildInternal() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        mainPanel.add(new JLabel("USD"), gridBagConstraints(0, 0, 0, 0));
        usdChange = new JTextField();
        usdChange.setColumns(8);
        mainPanel.add(usdChange, gridBagConstraints(1,0 ,1, 0, GridBagConstraints.HORIZONTAL));

        mainPanel.add(new JLabel("GBP"), gridBagConstraints(0, 1, 0, 0));
        gbpChange = new JTextField();
        gbpChange.setColumns(8);
        mainPanel.add(gbpChange, gridBagConstraints(1, 1, 1, 0, GridBagConstraints.HORIZONTAL));

        mainPanel.add(new JLabel("JPY"), gridBagConstraints(0, 2, 0, 0));
        jpyChange = new JTextField();
        jpyChange.setColumns(8);
        mainPanel.add(jpyChange, gridBagConstraints(1, 2 ,1, 0, GridBagConstraints.HORIZONTAL));

        mainPanel.add(new JLabel("CHF"), gridBagConstraints(0, 3, 0, 0));
        chfChange = new JTextField();
        chfChange.setColumns(8);
        mainPanel.add(chfChange, gridBagConstraints(1, 3, 1, 0, GridBagConstraints.HORIZONTAL));
        
        mainPanel.add(new JPanel(), gridBagConstraints(1, 4, 0, 0));
        changeRate = new JButton("Change rate");
        mainPanel.add(changeRate, gridBagConstraints(1, 4, 0, 0));

        return mainPanel;
    }
}
