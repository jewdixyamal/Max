package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* renamed from: a98  reason: default package */
public final class a98 implements q3b {
    public final Handler X;
    public final long Y = -9223372036854775807L;
    public boolean Z;
    public final kue a = new kue();
    public boolean b;
    public final z88 c;
    public final y88 o;
    public final x88 s0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: da8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: w98} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: da8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: da8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a98(android.content.Context r7, defpackage.obd r8, android.os.Bundle r9, defpackage.y88 r10, android.os.Looper r11, defpackage.i98 r12, defpackage.imc r13) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.fm9.i(r7, r0)
            java.lang.String r0 = "token must not be null"
            defpackage.fm9.i(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Init "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.oaf.e
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.z04.J(r0)
            kue r0 = new kue
            r0.<init>()
            r6.a = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.Y = r0
            r6.o = r10
            android.os.Handler r10 = new android.os.Handler
            r10.<init>(r11)
            r6.X = r10
            r6.s0 = r12
            nbd r10 = r8.a
            boolean r10 = r10.e()
            if (r10 == 0) goto L_0x0065
            da8 r9 = new da8
            r13.getClass()
            r0 = r9
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0071
        L_0x0065:
            w98 r10 = new w98
            r0 = r10
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r10
        L_0x0071:
            r6.c = r9
            r9.connect()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a98.<init>(android.content.Context, obd, android.os.Bundle, y88, android.os.Looper, i98, imc):void");
    }

    public final long A() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.A();
        }
        return -9223372036854775807L;
    }

    public final void A0(int i, tb8 tb8) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring replaceMediaItem().");
        } else {
            z88.A0(i, tb8);
        }
    }

    public final int B() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.B();
        }
        return -1;
    }

    public final jlf C() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.C() : jlf.e;
    }

    public final void C0(tb8 tb8) {
        K();
        fm9.i(tb8, "mediaItems must not be null");
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            z88.C0(tb8);
        }
    }

    public final void D() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else {
            z88.D();
        }
    }

    public final void D0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            z88.D0();
        }
    }

    public final void E() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        } else {
            z88.E();
        }
    }

    public final boolean E0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.E0();
    }

    public final h30 F() {
        K();
        z88 z88 = this.c;
        return !z88.isConnected() ? h30.g : z88.F();
    }

    public final j0f F0() {
        K();
        z88 z88 = this.c;
        return !z88.isConnected() ? j0f.C : z88.F0();
    }

    public final void G(Runnable runnable) {
        oaf.W(this.X, runnable);
    }

    public final long G0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.G0();
        }
        return 0;
    }

    public final void H(int i, boolean z) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            z88.H(i, z);
        }
    }

    public final void H0(int i, long j, List list) {
        K();
        fm9.i(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            fm9.e("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            z88.H0(i, j, list);
        }
    }

    public final ui4 I() {
        K();
        z88 z88 = this.c;
        return !z88.isConnected() ? ui4.e : z88.I();
    }

    public final void I0(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            z88.I0(i);
        }
    }

    public final void J() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            z88.J();
        }
    }

    public final void J0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekToNext().");
        } else {
            z88.J0();
        }
    }

    public final void K() {
        fm9.j("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.X.getLooper());
    }

    public final void K0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekForward().");
        } else {
            z88.K0();
        }
    }

    public final boolean K1() {
        K();
        mue x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).a();
    }

    public final void L(int i, int i2) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            z88.L(i, i2);
        }
    }

    public final void L0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekBack().");
        } else {
            z88.L0();
        }
    }

    public final boolean M() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.M();
    }

    public final void N(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            z88.N(i);
        }
    }

    public final gd8 N0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.N0() : gd8.J;
    }

    public final int O() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.O();
        }
        return -1;
    }

    public final void O0(List list) {
        K();
        fm9.i(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            fm9.e("items must not contain null, index=" + i, list.get(i) != null);
        }
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            z88.O0(list);
        }
    }

    public final long P0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.P0();
        }
        return 0;
    }

    public final void Q(j0f j0f) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        z88.Q(j0f);
    }

    public final tb8 R0() {
        mue x0 = x0();
        if (x0.q()) {
            return null;
        }
        return x0.n(p0(), this.a, 0).c;
    }

    public final void S(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring removeMediaItem().");
        } else {
            z88.S(i);
        }
    }

    public final void U(int i, int i2) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring removeMediaItems().");
        } else {
            z88.U(i, i2);
        }
    }

    public final void V() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekToPrevious().");
        } else {
            z88.V();
        }
    }

    public final PlaybackException X() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.X();
        }
        return null;
    }

    public final void Y(boolean z) {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            z88.Y(z);
        }
    }

    public final void Z(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        } else {
            z88.Z(i);
        }
    }

    public final boolean a() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.a();
    }

    public final long a0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.a0();
        }
        return 0;
    }

    public final boolean b() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.b();
    }

    public final long b0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.b0();
        }
        return 0;
    }

    public final long c() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.c();
        }
        return -9223372036854775807L;
    }

    public final c3b d() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.d() : c3b.d;
    }

    public final void d0(int i, List list) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring addMediaItems().");
        } else {
            z88.d0(i, list);
        }
    }

    public final float e() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.e();
        }
        return 1.0f;
    }

    public final long e0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.e0();
        }
        return 0;
    }

    public final void f(c3b c3b) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setPlaybackParameters().");
        } else {
            z88.f(c3b);
        }
    }

    public final void f0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else {
            z88.f0();
        }
    }

    public final void g(float f) {
        K();
        fm9.e("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setVolume().");
        } else {
            z88.g(f);
        }
    }

    public final void g0(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            z88.g0(i);
        }
    }

    public final int getPlaybackState() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.getPlaybackState();
        }
        return 1;
    }

    public final int getRepeatMode() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.getRepeatMode();
        }
        return 0;
    }

    public final int h() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.T0();
        }
        return -1;
    }

    public final p0f h0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.h0() : p0f.b;
    }

    public final int i() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.R0();
        }
        return -1;
    }

    public final void j() {
        fm9.k(Looper.myLooper() == this.X.getLooper());
        fm9.k(!this.Z);
        this.Z = true;
        i98 i98 = (i98) this.s0;
        i98.u0 = true;
        a98 a98 = i98.t0;
        if (a98 != null) {
            i98.l(a98);
        }
    }

    public final boolean j0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.j0();
    }

    public final long k() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.k();
        }
        return 0;
    }

    public final gd8 k0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.k0() : gd8.J;
    }

    public final int l() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            return 0;
        }
        return z88.l();
    }

    public final zz3 l0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.l0() : zz3.c;
    }

    public final void m(Surface surface) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setVideoSurface().");
        } else {
            z88.m(surface);
        }
    }

    public final void m0(h30 h30, boolean z) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setAudioAttributes().");
        } else {
            z88.m0(h30, z);
        }
    }

    public final boolean n() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.n();
    }

    public final void n0(gd8 gd8) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setPlaylistMetadata().");
        } else {
            z88.n0(gd8);
        }
    }

    public final boolean n1() {
        K();
        mue x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).h;
    }

    public final void o(pj3 pj3) {
        fm9.k(Looper.myLooper() == this.X.getLooper());
        pj3.accept(this.o);
    }

    public final int o0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.o0();
        }
        return -1;
    }

    public final long p() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.p();
        }
        return -9223372036854775807L;
    }

    public final int p0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.p0();
        }
        return -1;
    }

    public final void pause() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring pause().");
        } else {
            z88.pause();
        }
    }

    public final void play() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring play().");
        } else {
            z88.play();
        }
    }

    public final void prepare() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring prepare().");
        } else {
            z88.prepare();
        }
    }

    public final long q() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.q();
        }
        return 0;
    }

    public final void q0(boolean z) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            z88.q0(z);
        }
    }

    public final void r(int i, long j) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        } else {
            z88.r(i, j);
        }
    }

    public final void r0(n3b n3b) {
        K();
        fm9.i(n3b, "listener must not be null");
        this.c.r0(n3b);
    }

    public final void release() {
        K();
        if (!this.b) {
            z04.J("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "] [" + nc8.b() + "]");
            boolean z = true;
            this.b = true;
            Handler handler = this.X;
            handler.removeCallbacksAndMessages((Object) null);
            try {
                this.c.release();
            } catch (Exception e) {
                z04.s(e, "Exception while releasing impl");
            }
            if (this.Z) {
                if (Looper.myLooper() != handler.getLooper()) {
                    z = false;
                }
                fm9.k(z);
                this.o.onDisconnected();
                return;
            }
            this.Z = true;
            i98 i98 = (i98) this.s0;
            i98.getClass();
            i98.m(new SecurityException("Session rejected the connection request."));
        }
    }

    public final k3b s() {
        K();
        z88 z88 = this.c;
        return !z88.isConnected() ? k3b.b : z88.s();
    }

    public final void s0(List list, int i, int i2) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring replaceMediaItems().");
        } else {
            z88.s0(list, i, i2);
        }
    }

    public final void seekTo(long j) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        } else {
            z88.seekTo(j);
        }
    }

    public final void setPlaybackSpeed(float f) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setPlaybackSpeed().");
        } else {
            z88.setPlaybackSpeed(f);
        }
    }

    public final void setRepeatMode(int i) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setRepeatMode().");
        } else {
            z88.setRepeatMode(i);
        }
    }

    public final void stop() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring stop().");
        } else {
            z88.stop();
        }
    }

    public final void t(tb8 tb8, long j) {
        K();
        fm9.i(tb8, "mediaItems must not be null");
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setMediaItem().");
        } else {
            z88.t(tb8, j);
        }
    }

    public final void t0(int i, int i2) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring moveMediaItem().");
        } else {
            z88.t0(i, i2);
        }
    }

    public final boolean t1(int i) {
        return s().a(i);
    }

    public final boolean u() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() && z88.u();
    }

    public final void u0(int i, int i2, int i3) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring moveMediaItems().");
        } else {
            z88.u0(i, i2, i3);
        }
    }

    public final void v() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring clearMediaItems().");
        } else {
            z88.v();
        }
    }

    public final int v0() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.v0();
        }
        return 0;
    }

    public final void w(boolean z) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setShuffleMode().");
        } else {
            z88.w(z);
        }
    }

    public final void w0(List list) {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            z04.c0("The controller is not connected. Ignoring addMediaItems().");
        } else {
            z88.w0(list);
        }
    }

    public final int x() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.x();
        }
        return 0;
    }

    public final mue x0() {
        K();
        z88 z88 = this.c;
        return z88.isConnected() ? z88.x0() : mue.a;
    }

    public final long y() {
        K();
        z88 z88 = this.c;
        if (z88.isConnected()) {
            return z88.y();
        }
        return 0;
    }

    public final boolean y1() {
        K();
        mue x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).i;
    }

    public final void z(n3b n3b) {
        this.c.z(n3b);
    }

    public final boolean z0() {
        K();
        z88 z88 = this.c;
        if (!z88.isConnected()) {
            return false;
        }
        return z88.z0();
    }

    public final Looper z1() {
        return this.X.getLooper();
    }
}
