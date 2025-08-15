package ru.ok.android.externcalls.sdk.participant.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00102\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010\u00022\n\u0010#\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b$\u0010\u000fJ\u001d\u0010%\u001a\u0004\u0018\u00010\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00152\n\u0010#\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u00152\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020\u00152\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0+¢\u0006\u0004\b)\u0010-J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020+2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010:J\u0015\u0010<\u001a\u00020\u00152\u0006\u00108\u001a\u000207¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001aH\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u0004\u0018\u00010\u00022\n\u0010B\u001a\u000601j\u0002`2H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u000201H\u0002¢\u0006\u0004\bE\u0010FJ3\u0010J\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00020Hj\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0002`I2\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LRx\u0010O\u001af\u0012\u0004\u0012\u00020\u001a\u0012(\u0012&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020Hj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u0002`I0Mj2\u0012\u0004\u0012\u00020\u001a\u0012(\u0012&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020Hj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u0002`I`N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR8\u0010Q\u001a&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u001a0Mj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u001a`N8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR(\u0010S\u001a\u0004\u0018\u0001072\b\u0010R\u001a\u0004\u0018\u0001078\u0006@BX\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR(\u0010W\u001a\u0004\u0018\u0001072\b\u0010R\u001a\u0004\u0018\u0001078\u0006@BX\u000e¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR*\u0010Z\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010`\u001a\u0004\u0018\u00010\u001a2\b\u0010R\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u000e¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "initialMe", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "<init>", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;)V", "", "iterator", "()Ljava/util/Iterator;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "id", "getParticipantById", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "", "hasOtherParticipants", "()Z", "isEmpty", "me", "Le5f;", "updateMe", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "participant", "addToActiveSessionRoom", "Lzad;", "sessionRoomId", "add", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lzad;)V", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "containsByInternal", "(Lbg1;)Z", "externalId", "getByExternalWithAnyDevice", "getByInternal", "(Lbg1;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "removeByExternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "removeByInternal", "(Lbg1;)V", "", "internalIdsSet", "(Ljava/util/Collection;)V", "getParticipants", "(Lzad;)Ljava/util/Collection;", "", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "Lru/ok/android/externcalls/sdk/participant/collection/LocalId;", "getRoomToParticipantsMap", "()Ljava/util/Map;", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lzad;", "Ltad;", "room", "setActiveSessionRoom", "(Lzad;Ltad;)V", "setProposedSessionRoom", "maybeUpdateRoom", "(Ltad;)V", "oldRoomId", "newRoomId", "onActiveRoomChanged", "(Lzad;Lzad;)V", "localId", "getByLocal", "(Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "removeByLocalId", "(Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;)V", "roomId", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSessionRoomParticipantsMap", "(Lzad;)Ljava/util/LinkedHashMap;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "roomToIdToParticipantMap", "Ljava/util/HashMap;", "localIdToSessionRoomMap", "<set-?>", "activeRoom", "Ltad;", "getActiveRoom", "()Ltad;", "proposedRoom", "getProposedRoom", "value", "activeRoomId", "Lzad;", "getActiveRoomId", "()Lzad;", "setActiveRoomId", "(Lzad;)V", "proposedRoomId", "getProposedRoomId", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getMe", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "()Ljava/util/Collection;", "participants", "", "getSize", "()I", "size", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantStore implements ParticipantCollection {
    private tad activeRoom;
    private zad activeRoomId = xad.a;
    private final LocalIdMappings localIdMappings;
    private final HashMap<LocalParticipantId, zad> localIdToSessionRoomMap = new HashMap<>();

    /* renamed from: me  reason: collision with root package name */
    private final ConversationParticipant f147me;
    private tad proposedRoom;
    private zad proposedRoomId;
    private final HashMap<zad, LinkedHashMap<LocalParticipantId, ConversationParticipant>> roomToIdToParticipantMap = new HashMap<>();

    public ParticipantStore(ConversationParticipant conversationParticipant, LocalIdMappings localIdMappings2) {
        this.localIdMappings = localIdMappings2;
        this.f147me = conversationParticipant;
        updateMe(conversationParticipant);
    }

    private final ConversationParticipant getByLocal(LocalParticipantId localParticipantId) {
        LinkedHashMap linkedHashMap;
        zad zad = this.localIdToSessionRoomMap.get(localParticipantId);
        if (zad == null || (linkedHashMap = this.roomToIdToParticipantMap.get(zad)) == null) {
            return null;
        }
        return (ConversationParticipant) linkedHashMap.get(localParticipantId);
    }

    private final LinkedHashMap<LocalParticipantId, ConversationParticipant> getSessionRoomParticipantsMap(zad zad) {
        HashMap<zad, LinkedHashMap<LocalParticipantId, ConversationParticipant>> hashMap = this.roomToIdToParticipantMap;
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap = hashMap.get(zad);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            hashMap.put(zad, linkedHashMap);
        }
        return linkedHashMap;
    }

    private final void onActiveRoomChanged(zad zad, zad zad2) {
        ConversationParticipant me2;
        if (!tpa.f(zad, zad2) && (me2 = getMe()) != null) {
            removeByLocalId(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(me2));
            add(me2, zad2);
        }
    }

    private final void removeByLocalId(LocalParticipantId localParticipantId) {
        ConversationParticipant byLocal = getByLocal(localParticipantId);
        if (byLocal != null) {
            this.localIdMappings.removedMappings(byLocal);
        }
        zad zad = this.localIdToSessionRoomMap.get(localParticipantId);
        if (zad != null) {
            LinkedHashMap linkedHashMap = this.roomToIdToParticipantMap.get(zad);
            if (linkedHashMap != null) {
                ConversationParticipant conversationParticipant = (ConversationParticipant) linkedHashMap.remove(localParticipantId);
            }
            this.localIdToSessionRoomMap.remove(localParticipantId);
        }
    }

    private final void setActiveRoomId(zad zad) {
        if (!tpa.f(this.activeRoomId, zad)) {
            zad zad2 = this.activeRoomId;
            this.activeRoomId = zad;
            onActiveRoomChanged(zad2, zad);
        }
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends ConversationParticipant> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addToActiveSessionRoom(ConversationParticipant conversationParticipant) {
        add(conversationParticipant, this.activeRoomId);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsByInternal(bg1 bg1) {
        return getByInternal(bg1) != null;
    }

    public final tad getActiveRoom() {
        return this.activeRoom;
    }

    public final zad getActiveRoomId() {
        return this.activeRoomId;
    }

    public final ConversationParticipant getByExternalWithAnyDevice(ParticipantId participantId) {
        LocalParticipantId anyLocalId = this.localIdMappings.getAnyLocalId(participantId);
        if (anyLocalId == null) {
            return null;
        }
        return getByLocal(anyLocalId);
    }

    public ConversationParticipant getByInternal(bg1 bg1) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(bg1);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    public ConversationParticipant getMe() {
        return this.f147me;
    }

    public ConversationParticipant getParticipantById(ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    public final zad getParticipantRoomId(ConversationParticipant conversationParticipant) {
        return this.localIdToSessionRoomMap.get(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant));
    }

    public Collection<ConversationParticipant> getParticipants() {
        return getParticipants(this.activeRoomId);
    }

    public final tad getProposedRoom() {
        return this.proposedRoom;
    }

    public final zad getProposedRoomId() {
        return this.proposedRoomId;
    }

    public final Map<zad, Map<LocalParticipantId, ConversationParticipant>> getRoomToParticipantsMap() {
        return this.roomToIdToParticipantMap;
    }

    public int getSize() {
        return getParticipants().size();
    }

    public boolean hasOtherParticipants() {
        return size() > 1;
    }

    public boolean isEmpty() {
        return getParticipants().isEmpty();
    }

    public Iterator<ConversationParticipant> iterator() {
        return getParticipants().iterator();
    }

    public final void maybeUpdateRoom(tad tad) {
        zad zad = this.activeRoomId;
        yad yad = tad.a;
        if (tpa.f(zad, yad)) {
            this.activeRoom = tad;
        }
        if (tpa.f(this.proposedRoomId, yad)) {
            this.proposedRoom = tad;
        }
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeByExternal(ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId != null) {
            removeByLocalId(localId);
        }
    }

    public final void removeByInternal(bg1 bg1) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(bg1);
        if (localId != null) {
            removeByLocalId(localId);
        }
    }

    public boolean removeIf(Predicate<? super ConversationParticipant> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setActiveSessionRoom(zad zad, tad tad) {
        setActiveRoomId(zad);
        this.activeRoom = tad;
    }

    public final void setProposedSessionRoom(zad zad, tad tad) {
        this.proposedRoomId = zad;
        this.proposedRoom = tad;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return f46.d0(this);
    }

    public final void updateMe(ConversationParticipant conversationParticipant) {
        add(conversationParticipant, this.activeRoomId);
    }

    public boolean add(ConversationParticipant conversationParticipant) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Collection<ConversationParticipant> getParticipants(zad zad) {
        return getSessionRoomParticipantsMap(zad).values();
    }

    public <T> T[] toArray(T[] tArr) {
        return f46.e0(this, tArr);
    }

    public final void add(ConversationParticipant conversationParticipant, zad zad) {
        this.localIdMappings.addMappings(conversationParticipant);
        getSessionRoomParticipantsMap(zad).put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant), conversationParticipant);
        this.localIdToSessionRoomMap.put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant), zad);
    }

    public final void removeByInternal(Collection<bg1> collection) {
        for (bg1 removeByInternal : collection) {
            removeByInternal(removeByInternal);
        }
    }
}
