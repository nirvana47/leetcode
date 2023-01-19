import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // List<Person> people = new ArrayList<Person>();
        // people.add(new Person("John", 30));
        // people.add(new Person("Jane", 25));
        // people.add(new Person("Bob", 35));

        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(15, 20));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(0, 30));
        intervals.add(new Interval(13, 29));

        Solution s = new Solution();
        
        System.out.println(s.canAttendMeetings(intervals));

        // System.out.println("Before sorting");
        // for(Interval i: intervals) {
        //     System.out.println(i.start + " " + i.end);
        // }

        // intervals.sort((a,b) -> a.start - b.start);
        // people.sort((a,b) -> a.age - b.age);
        
        // System.out.println("After sorting");
        // for(Interval i: intervals) {
        //     System.out.println(i.start + " " + i.end);
        // }
        // for(Person p: people) {
        //     System.out.println(p.name + " " + p.age);
        // }
    }
}


