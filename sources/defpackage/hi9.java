package defpackage;

import java.util.EnumMap;

/* renamed from: hi9  reason: default package */
public final class hi9 {
    public rd8 a;
    public rd8 b;
    public rd8 c;
    public rd8 d;

    public hi9(rd8 rd8, rd8 rd82, rd8 rd83, rd8 rd84) {
        this.a = rd8;
        this.b = rd82;
        this.c = rd83;
        this.d = rd84;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(qd8.class);
        enumMap.put(qd8.a, this.a);
        enumMap.put(qd8.b, this.b);
        enumMap.put(qd8.c, this.c);
        enumMap.put(qd8.o, this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi9)) {
            return false;
        }
        hi9 hi9 = (hi9) obj;
        return this.a == hi9.a && this.b == hi9.b && this.c == hi9.c && this.d == hi9.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        rd8 rd8 = this.a;
        rd8 rd82 = this.b;
        rd8 rd83 = this.c;
        rd8 rd84 = this.d;
        return "MutableMediaOptions(audioState=" + rd8 + ", videoState=" + rd82 + ", screenshareState=" + rd83 + ", movieSharingState=" + rd84 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ hi9() {
        /*
            r1 = this;
            rd8 r0 = defpackage.rd8.a
            r1.<init>(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi9.<init>():void");
    }
}
