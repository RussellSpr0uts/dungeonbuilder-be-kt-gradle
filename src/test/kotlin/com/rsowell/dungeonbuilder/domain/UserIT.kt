package com.rsowell.dungeonbuilder.domain

import com.rsowell.dungeonbuilder.data.UserRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
@Tag("IT")
internal class UserIT(@Autowired val entityManager: TestEntityManager,
                      @Autowired val userRepository: UserRepository) {

    private final val userTestData = User("russellsowell88@gmail.com")
    private final val basicDungeonTestData = Dungeon(
            "Basic Dungeon",
            "[1,2,3]",
            "[1,2,3]")
    private final val advancedDungeonTestData = Dungeon(
            "Advanced Dungeon",
            "[1,2,3]",
            "[1,2,3]")
    val dungeonsTestData = listOf(basicDungeonTestData, advancedDungeonTestData)
    var testUserId: Long = 0

    @BeforeEach
    fun setup() {
        userTestData.dungeons = dungeonsTestData
        val user = userTestData.copy()
        entityManager.persist(user)
        entityManager.flush()
        testUserId = user.id!!
    }

    @Test
    @DisplayName("When findAll() then user list contains our test users")
    fun findAll() {
        val user = userTestData.copy()
        val userListFromRepo = userRepository.findAll()
        assertThat(userListFromRepo).contains(user)
    }

    @Test
    @DisplayName("When findById() with test user ID then returns our test user")
    fun findById() {
        val user = userTestData.copy()
        val userFromRepo = userRepository.findById(testUserId)
        assertThat(userFromRepo).contains(user)

        val nullResultFromRepo = userRepository.findById(2L)
        assertThat(nullResultFromRepo).isEmpty
    }

    @Test
    fun save() {

    }

    @Test
    fun saveAll() {

    }

    @Test
    fun exists() {

    }

    @Test
    fun delete() {

    }

    @Test
    fun deleteById() {

    }

}