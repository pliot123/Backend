package com.backend.db.repository;

import com.backend.db.entity.SendFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SendFriendRepository extends JpaRepository<SendFriend,String> {

    @Query("DELETE FROM SendFriend m WHERE m.sendSequence=:send AND m.getSequence=:get")
    void deleteSendingList(Integer send, Integer get);
}
