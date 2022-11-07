public class Main {
    public static void main(String[] args) {
        //Exercise 1
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Exercise 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Exercise 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Exercise 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Exercise 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Exercise 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumOfTHeWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println(sumOfTHeWeights + " kg - total weight of two boxers!");
        var differenceOfTheWeights = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceOfTheWeights + " kg - boxers weight difference!");

        //Exercise 7
        var firstMethodDifferenceOfTheWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(firstMethodDifferenceOfTheWeight);
        var secondMethodDifferenceOfTheWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(secondMethodDifferenceOfTheWeight);

        //Exercise 8
        var totalWorkingHours = 640;
        var workingHoursOfEmployees = 8;
        var theNumberOfEmployees = totalWorkingHours / workingHoursOfEmployees;
        System.out.println("Всего работников в компании – " + theNumberOfEmployees + " человек");
        var numberOfEmployeesAfterChanges = theNumberOfEmployees + 94;
        var workingHoursOfEmployeesAfterChanges = workingHoursOfEmployees * numberOfEmployeesAfterChanges;
        System.out.println("Если в компании работает " + numberOfEmployeesAfterChanges + " человек, то всего " + workingHoursOfEmployeesAfterChanges + " часа работы может быть поделено между сотрудниками.");
    }
}
