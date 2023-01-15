package com.calisthenics.dragonhealth.room.model.service;

import com.calisthenics.dragonhealth.room.model.dao.RoomDao;
import com.calisthenics.dragonhealth.room.model.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomdao;

    @Override
    public void makeRoom(String roomId, Room room){
        System.out.println();
    }
}
