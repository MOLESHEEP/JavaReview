import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Variable variable = new Variable("/Users/jiawen.yan/mall/JavaReview/files/IOtestFile.txt");
        //variable.defineVariable();
        //variable.IOoperation();
        //variable.defineTuples();
        //variable.equalAndequalMark();
        try {
            variable.IoTest();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}