package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ja0  reason: default package */
public final class ja0 {
    public final String a;
    public final Integer b;
    public final i05 c;
    public final long d;
    public final long e;
    public final Map f;

    public ja0(String str, Integer num, i05 i05, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = i05;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ai3] */
    public final ai3 c() {
        ? obj = new Object();
        String str = this.a;
        if (str != null) {
            obj.a = str;
            obj.b = this.b;
            i05 i05 = this.c;
            if (i05 != null) {
                obj.c = i05;
                obj.o = Long.valueOf(this.d);
                obj.X = Long.valueOf(this.e);
                obj.Y = new HashMap(this.f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0 = (ja0) obj;
        if (this.a.equals(ja0.a)) {
            Integer num = ja0.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(ja0.c) && this.d == ja0.d && this.e == ja0.e && this.f.equals(ja0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return this.f.hashCode() ^ ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
