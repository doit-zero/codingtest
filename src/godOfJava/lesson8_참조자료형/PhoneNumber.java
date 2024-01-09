package godOfJava.lesson8_참조자료형;

public class PhoneNumber {
    private String preNumber = "010";
    private String lNumber;
    private String phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String leftNumber) {
        this.lNumber = leftNumber;
        this.phoneNumber = preNumber + "-" + leftNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPreNumber(String preNumber) {
        this.preNumber = preNumber;
        this.phoneNumber = this.preNumber + "-" + this.lNumber;
    }
}
