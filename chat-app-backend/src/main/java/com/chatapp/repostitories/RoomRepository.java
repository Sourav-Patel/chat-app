package com.chatapp.repostitories;

import com.chatapp.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String> {

    //get room using room id
    Room findByRoomId(String roomId);
}