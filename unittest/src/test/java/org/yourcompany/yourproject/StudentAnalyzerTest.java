package org.yourcompany.yourproject;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Lớp kiểm thử đơn vị cho StudentAnalyzer
 */
public class StudentAnalyzerTest {
    
    private StudentAnalyzer analyzer;
    
    @BeforeEach
    public void setUp() {
        analyzer = new StudentAnalyzer();
    }
    
    // ============ Kiểm thử countExcellentStudents ============
    
    /**
     * Trường hợp bình thường: Danh sách có nhiều điểm hợp lệ và không hợp lệ
     */
    @Test
    public void testCountExcellentStudents_MixedValidAndInvalid() {
        // Input: 9.0 (giỏi), 8.5 (giỏi), 7.0 (không giỏi), 11.0 (không hợp lệ), -1.0 (không hợp lệ)
        // Expected: 2 học sinh đạt loại Giỏi
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }
    
    /**
     * Trường hợp bình thường: Danh sách toàn bộ hợp lệ và đạt giỏi
     */
    @Test
    public void testCountExcellentStudents_AllValidAndExcellent() {
        // Input: tất cả >= 8.0
        // Expected: 4 học sinh
        assertEquals(4, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 8.5, 10.0)));
    }
    
    /**
     * Trường hợp biên: Danh sách rỗng
     */
    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Input: rỗng
        // Expected: 0
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }
    
    /**
     * Trường hợp biên: Danh sách null
     */
    @Test
    public void testCountExcellentStudents_NullList() {
        // Input: null
        // Expected: 0
        assertEquals(0, analyzer.countExcellentStudents(null));
    }
    
    /**
     * Trường hợp biên: Danh sách chỉ chứa giá trị 0 và 10
     */
    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        // Input: 0 (không giỏi), 10 (giỏi), 8 (giỏi)
        // Expected: 2 học sinh
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0, 8.0)));
    }
    
    /**
     * Trường hợp ngoại lệ: Có điểm < 0 hoặc > 10
     */
    @Test
    public void testCountExcellentStudents_InvalidScores() {
        // Input: -5 (không hợp lệ), 15 (không hợp lệ), 9.0 (giỏi)
        // Expected: 1 học sinh (chỉ 9.0 được tính)
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(-5.0, 15.0, 9.0)));
    }
    
    /**
     * Trường hợp đặc biệt: Danh sách toàn điểm không hợp lệ
     */
    @Test
    public void testCountExcellentStudents_AllInvalidScores() {
        // Input: -1, 11, -10, 20
        // Expected: 0
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 11.0, -10.0, 20.0)));
    }
    
    // ============ Kiểm thử calculateValidAverage ============
    
    /**
     * Trường hợp bình thường: Danh sách có nhiều điểm hợp lệ và không hợp lệ
     */
    @Test
    public void testCalculateValidAverage_MixedValidAndInvalid() {
        // Input: 9.0, 8.5, 7.0, 11.0, -1.0
        // Điểm hợp lệ: 9.0, 8.5, 7.0
        // Trung bình: (9.0 + 8.5 + 7.0) / 3 = 24.5 / 3 = 8.1666...
        // Expected: 8.17 (với sai số ± 0.01)
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }
    
    /**
     * Trường hợp bình thường: Danh sách toàn bộ hợp lệ
     */
    @Test
    public void testCalculateValidAverage_AllValid() {
        // Input: 8.0, 9.0, 7.0, 6.0
        // Trung bình: (8.0 + 9.0 + 7.0 + 6.0) / 4 = 30 / 4 = 7.5
        // Expected: 7.5
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(8.0, 9.0, 7.0, 6.0)), 0.01);
    }
    
    /**
     * Trường hợp biên: Danh sách rỗng
     */
    @Test
    public void testCalculateValidAverage_EmptyList() {
        // Input: rỗng
        // Expected: 0
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()));
    }
    
    /**
     * Trường hợp biên: Danh sách null
     */
    @Test
    public void testCalculateValidAverage_NullList() {
        // Input: null
        // Expected: 0
        assertEquals(0, analyzer.calculateValidAverage(null));
    }
    
    /**
     * Trường hợp biên: Danh sách chỉ chứa 0 và 10
     */
    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        // Input: 0.0, 10.0
        // Trung bình: (0 + 10) / 2 = 5.0
        // Expected: 5.0
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
    }
    
    /**
     * Trường hợp ngoại lệ: Toàn bộ điểm không hợp lệ
     */
    @Test
    public void testCalculateValidAverage_AllInvalidScores() {
        // Input: -1, 11, -10, 20
        // Expected: 0 (không có điểm hợp lệ)
        assertEquals(0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0, -10.0, 20.0)), 0.01);
    }
    
    /**
     * Trường hợp đặc biệt: Một điểm hợp lệ, những điểm khác không hợp lệ
     */
    @Test
    public void testCalculateValidAverage_OneValidScore() {
        // Input: 7.5, -1, 11, 20
        // Expected: 7.5
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(7.5, -1.0, 11.0, 20.0)), 0.01);
    }
    
    /**
     * Trường hợp đặc biệt: Tất cả điểm bằng nhau
     */
    @Test
    public void testCalculateValidAverage_AllSameScores() {
        // Input: 5.0, 5.0, 5.0, 5.0
        // Expected: 5.0
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(5.0, 5.0, 5.0, 5.0)), 0.01);
    }
}
