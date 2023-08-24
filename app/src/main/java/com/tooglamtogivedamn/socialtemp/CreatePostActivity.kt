package com.tooglamtogivedamn.socialtemp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.tooglamtogivedamn.socialtemp.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    lateinit var postButton:Button
    lateinit var postInput:EditText
    private lateinit var postDao:PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
    postDao=PostDao()
    postButton=findViewById(R.id.postButton)
    postInput=findViewById(R.id.postInput)
        postButton.setOnClickListener{
            val input=postInput.text.toString().trim()
            if(input.isNotEmpty()) {

                postDao.addPost(input)
                finish()
            }
        }
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

    }

}
