package defpackage;

import java.io.Serializable;

/* renamed from: pq0  reason: default package */
public final class pq0 implements Serializable {
    public final boolean a;
    public final boolean b;

    public pq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return "{hasBots=" + this.a + ", suspendedBot=" + this.b + "}";
    }
}
