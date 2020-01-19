package com.example.jiyoung.helloworldtest.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * unit test 를 먼저 작성한 후에! 실제로 이부분을 구현합니다.
 */
class MainViewModel : ViewModel() {
    private val _helloWorldEvent = MutableLiveData<String>().apply { postValue("Hello, World!") }
    val helloWorldEvent : LiveData<String> get() = _helloWorldEvent

    private val _clickButtonAEvent = MutableLiveData<String>()
    val clickButtonAEvent : LiveData<String> get() = _clickButtonAEvent

    fun onClickA() {
        // 실제 앱을 구현한다면 당연히 string 리소스 파일에 넣겠지만, 지금은 그냥 하드코딩으로 박겠습니다
        // 귀찮아서 그런건 아니고..............다 이유가 있어여~~
        _clickButtonAEvent.value = "A버튼 누름!"
    }
}
