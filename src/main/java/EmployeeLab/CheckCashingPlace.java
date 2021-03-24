package EmployeeLab;

import java.util.ArrayList;

public class CheckCashingPlace {

    public static void main(String[] args) {

        HumanResources humanResources = new HumanResources();
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("James", "3/2/2002",1000.00 );
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Micheal", "2/6/2001", 20.00, 20.00);
        Entrepreneur entrepreneur1 = new Entrepreneur("Chris", 1000000.00);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee1);
        employees.add(hourlyEmployee1);

        IPayable[] payablePeople = {salariedEmployee1, hourlyEmployee1, entrepreneur1};


        //ArrayList<Employee> payments = new ArrayList<>();
        //employees.add()


        humanResources.issueBadge(employees);
        System.out.println("Prior to sorting by pay..");
        humanResources.payPerson(payablePeople);



/*
        humanResources.printPaymentInfo(salariedEmployee1);
        humanResources.printPaymentInfo(hourlyEmployee1);
        humanResources.printPaymentInfo(entrepreneur1);
*/








    }
}
