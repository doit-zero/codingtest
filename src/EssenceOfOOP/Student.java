package EssenceOfOOP;

import java.util.Objects;

public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // 동일한 참조인 경우 true 반환
        if (obj == null || getClass() != obj.getClass()) return false;  // 타입이 다르거나 null인 경우 false 반환
        Student student = (Student) obj;  // 타입이 같은 경우 캐스팅
        return Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name);  // 내용을 비교하여 true 또는 false 반환
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId,name);
    }
}
