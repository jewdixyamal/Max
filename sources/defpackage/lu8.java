package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: lu8  reason: default package */
public final class lu8 implements Serializable {
    public static final ku8 Z = new Object();
    public final short X;
    public final Map Y;
    public final long a;
    public final String b;
    public final pu8 c;
    public final short o;

    public lu8(long j, String str, pu8 pu8, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = pu8;
        this.o = s;
        this.X = s2;
        this.Y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu8)) {
            return false;
        }
        lu8 lu8 = (lu8) obj;
        return this.a == lu8.a && tpa.f(this.b, lu8.b) && this.c == lu8.c && this.o == lu8.o && this.X == lu8.X && tpa.f(this.Y, lu8.Y);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (Short.hashCode(this.X) + ((Short.hashCode(this.o) + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
        Map map = this.Y;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MessageElement(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.o + ", length=" + this.X + ", attributes=" + this.Y + ")";
    }
}
