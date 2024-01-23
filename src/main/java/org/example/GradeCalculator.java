package org.example;

import java.util.List;

public class GradeCalculator {
	private final List<Course> courses;

	public GradeCalculator(List<Course> courses) {
		this.courses = courses;
	}

	public double calculateGrade() {
		double multipliedCourseGradeAndCourseGrade = 0;
		for (Course course : courses) {
			multipliedCourseGradeAndCourseGrade += course.multiplyCreditAndCourseGrade();
		}

		int totalCompletedCredit = courses.stream()
			.mapToInt(Course::getCredit)
			.sum();

		return multipliedCourseGradeAndCourseGrade / totalCompletedCredit;
	}
}
