package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c7f  reason: default package */
public final class c7f {
    public final y8f a;
    public final ime b;
    public final fme c;
    public final q33 d;
    public final pk e;
    public final ztc f;
    public final w0f g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final msf i = new msf();

    public c7f(y8f y8f, fme fme, ime ime, w0f w0f, q33 q33, pk pkVar, ztc ztc) {
        this.a = y8f;
        this.c = fme;
        this.b = ime;
        this.g = w0f;
        this.d = q33;
        this.e = pkVar;
        this.f = ztc;
    }

    public final synchronized qy9 a(d7f d7f) {
        for (Map.Entry entry : this.h.entrySet()) {
            if (((d7f) entry.getKey()).equals(d7f)) {
                return (qy9) entry.getValue();
            }
        }
        return null;
    }

    public final void b(v6f v6f) {
        hm9.m("c7f", "putUploadInRepository: started, upload=%s", v6f);
        nd7.U(this.a.a(v6f).l(), ft.e, new a7f(v6f, 0), new e5(20, v6f));
    }

    public final synchronized void c(d7f d7f) {
        hm9.m("c7f", "removeFromUploadObsCache: data=" + d7f, new Object[0]);
        this.h.remove(d7f);
    }

    public final void d(d7f d7f) {
        hm9.m("c7f", "removeUploadFromRepository: started, data=%s", d7f);
        nd7.U(this.a.c(d7f).l(), ft.e, new b7f(d7f, 0), new y6f(d7f, 1));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.qy9 e(defpackage.d7f r9) {
        /*
            r8 = this;
            r0 = 14
            r1 = 6
            r2 = 2
            r3 = 1
            java.lang.String r4 = "upload: has upload for "
            monitor-enter(r8)
            qy9 r5 = r8.a(r9)     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x0024
            java.lang.String r0 = "c7f"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r1.<init>(r4)     // Catch:{ all -> 0x0021 }
            r1.append(r9)     // Catch:{ all -> 0x0021 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x0021 }
            defpackage.hm9.m(r0, r9, new java.lang.Object[0])     // Catch:{ all -> 0x0021 }
            monitor-exit(r8)
            return r5
        L_0x0021:
            r9 = move-exception
            goto L_0x00c4
        L_0x0024:
            java.lang.String r4 = "c7f"
            java.lang.String r5 = "upload: %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0021 }
            defpackage.hm9.m(r4, r5, r6)     // Catch:{ all -> 0x0021 }
            b7f r4 = new b7f     // Catch:{ all -> 0x0021 }
            r4.<init>(r9, r3)     // Catch:{ all -> 0x0021 }
            q1a r5 = new q1a     // Catch:{ all -> 0x0021 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0021 }
            x6f r4 = new x6f     // Catch:{ all -> 0x0021 }
            r4.<init>(r8, r1)     // Catch:{ all -> 0x0021 }
            o28 r6 = new o28     // Catch:{ all -> 0x0021 }
            r6.<init>(r5, r2, r4)     // Catch:{ all -> 0x0021 }
            l5 r4 = new l5     // Catch:{ all -> 0x0021 }
            r5 = 17
            r4.<init>(r5, r9)     // Catch:{ all -> 0x0021 }
            q1a r5 = new q1a     // Catch:{ all -> 0x0021 }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x0021 }
            ib3 r4 = new ib3     // Catch:{ all -> 0x0021 }
            r4.<init>(r6, r3, r5)     // Catch:{ all -> 0x0021 }
            x6f r5 = new x6f     // Catch:{ all -> 0x0021 }
            r6 = 7
            r5.<init>(r8, r6)     // Catch:{ all -> 0x0021 }
            q28 r6 = new q28     // Catch:{ all -> 0x0021 }
            r7 = 3
            r6.<init>(r4, r5, r7)     // Catch:{ all -> 0x0021 }
            ime r4 = r8.b     // Catch:{ all -> 0x0021 }
            r4.getClass()     // Catch:{ all -> 0x0021 }
            hme r4 = new hme     // Catch:{ all -> 0x0021 }
            r4.<init>(r3)     // Catch:{ all -> 0x0021 }
            e0a r5 = new e0a     // Catch:{ all -> 0x0021 }
            r5.<init>(r6, r4, r1)     // Catch:{ all -> 0x0021 }
            ypc r1 = new ypc     // Catch:{ all -> 0x0021 }
            r1.<init>(r8, r0, r9)     // Catch:{ all -> 0x0021 }
            kj6 r4 = defpackage.ft.e     // Catch:{ all -> 0x0021 }
            r66 r6 = defpackage.ft.d     // Catch:{ all -> 0x0021 }
            oz9 r7 = new oz9     // Catch:{ all -> 0x0021 }
            r7.<init>(r5, r4, r1, r6)     // Catch:{ all -> 0x0021 }
            vle r1 = new vle     // Catch:{ all -> 0x0021 }
            r5 = 5
            r1.<init>(r8, r5, r9)     // Catch:{ all -> 0x0021 }
            xy9 r5 = new xy9     // Catch:{ all -> 0x0021 }
            r5.<init>(r7, r4, r1, r2)     // Catch:{ all -> 0x0021 }
            x6f r1 = new x6f     // Catch:{ all -> 0x0021 }
            r4 = 8
            r1.<init>(r8, r4)     // Catch:{ all -> 0x0021 }
            xy9 r4 = new xy9     // Catch:{ all -> 0x0021 }
            r4.<init>(r5, r1, r6, r2)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "bufferSize"
            defpackage.hm9.j0(r3, r1)     // Catch:{ all -> 0x0021 }
            o84 r1 = new o84     // Catch:{ all -> 0x0021 }
            r1.<init>((int) r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0021 }
            r0.<init>()     // Catch:{ all -> 0x0021 }
            e1a r2 = new e1a     // Catch:{ all -> 0x0021 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0021 }
            h1a r3 = new h1a     // Catch:{ all -> 0x0021 }
            r3.<init>(r2, r4, r0, r1)     // Catch:{ all -> 0x0021 }
            y0a r0 = new y0a     // Catch:{ all -> 0x0021 }
            r0.<init>(r3)     // Catch:{ all -> 0x0021 }
            ztc r1 = r8.f     // Catch:{ all -> 0x0021 }
            s1a r0 = r0.r(r1)     // Catch:{ all -> 0x0021 }
            monitor-enter(r8)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.ConcurrentHashMap r1 = r8.h     // Catch:{ all -> 0x00c1 }
            r1.put(r9, r0)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r8)     // Catch:{ all -> 0x0021 }
            monitor-exit(r8)
            return r0
        L_0x00c1:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c1 }
            throw r9     // Catch:{ all -> 0x0021 }
        L_0x00c4:
            monitor-exit(r8)     // Catch:{ all -> 0x0021 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c7f.e(d7f):qy9");
    }
}
