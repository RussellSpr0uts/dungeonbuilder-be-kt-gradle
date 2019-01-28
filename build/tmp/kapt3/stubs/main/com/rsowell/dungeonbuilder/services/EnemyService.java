package com.rsowell.dungeonbuilder.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/rsowell/dungeonbuilder/services/EnemyService;", "", "()V", "enemyRepository", "Lcom/rsowell/dungeonbuilder/data/EnemyRepository;", "getEnemyRepository", "()Lcom/rsowell/dungeonbuilder/data/EnemyRepository;", "setEnemyRepository", "(Lcom/rsowell/dungeonbuilder/data/EnemyRepository;)V", "delete", "", "enemy", "Lcom/rsowell/dungeonbuilder/domain/dynamicentities/enemy/Enemy;", "deleteById", "id", "", "findAll", "", "save", "dungeonbuilder"})
@org.springframework.stereotype.Service()
public class EnemyService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public com.rsowell.dungeonbuilder.data.EnemyRepository enemyRepository;
    
    @org.jetbrains.annotations.NotNull()
    public com.rsowell.dungeonbuilder.data.EnemyRepository getEnemyRepository() {
        return null;
    }
    
    public void setEnemyRepository(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.data.EnemyRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy save(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy enemy) {
        return null;
    }
    
    public void delete(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy enemy) {
    }
    
    public void deleteById(long id) {
    }
    
    public EnemyService() {
        super();
    }
}