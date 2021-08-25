package com.company;

import java.util.List;

public class OutPut {
    private Account account;
    private List<String> violations;


    public OutPut(Account account, List<String> violations) {
        this.account = account;
        this.violations = violations;
    }

    public OutPut() {

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<String> getViolations() {
        return violations;
    }

    public void setViolations(List<String> violations) {
        this.violations = violations;
    }

    @Override
    public String toString() {
        return "OutPut{" +
                "account=" + account +
                ", violations=" + violations +
                '}';
    }
}
