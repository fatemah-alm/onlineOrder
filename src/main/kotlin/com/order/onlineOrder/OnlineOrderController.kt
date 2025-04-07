package com.order.onlineOrder

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class OnlineOrderController(
    val ordersRepository: OrdersRepository
){

    @GetMapping("/home")
    fun onlineOrder() =  "Start Ordering Food!"

    @PostMapping("/my-order")
    fun orderFood( @RequestBody request: OrderFoodRequest) = ordersRepository.save(Order(user = request.user, restaurant=request.restaurant, items=request.items))
}

data class OrderFoodRequest(
    val user: String,
    val restaurant: String,
    val items: String
)


