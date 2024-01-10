package String;

public class StringSample {
    public static void main(String[] args){
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert() {
        try {
            String korea = "한글";
            byte[] array = korea.getBytes();
            for(int i = 0; i < array.length; i++)
                System.out.print(array[i]+ " ");
            System.out.println();
            String arrayToString = new String(array);
            System.out.println(arrayToString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
