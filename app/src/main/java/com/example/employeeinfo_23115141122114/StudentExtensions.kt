package com.example.employeeinfo_23115141122114

fun Double.trangThai(): String {
    return if (this >= 5.0) {
        "ĐẠT"
    } else {
        "CHƯA ĐẠT"
    }
}

fun Double.xepLoai(): String {
    return when {
        this >= 8.5 -> "XUẤT SẮC"
        this >= 7.0 -> "GIỎI"
        this >= 5.0 -> "KHÁ"
        this >= 4.0 -> "TRUNG BÌNH"
        else -> "YẾU"
    }
}

fun Double.diemFormat(): String {
    return String.format("%.2f", this)
}

fun String.vietHoa(): String {
    return this.uppercase()
}

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
    """.trimIndent()
}