package advancedClassDesign._20twenty;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Stream<LocalDate> s = Stream.of(LocaleData.now());
//        UnaryOperator<LocalDate> u = l -> l;
//        s.filter(l -> l != null).map(u).peek(System.out :: println);
    }
}
//A.2016-05-01
//B.2016-06-01
//C.There is no output.
//D.The output is something other than 2016-05-01 or 2016-06-01
//E.The code does not compile.
//F.An exception is thrown.