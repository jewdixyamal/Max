package defpackage;

import java.util.Iterator;

/* renamed from: l77  reason: default package */
public final class l77 extends p1 {
    public final Iterator X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int o = 0;

    public l77(Iterator it, a7b a7b) {
        this.X = it;
        this.Y = a7b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (((defpackage.a7b) r2.Y).apply(r0) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r2.b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.hasNext() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (((defpackage.xbd) r2.Y).b.contains(r0) == false) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r2.b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r0 = r2.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r0.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = r0.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r2 = this;
            int r0 = r2.o
            switch(r0) {
                case 0: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.Iterator r0 = r2.X
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r2.Y
            xbd r1 = (defpackage.xbd) r1
            java.util.Set r1 = r1.b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0005
            goto L_0x0022
        L_0x001e:
            r0 = 3
            r2.b = r0
            r0 = 0
        L_0x0022:
            return r0
        L_0x0023:
            java.util.Iterator r0 = r2.X
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r2.Y
            a7b r1 = (defpackage.a7b) r1
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L_0x0023
            goto L_0x003e
        L_0x003a:
            r0 = 3
            r2.b = r0
            r0 = 0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l77.a():java.lang.Object");
    }

    public l77(xbd xbd) {
        this.Y = xbd;
        this.X = xbd.a.iterator();
    }
}
