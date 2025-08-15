package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: gw2  reason: default package */
public final class gw2 extends pnf implements px7 {
    public static final /* synthetic */ bc7[] Q0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final q0e E0;
    public final w7c F0;
    public final q0e G0;
    public final s35 H0 = new s35(0);
    public final s35 I0 = new s35(0);
    public final String J0 = gw2.class.getName();
    public final qj K0 = new qj(this);
    public final nx3 L0;
    public vxd M0;
    public vxd N0;
    public vxd O0;
    public final w4d P0;
    public final kz2 X;
    public final nzc Y;
    public final kke Z;
    public final k9c b;
    public final rr3 c;
    public final yx7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9 = new oi9(gw2.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Q0 = new bc7[]{oi9};
    }

    public gw2() {
        jyc jyc = jyc.a;
        yx7 yx7 = (yx7) jyc.getAccessor().c(yx7.class);
        ys2 ys2 = ys2.a;
        kke s = jyc.s();
        je7 je7 = iyc.r;
        je7 je72 = iyc.w;
        je7 je73 = iyc.b;
        je7 je74 = iyc.e;
        je7 je75 = iyc.c;
        khe d = jyc.getAccessor().d(q33.class);
        khe d2 = jyc.getAccessor().d(y7d.class);
        je7 je76 = iyc.v;
        je7 je77 = je7;
        khe d3 = ys2.getAccessor().d(ck3.class);
        khe d4 = ys2.getAccessor().d(ci0.class);
        khe d5 = ys2.getAccessor().d(tm3.class);
        khe d6 = ys2.getAccessor().d(ty3.class);
        this.b = (k9c) jyc.getAccessor().c(k9c.class);
        this.c = (rr3) jyc.getAccessor().c(rr3.class);
        this.o = yx7;
        this.X = (kz2) ys2.getAccessor().c(kz2.class);
        this.Y = (nzc) ys2.getAccessor().c(nzc.class);
        this.Z = s;
        this.s0 = je72;
        this.t0 = d;
        this.u0 = d2;
        this.v0 = je73;
        this.w0 = je74;
        this.x0 = je75;
        this.y0 = je77;
        this.z0 = je76;
        this.A0 = d3;
        this.B0 = d4;
        this.C0 = d5;
        this.D0 = d6;
        q0e a = r0e.a(ov2.f);
        this.E0 = a;
        this.F0 = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.G0 = a2;
        this.L0 = ((w9a) s).b().limitedParallelism(1, "ChatsListSearchViewModelDispatcher");
        this.P0 = mqd.D();
        yx7.i = this;
        t(true);
        od2.L(new zn5(od2.u(new jp5(a2, 0), 300), new lq0(2, this, gw2.class, "loadByQuery", "loadByQuery(Ljava/lang/String;)V", 4, 11), 5), this.a);
    }

    public static final void q(gw2 gw2, long j, long j2) {
        iy2 s = gw2.s();
        long e = ft4.e(j2) + ((hyc) ((q33) gw2.t0.getValue())).n();
        p82 l = ((jz2) s).l();
        e52 C = l.C(j);
        if (C != null) {
            l.l(e, C);
            ((k4a) ((pk) l.p.get())).r(C.a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List r(defpackage.gw2 r15) {
        /*
            je7 r15 = r15.u0
            java.lang.Object r15 = r15.getValue()
            y7d r15 = (defpackage.y7d) r15
            qyc r15 = (defpackage.qyc) r15
            r15.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f110searchwebappsshowcase
            java.lang.String r0 = r0.name()
            ne7 r15 = r15.g
            r1 = 0
            java.lang.String r15 = r15.getString(r0, r1)
            if (r15 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0023 }
            r0.<init>((java.lang.String) r15)     // Catch:{ JSONException -> 0x0023 }
            r1 = r0
        L_0x0023:
            nz4 r15 = defpackage.nz4.a
            if (r1 != 0) goto L_0x0028
            goto L_0x006d
        L_0x0028:
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x006d
        L_0x0031:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r1 = r0.length()
            r15.<init>(r1)
            int r1 = r0.length()
            r2 = 0
        L_0x003f:
            if (r2 >= r1) goto L_0x006d
            org.json.JSONObject r3 = r0.getJSONObject(r2)
            java.lang.String r4 = "id"
            long r6 = r3.getLong(r4)
            java.lang.String r4 = "icon"
            java.lang.String r9 = r3.optString(r4)
            java.lang.String r4 = "title"
            java.lang.String r8 = r3.getString(r4)
            v8c r3 = new v8c
            r4 = 2
            java.lang.String r10 = defpackage.w9e.Y0(r4, r8)
            r12 = 0
            r14 = 176(0xb0, float:2.47E-43)
            r11 = 0
            r13 = 1
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14)
            r15.add(r3)
            int r2 = r2 + 1
            goto L_0x003f
        L_0x006d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw2.r(gw2):java.util.List");
    }

    public final void c(String str, List list) {
        if (!tpa.f(((ov2) this.E0.getValue()).b, str)) {
            hm9.G(this.J0, "chats search: query changed, skip content", (Throwable) null);
            return;
        }
        vxd S = j47.S(this.a, ((w9a) this.Z).a().plus(this.K0), vx3.b, new bw2(this, str, list, (Continuation) null));
        this.P0.o1(this, Q0[0], S);
    }

    public final void p() {
        vxd vxd = this.M0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        yx7 yx7 = this.o;
        yx7.d();
        vxd vxd2 = this.N0;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        yx7.i = null;
    }

    public final iy2 s() {
        return (iy2) this.v0.getValue();
    }

    public final void t(boolean z) {
        vxd vxd = this.M0;
        if (vxd == null || !vxd.isActive()) {
            this.o.d();
            this.G0.setValue((Object) null);
            vxd vxd2 = this.N0;
            if (vxd2 != null) {
                vxd2.cancel((CancellationException) null);
            }
            x77 x77 = (x77) this.P0.T0(this, Q0[0]);
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            this.M0 = j47.T(this.a, this.L0.plus(this.K0), (vx3) null, new rv2(this, z, (Continuation) null), 2);
        }
    }

    public final void u(long j) {
        c64 c64;
        e52 q = ((jz2) s()).q(j);
        if (q != null) {
            c64 = gy2.a2(gy2.c, q.a);
        } else {
            gy2.c.getClass();
            c64 = new c64(":profile?id=" + j + "&type=contact");
        }
        pnf.o(this.H0, c64);
    }
}
