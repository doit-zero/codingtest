package godOfJava.array;


public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        int a = 0;
        while (a < 5) {
            System.out.println("Class No.: " + (a + 1));
            System.out.println("평균 키 : " + manageHeight.printAverage(a));
            a++;
        }

    }

    int[][] gradeHeights;

    public void setData(){
         gradeHeights = new int [5][];
         // 1반
        gradeHeights[0] = new int[] {170,180,173,175,177};
        // 2반
        gradeHeights[1] = new int[] {160,165,167,186};
        // 3반
        gradeHeights[2] = new int[] {158,177,187,186};
        // 4반
        gradeHeights[3] = new int[] {173,182,181};
        // 5반
        gradeHeights[4] = new int[] {170,180,165,177,172};
    }

    public void printHeight(int classNo){
        for(int a = 0; a < gradeHeights[classNo].length; a++){
            System.out.println(this.gradeHeights[classNo][a]);
        }
    }

    public double printAverage(int classNo) {
        double sum = 0;
        int num = gradeHeights[classNo].length;
        for(int a = 0; a < num; a++){
            sum += gradeHeights[classNo][a];
        }
        return sum/num;
    }
}
