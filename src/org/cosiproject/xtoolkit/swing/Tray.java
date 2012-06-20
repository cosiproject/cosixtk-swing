/* Tray.java is part of CosiXTK-Swing
 * created 18.11.2011 
 *
 *
 * Copyright (c) 2011, The Cosi Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the <organization> nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.  
 * 
 * @author lotherk
 *
 * 
 */
package org.cosiproject.xtoolkit.swing;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TrayIcon;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;

import org.apache.log4j.Logger;
import org.cosiproject.xtoolkit.Icon;

public class Tray extends Menu implements org.cosiproject.xtoolkit.Tray {

	private static Logger logger = Logger.getLogger(Tray.class);
	
	public Tray() {
		try {
			TrayIcon trayIcon = new TrayIcon(new Image() {
				
				@Override
				public int getWidth(ImageObserver arg0) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public ImageProducer getSource() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Object getProperty(String arg0, ImageObserver arg1) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getHeight(ImageObserver arg0) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public Graphics getGraphics() {
					// TODO Auto-generated method stub
					return null;
				}
			});
			//trayIcon.setPopupMenu(menu);
			java.awt.SystemTray.getSystemTray().add(trayIcon);
			setGUIContainer(trayIcon);
			//java.awt.SystemTray.getSystemTray().add(new java.awt.TrayIcon(java.awt.Toolkit.getDefaultToolkit().getImage("foo.png")));
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		((TrayIcon)getGUIContainer()).setImage(new ImageIcon(icon.getFile().getAbsolutePath()).getImage());
	}

	@Override
	public void setPopupMenu(org.cosiproject.xtoolkit.PopupMenu menu) {
		// TODO Auto-generated method stub
		//for(MenuItem item : menu.)
		
		((TrayIcon)getGUIContainer()).setPopupMenu((java.awt.PopupMenu)menu.getGUIContainer());
	}

	@Override
	public void setVisible(boolean b) {
		logger.debug("setVisible " + b);
		if(b) {
			try {
				java.awt.SystemTray.getSystemTray().add((TrayIcon)getGUIContainer());
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
				java.awt.SystemTray.getSystemTray().remove((TrayIcon)getGUIContainer());
		}
	}

	
}
