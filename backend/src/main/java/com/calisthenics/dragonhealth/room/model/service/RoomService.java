package com.calisthenics.dragonhealth.room.model.service;

import com.calisthenics.dragonhealth.room.model.dto.Room;

public interface RoomService {
    void makeRoom(String roomId, Room room) throws Exception;

}
