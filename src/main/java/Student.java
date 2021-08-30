import java.util.Date;

public class Student {
    private String fullName;
    private Integer age;
    private Date dayOfBirth;
    private String major;

    public Student(String fullName, Integer age, Date dayOfBirth, String major) {
        this.fullName = fullName;
        this.age = age;
        this.dayOfBirth = dayOfBirth;
        this.major = major;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
