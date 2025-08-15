package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* renamed from: nu8  reason: default package */
public final class nu8 {
    public static final EnumSet g = EnumSet.of(mu8.c, new mu8[]{mu8.o, mu8.X, mu8.Y, mu8.Z, mu8.t0, mu8.u0, mu8.s0});
    public final long a;
    public final String b;
    public final mu8 c;
    public final int d;
    public final int e;
    public final Map f;

    public nu8(long j, String str, mu8 mu8, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = mu8;
        this.d = i;
        this.e = i2;
        this.f = map;
    }

    public static nu8 a(nu8 nu8, int i, int i2, int i3) {
        long j = nu8.a;
        String str = nu8.b;
        mu8 mu8 = nu8.c;
        if ((i3 & 8) != 0) {
            i = nu8.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = nu8.e;
        }
        Map map = nu8.f;
        nu8.getClass();
        return new nu8(j, str, mu8, i4, i2, map);
    }

    public final nu8 b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu8)) {
            return false;
        }
        nu8 nu8 = (nu8) obj;
        return this.a == nu8.a && tpa.f(this.b, nu8.b) && this.c == nu8.c && this.d == nu8.d && this.e == nu8.e && tpa.f(this.f, nu8.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int e2 = k7d.e(this.e, k7d.e(this.d, (this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31, 31), 31);
        Map map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return e2 + i;
    }

    public final String toString() {
        return "MessageElementData(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.d + ", length=" + this.e + ", attributes=" + this.f + ")";
    }
}
