/* Test.java is part of CosiXTK-Swing
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
package org.cosiproject.xtoolkit.swing.test;

import org.cosiproject.xtoolkit.BorderLayout;
import org.cosiproject.xtoolkit.Color;
import org.cosiproject.xtoolkit.Frame;
import org.cosiproject.xtoolkit.Label;
import org.cosiproject.xtoolkit.Panel;
import org.cosiproject.xtoolkit.TKProvider;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       
	       
		TKProvider.main(null);
		Frame frame = (Frame) TKProvider.newInstance("Frame");
		frame.setTitle("Test Title");
		frame.setLayout(TKProvider.getLayout("BorderLayout"));
		Panel panel = (Panel) TKProvider.newPanel();
		panel.setLayout(TKProvider.getLayout("BorderLayout"));
		panel.setBackground(Color.RED);
		Label label = TKProvider.newLabel("Foo");
		panel.add(label, BorderLayout.CENTER);
		panel.updateUI();
		frame.add(panel, BorderLayout.EAST);
		frame.setVisible(true);
		
	}

}
