package org.yourcompany.yourproject;

import java.util.List;

/**
 * Lớp phân tích điểm số của học sinh
 */
public class StudentAnalyzer {
    
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // Xử lý trường hợp danh sách rỗng
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        
        // Duyệt qua danh sách điểm để lọc học sinh giỏi
        for (Double score : scores) {
            // Điều kiện 1: Kiểm tra điểm hợp lệ (từ 0 đến 10)
            if (score >= 0 && score <= 10) {
                // Kiểm tra điểm giỏi (>= 8.0)
                if (score >= 8.0) {
                    count++;
                }
            }
        }
        
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public double calculateValidAverage(List<Double> scores) {
        // Xử lý trường hợp danh sách rỗng
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        int validCount = 0;
        
        // Duyệt qua danh sách để tính trung bình hợp lệ
        for (Double score : scores) {
            // Điều kiện 1: Kiểm tra điểm hợp lệ (từ 0 đến 10)
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }
        
        // Trả về 0 nếu không có điểm hợp lệ
        if (validCount == 0) {
            return 0;
        }
        
        return sum / validCount;
    }
}
