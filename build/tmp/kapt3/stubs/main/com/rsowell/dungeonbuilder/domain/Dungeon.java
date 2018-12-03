package com.rsowell.dungeonbuilder.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/rsowell/dungeonbuilder/domain/Dungeon;", "Lcom/rsowell/dungeonbuilder/domain/BaseEntity;", "name", "", "tiles", "dynamicEntities", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "dungeonType", "Lcom/rsowell/dungeonbuilder/domain/DungeonType;", "getDungeonType", "()Lcom/rsowell/dungeonbuilder/domain/DungeonType;", "setDungeonType", "(Lcom/rsowell/dungeonbuilder/domain/DungeonType;)V", "getDynamicEntities", "()Ljava/lang/String;", "getName", "getTiles", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dungeonbuilder"})
@javax.persistence.Entity()
public final class Dungeon extends com.rsowell.dungeonbuilder.domain.BaseEntity {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "id")
    @javax.persistence.OneToOne(fetch = javax.persistence.FetchType.LAZY)
    public com.rsowell.dungeonbuilder.domain.DungeonType dungeonType;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tiles = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dynamicEntities = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.DungeonType getDungeonType() {
        return null;
    }
    
    public final void setDungeonType(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.domain.DungeonType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDynamicEntities() {
        return null;
    }
    
    public Dungeon(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String tiles, @org.jetbrains.annotations.NotNull()
    java.lang.String dynamicEntities) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.Dungeon copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String tiles, @org.jetbrains.annotations.NotNull()
    java.lang.String dynamicEntities) {
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