/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij;

import ij.io.FileSaver;
import ij.io.SaveDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "ij.IssaugotiFaila"
)
@ActionRegistration(
        iconBase = "ij/save.png",
        displayName = "#CTL_IssaugotiFaila"
)
@ActionReference(path = "Toolbars/File", position = 350)
@Messages("CTL_IssaugotiFaila=IssaugotiFaila")
public final class IssaugotiFaila implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        FileSaver fs = new FileSaver(IJ.getImage());
        fs.saveAsBmp();
    }
}
