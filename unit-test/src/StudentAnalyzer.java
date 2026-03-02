package com.example.exercise1;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng hoặc null, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // Điều kiện 2: Nếu danh sách rỗng hoặc null thì trả về 0
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Vòng lặp 1: Duyệt qua danh sách điểm để lọc học sinh giỏi
        for (Double score : scores) {
            // Bỏ qua giá trị null
            if (score == null) {
                continue;
            }

            // Điều kiện 1: Validate - bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
            if (score < 0 || score > 10) {
                continue;
            }

            // Đếm học sinh đạt loại Giỏi (>= 8.0)
            if (score >= 8.0) {
                count++;
            }
        }

        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     * - Bỏ qua điểm âm hoặc lớn hơn 10
     * - Nếu không có điểm hợp lệ, trả về 0
     */
    public double calculateValidAverage(List<Double> scores) {
        // Điều kiện 2: Nếu danh sách rỗng hoặc null thì trả về 0
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int validCount = 0;

        // Vòng lặp 2: Duyệt qua danh sách để tính trung bình hợp lệ
        for (Double score : scores) {
            // Bỏ qua giá trị null
            if (score == null) {
                continue;
            }

            // Điều kiện 1: Validate - bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
            if (score < 0 || score > 10) {
                continue;
            }

            // Cộng dồn điểm hợp lệ
            sum += score;
            validCount++;
        }

        // Tránh chia cho 0 nếu không có điểm hợp lệ
        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}