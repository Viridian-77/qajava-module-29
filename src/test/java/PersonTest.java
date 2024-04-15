import org.testng.annotations.*;
import org.testng.Assert;

public class PersonTest {
    @DataProvider(name = "ageDataProvider")
    Object[][] dataProvider() {
        return new Object[][] {
                {-1, false}, //1
                {0, false}, //2
                {1, false}, //3
                {10, false}, //4
                {11, false}, //5
                {12, false}, //6
                {13, true}, //7
                {14, true}, //8
                {15, true}, //9
                {16, true}, //10
                {17, true}, //11
                {18, true}, //12
                {19, true}, //13
                {20, false}, //14
                {21, false} //15
        };
    }

    @Test(dataProvider = "ageDataProvider")
    public void testIsTeen(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        Assert.assertEquals(result, expected);
    }
}
