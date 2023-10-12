public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        system.out.print("");
        System.out.print("");
        double numberOne = scanner.nextDouble();

        System.out.print("");
        double numberTwo = scanner.nextDouble();

        System.out.println("possible calcilations:");
        System.out.println("possible result:");
        System.out.println("(A)add");
        System.out.println("(S)subtract");
        System.out.println("(M)multiply");
        System.out.println("slect option: ");
        System.out.println("select option: ");

        char M = scanner.next().charAt(0);
        float result = 0;
        char optionChoice = scanner.next().charAt(0);
        double result = 0;

        //if (M == "A ")  {
        //   result = numberOne + numberTwo;
        //  System.out.println(numberOne + "+" + numberTwo"=" + result);
        }
        }
        switch (optionChoice) {
        case 'A':
        case 'a':
        result = numberOne + numberTwo;
        break;
//        System.out.println(numberOne + "+" + numberTwo "=" + result);
        case 'S':
        case 's':
        result = numberOne - numberTwo;
        break;
        case 'M':
        case 'm':
        result = numberOne * numberTwo;
        break;
        case 'D':
        case 'd':
        result = numberOne / numberTwo;

        }
        break;

        }

        System.out.println("Your answer is " + result);
        }
        }