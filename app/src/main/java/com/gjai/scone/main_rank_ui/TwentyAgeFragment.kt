package com.gjai.scone.main_rank_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gjai.scone.R
import kotlinx.android.synthetic.main.fragment_ten_age.*
import kotlinx.android.synthetic.main.fragment_ten_age.imageView
import kotlinx.android.synthetic.main.info_main_layout.*

class TwentyAgeFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_twenty_age, container,false)
        return view
    }
    // 뷰 생성이 완료되면 호출되는 메소드
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        section_label.text = arguments?.let {
            it.getInt(num).toString()
        }
        imageView.setImageResource(R.drawable.funny)
    }

    companion object {
        private const val num = "num"

        @JvmStatic
        fun newInstance(Number: Int): TwentyAgeFragment {
            return TwentyAgeFragment().apply {
                arguments = Bundle().apply {
                    putInt(num, Number)
                }
            }
        }
    }
}