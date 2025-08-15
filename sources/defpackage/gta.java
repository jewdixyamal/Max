package defpackage;

import android.content.Context;

/* renamed from: gta  reason: default package */
public final class gta {
    public final vi4 a;
    public final boolean b;

    public gta(Context context) {
        vi4 q = lz7.q(context);
        this.a = q;
        this.b = q.compareTo(vi4.o) >= 0;
    }

    public final String toString() {
        return x9e.b0("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
