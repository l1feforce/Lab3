package ru.spbstu.gusev.lab3_5_2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.layout_info.*

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.layout_info, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextFragment = arguments?.getInt("next_fragment") ?: 1
        val navController = this.findNavController()
        next_button.setOnClickListener {
            when (nextFragment) {
                2 -> navController.navigate(R.id.action_info_fragment_to_second_fragment)
                3 -> navController.navigate(R.id.action_info_fragment_to_third_fragment)
            }
        }
    }
}
