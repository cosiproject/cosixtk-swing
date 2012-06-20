/* PopupMenu.java is part of CosiXTK-Swing
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






public class PopupMenu extends Menu implements org.cosiproject.xtoolkit.PopupMenu {
	
	public PopupMenu() {
		setGUIContainer(new java.awt.PopupMenu());
	}

	@Override
	public void addSeparator() {
		// TODO Auto-generated method stub
		((java.awt.PopupMenu)getGUIContainer()).addSeparator();
		
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		((java.awt.PopupMenu)getGUIContainer()).setLabel(text);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return ((java.awt.PopupMenu)getGUIContainer()).getLabel();
	}

	@Override
	public void add(org.cosiproject.xtoolkit.MenuItem menuItem) {
		// TODO Auto-generated method stub
		((java.awt.PopupMenu)getGUIContainer()).add((java.awt.MenuItem)menuItem.getGUIContainer());
	}

	@Override
	public void remove(org.cosiproject.xtoolkit.MenuItem menuItem) {
		// TODO Auto-generated method stub
		((java.awt.PopupMenu)getGUIContainer()).remove((java.awt.MenuItem)menuItem.getGUIContainer());
	}

	

}
