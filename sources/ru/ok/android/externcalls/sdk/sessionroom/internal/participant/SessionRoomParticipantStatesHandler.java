package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantStatesHandler;", "Lrl1;", "Lzy0;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lkotlin/Function0;", "", "isMeCreatorOrAdmin", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lk56;)V", "", "Lfg1;", "participants", "Le5f;", "dismissAssistanceRequestIfAdminAppearedInRoom", "(Ljava/util/Collection;)V", "dismissAssistanceRequestIfNecessary", "()V", "lowerMyHandAndDismissAssistanceRequestIfNecessary", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Luy0;", "onActiveParticipantsAdded", "(Luy0;)V", "Lyy0;", "onActiveParticipantUpdated", "(Lyy0;)V", "Lvy0;", "onActiveParticipantsChanged", "(Lvy0;)V", "Lwy0;", "onActiveParticipantsDeAnonimized", "(Lwy0;)V", "Lxy0;", "onActiveParticipantsRemoved", "(Lxy0;)V", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lk56;", "Lzad;", "roomId", "Lzad;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomParticipantStatesHandler implements rl1, zy0 {
    private final k56 isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private zad roomId = xad.a;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, k56 k56) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = k56;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void dismissAssistanceRequestIfAdminAppearedInRoom(java.util.Collection<defpackage.fg1> r3) {
        /*
            r2 = this;
            zad r0 = r2.roomId
            boolean r0 = r0 instanceof defpackage.xad
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Iterator r3 = r3.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            fg1 r0 = (defpackage.fg1) r0
            java.util.List r0 = r0.e
            eg1 r1 = defpackage.eg1.b
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0029
            eg1 r1 = defpackage.eg1.a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x000b
        L_0x0029:
            r2.dismissAssistanceRequestIfNecessary()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler.dismissAssistanceRequestIfAdminAppearedInRoom(java.util.Collection):void");
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.Companion;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, mz7.a0(new kpa(state, companion.getSTATE_OFF()), new kpa(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), (qod) null, (qod) null, 6, (Object) null);
    }

    public void onActiveParticipantUpdated(yy0 yy0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(yy0.b);
    }

    public void onActiveParticipantsAdded(uy0 uy0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(uy0.a);
    }

    public void onActiveParticipantsChanged(vy0 vy0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(vy0.a);
    }

    public void onActiveParticipantsDeAnonimized(wy0 wy0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(wy0.a);
    }

    public void onActiveParticipantsRemoved(xy0 xy0) {
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        zad zad = this.roomId;
        zad zad2 = nl1.a;
        if (!tpa.f(zad, zad2)) {
            lowerMyHandAndDismissAssistanceRequestIfNecessary();
            if (((Boolean) this.isMeCreatorOrAdmin.invoke()).booleanValue() && (zad2 instanceof yad)) {
                ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (yad) zad2, (qod) null, (qod) null, 12, (Object) null);
            }
            this.roomId = zad2;
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1) {
    }
}
