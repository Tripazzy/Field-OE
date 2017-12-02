//TODO Complete the Major Window

/**
 * This class creates a window which will be used by the host.
 * This is not a window inside Field!
 */

package main.tools;

import javax.swing.JFrame;

public class MajWin {
	public JFrame frame = new JFrame();
	public boolean visible = false;
	public boolean exists = true;
	public void run() {
		while (exists) {
			//Check the visibility
			//Don't know why you would want to hide the window though...
			frame.setVisible(visible);
		}
		frame.dispose();
	}
	public MajWin() {
		run();
	}
	public MajWin(int x, int y) {
		
	}
	public void setSize(int x, int y) {
		
	}
	public void setVisible(boolean vsblty) {
		visible = vsblty;
	}
	public void dispose() {
		exists = false;
	}
	public void refresh() {
		frame.setVisible(false);
		frame.setVisible(true);
	}
}
