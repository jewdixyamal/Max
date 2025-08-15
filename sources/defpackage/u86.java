package defpackage;

import android.net.Uri;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: u86  reason: default package */
public final class u86 extends v86 {
    public final boolean b;
    public final zp7 c;
    public final jic d;
    public final awa e;
    public final ref f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final long m;

    public u86(boolean z, zp7 zp7, jic jic, awa awa, ref ref, Uri uri, int i2, boolean z2, long j2, int i3, Uri uri2) {
        super(10);
        this.b = z;
        this.c = zp7;
        this.d = jic;
        this.e = awa;
        this.f = ref;
        this.g = uri;
        this.h = i2;
        this.i = z2;
        this.j = j2;
        this.k = i3;
        this.l = uri2;
        Long l2 = zp7.Z;
        this.m = l2 != null ? l2.longValue() : 0;
    }

    public static u86 b(u86 u86, awa awa, ref ref, Uri uri, int i2, boolean z, int i3, Uri uri2, int i4) {
        u86 u862 = u86;
        int i5 = i4;
        boolean z2 = u862.b;
        zp7 zp7 = u862.c;
        jic jic = u862.d;
        awa awa2 = (i5 & 8) != 0 ? u862.e : awa;
        ref ref2 = (i5 & 16) != 0 ? u862.f : ref;
        Uri uri3 = (i5 & 32) != 0 ? u862.g : uri;
        int i6 = (i5 & 64) != 0 ? u862.h : i2;
        boolean z3 = (i5 & 128) != 0 ? u862.i : z;
        long j2 = u862.j;
        int i7 = (i5 & 512) != 0 ? u862.k : i3;
        Uri uri4 = (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? u862.l : uri2;
        u86.getClass();
        return new u86(z2, zp7, jic, awa2, ref2, uri3, i6, z3, j2, i7, uri4);
    }

    public final Long a() {
        return Long.valueOf(this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.u86) r8;
        r1 = r8.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.u86
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            u86 r8 = (defpackage.u86) r8
            boolean r1 = r8.b
            boolean r3 = r7.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            zp7 r1 = r7.c
            zp7 r3 = r8.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            jic r1 = r7.d
            jic r3 = r8.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            awa r1 = r7.e
            awa r3 = r8.e
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            ref r1 = r7.f
            ref r3 = r8.f
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            android.net.Uri r1 = r7.g
            android.net.Uri r3 = r8.g
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x004a
            return r2
        L_0x004a:
            int r1 = r7.h
            int r3 = r8.h
            if (r1 == r3) goto L_0x0051
            return r2
        L_0x0051:
            boolean r1 = r7.i
            boolean r3 = r8.i
            if (r1 == r3) goto L_0x0058
            return r2
        L_0x0058:
            long r3 = r7.j
            long r5 = r8.j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            return r2
        L_0x0061:
            int r1 = r7.k
            int r3 = r8.k
            if (r1 == r3) goto L_0x0068
            return r2
        L_0x0068:
            android.net.Uri r7 = r7.l
            android.net.Uri r8 = r8.l
            boolean r7 = defpackage.tpa.f(r7, r8)
            if (r7 != 0) goto L_0x0073
            return r2
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u86.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        int i2 = 0;
        awa awa = this.e;
        int hashCode2 = (hashCode + (awa == null ? 0 : awa.hashCode())) * 31;
        ref ref = this.f;
        int hashCode3 = (hashCode2 + (ref == null ? 0 : ref.hashCode())) * 31;
        Uri uri = this.g;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return this.l.hashCode() + k7d.e(this.k, h4f.m(ms2.d(k7d.e(this.h, (hashCode3 + i2) * 31, 31), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        int i2 = this.h;
        return "Media(multiSelect=" + this.b + ", origin=" + this.c + ", resizeOptions=" + this.d + ", photoEditorOptions=" + this.e + ", videoConvertOptions=" + this.f + ", overlay=" + this.g + ", selectionNumber=" + i2 + ", enabled=" + this.i + ", id=" + this.j + ", rotation=" + this.k + ", thumbnailUri=" + this.l + ")";
    }
}
