package epsi.archi.mvc.converter;

import epsi.archi.mvc.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConverterController {

    private Model model;
    private ConverterView view;

    public ConverterController(Model aModel, ConverterView aConverterView) {
        model = aModel;
        view = aConverterView;
        bind();
    }

    public void bind() {

    }
}
