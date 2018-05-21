package lab_basic_intro;


import javax.swing.JOptionPane;

public class DriverLock
{
	public static void main (String[] args) {
		Lock myLock1 =  new Lock("123");		
		Lock myLock2 =   new Lock("234");
		Lock myLock3 = new Lock ("776");
	
		//Lock.setMasterCode("999");

        myLock1.enterCode("1233");
        myLock1.save ("file1.txt");
        myLock1.enterCode("123234234");
        myLock1.load("file1.txt");

        String s = JOptionPane.showInputDialog ("Enter String");

		myLock1.enterCode(s);
		myLock2.enterCode(s);

		Lock.setMasterCode("999");


		if (myLock1.isUnlock()) 
			System.out.println ("OPEN Lock 1!");
		else
			System.out.println ("Lock 1 is Locked!!!");


		if (myLock1 == myLock2)
			System.out.println ("Equal");

		if (myLock1.equals(myLock2))
			System.out.println ("Equal");

//		if (Lock.equals(myLock1,myLock2))
//			System.out.println ("Equal");
	}        
}

