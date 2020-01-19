package com.example.jiyoung.helloworldtest.ui.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()  // 요게 있어야 livedata observe를 돌릴수가 있어여

    private lateinit var viewModel: MainViewModel

    // Before 어노테이션이 달린 메소드는 @Test 메소드를 돌기 전에 항상 먼저 실행 됩니다.
    @Before
    fun init() {
        viewModel = MainViewModel()
    }

    // Given, When, Then 으로 내가 테스트하고자 하는 로직을 명확히 표기합니다.
    // 어느 누가 보더라도 이해하기 쉽도록!!
    @Test
    fun `(Given) 메인 화면에 진입 시 (When) x (Then) Hello, World! 텍스트를 표시`() {
        val expectedResult = "Hello, World!" // 내가 도출되길 원하는 결과값
        viewModel.helloWorldEvent.observeForever {
            assertEquals(expectedResult, it)
        }
    }

    // 테스트 코드를 작성하는 이유는 다른 사람과의 협업을 위함이라는 사실을 인지합니다.
    // 'MainViewModel 이라는 클래스는 이런이런 로직을 수행하는 역할을 한다' 라는 것을 나타내기 위한 작업입니다.
    // 실제 제품을 제작하기 전에 청사진을 그리는 작업이라고 생각하면 쉽습니다.
    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) A 버튼 클릭 시 (Then) A버튼 누름! 텍스트를 표시`() {
        val expectedResult = "A버튼 누름!"
        viewModel.clickButtonAEvent.observeForever {
            assertEquals(expectedResult, it)
        }
        viewModel.onClickA()
    }
}