package com.example.employeeinfo_23115141122114

class StudentExtensions {

// Kiểm tra sinh viên đạt hay chưa đạt
    fun Double.trangThai(): String {
        return if (this >= 5.0) {
            "ĐẠT"
        } else {
            "CHƯA ĐẠT"
        }
    }
// Xếp loại dựa trên điểm
    fun Double.xepLoai(): String {
        return when {
            this >= 8.5 -> "XUẤT SẮC"
            this >= 7.0 -> "GIỎI"
            this >= 5.0 -> "KHÁ"
            this >= 4.0 -> "TRUNG BÌNH"
            else -> "YẾU"
        }
    }

// Định dạng điểm
    fun Double.diemFormat(): String {
        return String.format("%.2f", this)
    }

// Viết hoa họ tên
    fun String.vietHoa(): String {
        return this.uppercase()
    }

// Hiển thị toàn bộ thông tin Student
    fun Student.thongTin(): String {
        return """
        Mã sinh viên: $maSinhVien
        Họ tên: ${hoTen.vietHoa()}
        Lớp: $lop
        Tuổi: $tuoi
        Khoa: $khoa
        Điểm: ${diem.diemFormat()}
        Trạng thái: ${diem.trangThai()}
        Xếp loại: ${diem.xepLoai()}
    """
    }
}