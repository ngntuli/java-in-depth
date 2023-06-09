package com.ngntuli.basics;

public class BasicsDemo {

	// Adapted from
	// http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
		System.out.println(); // Print empty line
		System.out.print("Hello, world!!"); // Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" "); // Print a space
		System.out.print("world!!");
		// Test new eclipse
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ...");
		// literals demo
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intChar = 'A'; // holds decimal equivalent, which is 65
		System.out.println("intChar: " + intChar);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);

		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowdByte: " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int
								// --> char)
		System.out.println("cChar: " + cChar);
	}

	static void arrays() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 11, 2, 5, 4, 4, 6 };
		System.out.println("myArray.length: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
		System.out.println("myArray[6]: " + myArray[6]);
	}

	static void threeDimensionalArrays() {
		System.out.println("\nInside threeDimensionalArrays ...");
		int[][][] unitsSold = new int[][][] { { // Johannesburg
				{ 0, 0, 0, 0 }, // Jan
				{ 0, 0, 0, 0 }, // Feb
				{ 0, 0, 0, 0 }, // Mar
				{ 0, 850, 0, 0 }// Apr
				}, { // CapeTown
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0 } // Apr
				}, { // Pretoria
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0 } // Apr
				}, { // Bloemfontein
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0 } // April
				} };

		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}

	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("\nInside varargsOverload without varargs ...");
	}

	static void varargsOverload(boolean b, int... list) {
		System.out.println("\nInside varargsOverload with varargs ...");
		System.out.println("list.length: " + list.length);
	}

	static void printVarargsOverload() {
		varargsOverload(true);
		varargsOverload(true, 1);
		varargsOverload(true, 1, 2);
		varargsOverload(true, 1, 2, 3);
		varargsOverload(true, 1, 2, 3, 4);
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
	}

	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");

		int x = 5;

		--x;
		System.out.println("x: " + x);

		int y = x--;
		System.out.println("y: " + y + ", x: " + x);

		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;
		array[index++] = 20;
		array[index++] = 30;

		System.out.println(index);
	}

	static void compoundArithmeticAssignment() {
		int x = 100;

		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));

		// Invalid
		System.out.println("x =+ 5: " + (x = +5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x = -5)); // Unary minus ~ x = -5

		// System.out.println("x =* 5: " + (x =* 5));
		// System.out.println("x =/ 5: " + (x =/ 5));
		// System.out.println("x =% 5: " + (x =% 5));

	}

	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}

	static void charTypePromotion() {
		System.out.println("\nInside charTypePromotion ...");
		char char1 = 50; // Will be assigned corresponding UTF16 value 2
		System.out.println("char1: " + char1);
		System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50
																// in UTF16 is used
		System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints
		System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' & 'b' are promoted to ints and the respective
															// equivalents 97 & 98 are added
	}

	// Comparison or Relational operators
	static void comparisonOperators() {
		int age = 33;
		/*
		 * if (age > 35) { System.out.println("Earn up to R25 000"); }
		 */

		System.out.println("\n*** Inside charTypePromotion ... ***");
		System.out.println("age > 33: " + (age > 33));
		System.out.println("age >= 33: " + (age >= 33));
		System.out.println("age < 33: " + (age < 33));
		System.out.println("age <= 33: " + (age <= 33));
		System.out.println("age == 33: " + (age == 33)); // equal to (equality operator)
		System.out.println("age != 33: " + (age != 33)); // not equal to (equality operator)

		boolean isInternational = true;
		// System.out.println("isInternational <= true: " + (isInternational <= true));
		System.out.println("isInternational == true: " + (isInternational == true));
		System.out.println("isInternational != true: " + (isInternational != true));

		Student s1 = new Student("Nkosinathi", "male");
		Student s2 = new Student("Nkosinathi", "male");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));

		s1.setName("Givenson");
	}

	static boolean update(Student s, String name) {
		if (s == null) {
			return false;
		}

		s.setName(name);
		return true;
	}

	static void logicalOperators() {
		System.out.println("\n*** Inside logicalOperators ... ***");
		int age = 35;
		int salary = 25000;
		boolean hasBadCredit = false;

		// 1. Core (AND, OR, NOT & Operator Chaining)

		if (age > 35 && salary > 30000 || !hasBadCredit) {
			System.out.println("Loan approved!");
		} else {
			System.out.println("Loan not approved!");
		}

		// 2.
		// (a) Left-associative ~ Order of grouping
		// (b) Associativity (a && b) && c = a && (b && c)
		// Applies to both && and ||

		// 3.
		// (a) Operator precedence of Logical Operators: Helps with ONLY grouping
		// operations. Not order of execution. (! > && > ||)

		// Other Examples: A && B || C && D = (A && B) || (C && D)
		// A && B && C || D = ((A && B) && C) || D

		// (b) Operator Precedence across logical, comparison and arithmetic
		// ! > arithmetic > comparison > &&, ||
		// See resources section for complete precedence rules

		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence
		// rules

		// 4. Use && to avoid NullPointerException
		Student s1 = new Student("Uthando", "female");
		update(s1, "Nkosinathi");
	}

	static void bitwiseOperators() {
		System.out.println("\n*** Inside bitwiseOperators ...*** ");
		int x = 6;
		int y = 7;

		System.out.println(" x in binary: " + Integer.toBinaryString(x));
		System.out.println(" y in binary: " + Integer.toBinaryString(y));
		System.out.println();
		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));

		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

		// Since bitwise work only on Integer types, following will not compile
		// double d1 = 3.14;
		// double d2 = 5.15;
		// System.out.println("d1 | d2: " + (d1 | d2));
	}

	static boolean ifStatement() {
		boolean approved = false;

		int age = 33;
		int salary = 13_000;
		boolean hasBadCredit = false;

		System.out.println("\n*** Inside ifStatement ...*** ");
		if (age >= 25 && age <= 35 && salary >= 13_000) {
			approved = true;
			System.out.println("age >= 25 && age <= 35 && salary >= R13 000");
		} else if (age > 35 && age <= 45 && salary >= 25_000) {
			approved = true;
			System.out.println("age > 35 && age <= 45 && salary >= R25 000");
		} else if (age > 45 && age <= 55 && salary >= 28_000) {
			approved = true;
			System.out.println("age > 45 && age <= 55 && salary >= R28 000");
		} else {
			if (age > 55 && !hasBadCredit) {
				approved = true;
				System.out.println("age > 55 && !hasBadCredit");
			}
			System.out.println("else block");
		}

		System.out.println("Outside if statement");
		return approved;
	}

	static void switchExample() {
		System.out.println("\n*** Inside switchExample ...*** ");
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("April");
		}
	}

	static void forLoop() {
		System.out.println("\n*** Inside forLoopExample ...*** \n");
		int[] iArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = iArray.length - 1; i >= 0; i--) {
			System.out.print(iArray[i] + " ");
		}

		System.out.println("\n\nReversing Array ... ");
		for (int i = 0, j = iArray.length - 1, middle = iArray.length >>> 1; i < middle; i++, j--) {
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		System.out.println("\n\nCounting divisors ...");
		int x = 24;
		int divisorCount = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
				divisorCount++;
			}
		}
		System.out.println("\nDivisor Count: " + divisorCount);

		System.out.println("\nDisplaying Student Grades ...");
		int[][] studentGrades = { { 76, 52, 69, 83, 45, 90 }, { 22, 71, 67, 69, 40 }, { 53, 87, 91, 25 } };
		for (int i = 0; i < studentGrades.length; i++) {
			System.out.print("\nDisplaying grades of students from class " + i + ": ");
			int max = 0;
			for (int j = 0; j < studentGrades[i].length; j++) {
				if (studentGrades[i][j] > max) {
					max = studentGrades[i][j];
				}
				System.out.print(studentGrades[i][j] + " ");
			}
			System.out.println("\nmax: " + max);
		}

	}

	static void labeledBreak() {
		System.out.println("\n*** Inside labeledBreak ...*** ");
		int num = 0;

		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					break outermost;
				}
				num++;
			}
		}

		System.out.println("num: " + num); // prints 55
	}

	static void labeledContinue() {
		System.out.println("\n*** Inside labeledContinue ...*** ");
		int num = 0;

		outermost: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					continue outermost;
				}
				num++;
			}
		}

		System.out.println("num: " + num); // prints 55
	}

	static void stringExamples() {
		System.out.println("\n*** Inside stringExamples ...***");
		String s = "hello world!";
		System.out.println("s: " + s);

		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());

		// Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));

		// Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hell\"): " + s.startsWith("hell"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));

		// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));

		// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));

		// Case conversions (Note: String is immutable. So, only a copy is returned)
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());

		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing
														// white spaces

		// Replace (e.g., replace comma's with white-space)
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));

		// Split (e.g., split a document into words or split a line of text by tab or
		// comma or white space)
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}

		// Static method (includes overloaded methods)
		System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));

		// Converts this string to a new character array
		System.out.print("\ns.toCharArray(): ");
		char[] sToCharArray = s.toCharArray();
		for (char c : sToCharArray) {
			System.out.print(" " + c);
		}
		System.out.println();

		// Concatenation of string repeated count times
		System.out.println("\ns.repeat(6): " + s.repeat(6));
	}

	static void stringPool() {
		System.out.println("\n*** Inside stringPool ...***");
		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!".intern();
		String s4 = new String("hello!");
		String s5 = "lo!";

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 == s4: " + (s1 == s4));
		System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
		System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
		System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
	}

	public BasicsDemo() {
		System.out.println("Inside no-arg constructor ...");
	}

	public BasicsDemo(int id) {
		System.out.println("Inside constructor with a parameter ...");
	}

	{
		System.out.println("Inside instance initializer ...");
	}

	static void veryExpensive() {
		System.out.println("\n*** Inside veryExpensive ...***");
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
	}

	static void compareBoxPrimitives() {
		System.out.println("\n*** Inside compareBoxPrimitives ...***");
		Integer num1 = new Integer(0);
		Integer num2 = new Integer(0);
		System.out.println("(num1 == num2): " + (num1 == num2));

		// Solutions:
		System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
		System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));

		Integer num3 = new Integer(1);
		System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
	}

	static Integer i;

	static void unbelievable() {
		System.out.println("\n*** Inside unbelievable ...***");
		if (i == 0)
			System.out.println("weird!");
	}

	public static void main(String[] args) {
		// Language Basics 1
		// print();
		// primitives();
		// typeCasting();
		// arrays();
		// threeDimensionalArrays();
		// printVarargsOverload();
		// preAndPost();
		// compoundArithmeticAssignment();
		// isOddOrEven(42);
		// charTypePromotion();
		// comparisonOperators();
		// logicalOperators();
		// bitwiseOperators();
		// ifStatement();
		// switchExample();
		// forLoop();
		// labeledBreak();
		// labeledContinue();
		// import demo
		// package creation demo
		// stringExamples();
		// stringPool();
		// BasicsDemo bd = new BasicsDemo(1);
		/*
		 * Integer[] items = new Integer[] { 1, 2 };
		 * 
		 * long start = System.nanoTime(); veryExpensive();
		 * System.out.println("Elapsed Time: " + ((System.nanoTime() - start) /
		 * 1_000_000.0) + " msec");
		 */
		// compareBoxPrimitives();
		unbelievable();
	}

}
