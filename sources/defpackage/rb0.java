package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: rb0  reason: default package */
public final class rb0 {
    public final xf4 a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final eu4 f;

    public rb0(xf4 xf4, List list, String str, int i, int i2, eu4 eu4) {
        this.a = xf4;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = eu4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xe5, java.lang.Object] */
    public static xe5 a(xf4 xf4) {
        ? obj = new Object();
        if (xf4 != null) {
            obj.a = xf4;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                obj.b = emptyList;
                obj.c = null;
                obj.o = -1;
                obj.X = -1;
                obj.Y = eu4.d;
                return obj;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0 = (rb0) obj;
        if (this.a.equals(rb0.a) && this.b.equals(rb0.b)) {
            String str = rb0.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d == rb0.d && this.e == rb0.e && this.f.equals(rb0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return this.f.hashCode() ^ ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
