package com.tritongames.physicstutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class DashBoardFragment : Fragment() {

    private lateinit var tvStudentName : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_dashboard, container, false)
        tvStudentName = view.findViewById((R.id.student_name))
        if (savedInstanceState != null) {
            tvStudentName.text = savedInstanceState.getString("nameOfStudent")
        }
        return view
    }


}