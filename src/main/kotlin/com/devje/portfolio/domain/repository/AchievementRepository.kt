package com.devje.portfolio.domain.repository

import com.devje.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement where is_Active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Achievement>
}