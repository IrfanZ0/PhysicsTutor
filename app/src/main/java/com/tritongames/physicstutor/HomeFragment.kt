package com.tritongames.physicstutor

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class HomeFragment : Fragment() {

    private lateinit var ptViewModel : PhysicsTutorViewModel
    private lateinit var nameSpinner: Spinner

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        nameSpinner = view.findViewById(R.id.student_name_spinner) as Spinner

        val vmp = ViewModelProvider(this)
        ptViewModel = vmp.get(PhysicsTutorViewModel::class.java)
        ptViewModel.getUsers().observe(viewLifecycleOwner, Observer{ users ->
            val arrayAdapter = ArrayAdapter(
                requireActivity().applicationContext,
                android.R.layout.simple_spinner_item,
                users )
            nameSpinner.adapter = arrayAdapter

            nameSpinner.onItemClickListener = object : AdapterView.OnItemSelectedListener,
                AdapterView.OnItemClickListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val studentName : String = parent?.getItemAtPosition(position).toString()
                    val intent = Intent(activity, DashBoardFragment::class.java)
                    intent.putExtra("nameOfStudent", studentName)
                    startActivity(intent)

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    TODO("Not yet implemented")
                }

            }

        })
        return view
    }




}






