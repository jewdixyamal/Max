package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;

/* renamed from: d  reason: default package */
public final class d implements mq7, ii9 {
    public volatile VideoSink A0;
    public final aq7 B0;
    public final dnc C0;
    public final vte D0;
    public final ync E0;
    public final u5e F0;
    public jx1 G0 = null;
    public ece H0;
    public final ji9 X;
    public final Context Y;
    public final String Z;
    public final EglBase.Context a;
    public final xx0 b;
    public final qld c;
    public final i50 o;
    public final String s0;
    public final String t0;
    public final Integer u0;
    public final a4c v0;
    public final boolean w0;
    public final ag1 x0;
    public final CopyOnWriteArraySet y0 = new CopyOnWriteArraySet();
    public volatile kq7 z0;

    public d(nld nld) {
        a4c a4c = nld.e;
        this.v0 = a4c;
        this.c = nld.a;
        this.o = nld.b;
        this.u0 = nld.j;
        this.Y = nld.d;
        this.X = nld.c;
        this.a = nld.l;
        this.w0 = nld.k;
        this.x0 = nld.f;
        this.b = nld.g;
        this.B0 = nld.m;
        this.C0 = nld.o;
        if (!TextUtils.isEmpty(nld.i)) {
            this.s0 = zr6.l(new StringBuilder(), nld.i, "v0");
            this.t0 = zr6.l(new StringBuilder(), nld.i, "a0");
            this.Z = nld.i;
        } else {
            this.s0 = "ARDAMSv0";
            this.t0 = "ARDAMSa0";
            this.Z = "ARDAMS";
        }
        a4c.log("SlmsSource", "local media stream id = " + this.Z + " local video track id = " + this.s0 + " local audio track id = " + this.t0);
        this.D0 = nld.n;
        this.E0 = nld.p;
        this.F0 = nld.h;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [jq7, java.lang.Object] */
    public final ar0 a() {
        boolean z = this.z0 == null;
        if (z) {
            ? obj = new Object();
            obj.o = false;
            obj.s = null;
            obj.t = false;
            obj.a = this.c.d;
            obj.c = this.c.a;
            obj.b = this.o;
            obj.e = this.Z;
            obj.f = this.s0;
            obj.g = this.t0;
            obj.d = this.Y.getApplicationContext();
            obj.h = this.v0;
            obj.i = this.a;
            obj.k = true;
            obj.j = this.b;
            obj.p = this.w0;
            ag1 ag1 = this.x0;
            obj.l = ag1.s;
            aq7 aq7 = this.B0;
            obj.q = aq7;
            obj.m = this.C0;
            obj.s = this.u0;
            yf1 yf1 = ag1.B;
            obj.t = yf1.a;
            obj.o = yf1.k;
            obj.n = this.D0;
            obj.r = this.F0;
            if (obj.a == null || aq7 == null || obj.b == null || TextUtils.isEmpty(obj.e) || TextUtils.isEmpty(obj.f) || TextUtils.isEmpty(obj.g) || obj.h == null || obj.j == null || obj.i == null || obj.m == null || obj.n == null || obj.r == null) {
                throw new IllegalStateException();
            }
            this.z0 = new kq7(obj);
            this.z0.x = this.H0;
            this.z0.c.add(this);
            if (this.G0 != null) {
                this.z0.l(this.G0);
            }
            VideoSink videoSink = this.A0;
            if (videoSink != null) {
                this.z0.k(videoSink);
            }
            this.z0.d(this.X);
            ync ync = this.E0;
            if (ync != null) {
                kq7 kq7 = this.z0;
                kq7.getClass();
                ((aab) ync.b).b = new iq7(kq7);
            }
        }
        return new ar0((Object) this.z0, z);
    }

    public final void b(kq7 kq7) {
        this.v0.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((mq7) it.next()).b(kq7);
        }
    }

    public final int c() {
        kq7 kq7 = this.z0;
        if (kq7 == null) {
            return 0;
        }
        tv1 tv1 = kq7.r;
        if (tv1 != null && tv1.k) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) kq7.y.X;
            if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                return tv1.i ? 1 : 2;
            }
        }
        zuc zuc = kq7.t;
        if (zuc == null || !zuc.d) {
            return 0;
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) kq7.z.X;
        return mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false ? 3 : 0;
    }

    public final void i(ji9 ji9) {
        this.v0.log("SlmsSource", "onMediaSettingsChanged, " + ji9);
        this.c.a.execute(new c(this, 1, ji9));
    }
}
