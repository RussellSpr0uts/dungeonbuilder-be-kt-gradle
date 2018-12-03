package com.rsowell.dungeonbuilder.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/rsowell/dungeonbuilder/domain/BaseEntity;", "Lorg/springframework/data/domain/Persistable;", "", "()V", "createdAt", "Ljava/time/Instant;", "getCreatedAt", "()Ljava/time/Instant;", "id", "Ljava/lang/Long;", "updatedAt", "getUpdatedAt", "version", "equals", "", "other", "", "getId", "()Ljava/lang/Long;", "hashCode", "", "isNew", "toString", "", "dungeonbuilder"})
@javax.persistence.MappedSuperclass()
public abstract class BaseEntity implements org.springframework.data.domain.Persistable<java.lang.Long> {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id()
    private java.lang.Long id;
    @javax.persistence.Version()
    private final java.lang.Long version = null;
    @org.jetbrains.annotations.Nullable()
    @org.hibernate.annotations.CreationTimestamp()
    private final java.time.Instant createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @org.hibernate.annotations.UpdateTimestamp()
    private final java.time.Instant updatedAt = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.Instant getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.Instant getUpdatedAt() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isNew() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public BaseEntity() {
        super();
    }
}