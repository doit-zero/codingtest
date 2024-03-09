package Enum;

public enum Grade {
    FI_G(1,2023),
    SE_G(2,2022),
    TH_G(3,2021);

    private int grade;
    private int entranceYear;

    Grade(int grade, int entranceYear) {
        this.grade = grade;
        this.entranceYear = entranceYear;
    }

    public int getGrade() {
        return grade;
    }

    public int getEntranceYear() {
        return entranceYear;
    }
}
