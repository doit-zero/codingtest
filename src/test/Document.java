package test;

import java.util.HashMap;
import java.util.Map;

public class Document {
    static int count = 0;
    String name;

    public Document() {
        this.name = "제목없음" + ++count;
    }

    public Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }

    public static void main(String[] args){
        Document document1 = new Document();
        Document document2 = new Document("테스트");
        Document document3 = new Document();

        System.out.println(document1.name);
        System.out.println(document2.name);
        System.out.println(document3.name);
    }

    Map<String,String> stringMap = new HashMap<>();
}
