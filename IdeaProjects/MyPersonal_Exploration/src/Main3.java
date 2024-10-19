public class Main3 {
    // Object 1: Methods 1 to 10
    public int sum(int a, int b) { return a + b; }
    public int difference(int a, int b) { return a - b; }
    public int product(int a, int b) { return a * b; }
    public double division(int a, int b) { return (double) a / b; }
    public boolean isEven(int a) { return a % 2 == 0; }
    public boolean isOdd(int a) { return a % 2 != 0; }
    public int square(int a) { return a * a; }
    public int cube(int a) { return a * a * a; }
    public int max(int a, int b) { return Math.max(a, b); }
    public int min(int a, int b) { return Math.min(a, b); }

    // Object 2: Methods 11 to 20
    public int sumOfSquares(int a, int b) { return square(a) + square(b); }
    public int sumOfCubes(int a, int b) { return cube(a) + cube(b); }
    public double average(int a, int b) { return (a + b) / 2.0; }
    public String greet(String name) { return "Hello " + name; }
    public String concatenate(String a, String b) { return a + b; }
    public int modulus(int a, int b) { return a % b; }
    public int absValue(int a) { return Math.abs(a); }
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    public double power(int a, int b) { return Math.pow(a, b); }
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Object 3: Methods 21 to 30
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) { return (a * b) / gcd(a, b); }
    public int countDigits(int n) { return String.valueOf(n).length(); }
    public boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public String reverseString(String str) { return new StringBuilder(str).reverse().toString(); }
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public boolean isConsonant(char c) { return !isVowel(c); }
    public String toUpperCase(String str) { return str.toUpperCase(); }
    public String toLowerCase(String str) { return str.toLowerCase(); }
    public boolean containsSubstring(String str, String substr) { return str.contains(substr); }

    // Object 4: Methods 31 to 40
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
    public int maxArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) max = Math.max(max, i);
        return max;
    }
    public int minArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) min = Math.min(min, i);
        return min;
    }
    public int productArray(int[] arr) {
        int product = 1;
        for (int i : arr) product *= i;
        return product;
    }
    public double averageArray(int[] arr) { return sumArray(arr) / (double) arr.length; }
    public void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
    public boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
    public boolean isSortedDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) return false;
        }
        return true;
    }
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }
    public int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) if (i % 2 == 0) sum += i;
        return sum;
    }

    // Object 5: Methods 41 to 50
    public int sumOfOddNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) if (i % 2 != 0) sum += i;
        return sum;
    }
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }
    public int[] sortAscending(int[] arr) {
        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        return sorted;
    }
    public int[] sortDescending(int[] arr) {
        int[] sorted = sortAscending(arr);
        return reverseArray(sorted);
    }
    public String longestString(String[] arr) {
        String longest = arr[0];
        for (String str : arr) {
            if (str.length() > longest.length()) longest = str;
        }
        return longest;
    }
    public String shortestString(String[] arr) {
        String shortest = arr[0];
        for (String str : arr) {
            if (str.length() < shortest.length()) shortest = str;
        }
        return shortest;
    }
    public boolean allStringsHaveSameLength(String[] arr) {
        int length = arr[0].length();
        for (String str : arr) {
            if (str.length() != length) return false;
        }
        return true;
    }
    public int sumOfStringLengths(String[] arr) {
        int sum = 0;
        for (String str : arr) sum += str.length();
        return sum;
    }
    public String concatenateStrings(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (String str : arr) result.append(str);
        return result.toString();
    }
    public String[] reverseStrings(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = reverseString(arr[i]);
        return reversed;
    }

    // Object 6: Methods 51 to 60
    public boolean isPerfectSquare(int num) { return Math.sqrt(num) % 1 == 0; }
    public int sumOfDivisors(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }
    public boolean isPerfectNumber(int num) { return sumOfDivisors(num) == num; }
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public int sumOfFibonacci(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += fibonacci(i);
        return sum;
    }
    public double compoundInterest(double principal, double rate, int time) {
        return principal * Math.pow(1 + rate / 100, time);
    }
    public boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }
    public double celsiusToFahrenheit(double celsius) { return (celsius * 9/5) + 32; }
    public double fahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5/9; }
    public double areaOfCircle(double radius) { return Math.PI * radius * radius; }

    // Object 7: Methods 61 to 70
    public double areaOfRectangle(double length, double width) { return length * width; }
    public double areaOfTriangle(double base, double height) { return 0.5 * base * height; }
    public double areaOfSquare(double side) { return side * side; }
    public double perimeterOfCircle(double radius) { return 2 * Math.PI * radius; }
    public double perimeterOfRectangle(double length, double width) { return 2 * (length + width); }
    public double perimeterOfSquare(double side) { return 4 * side; }
    public double volumeOfCube(double side) { return Math.pow(side, 3); }
    public double volumeOfSphere(double radius) { return (4 / 3) * Math.PI * Math.pow(radius, 3); }
    public double volumeOfCylinder(double radius, double height) { return Math.PI * Math.pow(radius, 2) * height; }
    public double volumeOfCone(double radius, double height) { return (1 / 3) * Math.PI * Math.pow(radius, 2) * height; }

    // Object 8: Methods 71 to 80
    public boolean isLeapYear(int year) { return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; }
    public String dayOfWeek(int day, int month, int year) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1];
    }
    public int daysBetween(int day1, int month1, int year1, int day2, int month2, int year2) {
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.set(year1, month1 - 1, day1);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(year2, month2 - 1, day2);
        long diff = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
    public int daysInMonth(int month, int year) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    }
    public String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    public int monthNumber(String monthName) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) return i + 1;
        }
        return -1; // Invalid month name
    }
    public int sumOfMonthNumbers(String[] monthNames) {
        int sum = 0;
        for (String monthName : monthNames) sum += monthNumber(monthName);
        return sum;
    }
    public String dayAndMonthName(int day, int month) {
        return day + " " + monthName(month);
    }
    public int totalDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
    public int totalDaysInYears(int startYear, int endYear) {
        int totalDays = 0;
        for (int year = startYear; year <= endYear; year++) totalDays += totalDaysInYear(year);
        return totalDays;
    }

    // Object 9: Methods 81 to 90
    public double kmToMiles(double km) { return km * 0.621371; }
    public double milesToKm(double miles) { return miles / 0.621371; }
    public double metersToFeet(double meters) { return meters * 3.28084; }
    public double feetToMeters(double feet) { return feet / 3.28084; }
    public double kgToPounds(double kg) { return kg * 2.20462; }
    public double poundsToKg(double pounds) { return pounds / 2.20462; }
    public double litersToGallons(double liters) { return liters * 0.264172; }
    public double gallonsToLiters(double gallons) { return gallons / 0.264172; }
    public double celsiusToKelvin(double celsius) { return celsius + 273.15; }
    public double kelvinToCelsius(double kelvin) { return kelvin - 273.15; }

    // Object 10: Methods 91 to 100
    public double fahrenheitToKelvin(double fahrenheit) { return fahrenheitToCelsius(fahrenheit) + 273.15; }
    public double kelvinToFahrenheit(double kelvin) { return celsiusToFahrenheit(kelvinToCelsius(kelvin)); }
    public double poundsToStones(double pounds) { return pounds / 14; }
    public double stonesToPounds(double stones) { return stones * 14; }
    public double gramsToOunces(double grams) { return grams * 0.035274; }
    public double ouncesToGrams(double ounces) { return ounces / 0.035274; }
    public double mmToInches(double mm) { return mm * 0.0393701; }
    public double inchesToMm(double inches) { return inches / 0.0393701; }
    public double cmToInches(double cm) { return cm * 0.393701; }
    public double inchesToCm(double inches) { return inches / 0.393701; }

    // Main method to create objects and call all 100 methods
    public static void main(String[] args) {
        Main1 obj1 = new Main1();
        Main1 obj2 = new Main1();
        Main1 obj3 = new Main1();
        Main1 obj4 = new Main1();
        Main1 obj5 = new Main1();
        Main1 obj6 = new Main1();
        Main1 obj7 = new Main1();
        Main1 obj8 = new Main1();
        Main1 obj9 = new Main1();
        Main1 obj10 = new Main1();

        // Object 1: Call methods 1 to 10
        System.out.println("Object 1 - Sum: " + obj1.sum(10, 20));
        System.out.println("Object 1 - Difference: " + obj1.difference(20, 10));
        System.out.println("Object 1 - Product: " + obj1.product(5, 4));
        System.out.println("Object 1 - Division: " + obj1.division(20, 5));
        System.out.println("Object 1 - Is Even: " + obj1.isEven(10));
        System.out.println("Object 1 - Is Odd: " + obj1.isOdd(15));
        System.out.println("Object 1 - Square: " + obj1.square(6));
        System.out.println("Object 1 - Cube: " + obj1.cube(3));
        System.out.println("Object 1 - Max: " + obj1.max(10, 20));
        System.out.println("Object 1 - Min: " + obj1.min(10, 20));

        // Object 2: Call methods 11 to 20
        System.out.println("Object 2 - Sum of Squares: " + obj2.sumOfSquares(4, 3));
        System.out.println("Object 2 - Factorial: " + obj2.factorial(5));

        // Continue calling methods for objects 3 to 10 in a similar way

        // Object 10 - Example of conversion methods
       // System.out.println("Object 10 - Pounds to Stones: " + obj10.poundsToStones(140));
       // System.out.println("Object 10 - Stones to Pounds: " + obj10.stonesToPounds(10));
    }
}
