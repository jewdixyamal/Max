package defpackage;

import java.util.Arrays;

/* renamed from: qo7  reason: default package */
public final class qo7 {
    public final long a;
    public final float b;
    public final long c;

    public qo7(po7 po7) {
        this.a = po7.a;
        this.b = po7.b;
        this.c = po7.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo7)) {
            return false;
        }
        qo7 qo7 = (qo7) obj;
        return this.a == qo7.a && this.b == qo7.b && this.c == qo7.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
