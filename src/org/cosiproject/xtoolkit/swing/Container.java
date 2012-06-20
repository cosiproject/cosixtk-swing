/* Container.java is part of CosiXTK-Swing
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

import java.awt.LayoutManager2;

import org.cosiproject.xtoolkit.Rectangle;


public class Container extends org.cosiproject.xtoolkit.Container {
	

	


	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return ((java.awt.Container)getGUIContainer()).isVisible();
	}

	@Override
	public void setVisible(boolean bool) {
		// TODO Auto-generated method stub
		((java.awt.Container)getGUIContainer()).setVisible(bool);
	}

	@Override
	public void setBounds(Rectangle r) {
		// TODO Auto-generated method stub
		java.awt.Rectangle rect = new java.awt.Rectangle(r.getX(), r.getY(), r.getWidth(), r.getHeight());
		((java.awt.Container)getGUIContainer()).setBounds(rect);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		java.awt.Rectangle rect = ((java.awt.Container)getGUIContainer()).getBounds();
		Rectangle r = new Rectangle(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		return r;
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
		((java.awt.Container)getGUIContainer()).setBounds(x, y, width, height);
	}

	@Override
	public void add(org.cosiproject.xtoolkit.Component component, Object constrains) {
		// TODO Auto-generated method stub
		((java.awt.Container)getGUIContainer()).add((java.awt.Container)component.getGUIContainer(), constrains);
	}

	@Override
	public void add(org.cosiproject.xtoolkit.Component component) {
		// TODO Auto-generated method stub

		((java.awt.Container)getGUIContainer()).add((java.awt.Container)component.getGUIContainer());
	}

	@Override
	public org.cosiproject.xtoolkit.Layout getLayout() {
		// TODO Auto-generated method stub
		return super.getLayout();
	}

	@Override
	public void setLayout(org.cosiproject.xtoolkit.Layout layout) {
		// TODO Auto-generated method stub
		super.setLayout(layout);
		
	}

	@Override
	public void setBackground(org.cosiproject.xtoolkit.Color color) {
		// TODO Auto-generated method stub
		super.setBackground(color);
		java.awt.Color awtColor = new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
		((java.awt.Container)getGUIContainer()).setBackground(awtColor);
	}

	@Override
	public void setForeground(org.cosiproject.xtoolkit.Color color) {
		// TODO Auto-generated method stub
		super.setForeground(color);
		java.awt.Color awtColor = new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
		((java.awt.Container)getGUIContainer()).setForeground(awtColor);
	}

	@Override
	public org.cosiproject.xtoolkit.Color getBackground() {
		// TODO Auto-generated method stub
		return super.getBackground();
	}

	@Override
	public org.cosiproject.xtoolkit.Color getForeground() {
		// TODO Auto-generated method stub
		return super.getForeground();
	}

	@Override
	public void updateUI() {
		// TODO Auto-generated method stub
		super.updateUI();
	}

	
	
	
}
