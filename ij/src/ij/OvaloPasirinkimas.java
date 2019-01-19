/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "ij.OvaloPasirinkimas"
)
@ActionRegistration(
        iconBase = "ij/software_selection_oval-512.png",
        displayName = "#CTL_OvaloPasirinkimas"
)
@ActionReference(path = "Toolbars/File", position = 400)
@Messages("CTL_OvaloPasirinkimas=OvaloPasirinkimas")
public final class OvaloPasirinkimas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //IJ.runPlugIn(IJ.getImage(), "Binary", "");
        IJ.makeOval(50, 50, 100, 100);
    }
}
