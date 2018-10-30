package xiaoaiai.Mine;

import org.testng.annotations.Test;

import java.util.Date;

public class Test1 {
    @Test
    public void test1(){
        Date date=new Date();
        String month=String.format("%tb",date);
        String day=String.format("%te",date);
        String hour=String.format("%tH",date);
        String minute=String.format("%tM",date);
        String second=String.format("%tS",date);
        System.out.println(second);
    }

}
