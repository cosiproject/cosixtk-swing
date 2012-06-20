/* GridBagLayout.java is part of CosiXTK-Swing
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


public class GridBagLayout extends Layout implements org.cosiproject.xtoolkit.GridBagLayout {
	public int[] columnWidths = null;
	public int[] rowHeights = null;
	public double[] columnWeights = null;
	public double[] rowWeights = null;
	
	public GridBagLayout() {
		setGUIContainer(new java.awt.GridBagLayout());
		((java.awt.GridBagLayout)getGUIContainer()).columnWeights = columnWeights;
		((java.awt.GridBagLayout)getGUIContainer()).rowHeights = rowHeights;
		((java.awt.GridBagLayout)getGUIContainer()).columnWidths = columnWidths;
		((java.awt.GridBagLayout)getGUIContainer()).rowWeights = rowWeights;
	}
	@Override
	public int[] getColumnWidths() {
		// TODO Auto-generated method stub
		return columnWidths;
	}
	@Override
	public void setColumnWidths(int[] columnWidths) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int[] getRowHeights() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setRowHeights(int[] rowHeights) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double[] getColumnWeights() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setColumnWeights(double[] columnWeights) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double[] getRowWeights() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setRowWeights(double[] rowWeights) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
