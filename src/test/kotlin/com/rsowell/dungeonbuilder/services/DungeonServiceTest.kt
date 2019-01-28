package com.rsowell.dungeonbuilder.services

import com.rsowell.dungeonbuilder.data.DungeonRepository
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@Tag("UNIT")
internal class DungeonServiceTest {

    @MockK
    lateinit var dungeonReposoitory: DungeonRepository

    @InjectMockKs
    lateinit var dungeonService: DungeonService

    @BeforeEach
    fun setUp() {
    }

}