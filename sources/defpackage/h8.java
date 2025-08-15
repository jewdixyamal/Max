package defpackage;

/* renamed from: h8  reason: default package */
public final class h8 extends rd7 implements k56 {
    public static final h8 X = new h8(0, 3);
    public static final h8 Y = new h8(0, 4);
    public static final h8 Z = new h8(0, 5);
    public static final h8 b = new h8(0, 0);
    public static final h8 c = new h8(0, 1);
    public static final h8 o = new h8(0, 2);
    public static final h8 s0 = new h8(0, 6);
    public static final h8 t0 = new h8(0, 7);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: gx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: gx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: gx3} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            r0 = 0
            r1 = 14
            r2 = 0
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x0126;
                case 1: goto L_0x0104;
                case 2: goto L_0x00bf;
                case 3: goto L_0x0074;
                case 4: goto L_0x004c;
                case 5: goto L_0x001f;
                case 6: goto L_0x0014;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r5 = android.system.OsConstants._SC_NPROCESSORS_CONF
            long r0 = android.system.Os.sysconf(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x0014:
            int r5 = android.system.OsConstants._SC_CLK_TCK
            long r0 = android.system.Os.sysconf(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x001f:
            kye r5 = defpackage.kye.a
            java.util.Map r5 = defpackage.kye.c()
            o97 r3 = defpackage.ote.b
            java.lang.Object r5 = r5.get(r3)
            boolean r3 = r5 instanceof defpackage.gx3
            if (r3 == 0) goto L_0x0032
            r2 = r5
            gx3 r2 = (defpackage.gx3) r2
        L_0x0032:
            if (r2 != 0) goto L_0x003c
            ph4 r5 = new ph4
            r5.<init>((int) r1)
            r5.f()
        L_0x003c:
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>(r0)
            pd3 r0 = new pd3
            r1 = 4
            r0.<init>(r1, r5)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            return r5
        L_0x004c:
            kye r5 = defpackage.kye.a
            java.util.Map r5 = defpackage.kye.c()
            o97 r0 = defpackage.ote.b
            java.lang.Object r5 = r5.get(r0)
            boolean r0 = r5 instanceof defpackage.gx3
            if (r0 == 0) goto L_0x005f
            r2 = r5
            gx3 r2 = (defpackage.gx3) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0069
            ph4 r5 = new ph4
            r5.<init>((int) r1)
            r5.f()
        L_0x0069:
            ig r5 = new ig
            r0 = 1
            r5.<init>(r0)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r5)
            return r5
        L_0x0074:
            android.content.Context r5 = defpackage.kye.d
            if (r5 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r5 = r2
        L_0x007a:
            kye r0 = defpackage.kye.a
            java.util.Map r0 = defpackage.kye.c()
            o97 r3 = defpackage.ote.b
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof defpackage.gx3
            if (r3 == 0) goto L_0x008d
            r2 = r0
            gx3 r2 = (defpackage.gx3) r2
        L_0x008d:
            if (r2 != 0) goto L_0x0099
            ph4 r0 = new ph4
            r0.<init>((int) r1)
            gx3 r2 = new gx3
            r2.<init>(r0)
        L_0x0099:
            wq6 r0 = new wq6
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r3 = "TracerSDK/1.1.1 App/"
            java.lang.String r4 = " "
            java.lang.StringBuilder r1 = defpackage.au1.m(r3, r1, r4)
            java.lang.String r3 = "http.agent"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r3 = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)"
        L_0x00b2:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r2.b
            r0.<init>(r2, r5, r1)
            return r0
        L_0x00bf:
            js4 r5 = new js4
            android.content.Context r0 = defpackage.kye.d
            if (r0 == 0) goto L_0x00c6
            r2 = r0
        L_0x00c6:
            java.lang.String r0 = defpackage.c37.q()
            java.lang.String r1 = r2.getPackageName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "tracer"
            goto L_0x00f1
        L_0x00d7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "tracer-"
            r1.<init>(r3)
            r3 = 58
            r4 = 45
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00f1:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            r1.<init>(r2, r0)
            java.lang.String r0 = "drops.json"
            java.io.File r0 = defpackage.lk5.J(r1, r0)
            r5.<init>(r0)
            return r5
        L_0x0104:
            kye r5 = defpackage.kye.a
            java.util.Map r5 = defpackage.kye.c()
            o97 r1 = defpackage.oag.a
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof defpackage.fl4
            if (r1 == 0) goto L_0x0117
            r2 = r5
            fl4 r2 = (defpackage.fl4) r2
        L_0x0117:
            if (r2 != 0) goto L_0x0125
            sy4 r5 = new sy4
            r1 = 13
            r5.<init>((int) r1, (boolean) r0)
            fl4 r2 = new fl4
            r2.<init>(r5)
        L_0x0125:
            return r2
        L_0x0126:
            m4c r5 = defpackage.n4c.a
            r5.getClass()
            d3 r5 = defpackage.n4c.b
            r0 = 2147418112(0x7fff0000, float:NaN)
            int r5 = r5.g(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            int r5 = r5 + r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.invoke():java.lang.Object");
    }
}
