package OOSD.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface EmployeeRecord {
    public EmployeeRecord getClone();
}

class CollegeTeacher implements EmployeeRecord {
    private int id = 0;
    private String name;
    private String address;

    public CollegeTeacher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void showRecord () {
        System.out.println("");
        System.out.println("Teacher Employee Record");
        System.out.println("------------------------------");
        System.out.println("Id\tname\taddress\tsalary");
        System.out.println(id+"\t"+name+"\t"+address+"\tRs. 40000");
        System.out.println("");
    }
    
    @Override
    public EmployeeRecord getClone() {
        this.id++;
        return new CollegeTeacher(this.id, this.name, this.address);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an ID: ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.print("Enter teacher name: ");
        String name = br.readLine();
        System.out.println("\n");

        System.out.print("Enter address: ");
        String address = br.readLine();
        System.out.println("\n");

        CollegeTeacher ct1 = new CollegeTeacher(id, name, address);
        ct1.showRecord();

        CollegeTeacher ct2 = (CollegeTeacher) ct1.getClone();
        ct2.showRecord();
    }
}
