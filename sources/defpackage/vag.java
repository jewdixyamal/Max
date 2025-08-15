package defpackage;

/* renamed from: vag  reason: default package */
public final class vag implements uoc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vag(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: vbg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.e24 r8, byte[] r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x0099;
                case 2: goto L_0x0084;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r7.b
            bwc r7 = (defpackage.bwc) r7
            boolean r8 = r7.f
            if (r8 == 0) goto L_0x000f
            goto L_0x0083
        L_0x000f:
            xag r8 = new xag
            r8.<init>(r9)
            o9g r9 = r7.c
            int r10 = r8.d
            bg1 r9 = r9.C(r10)
            if (r9 != 0) goto L_0x001f
            goto L_0x0083
        L_0x001f:
            boolean r10 = r7.f
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0026
            goto L_0x005a
        L_0x0026:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            if (r10 != 0) goto L_0x0051
            java.util.Set r10 = r7.h
            if (r10 != 0) goto L_0x0034
            r10 = r0
            goto L_0x003a
        L_0x0034:
            java.util.Set r10 = r7.h
            boolean r10 = r10.contains(r9)
        L_0x003a:
            if (r10 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            vbg r10 = new vbg
            a4c r1 = r7.b
            vte r2 = r7.i
            ypc r3 = new ypc
            r4 = 3
            r3.<init>(r7, r4, r9)
            r10.<init>(r1, r2, r3)
            java.util.concurrent.ConcurrentHashMap r1 = r7.a
            r1.put(r9, r10)
        L_0x0051:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            r1 = r10
            vbg r1 = (defpackage.vbg) r1
        L_0x005a:
            if (r1 == 0) goto L_0x0067
            android.os.Handler r10 = r1.e
            ibg r2 = new ibg
            r3 = 1
            r2.<init>(r1, r3, r8)
            r10.post(r2)
        L_0x0067:
            byte r8 = r8.a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x0083
            java.util.concurrent.ConcurrentHashMap r8 = r7.a
            java.lang.Object r8 = r8.get(r9)
            vbg r8 = (defpackage.vbg) r8
            if (r8 == 0) goto L_0x0083
            r8.a()
            java.util.concurrent.ConcurrentHashMap r7 = r7.a
            r7.remove(r9)
        L_0x0083:
            return
        L_0x0084:
            t05 r6 = new t05
            r5 = 6
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>((java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (int) r4, (int) r5)
            java.lang.Object r7 = r7.b
            koc r7 = (defpackage.koc) r7
            android.os.Handler r7 = r7.f
            r7.post(r6)
            return
        L_0x0099:
            java.lang.Object r7 = r7.b
            c8d r7 = (defpackage.c8d) r7
            java.lang.Object r8 = r7.c
            o9g r8 = (defpackage.o9g) r8
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.get()
            r9.get()
            r9.getShort()
            int r10 = r9.getInt()
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r10 = r10 & r0
            r9.getInt()
            r9.getInt()
            java.nio.ByteBuffer r9 = r9.slice()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r9 = r0.decode(r9)
            java.lang.String r9 = r9.toString()
            r8.C(r10)
            st r0 = new st
            bg1 r8 = r8.C(r10)
            r0.<init>(r8, r9)
            java.lang.Object r7 = r7.o
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00de:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00f4
            java.lang.Object r8 = r7.next()
            xx0 r8 = (defpackage.xx0) r8
            py0 r8 = r8.a
            id1 r8 = r8.W1
            pt r8 = r8.o
            r8.onAsrDataPackage(r0)
            goto L_0x00de
        L_0x00f4:
            return
        L_0x00f5:
            t05 r0 = new t05
            r6 = 5
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (int) r5, (int) r6)
            java.lang.Object r7 = r7.b
            qp4 r7 = (defpackage.qp4) r7
            java.lang.Object r7 = r7.X
            android.os.Handler r7 = (android.os.Handler) r7
            r7.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vag.a(e24, byte[], int):void");
    }
}
