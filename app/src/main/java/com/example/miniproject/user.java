package com.example.miniproject;

public class user {

    String mail,passwrd,name;
    int score;
    long number;;
    boolean t11,t12,t13,t21,t22,t23,t31,t32,t33;

    public user(String mail, String passwrd, String name, long number, int score, boolean t11, boolean t12, boolean t13, boolean t21, boolean t22, boolean t23, boolean t31, boolean t32, boolean t33) {
        this.mail = mail;
        this.passwrd = passwrd;
        this.name = name;
        this.number = number;
        this.score = score;
        this.t11 = t11;
        this.t12 = t12;
        this.t13 = t13;
        this.t21 = t21;
        this.t22 = t22;
        this.t23 = t23;
        this.t31 = t31;
        this.t32 = t32;
        this.t33 = t33;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isT11() {
        return t11;
    }

    public void setT11(boolean t11) {
        this.t11 = t11;
    }

    public boolean isT12() {
        return t12;
    }

    public void setT12(boolean t12) {
        this.t12 = t12;
    }

    public boolean isT13() {
        return t13;
    }

    public void setT13(boolean t13) {
        this.t13 = t13;
    }

    public boolean isT21() {
        return t21;
    }

    public void setT21(boolean t21) {
        this.t21 = t21;
    }

    public boolean isT22() {
        return t22;
    }

    public void setT22(boolean t22) {
        this.t22 = t22;
    }

    public boolean isT23() {
        return t23;
    }

    public void setT23(boolean t23) {
        this.t23 = t23;
    }

    public boolean isT31() {
        return t31;
    }

    public void setT31(boolean t31) {
        this.t31 = t31;
    }

    public boolean isT32() {
        return t32;
    }

    public void setT32(boolean t32) {
        this.t32 = t32;
    }

    public boolean isT33() {
        return t33;
    }

    public void setT33(boolean t33) {
        this.t33 = t33;
    }
}