package com.tritongames.physicstutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PurchaseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PurchaseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_purchase, container, false)
        val purchaseItems = mutableListOf(
            ItemData(
                productName = "Sample quiz",
                productDescription = "free physics quiz you could try",
                isChecked = false,
                isClicked = false,
                price = 0.00
            ),
            ItemData(
                productName = "Easy level quiz",
                 productDescription = "A quiz for the beginners",
                isChecked = false,
                isClicked = false,
                price = 0.50),
            ItemData(
                productName = "Medium level quiz",
                productDescription = "A quiz for the intermediate level",
                isChecked = false,
                isClicked = false,
                price = 1.00),
            ItemData(
                productName = "Expert level quiz",
                productDescription = "A quiz for the pros",
                isChecked = false,
                isClicked = false,
                price = 1.50)
        )
        val customAdapter = CustomAdapter(purchaseItems)
        val purchaseRecycleView : RecyclerView = view.findViewById(R.id.purchaseRV)
        purchaseRecycleView.adapter = customAdapter
        return purchaseRecycleView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PurchaseFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PurchaseFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}