package com.example.server.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/server/data/models/Direction;", "", "()V", "Bot", "Top", "Lcom/example/server/data/models/Direction$Bot;", "Lcom/example/server/data/models/Direction$Top;", "server_debug"})
public abstract class Direction {
    
    private Direction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/server/data/models/Direction$Bot;", "Lcom/example/server/data/models/Direction;", "()V", "server_debug"})
    public static final class Bot extends com.example.server.data.models.Direction {
        @org.jetbrains.annotations.NotNull
        public static final com.example.server.data.models.Direction.Bot INSTANCE = null;
        
        private Bot() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/server/data/models/Direction$Top;", "Lcom/example/server/data/models/Direction;", "()V", "server_debug"})
    public static final class Top extends com.example.server.data.models.Direction {
        @org.jetbrains.annotations.NotNull
        public static final com.example.server.data.models.Direction.Top INSTANCE = null;
        
        private Top() {
        }
    }
}