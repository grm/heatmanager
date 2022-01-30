package sh.antisla.grm.heatmanager.use_cases

import org.assertj.core.api.Assertions.*

import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import sh.antisla.grm.heatmanager.domain.Room
import java.util.*
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify

internal class RetrieveRoomsTest {

    @Test
    fun doAction_doesSomething() {
        /* Given */
        val rooms = listOf(
                Room(UUID.randomUUID(), "living room"),
                Room(UUID.randomUUID(), "kitchen")
        )

        val mock = mock<RoomPersistence> {
            on { getRooms() } doReturn rooms
        }
        val retrieveRooms = RetrieveRooms(mock)

        /* When */
        val returnedRooms = retrieveRooms.execute()

        /* Then */
        verify(mock).getRooms()
        assertThat(returnedRooms).containsExactlyInAnyOrderElementsOf(rooms);
    }
}