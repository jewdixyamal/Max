package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J;\u0010)\u001a\u00020\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R6\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00100R,\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R8\u00106\u001a&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a04j\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a`58\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/Function0;", "Le5f;", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lvte;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;La66;Lm56;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lvte;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "item", "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lm56;Lm56;)V", "Lop1;", "event", "onHandUp", "(Lop1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "La66;", "Lm56;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lvte;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    /* access modifiers changed from: private */
    public final m56 getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    /* access modifiers changed from: private */
    public boolean hasMore = true;
    /* access modifiers changed from: private */
    public final a66 idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    /* access modifiers changed from: private */
    public final vte timeProvider;
    /* access modifiers changed from: private */
    public int totalCount;

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, a66 a66, m56 m56, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, vte vte) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = a66;
        this.getExternalId = m56;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = vte;
    }

    private final void loadHandsQueue(k56 k56, m56 m56) {
        this.commandExecutor.getHandsQueue(new StereoRoomHandsQueueImpl$loadHandsQueue$1(this, k56), m56);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, k56 k56, m56 m56, int i, Object obj) {
        if ((i & 2) != 0) {
            m56 = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(k56, m56);
    }

    /* access modifiers changed from: private */
    public final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* access modifiers changed from: private */
    public final void participantHandChanged(StereoHandQueueItem stereoHandQueueItem, boolean z) {
        if (z) {
            this.handQueue.put(stereoHandQueueItem.getParticipantId(), stereoHandQueueItem);
        } else {
            this.handQueue.remove(stereoHandQueueItem.getParticipantId());
        }
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void loadMoreElements(m56 m56, m56 m562) {
        loadHandsQueue(new StereoRoomHandsQueueImpl$loadMoreElements$1(m56, this), m562);
    }

    public final void onHandUp(op1 op1) {
        this.idsResolverHelper.invoke(x53.t0(op1.b, op1.c), new StereoRoomHandsQueueImpl$onHandUp$1(op1, this));
    }

    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> hashMap = this.handQueue;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ParticipantId, StereoHandQueueItem> value : hashMap.entrySet()) {
            StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) value.getValue();
            if (stereoHandQueueItem != null) {
                arrayList.add(stereoHandQueueItem);
            }
        }
        return x53.x0(arrayList, new StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1());
    }
}
