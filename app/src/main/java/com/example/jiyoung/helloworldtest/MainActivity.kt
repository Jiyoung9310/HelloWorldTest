package com.example.jiyoung.helloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.jiyoung.helloworldtest.ui.main.MainViewModel
import kotlinx.android.synthetic.main.main_activity.*

/**
 * app > src > test > java > 패키지명 > 여기서 유닛 테스트를 작성합니다.
 * (androidTest 폴더에 안에는 보통 UI테스트 코드를 작성하는데 우리는 Unit테스트만 할꺼임)
 * 항상 테스트 코드를 먼저! 작성하고 테스트를 돌렸을 때 통과가 되면, 실제 기능 구현을 합니다.
 */
class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        btnA.setOnClickListener { viewModel.onClickA() }
        vmObserve()
    }

    private fun vmObserve() {
        viewModel.helloWorldEvent.observe(this, Observer {
            tvHello.text = it
        })

        viewModel.clickButtonAEvent.observe(this, Observer {
            tvHello.text = it
        })
    }
}
