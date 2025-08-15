package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: tz0  reason: default package */
public final class tz0 implements MediaMuteManagerListener {
    public final /* synthetic */ yz0 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 d;

    public tz0(yz0 yz0, je7 je7, je7 je72, je7 je73) {
        this.a = yz0;
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    public final void onMuteChanged(vi9 vi9) {
        boolean z;
        Object value;
        Object value2;
        boolean z2;
        Object value3;
        vi9 vi92 = vi9;
        rd8 rd8 = (rd8) vi92.a.get(qd8.b);
        rd8 rd82 = rd8.a;
        if (rd8 != null) {
            yz0 yz0 = this.a;
            je7 je7 = this.b;
            yz0.getClass();
            boolean z3 = rd8 == rd82;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "CallAdminSettingsController", "Video was disabled by admin to " + rd8, (Throwable) null);
            }
            if (!z3) {
                CameraManager a2 = ((r21) je7.getValue()).a();
                z2 = a2 != null && a2.isCameraEnabled();
                CameraManager a3 = ((r21) je7.getValue()).a();
                if (a3 != null) {
                    a3.setCameraEnabled(false);
                }
            } else {
                z2 = false;
            }
            q0e q0e = yz0.E0;
            do {
                value3 = q0e.getValue();
            } while (!q0e.c(value3, aa.a((aa) value3, false, yz0.h(rd8), false, false, false, false, 125)));
            if (!yz0.h(rd8)) {
                yz0.C0.g(new xa(true, false));
            } else if (z2) {
                yz0.C0.g(ra.a);
            }
        }
        rd8 rd83 = (rd8) vi92.a.get(qd8.a);
        if (rd83 != null) {
            yz0 yz02 = this.a;
            je7 je72 = this.c;
            yz02.getClass();
            boolean z4 = rd83 == rd82;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, "CallAdminSettingsController", "Microphone was changed by admin to " + rd83, (Throwable) null);
            }
            if (!z4) {
                ((a11) ((z01) je72.getValue())).d();
                MicrophoneManager c2 = ((a11) ((z01) je72.getValue())).c();
                if (c2 != null) {
                    c2.setMicEnabled(false);
                }
            }
            q0e q0e2 = yz02.E0;
            do {
                value2 = q0e2.getValue();
            } while (!q0e2.c(value2, aa.a((aa) value2, false, false, yz0.h(rd83), false, false, false, 123)));
            Conversation a4 = yz02.d().a();
            if (!(a4 != null ? a4.isMeCreatorOrAdmin() : false)) {
                if (!yz0.h(rd83)) {
                    yz02.C0.g(new za(true, false));
                } else if (!z4) {
                    yz02.C0.g(sa.a);
                }
            }
        }
        rd8 rd84 = (rd8) vi92.a.get(qd8.c);
        if (rd84 != null) {
            yz0 yz03 = this.a;
            je7 je73 = this.d;
            yz03.getClass();
            boolean z5 = rd84 == rd82;
            ir6 ir63 = hm9.m;
            if (ir63 != null && ir63.c()) {
                ir63.d(us7.X, "CallAdminSettingsController", "Screen sharing was disabled by admin to " + rd84, (Throwable) null);
            }
            if (!z5) {
                z = ((xuc) je73.getValue()).c();
                ((xuc) je73.getValue()).b(false);
            } else {
                z = false;
            }
            q0e q0e3 = yz03.E0;
            do {
                value = q0e3.getValue();
            } while (!q0e3.c(value, aa.a((aa) value, false, false, false, yz0.h(rd84), false, false, 119)));
            if (!yz0.h(rd84) && z) {
                yz03.C0.g(new db(true, false));
            } else if (z) {
                yz03.C0.g(va.a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r0 = (r0 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r0, (defpackage.zad) null, 1, (java.lang.Object) null)).b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMuteStateInitialized(defpackage.vi9 r7) {
        /*
            r6 = this;
            yz0 r6 = r6.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.u0
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            qd8 r0 = defpackage.qd8.b
            java.util.Map r7 = r7.a
            java.lang.Object r0 = r7.get(r0)
            rd8 r0 = (defpackage.rd8) r0
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001f
            boolean r0 = defpackage.yz0.h(r0)
            goto L_0x0035
        L_0x001f:
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r0 = r6.e()
            if (r0 == 0) goto L_0x0034
            sd8 r0 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r0, r2, r3, r2)
            if (r0 == 0) goto L_0x0034
            rd8 r0 = r0.b
            if (r0 == 0) goto L_0x0034
            boolean r0 = defpackage.yz0.h(r0)
            goto L_0x0035
        L_0x0034:
            r0 = r1
        L_0x0035:
            qd8 r4 = defpackage.qd8.a
            java.lang.Object r4 = r7.get(r4)
            rd8 r4 = (defpackage.rd8) r4
            if (r4 == 0) goto L_0x0044
            boolean r4 = defpackage.yz0.h(r4)
            goto L_0x005a
        L_0x0044:
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r4 = r6.e()
            if (r4 == 0) goto L_0x0059
            sd8 r4 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r4, r2, r3, r2)
            if (r4 == 0) goto L_0x0059
            rd8 r4 = r4.a
            if (r4 == 0) goto L_0x0059
            boolean r4 = defpackage.yz0.h(r4)
            goto L_0x005a
        L_0x0059:
            r4 = r1
        L_0x005a:
            qd8 r5 = defpackage.qd8.c
            java.lang.Object r7 = r7.get(r5)
            rd8 r7 = (defpackage.rd8) r7
            if (r7 == 0) goto L_0x0069
            boolean r7 = defpackage.yz0.h(r7)
            goto L_0x007e
        L_0x0069:
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r6.e()
            if (r7 == 0) goto L_0x007d
            sd8 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r3, r2)
            if (r7 == 0) goto L_0x007d
            rd8 r7 = r7.c
            if (r7 == 0) goto L_0x007d
            boolean r1 = defpackage.yz0.h(r7)
        L_0x007d:
            r7 = r1
        L_0x007e:
            r6.k(r0, r4, r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.u0
            r7.set(r3)
            r6.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz0.onMuteStateInitialized(vi9):void");
    }
}
