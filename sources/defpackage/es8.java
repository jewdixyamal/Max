package defpackage;

import java.util.Collections;

/* renamed from: es8  reason: default package */
public class es8 implements vk6 {
    public static final /* synthetic */ int t0 = 0;
    public final u6b X;
    public final sw8 Y;
    public final zx8 Z;
    public final cu8 a;
    public final uj3 b;
    public final bw8 c;
    public final es8 o;
    public final lr2 s0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public es8(cu8 cu8, uj3 uj3, bw8 bw8, es8 es8, u6b u6b, sw8 sw8, zx8 zx8, lr2 lr2) {
        this(cu8, uj3, bw8, es8, u6b, sw8, zx8, lr2, 0);
        Collections.emptySet();
    }

    public final es8 a() {
        bw8 bw8 = this.c;
        if (bw8 == null || bw8.a != 2) {
            return null;
        }
        return bw8.c;
    }

    public final CharSequence b(e52 e52) {
        u6b u6b = this.X;
        u6b.f = e52;
        ida ida = u6b.a;
        u6b.i(e52, ida.f(), ida.e());
        u6b.g(e52);
        return u6b.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r1 != ((defpackage.p7b) ((defpackage.m7b) r0.a.get())).a.t()) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(defpackage.e52 r6) {
        /*
            r5 = this;
            zx8 r0 = r5.Z
            r0.getClass()
            boolean r1 = r6.I()
            cu8 r2 = r5.a
            if (r1 == 0) goto L_0x0013
            int r1 = r2.V0
            r3 = 4
            if (r1 != r3) goto L_0x0013
            goto L_0x003a
        L_0x0013:
            boolean r1 = r6.Q()
            if (r1 == 0) goto L_0x003f
            long r1 = r2.Y
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x003a
            bc7[] r3 = defpackage.zx8.b
            r4 = 0
            r3 = r3[r4]
            rm4 r0 = r0.a
            java.lang.Object r0 = r0.get()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            long r3 = r0.t()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
        L_0x003a:
            java.lang.String r5 = r6.q()
            goto L_0x0047
        L_0x003f:
            uj3 r5 = r5.b
            java.lang.String r5 = r5.d()
            if (r5 == 0) goto L_0x0048
        L_0x0047:
            return r5
        L_0x0048:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es8.c(e52):java.lang.String");
    }

    public final boolean d() {
        return !this.b.Y;
    }

    public final long getId() {
        return this.a.b;
    }

    public final long k() {
        cu8 cu8 = this.a;
        ng4 ng4 = cu8.T0;
        return ng4 != null ? ng4.a : cu8.o;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }

    public es8(cu8 cu8, uj3 uj3, bw8 bw8, es8 es8, u6b u6b, sw8 sw8, zx8 zx8, lr2 lr2, int i) {
        this.a = cu8;
        this.b = uj3;
        this.c = bw8;
        this.o = es8;
        this.X = u6b;
        this.Y = sw8;
        this.Z = zx8;
        this.s0 = lr2;
    }
}
