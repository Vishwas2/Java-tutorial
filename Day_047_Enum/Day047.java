package Day_047_Enum;

// Enum is used when you have something that has a predefined set of values that don't change (a good example is days of
// the week because they are always going to be 7 and are never going to change)
// So you might want to define in your code what those 7 days of the week are in a way that people cannot add more days
// of the week because that will not make sense.
public class Day047 {
    public static void main(String[] args) {

        //  ** USING DaysOfTheWeek ENUM ** 

        // DaysOfTheWeek day = new DaysOfTheWeek(); -> THIS WILL GIVE ERROR !
        // You cannot use enums like you normally use objects of other classes
        DaysOfTheWeek day1 = DaysOfTheWeek.MONDAY; // This is valid
        // In the above case the day1 variable has the value MONDAY
        // You can use this day1 variable like you would use any other variable in java.
        // For example :
        if (day1 == DaysOfTheWeek.MONDAY) {
            System.out.println("Today is Monday.");
        }
        // If you want to get all the possible values of an enum you can just write nameOfEnum.values();
        // For example :
        // DaysOfTheWeek.values(); -> This will return an array of all the possible day of the week
        // We can use a for each loop to print out all the values of the day of the week
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

        //  ** USING CEREALS ENUM ** 

        System.out.println(Cereals.CAPTAIN_CRUNCH.levelOfDeliciousness);
        // we can print out the level of deliciousness of captain crunch like this
//        Cereals.FRUIT_LOOPS.levelOfDeliciousness = 100; -> this will give error as we have made levelOfDeliciousness final.
    }
}
