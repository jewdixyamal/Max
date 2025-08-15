package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: kt7  reason: default package */
public final class kt7 extends gle implements dt7 {
    public final long A0;
    public final List X;
    public final Map Y;
    public final String Z;
    public final nab c;
    public final List o;
    public final long s0;
    public final le3 t0;
    public final Map u0;
    public final long v0;
    public final List w0;
    public final boolean x0;
    public final long y0;
    public final vp4 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ kt7() {
        /*
            r19 = this;
            nz4 r12 = defpackage.nz4.a
            oz4 r9 = defpackage.oz4.a
            r17 = 0
            r1 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r19
            r2 = r12
            r3 = r12
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r12, r13, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt7.<init>():void");
    }

    public final String a(boolean z, boolean z2) {
        a8d a8d;
        Map map;
        le3 le3 = this.t0;
        if (!(le3 == null || (a8d = le3.b) == null || (map = a8d.b) == null)) {
            String str = null;
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            }
            if (map.containsKey("log-sensitive")) {
                Object obj2 = map.get("log-sensitive");
                if (obj2 != null) {
                    str = obj2.toString();
                }
                z2 = Boolean.parseBoolean(str);
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str2 = this.Z;
        sb.append(z2 ? str2 != null ? str2.toString() : "NULL" : oag.x(str2));
        sb.append(",time=");
        sb.append(this.s0);
        sb.append(",chatMarker=");
        sb.append(this.v0);
        sb.append(",videoChatHistory=");
        sb.append(this.x0);
        sb.append(",resetAt=");
        sb.append(this.y0);
        sb.append(",contactInfos=");
        sb.append(wmd.x(this.X, z, z2));
        sb.append(",config=");
        sb.append(le3);
        sb.append(",messages=");
        sb.append(wmd.y(this.u0, z, z2));
        sb.append(",chats=");
        sb.append(wmd.x(this.o, z, z2));
        sb.append(",presence=");
        sb.append(wmd.y(this.Y, z, z2));
        sb.append(",calls=");
        sb.append(wmd.x(this.w0, z, z2));
        sb.append(",draftsNews=");
        sb.append(this.z0);
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.X) {
            if (((wm3) next) != um3.A0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt7)) {
            return false;
        }
        kt7 kt7 = (kt7) obj;
        return tpa.f(this.c, kt7.c) && tpa.f(this.o, kt7.o) && tpa.f(this.X, kt7.X) && tpa.f(this.Y, kt7.Y) && tpa.f(this.Z, kt7.Z) && this.s0 == kt7.s0 && tpa.f(this.t0, kt7.t0) && tpa.f(this.u0, kt7.u0) && this.v0 == kt7.v0 && tpa.f(this.w0, kt7.w0) && this.x0 == kt7.x0 && this.y0 == kt7.y0 && tpa.f(this.z0, kt7.z0) && this.A0 == kt7.A0;
    }

    public final int hashCode() {
        int i = 0;
        nab nab = this.c;
        int hashCode = (this.Y.hashCode() + k7d.g(this.X, k7d.g(this.o, (nab == null ? 0 : nab.hashCode()) * 31, 31), 31)) * 31;
        String str = this.Z;
        int m = h4f.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.s0);
        le3 le3 = this.t0;
        int m2 = h4f.m(ms2.d(k7d.g(this.w0, h4f.m((this.u0.hashCode() + ((m + (le3 == null ? 0 : le3.hashCode())) * 31)) * 31, 31, this.v0), 31), 31, this.x0), 31, this.y0);
        vp4 vp4 = this.z0;
        if (vp4 != null) {
            i = vp4.hashCode();
        }
        return Long.hashCode(this.A0) + ((m2 + i) * 31);
    }

    public final String toString() {
        return a(false, false);
    }

    public kt7(nab nab, List list, List list2, Map map, String str, long j, le3 le3, Map map2, long j2, List list3, boolean z, long j3, vp4 vp4, long j4) {
        long j5 = j4;
        this.c = nab;
        this.o = list;
        this.X = list2;
        this.Y = map;
        this.Z = str;
        this.s0 = j;
        this.t0 = le3;
        this.u0 = map2;
        this.v0 = j2;
        this.w0 = list3;
        this.x0 = z;
        this.y0 = j3;
        this.z0 = vp4;
        this.A0 = j5;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j5));
    }
}
