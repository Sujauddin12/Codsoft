package Codsoft.java;

import java.util.HashMap;
import java.util.Map;

public class AtmOpertionImp implements AtmOperationInter{
 ATMmachine atm = new ATMmachine();
 HashMap<Double,String> Mini=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is:"+atm.getBalance());
    }

    @Override
    public void withDrawAmount(double withdrawAmount) {
       Mini.put(withdrawAmount,"Amount Withdrawn");
      if(withdrawAmount<=atm.getBalance()){
          System.out.println("Collect the Cash "+withdrawAmount);
          atm.setBalance(atm.getBalance()-withdrawAmount);
          viewBalance();
       }
       else{
         System.out.println("Insufficient Amount !!");
       }
    }

    @Override
    public void depositAmount(double depositAmount) {
       Mini.put(depositAmount,"Amount Deposited");
       System.out.println(depositAmount+" Deposited Sucessfully !!");
       atm.setBalance(atm.getBalance()+depositAmount);
       viewBalance();
    }

    @Override
    public void viewMinistatement() {
       for(Map.Entry<Double,String> m: Mini.entrySet()){
          System.out.println(m.getKey()+""+m.getValue());
       }

    }
}
