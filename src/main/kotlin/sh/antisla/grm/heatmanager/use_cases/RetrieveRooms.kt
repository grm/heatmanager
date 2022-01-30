package sh.antisla.grm.heatmanager.use_cases

import sh.antisla.grm.heatmanager.domain.Room

class RetrieveRooms(val roomPersistence: RoomPersistence) {

    fun execute(): List<Room> {
        return roomPersistence.getRooms()
    }
}