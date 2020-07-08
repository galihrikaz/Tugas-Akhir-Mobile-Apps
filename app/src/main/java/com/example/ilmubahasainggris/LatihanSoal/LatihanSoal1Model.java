package com.example.ilmubahasainggris.LatihanSoal;

public class LatihanSoal1Model {

    private String pertanyaan,optionA,optionB,optionC,optionD,correctANS;

    public LatihanSoal1Model(String pertanyaan, String optionA, String optionB, String optionC, String optionD, String correctANS) {
        this.pertanyaan = pertanyaan;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctANS = correctANS;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getCorrectANS() {
        return correctANS;
    }

    public void setCorrectANS(String correctANS) {
        this.correctANS = correctANS;
    }
}
