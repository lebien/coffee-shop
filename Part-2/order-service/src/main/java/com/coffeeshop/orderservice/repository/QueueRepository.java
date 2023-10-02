package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.model.Queue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueueRepository extends JpaRepository<Queue,Long> {

    @Query( "SELECT CASE WHEN COUNT(q) > 0 THEN true ELSE false END " +
            "FROM Queue q WHERE q.shop.shopId= :shopId AND q.currentStatus = true" )
    boolean isQueueAvailable(@Param("shopId") Long shopId);

    @Query("SELECT q FROM Queue q WHERE q.shop.shopId= :shopId AND q.currentStatus = true ORDER BY queueNumber ASC" )
    List<Queue> findByShopIdOrderByQueueNumber(@Param("shopId") Long shopId );

}
