package defpackage;

import android.graphics.Bitmap;

/* renamed from: rw8  reason: default package */
public final class rw8 {
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final Bitmap h;
    public final long i;
    public final yx8 j;
    public final ne5 k;
    public final dv9 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public rw8(long j2, String str, long j3, Long l2, long j4, String str2, long j5, Bitmap bitmap, long j6, yx8 yx8, ne5 ne5, dv9 dv9, boolean z, boolean z2, boolean z3) {
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = l2;
        this.e = j4;
        this.f = str2;
        this.g = j5;
        this.h = bitmap;
        this.i = j6;
        this.j = yx8;
        this.k = ne5;
        this.l = dv9;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw8)) {
            return false;
        }
        rw8 rw8 = (rw8) obj;
        return this.a == rw8.a && tpa.f(this.b, rw8.b) && this.c == rw8.c && tpa.f(this.d, rw8.d) && this.e == rw8.e && tpa.f(this.f, rw8.f) && this.g == rw8.g && tpa.f(this.h, rw8.h) && this.i == rw8.i && tpa.f(this.j, rw8.j) && this.k == rw8.k && tpa.f(this.l, rw8.l) && this.m == rw8.m && this.n == rw8.n && this.o == rw8.o;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int m2 = h4f.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l2 = this.d;
        int m3 = h4f.m(rh4.d(h4f.m((m2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int hashCode2 = (this.k.hashCode() + ((this.j.hashCode() + h4f.m((m3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.i)) * 31)) * 31;
        dv9 dv9 = this.l;
        if (dv9 != null) {
            i2 = dv9.hashCode();
        }
        return Boolean.hashCode(this.o) + ms2.d(ms2.d((hashCode2 + i2) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append("', senderUserId=");
        sb.append(this.g);
        sb.append(", time=");
        sb.append(this.i);
        sb.append(", text=");
        sb.append(this.j);
        sb.append(", fcmNotificationType=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", fcmSource=");
        sb.append(this.m);
        sb.append(", isScheduledMessage=");
        sb.append(this.n);
        sb.append(", hasAnyError=");
        return au1.j(sb, this.o, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ rw8(long r24, java.lang.String r26, long r27, java.lang.Long r29, long r30, java.lang.String r32, long r33, android.graphics.Bitmap r35, long r36, defpackage.yx8 r38, defpackage.ne5 r39, defpackage.dv9 r40, boolean r41, boolean r42, boolean r43, int r44) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r19 = r1
            goto L_0x000c
        L_0x000a:
            r19 = r40
        L_0x000c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r20 = r2
            goto L_0x0016
        L_0x0014:
            r20 = r41
        L_0x0016:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x001d
            r21 = r2
            goto L_0x001f
        L_0x001d:
            r21 = r42
        L_0x001f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0026
            r22 = r2
            goto L_0x0028
        L_0x0026:
            r22 = r43
        L_0x0028:
            r2 = r23
            r3 = r24
            r5 = r26
            r6 = r27
            r8 = r29
            r9 = r30
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
            r2.<init>(r3, r5, r6, r8, r9, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw8.<init>(long, java.lang.String, long, java.lang.Long, long, java.lang.String, long, android.graphics.Bitmap, long, yx8, ne5, dv9, boolean, boolean, boolean, int):void");
    }
}
