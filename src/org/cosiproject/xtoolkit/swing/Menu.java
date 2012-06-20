/* Menu.java is part of CosiXTK-Swing
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

import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;

import org.cosiproject.xtoolkit.Icon;

public class Menu implements org.cosiproject.xtoolkit.Menu {
	private Icon icon;
	private String text;
	private boolean visible = false;
	private Object guiContainer;
	private String toolTip;
	
	private List<org.cosiproject.xtoolkit.PopupMenu> listPopupMenus = new ArrayList<org.cosiproject.xtoolkit.PopupMenu>();
	private List<org.cosiproject.xtoolkit.MenuItem> listMenuItems = new ArrayList<org.cosiproject.xtoolkit.MenuItem>();
	
	
	public Menu() {
		setGUIContainer(new JMenu());
	}
	@Override
	public void add(org.cosiproject.xtoolkit.PopupMenu menu) {
		// TODO Auto-generated method stub
		listPopupMenus.add(menu);
		((JMenu)getGUIContainer()).add((javax.swing.JPopupMenu)menu.getGUIContainer());
	}

	@Override
	public void add(org.cosiproject.xtoolkit.Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(org.cosiproject.xtoolkit.MenuItem menuItem) {
		// TODO Auto-generated method stub
		listMenuItems.add(menuItem);
		((JMenu)getGUIContainer()).add((javax.swing.JMenuItem)menuItem.getGUIContainer());
	}

	@Override
	public void remove(org.cosiproject.xtoolkit.PopupMenu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(org.cosiproject.xtoolkit.Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(org.cosiproject.xtoolkit.MenuItem menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	@Override
	public Icon getIcon() {
		return icon;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setVisible(boolean b) {
		this.visible = b;
	}

	@Override
	public boolean isVisible() {
		return visible;
	}

	@Override
	public Object getGUIContainer() {
		if(guiContainer == null)
			setGUIContainer(new JMenu());
		return guiContainer;
	}

	@Override
	public void setGUIContainer(Object container) {
		guiContainer = container;
	}

	@Override
	public void setToolTip(String text) {
		this.toolTip = text;
	}

	@Override
	public String getToolTip() {
		return toolTip;
	}

}
