package com.calisthenics.dragonhealth.room.model.dao;

import com.calisthenics.dragonhealth.room.model.dto.Room;

import java.sql.SQLException;

public interface RoomDao {

    void addRoom(Room room) throws SQLException;
}
