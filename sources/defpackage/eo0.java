package defpackage;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import java.util.HashMap;

/* renamed from: eo0  reason: default package */
public final class eo0 implements dab {
    public final HashMap a;
    public final dab b;
    public final boolean c;
    public final String d;
    public final String e;
    public final /* synthetic */ int f;
    public final o84 g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eo0(o84 o84, boolean z, dab dab) {
        this(dab, "EncodedCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_ENCODED_COUNT, z);
        this.f = 1;
        this.g = o84;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.fi0 r6, defpackage.eab r7) {
        /*
            r5 = this;
            defpackage.f46.I()     // Catch:{ all -> 0x004b }
            r0 = r7
            oj0 r0 = (defpackage.oj0) r0     // Catch:{ all -> 0x004b }
            hab r0 = r0.c     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r5.d     // Catch:{ all -> 0x004b }
            r0.j(r7, r1)     // Catch:{ all -> 0x004b }
            android.util.Pair r0 = r5.d(r7)     // Catch:{ all -> 0x004b }
        L_0x0011:
            monitor-enter(r5)     // Catch:{ all -> 0x004b }
            monitor-enter(r5)     // Catch:{ all -> 0x004d }
            java.util.HashMap r1 = r5.a     // Catch:{ all -> 0x004f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x004f }
            vg9 r1 = (defpackage.vg9) r1     // Catch:{ all -> 0x004f }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            r2 = 1
            if (r1 != 0) goto L_0x0030
            monitor-enter(r5)     // Catch:{ all -> 0x004d }
            vg9 r1 = new vg9     // Catch:{ all -> 0x002d }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x002d }
            java.util.HashMap r3 = r5.a     // Catch:{ all -> 0x002d }
            r3.put(r0, r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            r3 = r2
            goto L_0x0031
        L_0x002d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x0030:
            r3 = 0
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            boolean r4 = r1.a(r6, r7)     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0011
            if (r3 == 0) goto L_0x0047
            oj0 r7 = (defpackage.oj0) r7     // Catch:{ all -> 0x004b }
            boolean r5 = r7.g()     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 2
        L_0x0044:
            r1.i(r2)     // Catch:{ all -> 0x004b }
        L_0x0047:
            defpackage.f46.I()
            return
        L_0x004b:
            r5 = move-exception
            goto L_0x0054
        L_0x004d:
            r6 = move-exception
            goto L_0x0052
        L_0x004f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x0052:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r6     // Catch:{ all -> 0x004b }
        L_0x0054:
            defpackage.f46.I()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo0.a(fi0, eab):void");
    }

    public final Closeable c(Closeable closeable) {
        switch (this.f) {
            case 0:
                return o43.o((o43) closeable);
            default:
                return g05.a((g05) closeable);
        }
    }

    public final Pair d(eab eab) {
        switch (this.f) {
            case 0:
                oj0 oj0 = (oj0) eab;
                return Pair.create(this.g.b(oj0.a, oj0.o), oj0.X);
            default:
                oj0 oj02 = (oj0) eab;
                wv6 wv6 = oj02.a;
                o84 o84 = this.g;
                o84.getClass();
                return Pair.create(o84.d(wv6.b), oj02.X);
        }
    }

    public final synchronized void e(Object obj, vg9 vg9) {
        if (this.a.get(obj) == vg9) {
            this.a.remove(obj);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eo0(o84 o84, fo0 fo0) {
        this(fo0, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_BITMAP_COUNT, false);
        this.f = 0;
        this.g = o84;
    }

    public eo0(dab dab, String str, String str2, boolean z) {
        this.b = dab;
        this.a = new HashMap();
        this.c = z;
        this.d = str;
        this.e = str2;
    }
}
