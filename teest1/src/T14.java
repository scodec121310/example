import java.util.*;
import java.util.HashSet;

import javax.swing.*;
public class T14 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		while(true){
			String s = JOptionPane.showInputDialog("���s,�п�Jword");
			if(hs.add(s)==false){
				JOptionPane.showMessageDialog(null, "word duplicated");
				break;
			}
		}
		System.out.println(hs.toString());
		
		
	}
}
