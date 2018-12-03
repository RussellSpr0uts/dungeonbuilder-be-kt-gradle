package com.rsowell.dungeonbuilder.domain.tile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/rsowell/dungeonbuilder/domain/tile/Tile;", "", "id", "", "(J)V", "TileType", "Lcom/rsowell/dungeonbuilder/domain/tile/TileType;", "getTileType", "()Lcom/rsowell/dungeonbuilder/domain/tile/TileType;", "setTileType", "(Lcom/rsowell/dungeonbuilder/domain/tile/TileType;)V", "getId", "()J", "dungeonbuilder"})
@javax.persistence.Entity()
public final class Tile {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "id")
    @javax.persistence.OneToOne(fetch = javax.persistence.FetchType.LAZY)
    public com.rsowell.dungeonbuilder.domain.tile.TileType TileType;
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id()
    private final long id = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rsowell.dungeonbuilder.domain.tile.TileType getTileType() {
        return null;
    }
    
    public final void setTileType(@org.jetbrains.annotations.NotNull()
    com.rsowell.dungeonbuilder.domain.tile.TileType p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public Tile(long id) {
        super();
    }
}