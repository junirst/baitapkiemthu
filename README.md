# baitapkiemthu
<img width="1902" height="940" alt="image" src="https://github.com/user-attachments/assets/55f19e88-e597-4509-9ab3-45c215768eb2" />

Bài thực hành 2 : 
# Bài tập Kiểm thử phần mềm - Unit Test

## Mô tả bài toán

Chương trình phân tích điểm số học sinh với 2 chức năng chính: 

| Hàm | Chức năng |
|-----|-----------|
| `countExcellentStudents()` | Đếm số học sinh đạt loại Giỏi (điểm >= 8.0) |
| `calculateValidAverage()` | Tính điểm trung bình của các điểm hợp lệ |

**Quy tắc xử lý:**
- Điểm hợp lệ:  từ 0 đến 10
- Điểm không hợp lệ (< 0 hoặc > 10): bị bỏ qua
- Danh sách rỗng: trả về 0

---

## Cấu trúc thư mục

```
Kiem-thu-phan-mem/
├── README.md
└── unit-test/
    ├── src/
    │   └── StudentAnalyzer.java
    └── test/
        └── StudentAnalyzerTest.java
```

---

## Hướng dẫn chạy chương trình

### Yêu cầu
- Java JDK 21
- Maven 3.9+
- IntelliJ IDEA

### Các bước thực hiện

1. Clone repository: 
```bash
git clone https://github.com/lmd17072005/Kiem-thu-phan-mem.git
```

2. Mở project trong IntelliJ IDEA

3. Copy file mã nguồn vào đúng thư mục: 
   - `StudentAnalyzer.java` → `src/main/java/com/example/exercise1/`
   - `StudentAnalyzerTest.java` → `src/test/java/com/example/exercise1/`

---

## Hướng dẫn chạy kiểm thử đơn vị

### Cách 1: Chạy bằng Maven

```bash
mvn clean test
```

### Cách 2: Chạy trong IntelliJ

1. Chuột phải vào file `StudentAnalyzerTest.java`
2. Chọn **Run 'StudentAnalyzerTest'**

### Kết quả mong đợi

```
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

## Chi tiết Test Cases

| Test Case | Input | Expected | Giải thích |
|-----------|-------|----------|------------|
| testCountExcellentStudents | [9.0, 8.5, 7.0, 11.0, -1.0] | 2 | Đếm 9.0 và 8.5 |
| testCountExcellentStudents | [] | 0 | Danh sách rỗng |
| testCalculateValidAverage | [9.0, 8.5, 7.0, 11.0, -1.0] | 8.17 | (9.0+8.5+7.0)/3 |

---

## Danh sách Issues

- Issue #1: Viết hàm countExcellentStudents()
- Issue #2: Viết hàm calculateValidAverage()
- Issue #3: Viết test cho 2 hàm trên
- Issue #4: Viết tài liệu README. md

---

## Thông tin sinh viên

- **Họ tên:** Phạm Quang Đạt
- **GitHub:** [junirst](https://github.com/junirst/baitapkiemthu.git)

Bài thực hành 3 :
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/4ba14dc2-880d-4688-b225-19890de8db84" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/3a552b30-8c10-4153-a473-dfb6995afc4c" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/9c85b8b8-512b-417e-931a-98dd77d799c8" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/3e7d5a05-1f72-4adf-9e87-cf8e8304ab45" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/e3609b44-1e62-4a52-bd83-251ea1f2a49d" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/c13bd8b2-11cd-44dd-9c7e-877a1998be5c" />

Bài thực hành 4 :





