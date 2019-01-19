/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij;

import ij.io.Opener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "ij.AtidarytiFaila"
)
@ActionRegistration(
        iconBase = "ij/open.png",
        displayName = "#CTL_AtidarytiFaila"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_AtidarytiFaila=AtidarytiFaila")
public final class AtidarytiFaila implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       //String[] args = {"-run", "Open..."};
       //ImageJ.main(args);
       Opener op = new Opener();
       op.open();
    }
}
