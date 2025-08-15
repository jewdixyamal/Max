package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 b2\u00020\u0001:\u0003bcdB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J!\u00102\u001a\f\u0012\b\u0012\u000600j\u0002`10/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\b\u0012\u0004\u0012\u0002060/2\u0006\u0010\r\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0002042\u0006\u00109\u001a\u00020-2\n\u0010:\u001a\u000600j\u0002`1H\u0002¢\u0006\u0004\b;\u0010<JP\u0010D\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u001a\b\u0004\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u000e0@2\u0014\b\u0004\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0@H\b¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020-0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\f\u0012\b\u0012\u000600j\u0002`10=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bH\u0010GJ\u001d\u0010I\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010'J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0003¢\u0006\u0004\bQ\u0010'J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u00110\u00110W8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u001e\u0010`\u001a\n X*\u0004\u0018\u00010*0*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants;", "Lbq1;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "listener", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "La4c;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;La4c;)V", "Lpy0;", "call", "Le5f;", "setCall", "(Lpy0;)V", "", "isMeAdmin", "onIsMeAdminMayHaveChanged", "(Z)V", "isWaitingRoomEnabled", "onWaitingRoomEnabled", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lmp1;", "event", "onAttendee", "(Lmp1;)V", "Lnp1;", "onFeedback", "(Lnp1;)V", "Lpp1;", "onPromotionUpdated", "(Lpp1;)V", "Lop1;", "onHandUp", "(Lop1;)V", "release", "()V", "update", "onWaitingRoomParticipantsMayHaveChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "loadWaitingParticipantIds", "()Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "waitingParticipantId", "Liqd;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "resolveInternalIdSingle", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;)Liqd;", "Llp1;", "fromId", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "loadWaitingParticipantIdsPageSingle", "(Lpy0;Llp1;)Liqd;", "participantId", "internalId", "fromInternalLong", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;Lbg1;)Llp1;", "", "Lkp1;", "waitingParticipants", "Lkotlin/Function1;", "onResult", "", "onError", "resolveInternalIds", "(Ljava/util/List;Lm56;Lm56;)V", "getResolvedWaitingParticipantIds", "(Ljava/util/List;)Ljava/util/List;", "getInternalIdsToResolve", "putIdMappingsToCache", "(Ljava/util/List;)V", "scheduleLoad", "data", "notifyListener", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "shouldSendWaitingList", "()Z", "notifyListenerWithEmptyList", "notifyIfListChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "La4c;", "Lxpb;", "kotlin.jvm.PlatformType", "loadEventSubject", "Lxpb;", "Lhc3;", "compositeDisposable", "Lhc3;", "Lpy0;", "Z", "lastSentParticipantIds", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Companion", "Listener", "WaitingParticipantsPage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WaitingRoomParticipants implements bq1 {
    public static final Companion Companion = new Companion((z84) null);
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile py0 call;
    private final hc3 compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final xpb loadEventSubject;
    private final a4c log;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Companion;", "", "()V", "LOG_TAG", "", "PAGE_SIZE", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "data", "Le5f;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean z);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "", "participantIds", "", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getParticipantIds", "()Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [hc3, java.lang.Object] */
    public WaitingRoomParticipants(Listener listener2, IdMappingWrapper idMappingWrapper2, IdMappingResolver idMappingResolver2, a4c a4c) {
        this.listener = listener2;
        this.idMappingWrapper = idMappingWrapper2;
        this.idMappingResolver = idMappingResolver2;
        this.log = a4c;
        xpb xpb = new xpb();
        this.loadEventSubject = xpb;
        ? obj = new Object();
        this.compositeDisposable = obj;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc a = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        e0a e0a = new e0a(new hz9(xpb, timeUnit, a, 1).n(muc.b()), new WaitingRoomParticipants$loadDisposable$1(this), 3);
        Objects.requireNonNull(waitingRoomParticipantsUpdate, "item is null");
        obj.a(new e0a(e0a, new t66(waitingRoomParticipantsUpdate), 5).n(ce.a()).p(new WaitingRoomParticipants$loadDisposable$2(this)));
    }

    private final lp1 fromInternalLong(ConversationWaitingParticipantId conversationWaitingParticipantId, bg1 bg1) {
        return new lp1(bg1, conversationWaitingParticipantId.addedTs);
    }

    private final List<bg1> getInternalIdsToResolve(List<kp1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (kp1 kp1 : list) {
            lp1 lp1 = kp1.a;
            IdMappingWrapper idMappingWrapper2 = this.idMappingWrapper;
            bg1 bg1 = lp1.b;
            if (idMappingWrapper2.getByInternal(bg1) == null) {
                arrayList.add(bg1);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<kp1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (kp1 next : list) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(next.a.b);
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), next.a.a));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        lp1 lp1;
        boolean z;
        py0 py0 = this.call;
        if (py0 == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    lp1 = fromInternalLong(conversationWaitingParticipantId, (bg1) resolveInternalIdSingle(conversationWaitingParticipantId).e());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                lp1 = null;
            }
            try {
                WaitingParticipantsPage waitingParticipantsPage = (WaitingParticipantsPage) loadWaitingParticipantIdsPageSingle(py0, lp1).e();
                for (ConversationWaitingParticipantId participantId : waitingParticipantsPage.getParticipantIds()) {
                    arrayList.add(participantId.getParticipantId());
                }
                z = waitingParticipantsPage.getHasMore() && (waitingParticipantsPage.getParticipantIds().isEmpty() ^ true);
                if (!waitingParticipantsPage.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = waitingParticipantsPage.getParticipantIds().get(waitingParticipantsPage.getParticipantIds().size() - 1);
                    continue;
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "can't load next page. Error: " + th2.getMessage());
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final iqd loadWaitingParticipantIdsPageSingle(py0 py0, lp1 lp1) {
        return new q1a(1, new tef(py0, lp1, this, 2));
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6(py0 py0, lp1 lp1, WaitingRoomParticipants waitingRoomParticipants, sqd sqd) {
        gsa gsa = new gsa(waitingRoomParticipants, 6, sqd);
        nrf nrf = new nrf(sqd, 0);
        rod rod = py0.Z;
        try {
            ka6 b = f46.b((JSONObject) null, "get-waiting-hall");
            JSONObject jSONObject = b.a;
            jSONObject.put("backward", false);
            if (lp1 != null) {
                jSONObject.put("fromId", (Object) new JSONObject().put("id", (Object) lp1.b.c()).put("addedTs", lp1.a));
            }
            b.b(PAGE_SIZE, NewHtcHomeBadger.COUNT);
            rod.d(b, false, new hy0(py0, gsa, nrf, 0), new jy0(0, nrf));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4(WaitingRoomParticipants waitingRoomParticipants, sqd sqd, cq1 cq1) {
        List list = cq1.a;
        waitingRoomParticipants.putIdMappingsToCache(list);
        List<bg1> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(list);
        if (!internalIdsToResolve.isEmpty()) {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1(waitingRoomParticipants, list, sqd, cq1, sqd), new WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2(sqd));
            return;
        }
        ((nqd) sqd).a(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(list), cq1.b));
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(sqd sqd) {
        ((nqd) sqd).d(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        this.listener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
    }

    /* access modifiers changed from: private */
    public final void notifyListener(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(waitingRoomParticipantsUpdate);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<kp1> list) {
        for (kp1 next : list) {
            ParticipantId convert = CallExternalIdConverter.convert(next.b);
            if (convert != null) {
                this.idMappingWrapper.addMapping(convert, next.a.b);
            }
        }
    }

    private final iqd resolveInternalIdSingle(ConversationWaitingParticipantId conversationWaitingParticipantId) {
        return new q1a(1, new ypc(this, 28, conversationWaitingParticipantId));
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, sqd sqd) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new oj3(5, sqd), new nrf(sqd, 1));
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1$lambda$0(sqd sqd) {
        ((nqd) sqd).onError(new RuntimeException());
    }

    private final void resolveInternalIds(List<kp1> list, m56 m56, m56 m562) {
        putIdMappingsToCache(list);
        List<bg1> internalIdsToResolve = getInternalIdsToResolve(list);
        if (!internalIdsToResolve.isEmpty()) {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new WaitingRoomParticipants$resolveInternalIds$1(this, list, m56, m562), new WaitingRoomParticipants$resolveInternalIds$2(m562));
        } else {
            m56.invoke(getResolvedWaitingParticipantIds(list));
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.e(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    public void onAttendee(mp1 mp1) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    public void onFeedback(np1 np1) {
    }

    public void onHandUp(op1 op1) {
    }

    public final void onIsMeAdminMayHaveChanged(boolean z) {
        if (this.isMeAdmin != z) {
            this.isMeAdmin = z;
            update();
        }
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        this.listener.onMeInWaitingRoomChanged(z);
    }

    public void onPromotionUpdated(pp1 pp1) {
    }

    public final void onWaitingRoomEnabled(boolean z) {
        if (this.isWaitingRoomEnabled != z) {
            this.isWaitingRoomEnabled = z;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.g();
    }

    public final void setCall(py0 py0) {
        this.call = py0;
    }
}
