package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: at5  reason: default package */
public final class at5 implements Comparable {
    public final Map A0;
    public final List B0;
    public final Set C0;
    public final List X;
    public final Set Y;
    public final boolean Z;
    public final String a;
    public final CharSequence b;
    public final String c;
    public final int o;
    public final boolean s0;
    public final List t0;
    public final boolean u0;
    public final Set v0;
    public final Set w0;
    public final Set x0;
    public final List y0;
    public final Long z0;

    public at5(String str, CharSequence charSequence, String str2, int i, List list, Set set, boolean z, boolean z2, List list2, boolean z3, Set set2, Set set3, Set set4, List list3, Long l, Map map, List list4, Set set5) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.o = i;
        this.X = list;
        this.Y = set;
        this.Z = z;
        this.s0 = z2;
        this.t0 = list2;
        this.u0 = z3;
        this.v0 = set2;
        this.w0 = set3;
        this.x0 = set4;
        this.y0 = list3;
        this.z0 = l;
        this.A0 = map;
        this.B0 = list4;
        this.C0 = set5;
    }

    public static at5 a(at5 at5, String str, int i, List list, int i2) {
        at5 at52 = at5;
        String str2 = (i2 & 1) != 0 ? at52.a : str;
        CharSequence charSequence = at52.b;
        String str3 = at52.c;
        int i3 = (i2 & 8) != 0 ? at52.o : i;
        List list2 = (i2 & 16) != 0 ? at52.X : list;
        Set set = at52.Y;
        boolean z = at52.Z;
        boolean z2 = at52.s0;
        List list3 = at52.t0;
        boolean z3 = at52.u0;
        Set set2 = at52.v0;
        Set set3 = at52.w0;
        Set set4 = at52.x0;
        List list4 = at52.y0;
        Long l = at52.z0;
        List list5 = list4;
        Map map = at52.A0;
        List list6 = at52.B0;
        Set set5 = at52.C0;
        at5.getClass();
        return new at5(str2, charSequence, str3, i3, list2, set, z, z2, list3, z3, set2, set3, set4, list5, l, map, list6, set5);
    }

    public final boolean b() {
        return tpa.f(this.a, "all.chat.folder");
    }

    public final int compareTo(Object obj) {
        return tpa.m(this.o, ((at5) obj).o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at5)) {
            return false;
        }
        at5 at5 = (at5) obj;
        if (!tpa.f(this.a, at5.a) || this.o != at5.o || this.Z != at5.Z || this.s0 != at5.s0 || this.u0 != at5.u0 || !tpa.f(this.z0, at5.z0) || !tpa.f(this.b, at5.b) || !tpa.f(this.c, at5.c) || !tpa.f(this.Y, at5.Y) || !tpa.f(this.v0, at5.v0) || !tpa.f(this.w0, at5.w0) || !tpa.f(this.x0, at5.x0) || !tpa.f(this.y0, at5.y0)) {
            return false;
        }
        Map map = at5.A0;
        Map map2 = this.A0;
        if (map2.size() == map.size()) {
            for (Map.Entry entry : map2.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = map.get((pa2) entry.getKey());
                if (obj2 != null) {
                    if (!(value instanceof long[]) || !(obj2 instanceof long[])) {
                        if (!tpa.f(value, obj2)) {
                        }
                    } else if (!Arrays.equals((long[]) value, (long[]) obj2)) {
                    }
                }
            }
            return tpa.f(this.B0, at5.B0) && tpa.f(this.C0, at5.C0);
        }
        return false;
    }

    public final int hashCode() {
        int d = ms2.d(ms2.d(ms2.d(this.o * 31, 31, this.Z), 31, this.s0), 31, this.u0);
        Long l = this.z0;
        int f = rh4.f(this.b, rh4.d((d + (l != null ? l.hashCode() : 0)) * 31, 31, this.a), 31);
        String str = this.c;
        int hashCode = (this.C0.hashCode() + k7d.g(this.B0, k7d.g(this.y0, (this.x0.hashCode() + ((this.w0.hashCode() + ((this.v0.hashCode() + k7d.g(this.t0, (this.Y.hashCode() + k7d.g(this.X, (f + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31, 31)) * 31)) * 31)) * 31, 31), 31)) * 31;
        int i = 0;
        for (Map.Entry entry : this.A0.entrySet()) {
            Object value = entry.getValue();
            int hashCode2 = ((pa2) entry.getKey()).hashCode() + (i * 31);
            if (value instanceof long[]) {
                for (long hashCode3 : (long[]) value) {
                    hashCode2 = (hashCode2 * 31) + Long.hashCode(hashCode3);
                }
                i = hashCode2;
            } else {
                i = (value != null ? value.hashCode() : 0) + (hashCode2 * 31);
            }
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id='");
        sb.append(this.a);
        sb.append("', includedChats=");
        sb.append(this.v0.size());
        sb.append(", title='");
        sb.append(this.b);
        sb.append("', emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.o);
        sb.append(", filters=");
        sb.append(this.Y);
        sb.append(", isEnabled=");
        sb.append(this.Z);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.s0);
        sb.append(", hideIfEmpty=");
        sb.append(this.u0);
        sb.append(", creatorId=");
        sb.append(this.z0);
        sb.append(", elements=");
        sb.append(this.y0.size());
        sb.append(", filterSubjects=");
        sb.append(this.A0.size());
        sb.append(", widgets=");
        sb.append(x53.n0(this.B0, "[", "]", (String) null, (m56) null, 60));
        sb.append(", options=");
        return zr6.l(sb, x53.n0(this.C0, "[", "]", (String) null, (m56) null, 60), ")");
    }
}
