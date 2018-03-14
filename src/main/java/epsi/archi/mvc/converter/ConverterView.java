package epsi.archi.mvc.converter;

import epsi.archi.mvc.Model;
import epsi.archi.mvc.util.Observable;
import epsi.archi.mvc.util.Observer;

import javax.swing.*;
import java.awt.*;

import static epsi.archi.mvc.util.GridBagContraintsUtil.*;

public class ConverterView {

    private JTextField amount;
    private JButton convert;
    private JCheckBox customToggle;

    // Conversion display
    private JLabel usd;
    private JLabel gbp;
    private JLabel jpy;
    private JLabel chf;

    // Custom panel
    private JPanel customPanel;
    private JTextField customRate;
    private JLabel customAmount;

    private ConverterController controller;

    public ConverterView(Model model) {
        buildIHM();

    }

    public JTextField getAmount() {
        return amount;
    }

    public JButton getConvert() {
        return convert;
    }

    public JCheckBox getCustomToggle() {
        return customToggle;
    }

    private void buildIHM() {
        JFrame frame = new JFrame("Money converter");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(buildMainPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel buildAmountPanel() {
        final JPanel amountPanel = new JPanel();
        amountPanel.setLayout(new GridBagLayout());
        amountPanel.add(new JLabel("Amount"), gridBagConstraints(0, 0, 0, 0, GridBagConstraints.NONE));
        amount = new JTextField();
        amount.setColumns(5);
        amountPanel.add(amount, gridBagConstraints(1, 0, 1, 0, GridBagConstraints.HORIZONTAL));
        convert = new JButton("Convert");
        amountPanel.add(convert, gridBagConstraints(2, 0, 0, 0));
        customToggle = new JCheckBox("Custom");
        amountPanel.add(customToggle, gridBagConstraints(3, 0, 0, 0));
        return amountPanel;
    }

    private JPanel buildConversionPanel() {
        final JPanel conversionPanel = new JPanel();
        conversionPanel.setLayout(new GridBagLayout());
        conversionPanel.setBorder(BorderFactory.createTitledBorder("Conversion"));


        conversionPanel.add(new JLabel("USD"), gridBagConstraints(0, 0, 0, 0));
        conversionPanel.add(new JPanel(), gridBagConstraints(1, 0, 0, 0));
        usd = new JLabel();
        conversionPanel.add(usd, gridBagConstraints(2, 0, 1, 0, GridBagConstraints.HORIZONTAL));

        conversionPanel.add(new JLabel("GBP"), gridBagConstraints(0, 1, 0, 0));
        conversionPanel.add(new JPanel(), gridBagConstraints(1, 1, 0, 0));
        gbp = new JLabel();
        conversionPanel.add(gbp, gridBagConstraints(2, 1, 1, 0, GridBagConstraints.HORIZONTAL));

        conversionPanel.add(new JLabel("JPY"), gridBagConstraints(0, 2, 0, 0));
        conversionPanel.add(new JPanel(), gridBagConstraints(1, 2, 0, 0));
        jpy = new JLabel();
        conversionPanel.add(jpy, gridBagConstraints(2, 2, 1, 0, GridBagConstraints.HORIZONTAL));

        conversionPanel.add(new JLabel("CHF"), gridBagConstraints(0, 3, 0, 0));
        conversionPanel.add(new JPanel(), gridBagConstraints(1, 3, 0, 0));
        chf = new JLabel();
        conversionPanel.add(chf, gridBagConstraints(2, 3, 1, 0, GridBagConstraints.HORIZONTAL));
        return conversionPanel;
    }

    private JPanel buildCustomPanel() {
        customPanel = new JPanel();
        customPanel.setLayout(new GridBagLayout());
        customPanel.setBorder(BorderFactory.createTitledBorder("Custom"));
        customPanel.setVisible(false);

        customPanel.add(new JLabel("Change rate"), gridBagConstraints(0, 0, 0, 0));
        customRate = new JTextField("1.0");
        customPanel.add(customRate, gridBagConstraints(1, 0, 0.4, 0, GridBagConstraints.HORIZONTAL));
        customAmount = new JLabel();
        customPanel.add(customAmount, gridBagConstraints(2,0, 0.6, 0));
        return customPanel;
    }

    private  JPanel buildFooterPanel() {
        final JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new GridBagLayout());

        final JLabel label = new JLabel("MVC Converter EPSI");
        label.setFont(new Font("Italic", Font.ITALIC, 9));
        footerPanel.add(label, gridBagConstraints(0, 0, 0, 0));
        return footerPanel;
    }

    private Container buildMainPanel() {
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(buildAmountPanel(), gridBagConstraints(0, 0, 1.0, 0, GridBagConstraints.BOTH));
        mainPanel.add(buildConversionPanel(), gridBagConstraints(0, 1, 1.0, 0.5, GridBagConstraints.BOTH));
        mainPanel.add(buildCustomPanel(), gridBagConstraints(0, 2, 1.0, 0.5, GridBagConstraints.BOTH));
        mainPanel.add(buildFooterPanel(), gridBagConstraints(0, 3, 1.0, 0.0, GridBagConstraints.BOTH));

        return mainPanel;
    }
}
