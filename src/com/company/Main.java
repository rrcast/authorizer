package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int lineBeggining = 0;
        int lineEnding=0;
        Account account = null;
        OutPut outPut = new OutPut();
        String temp;
        while(args.length>lineBeggining){
            List<String> violations= new ArrayList<>();
            violations.clear();
            outPut.setViolations(violations);
            //IF its account
        if (args[lineBeggining+1].equals("account:")){

            lineEnding= lineBeggining+9;

            if(account!=null){
                violations.add("account-already initialized");
            }
            else{
               temp = args[lineBeggining+4];
                temp=temp.replaceAll(",","");
                account=new Account(Boolean.parseBoolean(temp),Integer.parseInt(args[lineBeggining+6]));
            }



        }
        //IF it's Merchant
        else{
            lineEnding= lineBeggining+10;
            temp=args[lineBeggining+5];
            temp=temp.replaceAll(",","");

            if(Integer.parseInt(temp)<account.getAvailableLimit()){
                account.setAvailableLimit(account.getAvailableLimit()-Integer.parseInt(temp));

            }else{
                violations.add("Insufficient-Limit");
            }






        }
            outPut.setAccount(account);
            outPut.setViolations(violations);


            System.out.println(outPut);



            lineBeggining= lineEnding+1;
        }
        /*
        System.out.println("Printing Arguments ");
        int counter = 0;
        for (String arg: args ) {
            System.out.print(counter + " ");
            System.out.println(arg);
            counter ++;
        }
*/
    }
}
