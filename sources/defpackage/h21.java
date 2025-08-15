package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: h21  reason: default package */
public final class h21 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final ac Z;
    public final l5g b;
    public final el1 c;
    public final je7 o;
    public final ac s0;
    public final q0e t0;
    public final w7c u0;
    public final w7c v0;
    public final qw w0;
    public final e21 x0;

    /* JADX WARNING: type inference failed for: r11v1, types: [ffe, e66] */
    public h21(l5g l5g, el1 el1) {
        el1 el12 = el1;
        khe d = n31.a.getAccessor().d(eua.class);
        je7 je7 = yi1.a;
        khe d2 = zi1.a.getAccessor().d(ir1.class);
        je7 c2 = yi1.c();
        je7 d3 = yi1.d();
        je7 je72 = yi1.a;
        this.b = l5g;
        this.c = el12;
        this.o = d2;
        this.X = d;
        this.Y = c2;
        mn5 x = od2.x(new j31(el12.H0, el12.I0, new t11(3, (Continuation) null, 0), 4));
        this.Z = od2.t((gld) ((ir1) d2.getValue()).t.getValue(), x, ((yz0) ((ir1) d2.getValue()).l).F0, new ffe(4, (Continuation) null));
        this.s0 = od2.s(new qw(((ir1) d2.getValue()).e(), 9), x, new qw(((ir1) d2.getValue()).o, 10), new qw(((ir1) d2.getValue()).b(), 11), new w11(d3, (Continuation) null));
        m38 m38 = m38.X;
        q0e a = r0e.a(new zq0(m38, m38, m38, m38, new y41(CallsAudioDeviceInfo.Companion.getNONE())));
        this.t0 = a;
        this.u0 = new w7c(a);
        t03 D = od2.D(new qw(((l31) ((ir1) d2.getValue()).f).k, 15), new u11(je72, (Continuation) null));
        int i = ft4.o;
        this.v0 = od2.X(od2.x(new qw(nu0.Q(D, z7.R(1, kt4.SECONDS)), 12)), this.a, wld.a, 0);
        w7c w7c = el12.C0;
        this.w0 = new qw(w7c, 13);
        this.x0 = new e21(new mqc(new ho5(TimeUnit.MILLISECONDS, (Continuation) null)), d2, 0);
        od2.L(od2.t((j0e) ((ir1) d2.getValue()).q.getValue(), w7c, new qw(((ir1) d2.getValue()).e(), 14), new s11(this, d3, (Continuation) null)), this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r0.getAvailableAudioDevices();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList q() {
        /*
            r4 = this;
            ir1 r0 = r4.r()
            z01 r0 = r0.b
            a11 r0 = (defpackage.a11) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            java.lang.Object r0 = r0.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r0 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r0
            if (r0 == 0) goto L_0x001d
            java.util.List r0 = r0.getAvailableAudioDevices()
            if (r0 == 0) goto L_0x001d
            java.util.Set r0 = defpackage.x53.H0(r0)
            goto L_0x001f
        L_0x001d:
            wz4 r0 = defpackage.wz4.a
        L_0x001f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r0.next()
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r2 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r2
            el1 r3 = r4.c
            boolean r3 = r3.u()
            a51 r2 = defpackage.dz7.b(r2, r3)
            r1.add(r2)
            goto L_0x002e
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h21.q():java.util.ArrayList");
    }

    public final ir1 r() {
        return (ir1) this.o.getValue();
    }

    public final void s(m38 m38) {
        if (m38 != m38.c) {
            je7 je7 = this.X;
            String[] strArr = eua.h;
            if (!((eua) je7.getValue()).b(strArr)) {
                eua eua = (eua) je7.getValue();
                int i = b8a.E;
                eua.getClass();
                int i2 = j1c.permissions_audio_title;
                int i3 = oga.g;
                l5g l5g = this.b;
                if (eua.i(l5g, strArr)) {
                    l5g.c(strArr, 160, i2, i, i3);
                } else {
                    eua.f(l5g, strArr, 160);
                }
            } else {
                bt1 bt1 = (bt1) this.Y.getValue();
                String str = r().c().c;
                m38 m382 = m38.b;
                long j = m38 == m382 ? 1 : 0;
                boolean z = r().c().h;
                bt1.getClass();
                bt1.c(bt1, "AUDIO_ENABLED", str, (String) null, Long.valueOf(j), (String) null, (String) null, z, 52);
                ir1 r = r();
                boolean z2 = m38 == m382;
                MicrophoneManager c2 = ((a11) r.b).c();
                if (c2 != null) {
                    c2.setMicEnabled(z2);
                }
                if (z2) {
                    ((si9) r.r.getValue()).g(Boolean.FALSE);
                }
            }
        } else if (!((aa) ((yz0) r().l).F0.getValue()).c) {
            pnf.o(this.c.M0, wj1.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r1.getAvailableAudioDevices();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r6 = this;
            ir1 r6 = r6.r()
            z01 r0 = r6.b
            a11 r0 = (defpackage.a11) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.c
            java.lang.Object r1 = r1.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r1 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r1
            if (r1 == 0) goto L_0x001d
            java.util.List r1 = r1.getAvailableAudioDevices()
            if (r1 == 0) goto L_0x001d
            java.util.Set r1 = defpackage.x53.H0(r1)
            goto L_0x001f
        L_0x001d:
            wz4 r1 = defpackage.wz4.a
        L_0x001f:
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0027
            goto L_0x005a
        L_0x0027:
            int r2 = r1.size()
            r4 = 3
            if (r2 >= r4) goto L_0x0059
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = r0.b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0036:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()
            r4 = r2
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r4 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r4
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r4 = r4.getDeviceType()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r5 = r0.getDeviceType()
            if (r4 == r5) goto L_0x0036
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r2 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r2
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = r2
        L_0x0055:
            r6.l(r0)
            goto L_0x005a
        L_0x0059:
            r3 = 1
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h21.t():boolean");
    }

    public final void u(m38 m38) {
        if (m38 != m38.c) {
            je7 je7 = this.X;
            boolean b2 = ((eua) je7.getValue()).b(eua.l);
            je7 je72 = this.Y;
            if (!b2) {
                bt1 bt1 = (bt1) je72.getValue();
                String str = r().c().c;
                boolean z = r().c().h;
                bt1.getClass();
                bt1.c(bt1, "REQUEST_PERMISSION_CAM", str, "DURING_CALL", (Long) null, (String) null, (String) null, z, 56);
                ((eua) je7.getValue()).h(this.b);
            } else if (!r().h.c()) {
                bt1 bt12 = (bt1) je72.getValue();
                String str2 = r().c().c;
                m38 m382 = m38.b;
                long j = m38 == m382 ? 1 : 0;
                boolean z2 = r().c().h;
                bt12.getClass();
                bt1.c(bt12, "VIDEO_ENABLED", str2, (String) null, Long.valueOf(j), (String) null, (String) null, z2, 52);
                r().g(m38 == m382);
            }
        } else if (!((aa) ((yz0) r().l).F0.getValue()).b) {
            pnf.o(this.c.M0, wj1.c);
        }
    }
}
