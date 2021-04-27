package com.company;

public class livingRoomMain {
    ChestOfDrawers chestOfDrawers = new ChestOfDrawers(125, 45, 130, "true", "true");
    RTVCabinet rtvCabinet = new RTVCabinet(3, 3, 25,true, true);
    TV tv = new TV("Manta", "1366 x 768", true);


    LivingRoom livingRoom = new LivingRoom(chestOfDrawers, rtvCabinet, tv);
            //livingRoom.turn();
}
