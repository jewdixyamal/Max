package defpackage;

/* renamed from: vfd  reason: default package */
public final class vfd implements kfd {
    public final jqe X;
    public final Integer Y;
    public final hfd Z;
    public final long a;
    public final int b;
    public final jqe c;
    public final jfd o;
    public final bfd s0;
    public final jqe t0;
    public final int u0;
    public final wed v0;

    public vfd(long j, int i, jqe jqe, jfd jfd, jqe jqe2, Integer num, hfd hfd, bfd bfd, jqe jqe3, int i2, wed wed) {
        this.a = j;
        this.b = i;
        this.c = jqe;
        this.o = jfd;
        this.X = jqe2;
        this.Y = num;
        this.Z = hfd;
        this.s0 = bfd;
        this.t0 = jqe3;
        this.u0 = i2;
        this.v0 = wed;
    }

    public static vfd k(vfd vfd, cqe cqe, dfd dfd, int i) {
        vfd vfd2 = vfd;
        long j = vfd2.a;
        int i2 = vfd2.b;
        jqe jqe = (i & 4) != 0 ? vfd2.c : cqe;
        jfd jfd = vfd2.o;
        jqe jqe2 = vfd2.X;
        Integer num = vfd2.Y;
        hfd hfd = (i & 64) != 0 ? vfd2.Z : dfd;
        bfd bfd = vfd2.s0;
        jqe jqe3 = vfd2.t0;
        int i3 = vfd2.u0;
        wed wed = vfd2.v0;
        vfd.getClass();
        return new vfd(j, i2, jqe, jfd, jqe2, num, hfd, bfd, jqe3, i3, wed);
    }

    public final jqe b() {
        return this.X;
    }

    public final bfd c() {
        return this.s0;
    }

    public final jqe d() {
        return this.t0;
    }

    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd)) {
            return false;
        }
        vfd vfd = (vfd) obj;
        return this.a == vfd.a && this.b == vfd.b && tpa.f(this.c, vfd.c) && this.o == vfd.o && tpa.f(this.X, vfd.X) && tpa.f(this.Y, vfd.Y) && tpa.f(this.Z, vfd.Z) && tpa.f(this.s0, vfd.s0) && tpa.f(this.t0, vfd.t0) && this.u0 == vfd.u0 && tpa.f(this.v0, vfd.v0);
    }

    public final Integer f() {
        return this.Y;
    }

    public final long getItemId() {
        return this.a;
    }

    public final jqe getTitle() {
        return this.c;
    }

    public final jfd getType() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + k7d.f(k7d.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        int i = 0;
        jqe jqe = this.X;
        int hashCode2 = (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Integer num = this.Y;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        hfd hfd = this.Z;
        int hashCode4 = (hashCode3 + (hfd == null ? 0 : hfd.hashCode())) * 31;
        bfd bfd = this.s0;
        int hashCode5 = (hashCode4 + (bfd == null ? 0 : bfd.hashCode())) * 31;
        jqe jqe2 = this.t0;
        int e = k7d.e(this.u0, (hashCode5 + (jqe2 == null ? 0 : jqe2.hashCode())) * 31, 31);
        wed wed = this.v0;
        if (wed != null) {
            i = wed.hashCode();
        }
        return e + i;
    }

    public final int q() {
        return this.u0;
    }

    public final wed s() {
        return this.v0;
    }

    public final String toString() {
        return "SettingsItemModel(itemId=" + this.a + ", sectionId=" + this.b + ", title=" + this.c + ", type=" + this.o + ", descriptionRes=" + this.X + ", startIconRes=" + this.Y + ", endView=" + this.Z + ", counterType=" + this.s0 + ", upperText=" + this.t0 + ", startIconPadding=" + this.u0 + ", avatarParams=" + this.v0 + ")";
    }

    public final int u() {
        return this.b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ vfd(long r16, int r18, defpackage.jqe r19, defpackage.jfd r20, defpackage.jqe r21, java.lang.Integer r22, defpackage.hfd r23, defpackage.zed r24, defpackage.jqe r25, int r26, defpackage.wed r27, int r28) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            jfd r1 = defpackage.jfd.b
            r7 = r1
            goto L_0x000c
        L_0x000a:
            r7 = r20
        L_0x000c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r8 = r2
            goto L_0x0015
        L_0x0013:
            r8 = r21
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r9 = r2
            goto L_0x001d
        L_0x001b:
            r9 = r22
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r10 = r2
            goto L_0x0025
        L_0x0023:
            r10 = r23
        L_0x0025:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r24
        L_0x002d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r2
            goto L_0x0035
        L_0x0033:
            r12 = r25
        L_0x0035:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004d
            r1 = 8
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r13 = r1
            goto L_0x004f
        L_0x004d:
            r13 = r26
        L_0x004f:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            r14 = r2
            goto L_0x0057
        L_0x0055:
            r14 = r27
        L_0x0057:
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfd.<init>(long, int, jqe, jfd, jqe, java.lang.Integer, hfd, zed, jqe, int, wed, int):void");
    }
}
