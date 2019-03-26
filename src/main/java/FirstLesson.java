public class FirstLesson {

    public static void main(String[] args) {

        /*
            Тернарный оператор
            Объявляем переменные a,b
            Переменной а будет присвоено значение 10
            Переменной b , будет присвоено выражение
            Если выражение заключенное в скобки будет возвращать true, тогда ответ будет 20
            Если выражение заключенное в скобки будет возвращать false, тогда ответ будет 30

         */
        //False example
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is: " + b);
        //True example
        int c, d;
        c = 10;
        d = (c == 10) ? 20: 30;
        System.out.println("Value of d is: " + d);

        int i;
        for (i = 0; i < 20; i++){
            System.out.println("Value i is: "+ i);
        }

        int salaries[] = {1244, 3423, 4343, 3434};
        for(i = 0; i <salaries.length; i++) {
            System.out.println(salaries[i]);
        }
        String gender = "Мужчина";
        System.out.println((gender.equals("Женщина")? "Мисс" : "Господин"));

        }

    }




