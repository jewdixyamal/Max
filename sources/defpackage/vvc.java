package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* renamed from: vvc  reason: default package */
public final class vvc implements lvc {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final ReentrantLock Z = new ReentrantLock(true);
    public final so1 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final q0e t0;
    public vxd u0;
    public final khe v0;
    public final w4d w0;
    public vxd x0;
    public final q0e y0;
    public final q0e z0;

    static {
        oi9 oi9 = new oi9(vvc.class, "loadUserRecordInfoJob", "getLoadUserRecordInfoJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9};
    }

    public vvc(je7 je7, je7 je72, je7 je73, je7 je74, so1 so1, je7 je75) {
        this.a = so1;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        this.Y = je75;
        q0e a2 = r0e.a(wvc.e);
        this.s0 = a2;
        this.t0 = a2;
        this.v0 = new khe(new hbc(11));
        this.w0 = mqd.D();
        q0e a3 = r0e.a((Object) null);
        this.y0 = a3;
        this.z0 = a3;
    }

    public final RecordManager b() {
        Conversation a2 = ((fw3) this.b.getValue()).a();
        if (a2 != null) {
            return a2.getRecordManager();
        }
        return null;
    }

    public final void c(xvc xvc) {
        q0e q0e;
        Object value;
        hm9.h0("ScreenRecordControllerTag", "release record state with " + xvc, new Object[0]);
        do {
            q0e = this.s0;
            value = q0e.getValue();
            wvc wvc = (wvc) value;
        } while (!q0e.c(value, wvc.a(wvc.e, xvc, (kvc) null, false, (String) null, 14)));
        vxd vxd = this.u0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.u0 = null;
        bc7[] bc7Arr = A0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.w0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
        vxd vxd2 = this.x0;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        this.x0 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r6 != 2) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.xvc r19) {
        /*
            r18 = this;
            r0 = r18
        L_0x0002:
            q0e r1 = r0.s0
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            wvc r3 = (defpackage.wvc) r3
            ru.ok.android.externcalls.sdk.record.RecordManager r4 = r18.b()
            r5 = 0
            if (r4 == 0) goto L_0x006c
            ru.ok.android.externcalls.sdk.record.RecordDescription r4 = r4.getRecordDescription()
            if (r4 == 0) goto L_0x006c
            pcc r6 = r4.getType()
            int r6 = r6.ordinal()
            r7 = 3
            r8 = 1
            if (r6 == 0) goto L_0x0029
            if (r6 == r8) goto L_0x002b
            r9 = 2
            if (r6 == r9) goto L_0x002c
        L_0x0029:
            r9 = r8
            goto L_0x002c
        L_0x002b:
            r9 = r7
        L_0x002c:
            if (r9 != r8) goto L_0x002f
            goto L_0x006c
        L_0x002f:
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = r4.getInitiator()
            gg1 r14 = defpackage.mqa.b(r6)
            je7 r6 = r0.c
            java.lang.Object r6 = r6.getValue()
            jr1 r6 = (defpackage.jr1) r6
            mvc r8 = new mvc
            long r10 = r14.a
            r8.<init>(r10, r0, r5)
            vxd r5 = defpackage.j47.T(r6, r5, r5, r8, r7)
            bc7[] r6 = A0
            r7 = 0
            r6 = r6[r7]
            w4d r7 = r0.w0
            r7.o1(r0, r6, r5)
            kvc r5 = new kvc
            long r11 = r4.getMovieId()
            long r6 = r4.getMovieId()
            java.lang.String r13 = java.lang.String.valueOf(r6)
            long r15 = r4.getStart()
            r10 = r5
            r17 = r9
            r10.<init>(r11, r13, r14, r15, r17)
        L_0x006c:
            r6 = 0
            r7 = 0
            r8 = 12
            r4 = r19
            wvc r3 = defpackage.wvc.a(r3, r4, r5, r6, r7, r8)
            boolean r1 = r1.c(r2, r3)
            if (r1 == 0) goto L_0x0002
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvc.d(xvc):void");
    }

    public final void onRecordDataChanged() {
        hm9.h0("ScreenRecordControllerTag", "onRecordDataChanged", new Object[0]);
        d(xvc.c);
    }

    public final void onRecordError(String str) {
        hm9.h0("ScreenRecordControllerTag", "onRecordError: " + str, new Object[0]);
        c(xvc.b);
        c(xvc.c);
    }

    public final void onRecordStarted() {
        RecordDescription recordDescription;
        RecordManager b2 = b();
        if (b2 != null && (recordDescription = b2.getRecordDescription()) != null) {
            hm9.h0("ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, new Object[0]);
            long start = recordDescription.getStart();
            if (this.u0 == null) {
                this.u0 = j47.T((jr1) this.c.getValue(), (lx3) null, (vx3) null, new uvc(start, this, (Continuation) null), 3);
            }
            d(xvc.a);
        }
    }

    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        ParticipantId externalId;
        ConversationParticipant me2;
        ParticipantId externalId2;
        hm9.h0("ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, new Object[0]);
        kvc kvc = ((wvc) this.t0.getValue()).b;
        gg1 gg1 = null;
        gg1 gg12 = kvc != null ? kvc.c : null;
        if (gg12 != null) {
            Conversation a2 = ((fw3) this.b.getValue()).a();
            if (gg12.equals((a2 == null || (me2 = a2.getMe()) == null || (externalId2 = me2.getExternalId()) == null) ? null : mqa.b(externalId2))) {
                if (!(conversationParticipant == null || (externalId = conversationParticipant.getExternalId()) == null)) {
                    gg1 = mqa.b(externalId);
                }
                if (!gg12.equals(gg1)) {
                    ((yz0) ((ez0) this.o.getValue())).C0.g(ua.a);
                }
            }
        }
        c(xvc.c);
    }
}
