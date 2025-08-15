package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jp7  reason: default package */
public abstract class jp7 implements dab {
    public final Executor a;
    public final y7g b;

    public jp7(Executor executor, y7g y7g) {
        this.a = executor;
        this.b = y7g;
    }

    public final void a(fi0 fi0, eab eab) {
        oj0 oj0 = (oj0) eab;
        hab hab = oj0.c;
        oj0.h("local", "fetch");
        ip7 ip7 = new ip7(this, fi0, hab, eab, e(), oj0.a, hab, eab);
        oj0.a(new fp7(ip7, 1));
        this.a.execute(ip7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        defpackage.q43.b(r4);
        defpackage.o43.S((defpackage.o43) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0005, B:4:0x0011, B:15:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.g05 c(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            y7g r3 = r3.b
            r0 = 0
            if (r5 > 0) goto L_0x002c
            r3.getClass()     // Catch:{ all -> 0x0025 }
            rq8 r5 = new rq8     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x0025 }
            pq8 r1 = (defpackage.pq8) r1     // Catch:{ all -> 0x0025 }
            r5.<init>(r1)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0027 }
            sh0 r3 = (defpackage.sh0) r3     // Catch:{ all -> 0x0027 }
            r3.i(r4, r5)     // Catch:{ all -> 0x0027 }
            qq8 r3 = r5.n()     // Catch:{ all -> 0x0027 }
            r5.close()     // Catch:{ all -> 0x0025 }
            v84 r3 = defpackage.o43.o0(r3)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            r0 = r3
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            goto L_0x005c
        L_0x0027:
            r3 = move-exception
            r5.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x002c:
            r3.getClass()     // Catch:{ all -> 0x0025 }
            rq8 r1 = new rq8     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r3.b     // Catch:{ all -> 0x0025 }
            pq8 r2 = (defpackage.pq8) r2     // Catch:{ all -> 0x0025 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0057 }
            sh0 r3 = (defpackage.sh0) r3     // Catch:{ all -> 0x0057 }
            r3.i(r4, r1)     // Catch:{ all -> 0x0057 }
            qq8 r3 = r1.n()     // Catch:{ all -> 0x0057 }
            r1.close()     // Catch:{ all -> 0x0025 }
            v84 r3 = defpackage.o43.o0(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x004b:
            g05 r3 = new g05     // Catch:{ all -> 0x0025 }
            r3.<init>(r0)     // Catch:{ all -> 0x0025 }
            defpackage.q43.b(r4)
            defpackage.o43.S(r0)
            return r3
        L_0x0057:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x005c:
            defpackage.q43.b(r4)
            defpackage.o43.S(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp7.c(java.io.InputStream, int):g05");
    }

    public abstract g05 d(wv6 wv6);

    public abstract String e();
}
