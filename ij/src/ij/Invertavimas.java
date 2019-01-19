/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij;

import ij.gui.Roi;
import ij.process.ImageProcessor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Invertavimas",
        id = "ij.Invertavimas"
)
@ActionRegistration(
        iconBase = "ij/blur.png",
        displayName = "#CTL_Invertavimas"
)
@ActionReference(path = "Toolbars/File", position = 400)
@Messages("CTL_Invertavimas=Invertavimas")
public final class Invertavimas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ImageProcessor ip = IJ.getProcessor();
        ip.snapshot();
        ip.setRoi(IJ.getImage().getRoi());           
        ip.invert();
        ip.reset(ip.getMask());
        //ip.reset();
    }
}
