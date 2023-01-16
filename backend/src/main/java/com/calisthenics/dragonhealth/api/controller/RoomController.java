package com.calisthenics.dragonhealth.api.controller;

import com.calisthenics.dragonhealth.room.model.dto.Room;
import com.calisthenics.dragonhealth.util.RandomNumberUtil;
import io.openvidu.java.client.OpenVidu;
import io.openvidu.java.client.OpenViduHttpException;
import io.openvidu.java.client.OpenViduJavaClientException;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Api(value = "방 관리 API", tags = {"Room"})
@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final int LIMIT = 4;

    // 오픈비두 객체 SDK
    private OpenVidu openVidu;

    // 방 관리
    private Map<String, Integer> mapSessions = new ConcurrentHashMap<>();

    // 오픈비두 서버 관련 변수
    private String OPENVIDU_URL;
    private String SECRET;

    // RoomController에 접근할 때마다 오픈비두 서버 관련 변수를 얻어옴

    @PostMapping("")
    public ResponseEntity<?> makeRoom(@RequestBody Room room)throws OpenViduJavaClientException, OpenViduHttpException{
        // 방 번호 난수 생성
        String roomId = RandomNumberUtil.getRandomNumber();

        // 방 관리 map에 저장
        this.mapSessions.put(roomId, 1);

        // DB 저장
//        RoomService.makeRoom(roomId, room);
//
//        return ResponseEntity.ok(RoomService.getRoomRes(roomId, makeRoomReq.getGameType()));
        return ResponseEntity.ok(room);
    }

}
