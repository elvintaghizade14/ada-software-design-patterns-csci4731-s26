package az.edu.ada.modules.module02.lesson19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class PatternDemoApp {

    public static void main(String[] args) {
        //#1 - decorator
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //#2 - strategy
        //Collections.sort(list, (a, b) -> a.getAge() - b.getAge());
        //Collections.sort(list, (b, a) -> a.getAge() - b.getAge());

        //#3 - Singleton (Eager)
        Runtime.getRuntime().availableProcessors();

        //#4 - Proxy
        // @Transactional

        //#5 - Observer
        //@EventListener

        //#6 - Template Method
        //@RestController (DispatcherServlet) - doService() & doDispatch()

        //#7 - Adapter
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //#8 - Factory
        Calendar instance = Calendar.getInstance();

        //9 - Template Method
        //JdbcTemplate
    }
}
