package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStorage", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "Le5f;", "sendActualState", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "sendActualStateToAll", "()V", "Lmd9;", "updates", "updateState", "(Lmd9;)V", "", "position", "Lfd9;", "getPosition", "(Ljava/lang/Long;)Lfd9;", "Lkd9;", "startInfo", "onVideoStarted", "(Lkd9;)V", "onVideoStatesUpdatedChanged", "Lnd9;", "stopInfo", "onVideoStopped", "(Lnd9;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "movieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(oz4.a);
    private final ParticipantStore participantsStorage;

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final fd9 getPosition(Long l) {
        return (l == null || l.longValue() < 0) ? ed9.a : new dd9(l.longValue(), TimeUnit.SECONDS);
    }

    private final void sendActualState(WatchTogetherListener watchTogetherListener) {
        this.mainHandler.post(new fre(this, 18, watchTogetherListener));
    }

    /* access modifiers changed from: private */
    public static final void sendActualState$lambda$5(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && (!watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty())) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    private final void updateState(md9 md9) {
        HashMap hashMap = new HashMap();
        for (ld9 ld9 : md9.a) {
            ConversationParticipant byInternal = this.participantsStorage.getByInternal(ld9.a.b);
            if (byInternal != null) {
                ParticipantId externalId = byInternal.getExternalId();
                fp1 fp1 = ld9.a;
                cd9 cd9 = fp1.c;
                if (cd9 != null) {
                    int i = jd9.$EnumSwitchMapping$1[fp1.a.ordinal()];
                    T t = null;
                    id9 id9 = i != 1 ? i != 2 ? null : id9.b : id9.a;
                    if (id9 != null) {
                        Iterator<T> it = byInternal.getMovies().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            zc9 zc9 = (zc9) next;
                            if (zc9.d == id9 && tpa.f(zc9.a, cd9)) {
                                t = next;
                                break;
                            }
                        }
                        zc9 zc92 = (zc9) t;
                        fd9 position = getPosition(ld9.d);
                        float f = ld9.b;
                        qd9.a(f);
                        hashMap.put(cd9, new MovieState(externalId, position, !ld9.c, f, ld9.e, zc92, (z84) null));
                        if (!this.movieStates.getStates().containsKey(cd9) && zc92 != null) {
                            MovieStartedData movieStartedData = new MovieStartedData(externalId, this.participantsStorage.getActiveRoomId(), zc92);
                            for (WatchTogetherListener onVideoStarted : this.listeners) {
                                onVideoStarted.onVideoStarted(movieStartedData);
                            }
                        }
                    }
                }
            }
        }
        this.movieStates = this.movieStates.copy(hashMap);
    }

    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.add(watchTogetherListener);
        sendActualState(watchTogetherListener);
    }

    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(kd9 kd9) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(kd9.a);
        if (byInternal != null) {
            zc9 zc9 = kd9.c;
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates2 = this.movieStates;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
            cd9 cd9 = zc9.a;
            ed9 ed9 = ed9.a;
            float f = qd9.a;
            linkedHashMap.put(cd9, new MovieState(externalId, ed9, true, 0.0f, true, zc9, (z84) null));
            this.movieStates = movieStates2.copy(linkedHashMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), kd9.b, zc9);
            for (WatchTogetherListener onVideoStarted : this.listeners) {
                onVideoStarted.onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(md9 md9) {
        updateState(md9);
        sendActualStateToAll();
    }

    public final void onVideoStopped(nd9 nd9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
        MovieState movieState = (MovieState) linkedHashMap.remove(nd9.c);
        this.movieStates = this.movieStates.copy(linkedHashMap);
        if (movieState != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(movieState.getParticipantId(), nd9.b, nd9.c, nd9.d);
            for (WatchTogetherListener onVideoStopped : this.listeners) {
                onVideoStopped.onVideoStopped(movieStoppedData);
            }
        }
    }

    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.remove(watchTogetherListener);
    }
}
