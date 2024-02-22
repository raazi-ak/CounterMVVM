package com.raazi.countermvvm

data class CounterModel(var count: Int)

class CounterRepository(){
    private var _counter = CounterModel(0)
    fun getCounter() = _counter
    fun increment(){
        _counter.count++

    }
    fun decrement(){
        _counter.count--
        if (_counter.count <0){
            _counter.count=0
        }
    }
}