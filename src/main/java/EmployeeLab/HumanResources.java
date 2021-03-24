package EmployeeLab;

import java.util.ArrayList;
import java.util.Arrays;

import static EmployeeLab.Person.pay;

public class HumanResources {

    Employee salariedEmployee1 = new SalariedEmployee("James", "3/2/2002", 1000.00);
    Employee hourlyEmployee1 = new HourlyEmployee("Micheal", "2/6/2001", 20.00, 20.00);


    public void issueBadge(ArrayList<Employee> employees ) {

        for (Employee y : employees) {
            System.out.println(y.printBadge());

        }
    }

        public void printPaymentInfo(IPayable person){
            System.out.println(person.getClass().getSimpleName() + "Should be paid: " + person.calculatePay());

        }

        public void payPerson(IPayable[] payablePeople){
            for(IPayable people : payablePeople){
                printPaymentInfo(people);
            }




            }

            }














