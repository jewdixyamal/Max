package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ub0  reason: default package */
public final class ub0 {
    public static final ub0 d = new ub0(0, 2, (cc0) null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{0, -1})));
    public static final ki3 f = new ki3(new ub0(0, 1, (cc0) null));
    public final int a;
    public final int b;
    public final cc0 c;

    public ub0(int i, int i2, cc0 cc0) {
        this.a = i;
        if (i2 != 0) {
            this.b = i2;
            this.c = cc0;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0 = (ub0) obj;
        if (this.a == ub0.a && au1.c(this.b, ub0.b)) {
            cc0 cc0 = ub0.c;
            cc0 cc02 = this.c;
            if (cc02 == null) {
                if (cc0 == null) {
                    return true;
                }
            } else if (cc02.equals(cc0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int s = (((this.a ^ 1000003) * 1000003) ^ au1.s(this.b)) * 1000003;
        cc0 cc0 = this.c;
        return (cc0 == null ? 0 : cc0.hashCode()) ^ s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
