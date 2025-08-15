package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010F¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater;", "Lzy0;", "Lpg1;", "Lrl1;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "listener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "statesManager", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "mappingUpdater", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "meChanger", "Lag1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;Lag1;)V", "Llg1;", "params", "Le5f;", "onCallParticipantsAdded", "(Llg1;)V", "Luy0;", "onActiveParticipantsAdded", "(Luy0;)V", "Lmg1;", "onCallParticipantsChanged", "(Lmg1;)V", "Lvy0;", "onActiveParticipantsChanged", "(Lvy0;)V", "Lng1;", "onCallParticipantsDeAnonimized", "(Lng1;)V", "Lwy0;", "onActiveParticipantsDeAnonimized", "(Lwy0;)V", "Log1;", "onCallParticipantsRemoved", "(Log1;)V", "Lxy0;", "onActiveParticipantsRemoved", "(Lxy0;)V", "Lyy0;", "onActiveParticipantUpdated", "(Lyy0;)V", "Lnl1;", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lql1;", "onRoomUpdated", "(Lql1;)V", "Lol1;", "onCurrentParticipantInvitedToRoom", "(Lol1;)V", "Lpl1;", "onRoomRemoved", "(Lpl1;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "Lag1;", "MappingUpdater", "MeChanger", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantsUpdater implements zy0, pg1, rl1 {
    private final ag1 callParams;
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "", "Le5f;", "triggerMapUpdate", "()V", "reportIfApplicable", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantExternalId", "Le5f;", "updateMyExternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper2, LocalIdMappings localIdMappings2, MappingUpdater mappingUpdater2, MeChanger meChanger2, ag1 ag1) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper2;
        this.localIdMappings = localIdMappings2;
        this.mappingUpdater = mappingUpdater2;
        this.meChanger = meChanger2;
        this.callParams = ag1;
    }

    public void onActiveParticipantUpdated(yy0 yy0) {
        this.store.setActiveSessionRoom(yy0.c, yy0.d);
        ConversationEventsListener conversationEventsListener = this.listener;
        Collection collection = yy0.b;
        if (!(collection instanceof qb7) || (collection instanceof rb7)) {
            conversationEventsListener.onParticipantsUpdated(collection);
        } else {
            f8.A(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public void onActiveParticipantsAdded(uy0 uy0) {
    }

    public void onActiveParticipantsChanged(vy0 vy0) {
    }

    public void onActiveParticipantsDeAnonimized(wy0 wy0) {
    }

    public void onActiveParticipantsRemoved(xy0 xy0) {
    }

    public void onCallParticipantsAdded(lg1 lg1) {
        List<fg1> list = lg1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (fg1 fg1 : list) {
            ParticipantStore participantStore = this.store;
            bg1 bg1 = fg1.a;
            if (bg1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(bg1);
                ParticipantId convert = CallExternalIdConverter.convert(fg1.p);
                if (convert != null) {
                    this.idMappingWrapper.addMapping(convert, fg1.a);
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(convert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                fg1 fg12 = (fg1) next;
                ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
                if (conversationParticipant == null) {
                    bg1 bg12 = fg12.a;
                    if (bg12 != null) {
                        ConversationParticipant createConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(bg12, this.idMappingWrapper);
                        ConversationParticipantExtensionsKt.setCallParticipantExt(createConversationParticipantFromInternal, fg12, this.localIdMappings);
                        this.store.add(createConversationParticipantFromInternal, lg1.a);
                        z = true;
                    }
                } else {
                    if (conversationParticipant.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, fg12, this.localIdMappings);
                    }
                    z2 = true;
                }
                i = i2;
            } else {
                y53.R();
                throw null;
            }
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    public void onCallParticipantsChanged(mg1 mg1) {
        ParticipantId convert;
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (fg1 fg1 : mg1.a) {
            ParticipantStore participantStore = this.store;
            bg1 bg1 = fg1.a;
            if (bg1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(bg1);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, fg1, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else if (!(!this.callParams.B.j || (convert = CallExternalIdConverter.convert(fg1.p)) == null || (participantById = this.store.getParticipantById(convert)) == null)) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, fg1, this.localIdMappings);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsChanged(arrayList);
        }
    }

    public void onCallParticipantsDeAnonimized(ng1 ng1) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (fg1 fg1 : ng1.a) {
            ParticipantStore participantStore = this.store;
            bg1 bg1 = fg1.a;
            if (bg1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(bg1);
                o61 o61 = fg1.p;
                if (!(byInternal == null || o61 == null)) {
                    if (!tpa.f(o61.a, byInternal.getExternalId().id)) {
                        ParticipantId externalId = byInternal.getExternalId();
                        ParticipantId convert = CallExternalIdConverter.convert(o61);
                        if (convert != null) {
                            ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, fg1, externalId, convert, this.localIdMappings);
                            bg1 bg12 = fg1.a;
                            ConversationParticipant me2 = this.store.getMe();
                            if (tpa.f(bg12, me2 != null ? me2.getInternalId() : null)) {
                                this.meChanger.updateMyExternalId(convert);
                            }
                            if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                                arrayList.add(byInternal);
                                linkedHashMap.put(convert, externalId);
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
        }
    }

    public void onCallParticipantsRemoved(og1 og1) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (fg1 fg1 : og1.a) {
            bg1 bg1 = fg1.a;
            if (!(bg1 == null || (byInternal = this.store.getByInternal(bg1)) == null)) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, fg1, this.localIdMappings);
                }
                hashSet.add(bg1);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal((Collection<bg1>) hashSet);
        if (!arrayList.isEmpty()) {
            this.statesManager.onParticipantsRemoved(arrayList);
            this.listener.onParticipantsRemoved(arrayList);
        }
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        this.store.setActiveSessionRoom(nl1.a, nl1.b);
        this.mappingUpdater.reportIfApplicable();
    }

    public void onCurrentParticipantInvitedToRoom(ol1 ol1) {
        this.store.setProposedSessionRoom(ol1.b, ol1.c);
    }

    public void onRoomRemoved(pl1 pl1) {
        zad proposedRoomId = this.store.getProposedRoomId();
        zad zad = pl1.a;
        boolean f = tpa.f(proposedRoomId, zad);
        xad xad = xad.a;
        if (f) {
            this.store.setProposedSessionRoom(xad, (tad) null);
        }
        if (tpa.f(this.store.getActiveRoomId(), zad)) {
            this.store.setActiveSessionRoom(xad, (tad) null);
        }
    }

    public void onRoomUpdated(ql1 ql1) {
        this.store.maybeUpdateRoom(ql1.b);
    }
}
