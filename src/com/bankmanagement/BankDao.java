package com.bankmanagement;

import java.io.*;
import java.util.*;

public class BankDao {

	@SuppressWarnings("unchecked")
	public List<Bank> getAllBanks(){
		
		System.out.println("Get all banks");
	      List<Bank> bankList = null;
	      try {
	         File file = new File("/home/sasuke/Banks.dat");
	         if (!file.exists()) {
	            Bank bank = new Bank(1, 1001, "HDFC", "Branch", "Bangalore", "Bangalore", "Karnataka", "Indiranagar", "HDFC0009999");
	            bankList = new ArrayList<>();
	            bankList.add(bank);
	            saveUserList(bankList);		
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            bankList = (List<Bank>) ois.readObject();
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }		
	      return bankList;
	   }

	   private void saveUserList(List<Bank> bankList){
		   
		   System.out.println("save user list");
	      try {
	         File file = new File("/home/sasuke/Banks.dat");
	         FileOutputStream fos;

	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);
	         oos.writeObject(bankList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
}
