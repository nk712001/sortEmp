package edyoda5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;




    class sortEmp implements Comparable<sortEmp> {
        String name;
        Integer salary;
        Date JoiningDate;

        public sortEmp() {
        }

        public sortEmp(String n, Integer f, Date d) {
            name = n;
            salary = f;
            JoiningDate = d;
        }

        public String toString() {
            return "\n name=" + name + ",salary=" + salary + ",JoiningDate="
                    + JoiningDate;
        }

        public int compareTo(sortEmp o) {
            return this.name.compareTo(o.name) + (this.salary.compareTo(o.salary))
                    + (this.JoiningDate.compareTo(o.JoiningDate));
        }
    }

    class SortEmployeeOnBasisOfNameSalaryDate {

        public static void main(String[] args) {

            sortEmp emp1 = new sortEmp("ank", 2000, new Date(2016 - 1900, 11, 14));
            sortEmp emp2 = new sortEmp("dav", 500, new Date(2016 - 1900, 11, 23));
            sortEmp emp3 = new sortEmp("ank", 1000, new Date(2016 - 1900, 11, 22));
            sortEmp emp4 = new sortEmp("sam", 9000, new Date(2016 - 1900, 11, 29));
            sortEmp emp5 = new sortEmp("ank", 1000, new Date(2016 - 1900, 11, 19));

            List<sortEmp> l = new ArrayList<sortEmp>();
            l.add(emp1);
            l.add(emp2);
            l.add(emp3);
            l.add(emp4);
            l.add(emp5);

            Collections.sort(l); 

            System.out.println(l);
        }
    }