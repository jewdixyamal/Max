package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: ir1  reason: default package */
public final class ir1 {
    public static final /* synthetic */ bc7[] y;
    public final kr1 a;
    public final z01 b;
    public final jt4 c;
    public final oqa d;
    public final r21 e;
    public final b31 f;
    public final xs1 g;
    public final xuc h;
    public final lvc i;
    public final jpb j;
    public final jr1 k;
    public final ez0 l;
    public final je7 m;
    public final q0e n;
    public final w7c o;
    public final khe p = new khe(new zq1(this, 0));
    public final khe q = new khe(new zq1(this, 1));
    public final khe r = new khe(new dk1(18));
    public final r44 s;
    public final khe t;
    public final khe u;
    public final w4d v;
    public final zn5 w;
    public final khe x;

    static {
        oi9 oi9 = new oi9(ir1.class, "vpnStatusJob", "getVpnStatusJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        y = new bc7[]{oi9};
    }

    public ir1(kr1 kr1, z01 z01, jt4 jt4, oqa oqa, r21 r21, b31 b31, xs1 xs1, xuc xuc, lvc lvc, jpb jpb, jr1 jr1, ez0 ez0, je7 je7, gh3 gh3) {
        kr1 kr12 = kr1;
        jr1 jr12 = jr1;
        this.a = kr12;
        this.b = z01;
        this.c = jt4;
        this.d = oqa;
        this.e = r21;
        this.f = b31;
        this.g = xs1;
        this.h = xuc;
        this.i = lvc;
        this.j = jpb;
        this.k = jr12;
        this.l = ez0;
        this.m = je7;
        q0e a2 = r0e.a(new to1(false, (nnf) null, 255));
        this.n = a2;
        this.o = new w7c(a2);
        int i2 = r44.g;
        int i3 = ft4.o;
        this.s = new r44(new q44(z7.R(10, kt4.SECONDS)), new yh0(2, new zq1(this, 2)), (m56) null);
        this.t = new khe(new zq1(this, 3));
        this.u = new khe(new zq1(this, 4));
        this.v = mqd.D();
        this.w = new zn5(od2.x(od2.g(new gr1(gh3, (Continuation) null))), new hr1(this, (Continuation) null), 5);
        this.x = new khe(new zq1(this, 5));
        ((wr1) kr12).d(new ar1(this));
        od2.L(new zn5(new t03(od2.x(new xk1(e(), 7)), 11), new br1(this, (Continuation) null), 5), jr12);
    }

    public final void a(nnf nnf) {
        q0e q0e;
        Object value;
        do {
            q0e = this.n;
            value = q0e.getValue();
        } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, (gg1) null, nnf, false, (u9f) null, 0, 239)));
    }

    public final q0e b() {
        return ((wr1) this.a).I;
    }

    public final d04 c() {
        return (d04) ((wr1) this.a).I.getValue();
    }

    public final fqa d() {
        return ((cra) this.d).c();
    }

    public final j0e e() {
        return ((cra) this.d).w0;
    }

    public final q0e f() {
        return ((vvc) this.i).t0;
    }

    public final void g(boolean z) {
        if (!this.h.c()) {
            CameraManager a2 = this.e.a();
            if (a2 != null) {
                a2.setCameraEnabled(z);
            }
            CallsAudioManager callsAudioManager = (CallsAudioManager) ((a11) this.b).c.get();
            if (callsAudioManager != null) {
                CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, z, false, (k56) null, (m56) null, 12, (Object) null);
            }
        }
    }

    public final void h(long j2) {
        q0e q0e;
        Object value;
        do {
            q0e = this.n;
            value = q0e.getValue();
        } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, (gg1) null, (nnf) null, false, (u9f) null, j2, 127)));
    }

    public final void i(gg1 gg1, boolean z) {
        q0e q0e;
        Object value;
        to1 to1;
        gg1 gg12;
        do {
            q0e = this.n;
            value = q0e.getValue();
            to1 = (to1) value;
            gg12 = (!z && tpa.f(to1.a, gg1)) ? null : gg1;
        } while (!q0e.c(value, to1.a(to1, gg12, (gg1) null, (gg1) null, gg12 != null ? nnf.a : to1.e, false, (u9f) null, 0, 238)));
    }

    public final void j(gg1 gg1) {
        q0e q0e;
        Object value;
        do {
            q0e = this.n;
            value = q0e.getValue();
        } while (!q0e.c(value, to1.a((to1) value, (gg1) null, gg1, (gg1) null, (nnf) null, false, (u9f) null, 0, 253)));
    }

    public final void k(boolean z) {
        RecordManager.StopParams stopParams = new RecordManager.StopParams((zad) null, z, (m56) null, (m56) null, 13, (z84) null);
        vvc vvc = (vvc) this.i;
        vvc.getClass();
        hm9.h0("ScreenRecordControllerTag", "stopRecordBroadcast", new Object[0]);
        ReentrantLock reentrantLock = vvc.Z;
        reentrantLock.lock();
        try {
            if (((wvc) vvc.t0.getValue()).a != xvc.a) {
                hm9.h0("ScreenRecordControllerTag", "startRecordBroadcast already finished", new Object[0]);
                return;
            }
            bt1 bt1 = (bt1) vvc.X.getValue();
            bt1.getClass();
            bt1.c(bt1, "CALL_RECORDING", (String) null, (String) null, 0L, (String) null, (String) null, true, 54);
            RecordManager b2 = vvc.b();
            if (b2 != null) {
                RecordManager.stopRecord$default(b2, stopParams, new zja(vvc, 16, stopParams), (m56) null, 4, (Object) null);
            }
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        bt1 bt1 = (bt1) this.m.getValue();
        String str = c().c;
        int i2 = cr1.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        String str2 = i2 != 1 ? i2 != 2 ? "HEADPHONES" : "DYNAMIC" : "PHONE";
        boolean z = c().h;
        bt1.getClass();
        bt1.c(bt1, "SPEAKER_MODE_CHANGED", str, str2, (Long) null, (String) null, (String) null, z, 56);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((a11) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, (k56) null, (m56) null, 6, (Object) null);
        }
    }

    public final void m() {
        Object value;
        a11 a11;
        ti9 ti9 = (ti9) this.p.getValue();
        do {
            value = ti9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
            a11 = (a11) this.b;
        } while (!ti9.c(value, a11.b()));
        ync ync = new ync(21, this);
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11.c.get();
        if (callsAudioManager != null) {
            callsAudioManager.setOnAudioDeviceChangeListener(ync);
        }
    }

    public final void n() {
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.u.getValue();
        a11 a11 = (a11) this.b;
        a11.getClass();
        try {
            MicrophoneManager c2 = a11.c();
            if (c2 != null) {
                c2.registerAudioSampleCallback(250, audioLevelListener);
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            hm9.l0("CallAudioController", "CallAudioController can't register mic audio listener due to: " + message + ".", e2);
        }
    }

    public final void o(u9f u9f) {
        Object value;
        q0e q0e = this.n;
        if (((to1) q0e.getValue()).g != u9f.c || u9f == u9f.o) {
            do {
                value = q0e.getValue();
            } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, (gg1) null, (nnf) null, false, u9f, 0, 191)));
        }
    }
}
