package com.devje.portfolio.domain.repository

import com.devje.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    // select * from introduction where is_Active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Introduction>
}