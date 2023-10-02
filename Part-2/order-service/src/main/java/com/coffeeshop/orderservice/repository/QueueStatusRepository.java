package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.model.Queue;
import com.coffeeshop.orderservice.model.QueueStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QueueStatusRepository extends JpaRepository<QueueStatus,Long> {

//    @Query("SELECT q FROM QueueStatus q WHERE q.queue.queueId= :queueId AND q.position = :position ")
//    Optional<QueueStatus> findByQueueIdAndPosition(@Param("queueId") Long queueId, @Param("position") Integer position);
}
