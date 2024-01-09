package generic;

public class GenericSample {
    public static void main(String[] args){
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();

    }

    public void checkCastingDTO() {
        CastingDTO<String> dto1 = new CastingDTO<String>();
        dto1.setObject(new String());

        CastingDTO<StringBuffer> dto2 = new CastingDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingDTO<StringBuilder> dto3 = new CastingDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());
    }
}
