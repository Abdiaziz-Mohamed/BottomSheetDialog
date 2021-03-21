package com.example.bottomsheetdialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom_sheet.view.*

class BottomFragment(): BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        var btncontinue = view.btncontinue;
        var edUsername = view.edUsername;

        btncontinue.setOnClickListener{
            if (edUsername.text.trim().toString().isNotEmpty()){
             var username = edUsername.text.trim().toString();
                startActivity(Intent(requireContext(),ItemActivity::class.java).putExtra("data",username))
                dismiss()
            }else{
                Toast.makeText(requireContext(), "Input Required", Toast.LENGTH_LONG).show()
            }
        }
        return view;
    }

}