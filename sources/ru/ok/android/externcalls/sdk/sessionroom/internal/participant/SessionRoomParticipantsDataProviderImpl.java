package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001J\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0010\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010*\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130-2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020&2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020&002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0-\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b6\u0010+JE\u0010:\u001a\u00020&2\n\u00109\u001a\u000607j\u0002`82\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b:\u0010;JG\u0010>\u001a\u00020&2\n\u0010<\u001a\u000607j\u0002`82\u0016\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b>\u0010;J3\u0010A\u001a\u0016\u0012\b\u0012\u000607j\u0002`8\u0012\b\u0012\u00060\u0012j\u0002`\u00130@2\u0010\u0010?\u001a\f\u0012\b\u0012\u000607j\u0002`80\u0011¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lyad;", "getRoomIds", "()Ljava/util/Set;", "roomId", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRoomParticipantIds", "(Lyad;)Ljava/util/Collection;", "getAllRoomParticipantIds", "()Ljava/util/Collection;", "Lzad;", "internalIds", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "mapInternalIdsToSessionRoomParticipants", "(Lzad;Ljava/util/Collection;)Ljava/util/Collection;", "internalId", "mapInternalIdToSessionRoomParticipant", "(Lbg1;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "mapConversationParticipantToSessionRoomParticipant", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "Le5f;", "onSuccess", "", "onError", "getMainCallParticipantIds", "(Lm56;Lm56;)V", "participantIds", "", "getUnresolvedExternalIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lkotlin/Function0;", "onResolve", "resolveParticipantIds", "(Ljava/util/Collection;Lk56;Lm56;)V", "getRoomParticipants", "(Lzad;Lm56;Lm56;)V", "getAllInRoomParticipants", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;)V", "externalId", "onIdResolved", "resolveInternalIdByExternal", "externalIds", "", "getInternalIdsByExternal", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "", "Ltad;", "knownSessionRooms", "Ljava/util/Map;", "ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "roomsListener", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    /* access modifiers changed from: private */
    public final Map<yad, tad> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        SessionRoomParticipantsDataProviderImpl$roomsListener$1 sessionRoomParticipantsDataProviderImpl$roomsListener$1 = new SessionRoomParticipantsDataProviderImpl$roomsListener$1(this);
        this.roomsListener = sessionRoomParticipantsDataProviderImpl$roomsListener$1;
        sessionRoomListenerManagerImpl.addListener(sessionRoomParticipantsDataProviderImpl$roomsListener$1);
    }

    private final Collection<bg1> getAllRoomParticipantIds() {
        Collection<tad> values = this.knownSessionRooms.values();
        ArrayList arrayList = new ArrayList();
        for (tad tad : values) {
            List list = tad.e;
            if (list != null) {
                arrayList.add(list);
            }
        }
        return z53.T(arrayList);
    }

    private final void getMainCallParticipantIds(m56 m56, m56 m562) {
        Set H0 = x53.H0(getAllRoomParticipantIds());
        ParticipantStore participantStore = this.store;
        xad xad = xad.a;
        Collection<ConversationParticipant> participants = participantStore.getParticipants(xad);
        ArrayList<ConversationParticipant> arrayList = new ArrayList<>();
        for (T next : participants) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) next;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !H0.contains(conversationParticipant.getInternalId())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        for (ConversationParticipant mapConversationParticipantToSessionRoomParticipant : arrayList) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant(mapConversationParticipantToSessionRoomParticipant));
        }
        m56.invoke(new SessionRoomParticipants(xad, arrayList2));
    }

    private final Set<yad> getRoomIds() {
        return x53.H0(this.knownSessionRooms.keySet());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<defpackage.bg1> getRoomParticipantIds(defpackage.yad r1) {
        /*
            r0 = this;
            java.util.Map<yad, tad> r0 = r0.knownSessionRooms
            java.lang.Object r0 = r0.get(r1)
            tad r0 = (defpackage.tad) r0
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r0.e
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = defpackage.x53.D0(r0)
            goto L_0x0015
        L_0x0013:
            nz4 r0 = defpackage.nz4.a
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(yad):java.util.Collection");
    }

    private final List<bg1> getUnresolvedExternalIds(Collection<bg1> collection) {
        ArrayList arrayList = new ArrayList();
        for (bg1 next : collection) {
            if (this.idMappingWrapper.getByInternal(next) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant conversationParticipant) {
        return new SessionRoomParticipants.Participant(conversationParticipant.getExternalId(), this.store.getParticipantRoomId(conversationParticipant), conversationParticipant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(bg1 bg1) {
        ConversationParticipant byInternal = this.store.getByInternal(bg1);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(bg1);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, (zad) null, (ConversationParticipant) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(zad zad, Collection<bg1> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (bg1 mapInternalIdToSessionRoomParticipant : collection) {
            SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant2 = mapInternalIdToSessionRoomParticipant(mapInternalIdToSessionRoomParticipant);
            if (mapInternalIdToSessionRoomParticipant2 != null) {
                linkedHashMap.put(mapInternalIdToSessionRoomParticipant2.getId(), mapInternalIdToSessionRoomParticipant2);
            }
        }
        for (ConversationParticipant next : this.store.getParticipants(zad)) {
            if (!linkedHashMap.containsKey(next.getExternalId()) && (next.isAdmin() || next.isCreator())) {
                linkedHashMap.put(next.getExternalId(), mapConversationParticipantToSessionRoomParticipant(next));
            }
        }
        return linkedHashMap.values();
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$0(m56 m56, m56 m562, ParticipantId participantId, bg1 bg1) {
        if (bg1 != null) {
            m56.invoke(bg1);
        } else if (m562 != null) {
            m562.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$1(m56 m56, ParticipantId participantId) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<bg1> collection, k56 k56, m56 m56) {
        if (collection.isEmpty()) {
            k56.invoke();
            return;
        }
        List<bg1> unresolvedExternalIds = getUnresolvedExternalIds(collection);
        if (unresolvedExternalIds.isEmpty()) {
            k56.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new yh0(7, k56), new abd(0, m56));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$8(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$9(m56 m56) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    public void getAllInRoomParticipants(m56 m56, m56 m562) {
        Set<yad> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            m56.invoke(nz4.a);
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1(roomIds, this, m56), m562);
        }
    }

    public final Map<ParticipantId, bg1> getInternalIdsByExternal(Collection<ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : collection) {
            bg1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal != null) {
                linkedHashMap.put(participantId, byExternal);
            } else {
                throw new RuntimeException("Unresolved external participant id " + participantId);
            }
        }
        return linkedHashMap;
    }

    public void getParticipantRoomId(ParticipantId participantId, m56 m56, m56 m562) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal != null) {
            zad participantRoomId = this.store.getParticipantRoomId(byExternal);
            if (participantRoomId != null) {
                m56.invoke(participantRoomId);
            } else if (m562 != null) {
                m562.invoke(new RuntimeException("Can't find room data for participant " + participantId));
            }
        } else if (m562 != null) {
            m562.invoke(new RuntimeException("Participant " + participantId + " not found"));
        }
    }

    public void getRoomParticipants(zad zad, m56 m56, m56 m562) {
        if (zad instanceof xad) {
            getMainCallParticipantIds(m56, m562);
        } else if (zad instanceof yad) {
            Collection<bg1> roomParticipantIds = getRoomParticipantIds((yad) zad);
            resolveParticipantIds(roomParticipantIds, new SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(m56, zad, this, roomParticipantIds), m562);
        }
    }

    public final void resolveInternalIdByExternal(ParticipantId participantId, m56 m56, m56 m562) {
        this.idMappingResolver.withInternalId(participantId, new ed4(m56, m562, participantId, 2), new flc(m562, 15, participantId));
    }
}
