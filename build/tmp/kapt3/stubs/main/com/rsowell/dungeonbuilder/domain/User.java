package com.rsowell.dungeonbuilder.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/rsowell/dungeonbuilder/domain/User;", "Lcom/rsowell/dungeonbuilder/domain/BaseEntity;", "email", "", "(Ljava/lang/String;)V", "dungeons", "", "Lcom/rsowell/dungeonbuilder/domain/Dungeon;", "getDungeons", "()Ljava/util/List;", "setDungeons", "(Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dungeonbuilder"})
@javax.persistence.Entity()
public final class User extends com.rsowell.dungeonbuilder.domain.BaseEntity {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "id")
    @javax.persistence.OneToMany(fetch = javax.persistence.FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    public java.util.List<com.rsowell.dungeonbuilder.domain.Dungeon> dungeons;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.rsowell.dungeonbuilder.domain.Dungeon> getDungeons() {
        return null;
    }
    
    public final void setDungeons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rsowell.dungeonbuilder.domain.Dungeon> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.User copy(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
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