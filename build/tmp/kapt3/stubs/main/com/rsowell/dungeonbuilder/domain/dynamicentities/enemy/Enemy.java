package com.rsowell.dungeonbuilder.domain.dynamicentities.enemy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/rsowell/dungeonbuilder/domain/dynamicentities/enemy/Enemy;", "Lcom/rsowell/dungeonbuilder/domain/BaseEntity;", "Lcom/rsowell/dungeonbuilder/domain/dynamicentities/DynamicActor;", "name", "", "startPosX", "", "startPoxY", "(Ljava/lang/String;DD)V", "enemyType", "Lcom/rsowell/dungeonbuilder/domain/dynamicentities/enemy/EnemyType;", "getEnemyType", "()Lcom/rsowell/dungeonbuilder/domain/dynamicentities/enemy/EnemyType;", "setEnemyType", "(Lcom/rsowell/dungeonbuilder/domain/dynamicentities/enemy/EnemyType;)V", "getName", "()Ljava/lang/String;", "getStartPosX", "()D", "getStartPoxY", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dungeonbuilder"})
@javax.persistence.Entity()
public final class Enemy extends com.rsowell.dungeonbuilder.domain.BaseEntity implements com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicActor {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "id")
    @javax.persistence.OneToOne(fetch = javax.persistence.FetchType.LAZY)
    public com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.EnemyType enemyType;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final double startPosX = 0.0;
    private final double startPoxY = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.EnemyType getEnemyType() {
        return null;
    }
    
    public final void setEnemyType(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.EnemyType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public double getStartPosX() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getStartPoxY() {
        return 0.0;
    }
    
    public Enemy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double startPosX, double startPoxY) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double startPosX, double startPoxY) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}