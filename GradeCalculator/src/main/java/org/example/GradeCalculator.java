package org.example;

import java.util.List;

public class GradeCalculator {

    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }


    public double calculateGrade() {
        // 학점 수 * 교과목 평점의 합계
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(course -> course.getCredit())
                .sum();
        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
