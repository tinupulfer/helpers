import javax.swing.JOptionPane;

import org.mpu.helper.UniversalTools;


public class PasswordMD5Generator {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Neues Passwort eingeben");
		
		if (input != null && !input.isEmpty()){
			String md = UniversalTools.getMessageDigestValue(input);
			JOptionPane.showInputDialog("Generierte PW-MD:", md);
		}
		
	}

}

