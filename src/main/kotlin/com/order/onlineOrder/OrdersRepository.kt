package com.order.onlineOrder

import jakarta.inject.Named
import jakarta.persistence.*
import org.springframework.data.jpa.repository.JpaRepository

@Named
interface OrdersRepository : JpaRepository<Order, Long>

@Entity
@Table(name = "`ORDERS`")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var user: String,
    var restaurant:String,
    var items:String
){
    constructor() : this(null, "","","")
}