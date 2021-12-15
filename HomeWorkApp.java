
 class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -4;
        int b = 7;
        System.out.println((a + b >= 0) ? "Sum is positiv" : "Sum is negativ");

    }

    static void printColor() {
        int value = 155;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 || <= 100) {
            System.out.println( "Yellow");
            }
        if (value > 100) {
            System.out.println( "Green");
        }

    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if ( varA >= varB) {
            System.out.println("a >= b");
        }
        if (varA < varB) {
            System.out.println("a < b");
        }
    }
}




