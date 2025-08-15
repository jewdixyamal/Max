package defpackage;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: z8d  reason: default package */
public final class z8d extends g9d {
    public static final /* synthetic */ int D0 = 0;
    public final float A0;
    public final boolean B0;
    public final long C0;
    public final er7 z0;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0.b == 0.0d) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z8d(defpackage.y8d r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            er7 r0 = r6.m
            r5.z0 = r0
            float r1 = r6.n
            r5.A0 = r1
            long r1 = r6.o
            r5.C0 = r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x002c
            er7 r0 = r6.m
            double r1 = r0.a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            double r0 = r0.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
        L_0x002c:
            r6 = 1
            r5.B0 = r6
            goto L_0x0034
        L_0x0030:
            boolean r6 = r6.l
            r5.B0 = r6
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8d.<init>(y8d):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    /* JADX WARNING: type inference failed for: r7v1, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [j10, java.lang.Object] */
    public final bu8 y() {
        ? obj = new Object();
        long n = ((hyc) i()).n();
        long j = this.C0;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = TimeUnit.SECONDS.toMillis(j) + n;
        }
        ? obj2 = new Object();
        obj2.a = this.z0;
        obj2.g = this.A0;
        obj2.b = j;
        obj2.c = n;
        obj2.d = j2;
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        obj2.f = ((ri4) e8d.d.getValue()).a();
        u10 a = obj2.a();
        ? obj3 = new Object();
        obj3.v = a;
        obj3.a = g20.x0;
        if (this.B0) {
            obj3.i = d20.X;
        }
        obj.a = Collections.singletonList(obj3.a());
        k8g c = obj.c();
        bu8 bu8 = new bu8();
        bu8.g = null;
        bu8.n = c;
        return bu8;
    }

    public final long z(long j, e52 e52) {
        long z = super.z(j, e52);
        if (this.B0) {
            hm9.m("z8d", "specifyLocation, start TaskLocationRequest to define location", new Object[0]);
            u().b(new s8d(((hyc) i()).o(), j, this.C0 != 0));
        }
        return z;
    }
}
