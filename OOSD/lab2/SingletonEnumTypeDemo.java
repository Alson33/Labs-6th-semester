package OOSD.lab2;

import java.util.HashMap;
import java.util.Map;

enum Roles {
    admin,
    staff,
    user,
}

class SingletonEnumType {
    public static Map<Roles, SingletonEnumType> types = new HashMap<>();

    private SingletonEnumType(Roles type) {}

    public static SingletonEnumType getInstance(Roles type) {
        if(!types.containsKey(type)){
            types.put(type, new SingletonEnumType(type));
        }
        return types.get(type);
    }
}

public class SingletonEnumTypeDemo {
    public static void main(String[] args) {
        SingletonEnumType t1 = SingletonEnumType.getInstance(Roles.admin);
        SingletonEnumType t2 = SingletonEnumType.getInstance(Roles.staff);
        SingletonEnumType t3 = SingletonEnumType.getInstance(Roles.staff);
        SingletonEnumType t4 = SingletonEnumType.getInstance(Roles.user);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
        System.out.println(t4.hashCode());

        /**
         * output:
         * 918221580
         * 2055281021 // same staff instance
         * 2055281021 // same staff instance
         * 1554547125
         */
    }
}
