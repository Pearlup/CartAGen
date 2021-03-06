package fr.ign.cogit.cartagen.appli.core.themes;

import java.awt.Color;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JMenu;

import fr.ign.cogit.geoxygene.appli.plugin.cartagen.themes.DataThemesGUIComponent;
import fr.ign.cogit.geoxygene.appli.plugin.cartagen.themes.LandUseMenu;

public class LandUseMenuCogitComplement extends JMenu {

  /**
   * 
   */
  private static final long serialVersionUID = 6811865464668228808L;

  @SuppressWarnings("unused")
  private Logger logger = Logger.getLogger(LandUseMenu.class.getName());

  private JLabel lblCogit = new JLabel("          COGIT");

  private JLabel mDefault = new JLabel("        empty menu        ");

  public LandUseMenuCogitComplement() {

    LandUseMenu menu = DataThemesGUIComponent.getInstance().getLandUseMenu();

    menu.addSeparator();
    menu.addSeparator();

    this.lblCogit.setForeground(Color.RED);
    menu.add(this.lblCogit);

    menu.addSeparator();
    menu.addSeparator();

    menu.add(this.mDefault);

  }

}
