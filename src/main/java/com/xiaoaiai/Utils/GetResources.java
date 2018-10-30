package com.xiaoaiai.Utils;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.AccoutEnv;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GetResources {
    public static void main(String[] mian) throws FileNotFoundException {
        Account account = getAccout("gama","g","y");
        System.out.println(account.getAcc());
    }

    public static Account getAccout(String evn, String sex, String isvip) throws FileNotFoundException {
        Account account = null;
        AccoutEnv accoutEnv = new Yaml().loadAs(new FileInputStream("C:\\Users\\admin\\Downloads\\sample-java-master\\sample-java-master\\src\\main\\java\\resources\\Account.yaml"),AccoutEnv.class);
        if (evn.equals("test")){
            for (Account account1 : accoutEnv.getTest()){
                if (account1.getSex().equals(sex) && account1.getIsvip().equals(isvip)){
                    account = account1;
                }
            }
        }else if (evn.equals("gama")){
            for (Account account1 : accoutEnv.getGama()){
                if (account1.getSex().equals(sex) && account1.getIsvip().equals(isvip)){
                    account = account1;
                }
            }
        }else {
            for (Account account1 : accoutEnv.getProd()) {
                if (account1.getSex().equals(sex) && account1.getIsvip().equals(isvip)) {
                    account = account1;
                }
            }
        }
        return account;
    }
}
