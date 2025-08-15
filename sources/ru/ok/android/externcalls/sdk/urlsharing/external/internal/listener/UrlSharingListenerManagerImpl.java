package ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "Lao1;", "Lrl1;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "La4c;", "logger", "<init>", "(Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;La4c;)V", "Lzad;", "roomId", "Ljpd;", "info", "Le5f;", "saveUrlSharing", "(Lzad;Ljpd;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiator", "", "url", "saveUrlSharingWithId", "(Lzad;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "reportForActiveRoom", "()V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "Lzn1;", "state", "onUrlSharingInfoUpdated", "(Lzn1;)V", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "La4c;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingInfo;", "roomIdToUrlSharingInfo", "Ljava/util/Map;", "activeRoomId", "Lzad;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class UrlSharingListenerManagerImpl implements UrlSharingListenerManager, ao1, rl1 {
    private static final Companion Companion = new Companion((z84) null);
    private static final String LOG_TAG = "UrlSharingListenerManagerImpl";
    private zad activeRoomId = xad.a;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final CopyOnWriteArraySet<UrlSharingListener> listeners = new CopyOnWriteArraySet<>();
    private final a4c logger;
    private Map<zad, UrlSharingInfo> roomIdToUrlSharingInfo = new HashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public UrlSharingListenerManagerImpl(IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2, a4c a4c) {
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        this.logger = a4c;
    }

    private final void reportForActiveRoom() {
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        Iterator<UrlSharingListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            UrlSharingListener next = it.next();
            if (urlSharingInfo == null) {
                next.onUrlSharingStopped();
            } else {
                next.onUrlSharingStarted(urlSharingInfo);
            }
        }
    }

    private final void saveUrlSharing(zad zad, jpd jpd) {
        ParticipantId byInternal = this.idMappingWrapper.getByInternal(jpd.a);
        if (byInternal != null) {
            saveUrlSharingWithId(zad, byInternal, jpd.b);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(jpd.a), new ewc(this, jpd, zad, 9), new ule(9, this));
        }
    }

    /* access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$0(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl, jpd jpd, zad zad) {
        ParticipantId byInternal = urlSharingListenerManagerImpl.idMappingWrapper.getByInternal(jpd.a);
        if (byInternal != null) {
            urlSharingListenerManagerImpl.saveUrlSharingWithId(zad, byInternal, jpd.b);
        }
    }

    /* access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$1(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl) {
        urlSharingListenerManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void saveUrlSharingWithId(zad zad, ParticipantId participantId, String str) {
        this.roomIdToUrlSharingInfo.put(zad, new UrlSharingInfo(str, participantId));
        if (tpa.f(zad, this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    public void addListener(UrlSharingListener urlSharingListener) {
        this.listeners.add(urlSharingListener);
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        if (urlSharingInfo != null) {
            urlSharingListener.onUrlSharingStarted(urlSharingInfo);
        }
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        zad zad = this.activeRoomId;
        zad zad2 = nl1.a;
        if (!tpa.f(zad, zad2)) {
            this.activeRoomId = zad2;
            reportForActiveRoom();
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1) {
    }

    public void onUrlSharingInfoUpdated(zn1 zn1) {
        zad zad = zn1.a;
        jpd jpd = zn1.b;
        if (jpd == null) {
            this.roomIdToUrlSharingInfo.put(zad, (Object) null);
            if (tpa.f(zad, this.activeRoomId)) {
                reportForActiveRoom();
                return;
            }
            return;
        }
        saveUrlSharing(zad, jpd);
    }

    public void removeListener(UrlSharingListener urlSharingListener) {
        this.listeners.remove(urlSharingListener);
    }
}
