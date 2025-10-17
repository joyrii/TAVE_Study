package com.study.todo_memo

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.icu.util.GregorianCalendar
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database

class MainActivity : AppCompatActivity() {

    val dataModelList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.getReference("myMemo")

        val recyclerView = findViewById<RecyclerView>(R.id.mainRV)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val rvAdapter = RVAdapter(dataModelList)
        recyclerView.adapter = rvAdapter

        myRef.child(Firebase.auth.currentUser!!.uid).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                dataModelList.clear()
                for (dataModel in snapshot.children) {
                    Log.d("Data", dataModel.toString())
                    dataModelList.add(dataModel.getValue(DataModel::class.java)!!)
                }
                rvAdapter.notifyDataSetChanged()
                Log.d("DataModel", dataModelList.toString())

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        val writeButton = findViewById<ImageView>(R.id.writeBtn)
        writeButton.setOnClickListener {

            val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("Todo Dialog")

            val mAlertDialog = mBuilder.show()

            val dateSelectBtn = mAlertDialog.findViewById<Button>(R.id.dateSelectBtn)

            var dateText = ""

            dateSelectBtn?.setOnClickListener {

                val today = GregorianCalendar()
                val year : Int = today.get(Calendar.YEAR)
                val month : Int = today.get(Calendar.MONTH)
                val date : Int = today.get(Calendar.DATE)

                val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int
                    ) {
                        Log.d("MAIN", "${year}. ${month + 1}. ${dayOfMonth}.")
                        dateSelectBtn.setText("${year}. ${month + 1}. ${dayOfMonth}.")
                        dateText = "${year}. ${month + 1}. ${dayOfMonth}."
                    }
                }, year, month, date)
                dlg.show()

            }

            val saveBtn = mAlertDialog.findViewById<Button>(R.id.saveBtn)
            saveBtn?.setOnClickListener {

                val todoMemo = mAlertDialog.findViewById<EditText>(R.id.todoMemo)?.text.toString()

                val database = Firebase.database
                val myRef = database.getReference("myMemo").child(Firebase.auth.currentUser!!.uid)

                val model = DataModel(dateText, todoMemo)

                myRef.push().setValue(model)

                mAlertDialog.dismiss()

            }

        }

    }
}