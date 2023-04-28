import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        Friend[] friends = {
            new Friend("Вася", Integer.parseInt("18"),true, Integer.parseInt("4")),
            new Friend("Катя", Integer.parseInt("19"),true, Integer.parseInt("12")),
            new Friend("Дима", Integer.parseInt("20"),false, Integer.parseInt("6")),
            new Friend("Лена", Integer.parseInt("16"),false, Integer.parseInt("9")),
            new Friend("Вова", Integer.parseInt("18"),true, Integer.parseInt("20"))
        };

        System.out.println(" My friends: " + Arrays.toString(friends));
    }
}


class Friend {
    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;
    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
}

