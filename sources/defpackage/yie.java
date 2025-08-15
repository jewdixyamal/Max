package defpackage;

import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: yie  reason: default package */
public final class yie {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final Set n;

    public yie(String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = map;
        this.n = set;
    }

    public static yie a(yie yie, boolean z, Map map, int i2) {
        yie yie2 = yie;
        int i3 = i2;
        String str = yie2.a;
        long j2 = yie2.b;
        String str2 = yie2.c;
        String str3 = yie2.d;
        String str4 = yie2.e;
        String str5 = yie2.f;
        String str6 = yie2.g;
        String str7 = yie2.h;
        String str8 = yie2.i;
        String str9 = yie2.j;
        boolean z2 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? yie2.k : z;
        boolean z3 = yie2.l;
        Map map2 = (i3 & 4096) != 0 ? yie2.m : map;
        Set set = yie2.n;
        yie.getClass();
        return new yie(str, j2, str2, str3, str4, str5, str6, str7, str8, str9, z2, z3, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yie)) {
            return false;
        }
        yie yie = (yie) obj;
        return tpa.f(this.a, yie.a) && this.b == yie.b && tpa.f(this.c, yie.c) && tpa.f(this.d, yie.d) && tpa.f(this.e, yie.e) && tpa.f(this.f, yie.f) && tpa.f(this.g, yie.g) && tpa.f(this.h, yie.h) && tpa.f(this.i, yie.i) && tpa.f(this.j, yie.j) && this.k == yie.k && this.l == yie.l && tpa.f(this.m, yie.m) && tpa.f(this.n, yie.n);
    }

    public final int hashCode() {
        int d2 = rh4.d(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int d3 = rh4.d(rh4.d(rh4.d(rh4.d(rh4.d((hashCode + i2) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = true;
        boolean z2 = this.k;
        if (z2) {
            z2 = true;
        }
        int i3 = (d3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.l;
        if (!z3) {
            z = z3;
        }
        return this.n.hashCode() + ((this.m.hashCode() + ((i3 + (z ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SystemState(versionName=" + this.a + ", versionCode=" + this.b + ", packageName=" + this.c + ", environment=" + this.d + ", buildUuid=" + this.e + ", sessionUuid=" + this.f + ", device=" + this.g + ", deviceId=" + this.h + ", vendor=" + this.i + ", osVersion=" + this.j + ", isInBackground=" + this.k + ", isRooted=" + this.l + ", properties=" + this.m + ", hostedLibrariesInfo=" + this.n + ')';
    }
}
