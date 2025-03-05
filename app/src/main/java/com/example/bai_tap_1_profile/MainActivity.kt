package com.example.bai_tap_1_profile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Ánh xạ ImageView
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnEdit = findViewById<ImageView>(R.id.btnEdit)

        // Sự kiện khi bấm vào nút quay lại
        btnBack.setOnClickListener {
            Toast.makeText(this, "Quay lại", Toast.LENGTH_SHORT).show()
            finish() // Kết thúc activity (quay lại màn hình trước)
        }

        // Sự kiện khi bấm vào nút chỉnh sửa
        btnEdit.setOnClickListener {
            Toast.makeText(this, "Chỉnh sửa", Toast.LENGTH_SHORT).show()
            // Ở đây bạn có thể mở Activity chỉnh sửa thông tin
        }

        // Ánh xạ các thành phần trong XML bằng ID
        val nameTextView = findViewById<TextView>(R.id.tvName)
        val addressTextView = findViewById<TextView>(R.id.tvAddress)
        val phoneTextView = findViewById<TextView>(R.id.tvPhone)
        val emailTextView = findViewById<TextView>(R.id.tvEmail)
        val avatarImageView = findViewById<ImageView>(R.id.avatarImage)

        // Gán dữ liệu vào TextView
        nameTextView.text = "Nguyễn Thành Can"
        addressTextView.text = "Thủ Dầu Một, Việt Nam"
        phoneTextView.text = "SĐT: 0987 654 321"
        emailTextView.text = "Email: 2251120136@ut.edu.vn"

        // Gán ảnh đại diện (ảnh phải có trong thư mục drawable, ví dụ: avatar.png)
        avatarImageView.setImageResource(R.drawable.anhdaidien)
    }
}
