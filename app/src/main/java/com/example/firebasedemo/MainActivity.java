package com.example.firebasedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.firebasedemo.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding ;
    String course;
    String imageURL;
    String email;
    String studentName;

    FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentName = binding.etName.getText().toString();
                imageURL = binding.etImage.getText().toString();
                email = binding.etEmail.getText().toString();
                course =binding.etCourse.getText().toString();


                    StudentModel studentModel = new StudentModel(course,imageURL,email,studentName);

                    db =FirebaseDatabase.getInstance();
                    reference = db.getReference("Students");
                    reference.child(studentName).setValue(studentModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.etName.setText("");
                            binding.etImage.setText("");
                            binding.etEmail.setText("");
                            binding.etCourse.setText("");
                            Toast.makeText(MainActivity.this, "success!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

        });
    }
}