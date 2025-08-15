package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qa2  reason: default package */
public final class qa2 implements Serializable {
    public final Set X;
    public final Set Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final Set o;
    public final List s0;
    public final long t0;
    public final Map u0;
    public final List v0;
    public final Set w0;

    public qa2(String str, String str2, String str3, Set set, Set set2, Set set3, boolean z, List list, long j, Map map, List list2, Set set4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = set;
        this.X = set2;
        this.Y = set3;
        this.Z = z;
        this.s0 = list;
        this.t0 = j;
        this.u0 = map;
        this.v0 = list2;
        this.w0 = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa2)) {
            return false;
        }
        qa2 qa2 = (qa2) obj;
        return tpa.f(this.a, qa2.a) && tpa.f(this.b, qa2.b) && tpa.f(this.c, qa2.c) && tpa.f(this.o, qa2.o) && tpa.f(this.X, qa2.X) && tpa.f(this.Y, qa2.Y) && this.Z == qa2.Z && tpa.f(this.s0, qa2.s0) && this.t0 == qa2.t0 && tpa.f(this.u0, qa2.u0) && tpa.f(this.v0, qa2.v0) && tpa.f(this.w0, qa2.w0);
    }

    public final int hashCode() {
        int d = rh4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.o.hashCode();
        return this.w0.hashCode() + k7d.g(this.v0, (this.u0.hashCode() + h4f.m(k7d.g(this.s0, ms2.d((this.Y.hashCode() + ((this.X.hashCode() + ((hashCode2 + ((d + hashCode) * 31)) * 31)) * 31)) * 31, 31, this.Z), 31), 31, this.t0)) * 31, 31);
    }

    public final String toString() {
        return "ChatFolder(id=" + this.a + ", title=" + this.b + ", emoji=" + this.c + ", include=" + this.o + ", favorites=" + this.X + ", filters=" + this.Y + ", hideEmpty=" + this.Z + ", elements=" + this.s0 + ", creatorId=" + this.t0 + ", filterSubjects=" + this.u0 + ", widgets=" + this.v0 + ", options=" + this.w0 + ")";
    }
}
