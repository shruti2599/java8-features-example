import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethodDemo2 {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(10, "Shruti", 26, 40000));
        employee.add(new Employee(20, "Rocky", 30, 110000));
        employee.add(new Employee(30, "Leo", 36, 10000));


        //Ascending Order

        List<Employee> employeeSortedList = employee.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2){
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        System.out.println(employeeSortedList);

        System.out.println("--------------------Ascending order Using Comparator.comparingLong------------------------------");

        List<Employee> employeeSortedList4 = employee.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(employeeSortedList4);

        System.out.println("-------------------Ascending Using Lambda Expression-----------------------");

        //Using Lambda Expression

        List<Employee> employeeSortedList2 = employee.stream()
                .sorted(( o1,  o2)-> (int) (o1.getSalary() - o2.getSalary()))
        .collect(Collectors.toList());

        System.out.println(employeeSortedList2);

        //Descending Order

        System.out.println("----------Descending order Using Comparator.comparingLong.reversed------------");
        List<Employee> employeeSortedList5 = employee.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(employeeSortedList5);

        System.out.println("-----------------Descending OrderUsing Lambda Expression--------------------");

        //Using Lambda Expression

        List<Employee> employeeSortedList3 = employee.stream()
                .sorted(( o1,  o2)-> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());

        System.out.println(employeeSortedList3);

    }

}
