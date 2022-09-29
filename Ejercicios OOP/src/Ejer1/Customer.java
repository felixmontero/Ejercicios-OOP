package Ejer1;

import javax.swing.*;

public class Customer {

    private String name;
    private boolean  member =false;
    private String membertype;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public String getName() {
        return name;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "customer"+ " " + this.name+ " " + this.membertype;
    }

    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
        this.setMember(true);
    }
}
