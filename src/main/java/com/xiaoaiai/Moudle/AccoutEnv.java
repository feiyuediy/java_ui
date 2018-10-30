package com.xiaoaiai.Moudle;

import java.util.List;

public class AccoutEnv {
    private List<Account> test;
    private List<Account> gama;
    private List<Account> prod;

    public List<Account> getProd() {
        return prod;
    }

    public void setProd(List<Account> prod) {
        this.prod = prod;
    }

    public List<Account> getTest() {
        return test;
    }

    public void setTest(List<Account> test) {
        this.test = test;
    }

    public List<Account> getGama() {
        return gama;
    }

    public void setGama(List<Account> gama) {
        this.gama = gama;
    }


}
