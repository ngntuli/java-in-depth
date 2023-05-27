package com.ngntuli.oop;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}

	public void approveReview(Staff s) {
		if (s instanceof Editor) {
			((Editor) s).approveReview();
		} else {
			System.out.println("Invalid object passed!!");
		}
	}

	public static void main(String[] args) {
		// Part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		System.out.println("-".repeat(26));
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);

		// Part 2
		System.out.println("-".repeat(26));
		//editor.approveReview();
		editor.postAReview("test");
		System.out.println("-".repeat(26));
		editor.saveWebLink();

		// Casting & instanceof demo
		System.out.println("-".repeat(26));
		ut.approveReview(new Staff());
		ut.approveReview(new Editor());

	}
}
