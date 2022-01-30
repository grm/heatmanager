package sh.antisla.grm.heatmanager.use_cases

import sh.antisla.grm.heatmanager.domain.Room

interface RoomPersistence {
    fun getRooms() : List<Room>
}