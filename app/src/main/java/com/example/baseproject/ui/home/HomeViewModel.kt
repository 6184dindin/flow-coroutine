package com.example.baseproject.ui.home

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.core.base.BaseViewModel
import com.example.core.database.DatabaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val databaseRepository: DatabaseRepository
) : BaseViewModel() {
    init {
        viewModelScope.launch {
//            val nums = flowOf(1, 2, 3).onEach { delay(1000) }
//            val strs = flowOf("one", "two", "three").onEach { delay(2000) }
//            val arrs = flowOf("a", "b", "c").onEach { delay(3000) }
//            val startTime = System.currentTimeMillis()
//            nums.combine(strs) { a, b -> "$a -> $b" }
//                .collect { value ->
//                    Log.e("TAG", "$value at ${System.currentTimeMillis() - startTime}")
//
//                }
//            combineTransform(nums, strs, arrs) {
//                a, b, c ->
//                emit("$a - $b - $c")
//            }.collect { value ->
//                Log.e("TAG", "$value at ${System.currentTimeMillis() - startTime}")
//            }
//            nums.zip(strs) {i, j ->
//                Pair(i, j)
//            }.zip(arrs) {pair, k ->
//                "${pair.first} - ${pair.second} - $k"
//            }.collect { value ->
//                    Log.e("TAG", "$value at ${System.currentTimeMillis() - startTime}")
//
//            }
        }


        //case1: Cho 3 api chạy song song khi nào cả 3 cái xong thì update view.
        viewModelScope.launch {
//            val flow1 = databaseRepository.getFlow1()
//            val flow2 = databaseRepository.getFlow2()
//            val flow3 = databaseRepository.getFlow3()
//            val startTime = System.currentTimeMillis()
//            val f = flow1.zip(flow2) { i, j ->
//                Pair(i, j)
//            }.zip(flow3) { pair, s ->
//                Pair(pair, s)
//            }
//            f.collect {
//                Log.e("TAG", ": ${it.first.first} - ${it.first.second} - ${it.second} at ${System.currentTimeMillis() - startTime}", )
//            }
        }


        //case2: cho 3 api chạy song song, cái nào xong thì update view luôn, khi cả 3 cái xong thì thông báo lên màn hình.
        viewModelScope.launch {
//            val flow1 = databaseRepository.getFlow1()
//            val flow2 = databaseRepository.getFlow2()
//            val flow3 = databaseRepository.getFlow3()
//            val startTime = System.currentTimeMillis()
//            merge(flow1, flow2, flow3)
//                .onCompletion {
//                    Log.e("TAG", "Done: at ${System.currentTimeMillis() - startTime}")
//                }.collect {
//                    Log.e("TAG", "${it}: at ${System.currentTimeMillis() - startTime}")
//                }
        }
        viewModelScope.launch {
//            val flow1 = databaseRepository.getFlow1().transform { emit(Pair("Flow 1", it)) }
//            val flow2 = databaseRepository.getFlow2().map { Pair("Flow 2", it) }
//            val flow3 = databaseRepository.getFlow3().map { Pair("Flow 3", it) }
//            val flow4 = databaseRepository.getFlow4().map { Pair("Flow 4", it) }
//            val startTime = System.currentTimeMillis()
//            merge(flow1, flow2, flow3, flow4)
//                .onCompletion {
//                    Log.e("TAG", "Done: at ${System.currentTimeMillis() - startTime}", )
//                }
//                .collect {
//                    when(it.first) {
//                        "Flow 1" -> Log.e("TAG", "${it.second}: at ${System.currentTimeMillis() - startTime}", )
//                        "Flow 2" -> Log.e("TAG", "${it.second}: at ${System.currentTimeMillis() - startTime}", )
//                        "Flow 3" -> Log.e("TAG", "${it.second}: at ${System.currentTimeMillis() - startTime}", )
//                        "Flow 4" -> Log.e("TAG", "${it.second}: at ${System.currentTimeMillis() - startTime}", )
//                    }
//                }
        }


        //case3: chạy tuần tự 3 api...
        viewModelScope.launch {
//            val flow1 = databaseRepository.getFlow1()
//            val flow2 = databaseRepository.getFlow2()
//            val flow3 = databaseRepository.getFlow3()
//            val startTime = System.currentTimeMillis()
//            flow1.collect {
//                Log.e("TAG", "$it: at ${System.currentTimeMillis() - startTime}", )
//            }
//            flow2.collect {
//                Log.e("TAG", "$it: at ${System.currentTimeMillis() - startTime}", )
//            }
//            flow3.collect {
//                Log.e("TAG", "$it: at ${System.currentTimeMillis() - startTime}", )
//            }
//            Log.e("TAG", "Done: at ${System.currentTimeMillis() - startTime}", )
        }
    }
}
