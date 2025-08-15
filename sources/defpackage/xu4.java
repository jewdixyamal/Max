package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: xu4  reason: default package */
public final class xu4 implements jv4 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final a73 e;
    public final String f;
    public final a73 g;
    public final String h;
    public final jqe i;
    public final String j;
    public final faf k;
    public final boolean l;
    public final Long m;

    public xu4(String str, long j2, String str2, CharSequence charSequence, a73 a73, String str3, a73 a732, String str4, jqe jqe, String str5, faf faf, boolean z, Long l2) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = charSequence;
        this.e = a73;
        this.f = str3;
        this.g = a732;
        this.h = str4;
        this.i = jqe;
        this.j = str5;
        this.k = faf;
        this.l = z;
        this.m = l2;
    }

    public static xu4 c(xu4 xu4, String str, a73 a73, String str2, a73 a732, String str3, jqe jqe, faf faf, boolean z, Long l2, int i2) {
        xu4 xu42 = xu4;
        int i3 = i2;
        return new xu4(xu42.a, xu42.b, (i3 & 4) != 0 ? xu42.c : str, xu42.d, (i3 & 16) != 0 ? xu42.e : a73, (i3 & 32) != 0 ? xu42.f : str2, (i3 & 64) != 0 ? xu42.g : a732, (i3 & 128) != 0 ? xu42.h : str3, (i3 & 256) != 0 ? xu42.i : jqe, xu42.j, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? xu42.k : faf, (i3 & 2048) != 0 ? xu42.l : z, (i3 & 4096) != 0 ? xu42.m : l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.jv4 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0034
            boolean r1 = r5 instanceof defpackage.xu4
            if (r1 != 0) goto L_0x0008
            goto L_0x0034
        L_0x0008:
            xu4 r5 = (defpackage.xu4) r5
            java.lang.String r1 = r4.h
            java.lang.String r2 = r5.h
            boolean r1 = defpackage.tpa.f(r2, r1)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            faf r1 = r4.k
            faf r3 = r5.k
            if (r3 == r1) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.f
            java.lang.String r4 = r4.f
            boolean r4 = defpackage.tpa.f(r5, r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu4.a(jv4):boolean");
    }

    public final boolean b(jv4 jv4) {
        if (jv4 == null || !(jv4 instanceof xu4)) {
            return false;
        }
        xu4 xu4 = (xu4) jv4;
        return (xu4.k != this.k) || (tpa.f(xu4.e, this.e) ^ true) || (tpa.f(xu4.g, this.g) ^ true) || !tpa.f(this.i, xu4.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4)) {
            return false;
        }
        xu4 xu4 = (xu4) obj;
        return tpa.f(this.a, xu4.a) && this.b == xu4.b && tpa.f(this.c, xu4.c) && tpa.f(this.d, xu4.d) && tpa.f(this.e, xu4.e) && tpa.f(this.f, xu4.f) && tpa.f(this.g, xu4.g) && tpa.f(this.h, xu4.h) && tpa.f(this.i, xu4.i) && tpa.f(this.j, xu4.j) && this.k == xu4.k && this.l == xu4.l && tpa.f(this.m, xu4.m);
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int m2 = h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        a73 a73 = this.e;
        int hashCode3 = (hashCode2 + (a73 == null ? 0 : a73.a.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a73 a732 = this.g;
        int hashCode5 = (hashCode4 + (a732 == null ? 0 : a732.a.hashCode())) * 31;
        String str4 = this.h;
        int f2 = k7d.f((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (f2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        faf faf = this.k;
        int d2 = ms2.d((hashCode6 + (faf == null ? 0 : faf.hashCode())) * 31, 31, this.l);
        Long l2 = this.m;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return d2 + i2;
    }

    public final String toString() {
        return "EditContactProfileUiModel(avatarUrl=" + this.a + ", contactId=" + this.b + ", firstName=" + this.c + ", abbreviation=" + this.d + ", firstNameError=" + this.e + ", lastName=" + this.f + ", lastNameError=" + this.g + ", description=" + this.h + ", shortLink=" + this.i + ", phoneNumber=" + this.j + ", inactiveTtl=" + this.k + ", isInDeleteState=" + this.l + ", removeProfileTimestamp=" + this.m + ")";
    }
}
