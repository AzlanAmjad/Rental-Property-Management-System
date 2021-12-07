package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class ChangeFeesGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class ChangeFeesGUI extends JPanel {
    private Controller changeFeesListener;
    private Frontend view;

    public ChangeFeesGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }
}
