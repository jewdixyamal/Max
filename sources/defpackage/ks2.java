package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: ks2  reason: default package */
public final class ks2 extends pnf {
    public static final /* synthetic */ bc7[] I0;
    public final s35 A0 = new s35(0);
    public final s35 B0 = new s35(0);
    public final AtomicLong C0 = new AtomicLong();
    public final w4d D0 = mqd.D();
    public final w4d E0 = mqd.D();
    public volatile String F0;
    public String G0 = "";
    public String H0 = "";
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long[] b;
    public final pyd c;
    public final y7d o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final q0e y0;
    public final w7c z0;

    static {
        Class<ks2> cls = ks2.class;
        I0 = new bc7[]{new oi9(cls, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;")};
    }

    public ks2(long[] jArr, pyd pyd) {
        nyd nyd = nyd.a;
        y7d b2 = nyd.b();
        khe d = nyd.getAccessor().d(pk.class);
        khe d2 = nyd.getAccessor().d(kke.class);
        khe d3 = nyd.getAccessor().d(eua.class);
        khe d4 = nyd.getAccessor().d(kk5.class);
        khe d5 = nyd.getAccessor().d(p82.class);
        khe f = nyd.getAccessor().f();
        khe d6 = nyd.getAccessor().d(av0.class);
        khe d7 = nyd.getAccessor().d(wha.class);
        khe d8 = nyd.getAccessor().d(Context.class);
        khe d9 = nyd.getAccessor().d(cz3.class);
        khe d10 = nyd.getAccessor().d(qe5.class);
        this.b = jArr;
        this.c = pyd;
        this.o = b2;
        this.X = d;
        this.Y = d3;
        this.Z = d2;
        this.s0 = d4;
        this.t0 = d5;
        this.u0 = f;
        this.v0 = d6;
        this.w0 = d7;
        this.x0 = d8;
        q0e a = r0e.a(new ds2((String) null, (String) null, (RectF) null));
        this.y0 = a;
        this.z0 = new w7c(a);
        if (pyd == pyd.CHANNEL) {
            od2.L(new zn5(new v7c(((cz3) d9.getValue()).a), new fs2(this, d2, d10, (Continuation) null), 5), this.a);
        }
    }

    public static final void q(ks2 ks2, long j) {
        String str;
        q0e q0e = ks2.y0;
        String str2 = ((ds2) q0e.getValue()).a;
        String str3 = ((ds2) q0e.getValue()).b;
        if (str3 == null || (str = j47.O(str3)) == null) {
            str = null;
        }
        if (str2 != null) {
            if (str != null) {
                p82 p82 = (p82) ks2.t0.getValue();
                p82.getClass();
                hm9.m("p82", "changeChatIcon, chatId = " + j + ", path = " + str, new Object[0]);
                p82.c(j, v82.b);
                p82.h(j, false, new m82(str, 0));
                p82.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), false));
            }
            a20 h = c37.h(((ds2) q0e.getValue()).c);
            k4a k4a = (k4a) ((pk) ks2.X.getValue());
            if (k4a.o(j)) {
                ((s8g) k4a.e.getValue()).b(new b32(((p7b) k4a.y()).a.o(), str2, j, h));
            }
        }
    }

    public final void r(String str, RectF rectF, Rect rect) {
        Object obj;
        try {
            obj = c37.i(str, rect, nyd.a.b());
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (pjc.a(obj) != null) {
            hm9.m(ks2.class.getName(), "local crop failed. Crop will be applied after update from server", new Object[0]);
        }
        if (obj instanceof njc) {
            obj = null;
        }
        this.y0.m((Object) null, new ds2(str, (String) obj, rectF));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: njc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: njc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r4 = this;
            je7 r0 = r4.Y
            java.lang.Object r0 = r0.getValue()
            eua r0 = (defpackage.eua) r0
            java.lang.String[] r1 = defpackage.eua.l
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L_0x0018
            s35 r4 = r4.A0
            tr2 r0 = defpackage.tr2.b
            defpackage.pnf.o(r4, r0)
            return
        L_0x0018:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0073 }
            r4.F0 = r0     // Catch:{ all -> 0x0073 }
            je7 r0 = r4.s0     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0073 }
            kk5 r0 = (defpackage.kk5) r0     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r4.F0     // Catch:{ all -> 0x0073 }
            java.io.File r0 = r0.q(r1)     // Catch:{ all -> 0x0073 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0073 }
            int r2 = defpackage.tfg.c     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "content://"
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0043
            goto L_0x005b
        L_0x0043:
            je7 r1 = r4.s0     // Catch:{ all -> 0x0073 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0073 }
            kk5 r1 = (defpackage.kk5) r1     // Catch:{ all -> 0x0073 }
            je7 r2 = r4.x0     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0073 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x0073 }
            java.io.File r0 = defpackage.ft.A(r0)     // Catch:{ all -> 0x0073 }
            android.net.Uri r0 = r1.f(r2, r0)     // Catch:{ all -> 0x0073 }
        L_0x005b:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "output"
            r1.putExtra(r2, r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0073 }
            r1.putExtra(r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r0 = move-exception
            njc r1 = new njc
            r1.<init>(r0)
        L_0x0079:
            java.lang.Throwable r0 = defpackage.pjc.a(r1)
            if (r0 == 0) goto L_0x008d
            r4.t()
            java.lang.Class<ks2> r2 = defpackage.ks2.class
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "capturePhoto: failed to capture photo"
            defpackage.hm9.p(r2, r3, r0)
        L_0x008d:
            boolean r0 = r1 instanceof defpackage.njc
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009f
            android.content.Intent r1 = (android.content.Intent) r1
            s35 r4 = r4.A0
            sr2 r0 = new sr2
            r0.<init>(r1)
            defpackage.pnf.o(r4, r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks2.s():void");
    }

    public final void t() {
        this.F0 = null;
        wha wha = (wha) this.w0.getValue();
        wha.g(new eqe(jpc.s));
        wha.e(new kia(woc.I));
        wha.i();
    }

    public final void u() {
        this.F0 = null;
        wha wha = (wha) this.w0.getValue();
        wha.g(new eqe(jpc.u));
        wha.e(new kia(woc.I));
        wha.i();
    }
}
