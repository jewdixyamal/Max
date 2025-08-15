package ru.ok.android.externcalls.sdk.watch_together.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u001b\u0010\u0011JF\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010#\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b#\u0010$JQ\u0010'\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J>\u0010(\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b(\u0010\u0011J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b0\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/WatchTogetherPlayerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;)V", "Lcd9;", "movieId", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "pause", "(Lcd9;Lk56;Lm56;)V", "Lqd9;", "volume", "Lgd9;", "meta", "", "moveToAdminOnHangup", "play-yj_a6ag", "(Lcd9;FLgd9;ZLk56;Lm56;)V", "play", "resume", "isMuted", "setMuted", "(Lcd9;ZLk56;Lm56;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lcd9;JLjava/util/concurrent/TimeUnit;Lk56;Lm56;)V", "setVolume-F2PwOSs", "(Lcd9;FZLk56;Lm56;)V", "setVolume", "stop", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WatchTogetherPlayerImpl implements WatchTogetherPlayer, WatchTogetherCommandsExecutor, WatchTogetherListenerManager {
    private final WatchTogetherCommandsExecutor commandExecutor;
    private final WatchTogetherListenerManager listenerManager;

    public WatchTogetherPlayerImpl(WatchTogetherCommandsExecutor watchTogetherCommandsExecutor, WatchTogetherListenerManager watchTogetherListenerManager) {
        this.commandExecutor = watchTogetherCommandsExecutor;
        this.listenerManager = watchTogetherListenerManager;
    }

    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.addListener(watchTogetherListener);
    }

    public MovieStates getMovieStates() {
        return this.listenerManager.getMovieStates();
    }

    public void pause(cd9 cd9, k56 k56, m56 m56) {
        this.commandExecutor.pause(cd9, k56, m56);
    }

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    public void m127playyj_a6ag(cd9 cd9, float f, gd9 gd9, boolean z, k56 k56, m56 m56) {
        this.commandExecutor.m131playyj_a6ag(cd9, f, gd9, z, k56, m56);
    }

    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.removeListener(watchTogetherListener);
    }

    public void resume(cd9 cd9, k56 k56, m56 m56) {
        this.commandExecutor.resume(cd9, k56, m56);
    }

    public void setMuted(cd9 cd9, boolean z, k56 k56, m56 m56) {
        this.commandExecutor.setMuted(cd9, z, k56, m56);
    }

    public void setPosition(cd9 cd9, long j, TimeUnit timeUnit, k56 k56, m56 m56) {
        this.commandExecutor.setPosition(cd9, j, timeUnit, k56, m56);
    }

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    public void m128setVolumeF2PwOSs(cd9 cd9, float f, boolean z, k56 k56, m56 m56) {
        this.commandExecutor.m132setVolumeF2PwOSs(cd9, f, z, k56, m56);
    }

    public void stop(cd9 cd9, k56 k56, m56 m56) {
        this.commandExecutor.stop(cd9, k56, m56);
    }
}
