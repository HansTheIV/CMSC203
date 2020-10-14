import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookTest {

    @BeforeEach
    void setUp() {
        GradeBook grades = new GradeBook(5);
        GradeBook grades2 = new GradeBook(5);
        grades.addScore(50);
        grades.addScore(88);
        grades.addScore(75);
        grades2.addScore(60);
        grades2.addScore(98);
        grades2.addScore(75);
        grades2.addScore(86);
    }

    @org.junit.jupiter.api.Test
    void addScore() {
        GradeBook grades = new GradeBook(5);
        GradeBook grades2 = new GradeBook(5);
        grades2.addScore(60);
        grades2.addScore(98);
        grades2.addScore(75);
        grades2.addScore(86);
        String x2 = grades2.toString();
        assertEquals(x2, "60.0 98.0 75.0 86.0 0.0 ");
        grades.addScore(50);
        grades.addScore(88);
        grades.addScore(75);
        String x1 = grades.toString();
        assertEquals(x1, "50.0 88.0 75.0 0.0 0.0 ");
        assertEquals(grades.getScoreSize(), 3);
        assertEquals(grades2.getScoreSize(), 4);
    }

    @org.junit.jupiter.api.Test
    void sum() {
        GradeBook grades = new GradeBook(5);
        GradeBook grades2 = new GradeBook(5);
        grades2.addScore(60);
        grades2.addScore(98);
        grades2.addScore(75);
        grades2.addScore(86);
        grades.addScore(50);
        grades.addScore(88);
        grades.addScore(75);
        double x1 = grades.sum();
        double x2 = grades2.sum();
        assertEquals(x2, 60+98+75+86);
        assertEquals(x1, 50+88+75);

    }

    @org.junit.jupiter.api.Test
    void minimum() {
        GradeBook grades = new GradeBook(5);
        GradeBook grades2 = new GradeBook(5);
        grades2.addScore(60);
        grades2.addScore(98);
        grades2.addScore(75);
        grades2.addScore(86);
        double x2 = grades.minimum();
        assertEquals(x2, 0);
        grades.addScore(50);
        grades.addScore(88);
        grades.addScore(75);
        double x1 = grades.minimum();
        assertEquals(x1, 50);

    }

    @org.junit.jupiter.api.Test
    void getScoreSize() {

    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void finalScore() {
        GradeBook grades = new GradeBook(5);
        GradeBook grades2 = new GradeBook(5);
        grades2.addScore(60);
        grades2.addScore(98);
        grades2.addScore(75);
        grades2.addScore(86);
        grades.addScore(50);
        grades.addScore(88);
        grades.addScore(75);

        double x1 = 88+75;
        double x2 = 75+86+98;
        assertEquals(grades.finalScore(), x1);
        assertEquals(grades2.finalScore(), x2);

    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        GradeBook grades = null;
        GradeBook grades2 = null;
    }
}
