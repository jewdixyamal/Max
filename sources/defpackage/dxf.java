package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: dxf  reason: default package */
public final class dxf implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final xs e;
    public final zt0 f;
    public wsf g;

    public dxf(ja7 ja7, je7 je7, je7 je72, je7 je73) {
        this.a = ja7;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        v25 v25 = twf.o;
        xs xsVar = new xs(0);
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            ((twf) u1Var.next()).getClass();
            xsVar.add("WebAppDownloadFile");
        }
        this.e = xsVar;
        this.f = c37.a(0, 0, 7);
    }

    public static final ga7 e(dxf dxf, Throwable th) {
        dxf.getClass();
        swf swf = th instanceof swf ? (swf) th : null;
        if (swf instanceof qwf) {
            return new ea7(new ha7("download_failed", 1));
        }
        if (swf instanceof rwf) {
            return new ea7(new ha7("invalid_params", 2));
        }
        if (swf instanceof pwf) {
            return new ea7(new ha7("denied_download_request", 3));
        }
        if (swf == null) {
            return fa7.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(defpackage.dxf r9, defpackage.gxf r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.vwf
            if (r0 == 0) goto L_0x0016
            r0 = r11
            vwf r0 = (defpackage.vwf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x001b
        L_0x0016:
            vwf r0 = new vwf
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            defpackage.od2.a0(r11)
            goto L_0x00b4
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            gxf r9 = r0.X
            dxf r10 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x00a0
        L_0x0045:
            gxf r9 = r0.X
            dxf r10 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x008c
        L_0x004d:
            nwf r9 = r0.Y
            gxf r10 = r0.X
            dxf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x0076
        L_0x0057:
            defpackage.od2.a0(r11)
            nwf r11 = new nwf
            java.lang.String r2 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r2, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.t0 = r6
            zt0 r2 = r9.f
            java.lang.Object r2 = r2.o(r11, r0)
            if (r2 != r1) goto L_0x0074
            goto L_0x00b6
        L_0x0074:
            r2 = r9
            r9 = r11
        L_0x0076:
            xwf r11 = new xwf
            r11.<init>(r2, r10, r7)
            r0.o = r2
            r0.X = r10
            r0.Y = r7
            r0.t0 = r5
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 != r1) goto L_0x008a
            goto L_0x00b6
        L_0x008a:
            r9 = r10
            r10 = r2
        L_0x008c:
            w97 r11 = (defpackage.w97) r11
            ywf r2 = new ywf
            r2.<init>(r10, r9, r7)
            r0.o = r10
            r0.X = r9
            r0.t0 = r4
            java.lang.Object r11 = r11.c(r2, r0)
            if (r11 != r1) goto L_0x00a0
            goto L_0x00b6
        L_0x00a0:
            w97 r11 = (defpackage.w97) r11
            zwf r2 = new zwf
            r2.<init>(r10, r9, r7)
            r0.o = r7
            r0.X = r7
            r0.t0 = r3
            java.lang.Object r9 = r11.d(r2, r0)
            if (r9 != r1) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            e5f r1 = defpackage.e5f.a
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxf.f(dxf, gxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object obj;
        twf.a.getClass();
        Iterator it = twf.o.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            ((twf) obj).getClass();
            if ("WebAppDownloadFile".equals(str)) {
                break;
            }
        }
        twf twf = (twf) obj;
        e5f e5f = e5f.a;
        if (twf == null) {
            hm9.p(dxf.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return e5f;
        }
        qyc qyc = (qyc) ((y7d) this.d.getValue());
        qyc.getClass();
        if (!qyc.n(PmsKey.f56jsdownloaddelegate, false)) {
            return e5f;
        }
        if (uwf.$EnumSwitchMapping$0[twf.ordinal()] == 1) {
            Object g2 = g(str2, continuation);
            return g2 == tx3.a ? g2 : e5f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final zt0 b() {
        return this.f;
    }

    public final Set c() {
        return this.e;
    }

    public final void d(wsf wsf) {
        this.g = wsf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.axf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            axf r0 = (defpackage.axf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            axf r0 = new axf
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            defpackage.od2.a0(r9)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            gxf r7 = r0.X
            dxf r8 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x008d
        L_0x003f:
            owf r7 = r0.Y
            gxf r8 = r0.X
            dxf r2 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0077
        L_0x0049:
            defpackage.od2.a0(r9)
            ja7 r9 = defpackage.ja7.d
            r9.getClass()
            fxf r2 = defpackage.gxf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            gxf r8 = (defpackage.gxf) r8
            owf r9 = new owf
            java.lang.String r2 = r8.c
            r9.<init>(r2)
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r5
            zt0 r2 = r7.f
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r7
            r7 = r9
        L_0x0077:
            bxf r9 = new bxf
            r9.<init>(r2, r8, r6)
            r0.o = r2
            r0.X = r8
            r0.Y = r6
            r0.t0 = r4
            java.lang.Object r9 = r7.c(r9, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r8
            r8 = r2
        L_0x008d:
            w97 r9 = (defpackage.w97) r9
            cxf r2 = new cxf
            r2.<init>(r8, r7, r6)
            r0.o = r6
            r0.X = r6
            r0.t0 = r3
            java.lang.Object r7 = r9.d(r2, r0)
            if (r7 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxf.g(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
