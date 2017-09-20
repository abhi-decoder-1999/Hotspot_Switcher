/*
 * Copyright (C) 2017 Argha Das
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package coolsd.lab.Service;

import coolsd.lab.UI.*;

/**
 *
 * @author Argha Das
 */
public class MenuItemServices {

    private ConfigurationUI configWindow;
    private UpdateUI updateWindow;
    private MainFrame mainFrame;
    private AboutUI aboutWindow;
    private ExitUI exitUI;

    public MenuItemServices() {
        exitUI = new ExitUI();
        aboutWindow = new AboutUI(mainFrame, true);
        configWindow = new ConfigurationUI(mainFrame, true);
        updateWindow = new UpdateUI(mainFrame, true);
    }

    public void showConfigDialog() {
        configWindow.show();
    }

    public void showConfirmDialog() {
        exitUI.showUI();
    }

    public void showUpdateDialog() {
        updateWindow.show();
    }

    public void showAboutDialog() {
        aboutWindow.show();
    }
}
