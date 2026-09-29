package com.example.employeeinfo_23115141122114

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Ánh xạ các View
        val tvMaSinhVien = findViewById<TextView>(R.id.tvMaSinhVien)
        val tvHoTen = findViewById<TextView>(R.id.tvHoTen)
        val tvLop = findViewById<TextView>(R.id.tvLop)
        val tvTuoi = findViewById<TextView>(R.id.tvTuoi)
        val tvKhoa = findViewById<TextView>(R.id.tvKhoa)
        val tvDiem = findViewById<TextView>(R.id.tvDiem)
        val tvTrangThai = findViewById<TextView>(R.id.tvTrangThai)
        val tvXepLoai = findViewById<TextView>(R.id.tvXepLoai)

        val btnHienThi = findViewById<Button>(R.id.btnHienThi)

        // Tạo Model Student
        val student = Student(
            maSinhVien = "23115141122114",
            hoTen = "Tạ Quang Nhựt",
            lop = "23sk1",
            tuoi = 20,
            diem = 8.5,
            khoa = "Sư phạm kĩ thuât"
        )

        // Xử lý khi nhấn Button
        btnHienThi.setOnClickListener {

            // Lấy dữ liệu từ Model
            tvMaSinhVien.text = "Mã sinh viên: ${student.maSinhVien}"

            tvHoTen.text = "Họ tên: ${student.hoTen.vietHoa()}"

            tvLop.text = "Lớp: ${student.lop}"

            tvTuoi.text = "Tuổi: ${student.tuoi}"

            tvKhoa.text = "Khoa: ${student.khoa}"

            tvDiem.text = "Điểm: ${student.diem.diemFormat()}"

            tvTrangThai.text =
                "Trạng thái: ${student.diem.trangThai()}"

            tvXepLoai.text =
                "Xếp loại: ${student.diem.xepLoai()}"
        }
    }
}