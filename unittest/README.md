# Bài Tập Kiểm Thử Đơn Vị - StudentAnalyzer

## Mô Tả Bài Toán

Bài tập này yêu cầu xây dựng một chương trình Java để phân tích điểm số của học sinh với hai hàm chính:

1. **countExcellentStudents()**: Đếm số học sinh đạt loại Giỏi (điểm >= 8.0)
2. **calculateValidAverage()**: Tính điểm trung bình của các điểm hợp lệ

### Điều Kiện Xử Lý
- **Điểm hợp lệ**: Từ 0 đến 10
- **Điểm không hợp lệ**: Nhỏ hơn 0 hoặc lớn hơn 10 (bỏ qua)
- **Danh sách rỗng**: Trả về giá trị mặc định (0 hoặc 0.0)

---

## Cấu Trúc Dự Án

```
unittest/
├── pom.xml                          # Cấu hình Maven
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/yourcompany/yourproject/
│   │           └── StudentAnalyzer.java      # Lớp chính chứa 2 phương thức
│   └── test/
│       └── java/
│           └── org/yourcompany/yourproject/
│               └── StudentAnalyzerTest.java   # Lớp kiểm thử JUnit
└── README.md                         # Tài liệu này
```

---

## Mô Tả Các Phương Thức

### 1. countExcellentStudents(List<Double> scores)

Đếm số học sinh đạt loại Giỏi (điểm >= 8.0)

**Tham số:**
- `scores`: Danh sách điểm số từ 0 đến 10

**Trả về:**
- Số lượng học sinh đạt loại Giỏi (>= 8.0)

**Xử lý:**
- Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
- Nếu danh sách rỗng, trả về 0

**Ví dụ:**
```java
List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
// Điểm hợp lệ: 9.0, 8.5, 7.0
// Điểm giỏi: 9.0, 8.5
// Kết quả: 2
int result = analyzer.countExcellentStudents(scores); // 2
```

### 2. calculateValidAverage(List<Double> scores)

Tính điểm trung bình hợp lệ (từ 0 đến 10)

**Tham số:**
- `scores`: Danh sách điểm

**Trả về:**
- Điểm trung bình của các điểm hợp lệ

**Xử lý:**
- Bỏ qua điểm âm hoặc lớn hơn 10
- Nếu danh sách rỗng, trả về 0

**Ví dụ:**
```java
List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
// Điểm hợp lệ: 9.0, 8.5, 7.0
// Trung bình: (9.0 + 8.5 + 7.0) / 3 = 8.17
double result = analyzer.calculateValidAverage(scores); // 8.17
```

---

## Yêu Cầu Kiểm Thử

Lớp `StudentAnalyzerTest` chứa các ca kiểm thử (test cases) cho mỗi phương thức:

### Kiểm Thử countExcellentStudents()

| Test Case | Mô Tả | Input | Expected |
|-----------|-------|-------|----------|
| Mixed Valid & Invalid | Danh sách có hỗn hợp | [9.0, 8.5, 7.0, 11.0, -1.0] | 2 |
| All Valid & Excellent | Tất cả hợp lệ và giỏi | [8.0, 9.0, 8.5, 10.0] | 4 |
| Empty List | Danh sách rỗng | [] | 0 |
| Null List | Danh sách null | null | 0 |
| Boundary Values | Giá trị biên (0, 10) | [0.0, 10.0, 8.0] | 2 |
| Invalid Scores | Tất cả không hợp lệ | [-5.0, 15.0, 9.0] | 1 |

### Kiểm Thử calculateValidAverage()

| Test Case | Mô Tả | Input | Expected |
|-----------|-------|-------|----------|
| Mixed Valid & Invalid | Danh sách có hỗn hợp | [9.0, 8.5, 7.0, 11.0, -1.0] | 8.17 |
| All Valid | Tất cả hợp lệ | [8.0, 9.0, 7.0, 6.0] | 7.5 |
| Empty List | Danh sách rỗng | [] | 0 |
| Null List | Danh sách null | null | 0 |
| Boundary Values | Giá trị biên (0, 10) | [0.0, 10.0] | 5.0 |
| All Invalid | Tất cả không hợp lệ | [-1.0, 11.0, -10.0, 20.0] | 0 |
| One Valid | Một điểm hợp lệ | [7.5, -1.0, 11.0, 20.0] | 7.5 |

---

## Hướng Dẫn Chạy Chương Trình

### Yêu Cầu Tiên Quyết
- **Java 11+** trở lên
- **Maven 3.6+** trở lên

### 1. Chuẩn Bị Môi Trường

```bash
# Cài đặt Java (nếu chưa cài)
# Cài đặt Maven (nếu chưa cài)
```

### 2. Chạy Kiểm Thử Đơn Vị

#### Cách 1: Sử dụng Maven

```bash
cd unittest
mvn clean test
```

**Output mong đợi:**
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.yourcompany.yourproject.StudentAnalyzerTest
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.xxx s
[INFO] 
[INFO] BUILD SUCCESS
```

#### Cách 2: Chạy một test case cụ thể

```bash
mvn test -Dtest=StudentAnalyzerTest#testCountExcellentStudents_MixedValidAndInvalid
```

#### Cách 3: Chạy tất cả test với coverage

```bash
mvn clean test
```

### 3. Xem Chi Tiết Test

Để xem chi tiết từng bước trong quá trình test:

```bash
mvn test -X
```

### 4. Compile Mã Nguồn (không chạy test)

```bash
mvn clean compile
```

---

## Kết Cấu Các Issues Trên GitHub

| Issue # | Tiêu Đề | Mô Tả |
|---------|---------|-------|
| #1 | Viết hàm countExcellentStudents() | Cần xử lý kiểm tra điểm hợp lệ và đếm học sinh giỏi |
| #2 | Viết hàm calculateValidAverage() | Tính trung bình các điểm hợp lệ |
| #3 | Viết test cho 2 hàm trên | Dùng JUnit để kiểm thử đầy đủ |
| #4 | Viết tài liệu README.md | Mô tả bài toán, cách chạy chương trình, test |

---

## Commit Messages Gắn Với Issues

```bash
git commit -m "feat: implement countExcellentStudents() #1"
git commit -m "feat: implement calculateValidAverage() #2"
git commit -m "test: add comprehensive unit tests for StudentAnalyzer #3"
git commit -m "docs: add README with instructions and test cases #4"
```

---

## Kết Quả Kiểm Thử

Sau khi chạy `mvn clean test`, bạn sẽ thấy tất cả 13 test cases đều pass:

```
✓ testCountExcellentStudents_MixedValidAndInvalid
✓ testCountExcellentStudents_AllValidAndExcellent
✓ testCountExcellentStudents_EmptyList
✓ testCountExcellentStudents_NullList
✓ testCountExcellentStudents_BoundaryValues
✓ testCountExcellentStudents_InvalidScores
✓ testCountExcellentStudents_AllInvalidScores
✓ testCalculateValidAverage_MixedValidAndInvalid
✓ testCalculateValidAverage_AllValid
✓ testCalculateValidAverage_EmptyList
✓ testCalculateValidAverage_NullList
✓ testCalculateValidAverage_BoundaryValues
✓ testCalculateValidAverage_AllInvalidScores
✓ testCalculateValidAverage_OneValidScore
✓ testCalculateValidAverage_AllSameScores
```

---

## Ghi Chú Quan Trọng

### Xử Lý Dữ Liệu Không Hợp Lệ
- Điểm < 0 hoặc > 10 được coi là không hợp lệ
- Các điểm không hợp lệ được bỏ qua hoàn toàn trong tính toán
- Không ném exception, chỉ bỏ qua điểm không hợp lệ

### Xử Lý Trường Hợp Đặc Biệt
- Nếu danh sách là null, xử lý như danh sách rỗng
- Nếu không có điểm hợp lệ nào, trả về 0 cho cả hai hàm
- Sử dụng chính xác số thập phân (floating point) trong tính toán

### Gợi Ý Best Practice
- Luôn kiểm tra null trước khi sử dụng collection
- Sử dụng Stream API của Java 8+ để làm code gọn hơn (tùy chọn)
- Viết test trước khi viết code (Test-Driven Development)
- Bao gồm đủ các trường hợp: bình thường, biên, ngoại lệ

---

## Tài Liệu Tham Khảo

- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Java List Interface](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)

---

## Tác Giả

Sinh viên: [Tên của bạn]
Lớp: [Lớp của bạn]
Ngày nộp: [Ngày nộp]

---

**Chúc bạn thực hiện bài tập thành công!** ✓
