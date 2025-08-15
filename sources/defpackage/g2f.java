package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: g2f  reason: default package */
public final class g2f {
    public final HashMap a = new HashMap();
    public final View b;
    public final ArrayList c = new ArrayList();

    public g2f(View view) {
        this.b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.g2f) r3;
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.g2f
            if (r0 == 0) goto L_0x0018
            g2f r3 = (defpackage.g2f) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r2 = r2.a
            java.util.HashMap r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder o = rh4.o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        o.append(this.b);
        o.append("\n");
        String g = au1.g(o.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            g = g + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g;
    }
}
