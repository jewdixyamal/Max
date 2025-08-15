package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: oj8  reason: default package */
public final class oj8 implements nh8 {
    public final kr6 a;

    public oj8(kr6 kr6) {
        this.a = kr6;
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void e(int i, m4b m4b, k3b k3b, boolean z, boolean z2, int i2) {
        Bundle bundle;
        boolean z3 = false;
        fm9.k(i2 != 0);
        boolean z4 = z || !k3b.a(17);
        if (z2 || !k3b.a(30)) {
            z3 = true;
        }
        kr6 kr6 = this.a;
        if (i2 >= 2) {
            m4b q = m4b.q(k3b, z, z2);
            if (kr6 instanceof ga8) {
                bundle = new Bundle();
                bundle.putBinder(m4b.l0, new l4b(q));
            } else {
                bundle = q.t(i2);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(k4b.d, z4);
            bundle2.putBoolean(k4b.e, z3);
            kr6.H(i, bundle, bundle2);
            return;
        }
        kr6.q0(i, m4b.q(k3b, z, true).t(i2), z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != oj8.class) {
            return false;
        }
        return oaf.a(this.a.asBinder(), ((oj8) obj).a.asBinder());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r2 != 4) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r8, defpackage.wf7 r9) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = defpackage.wf7.g
            int r2 = r9.a
            r0.putInt(r1, r2)
            java.lang.String r1 = defpackage.wf7.h
            long r2 = r9.b
            r0.putLong(r1, r2)
            oc8 r1 = r9.e
            if (r1 == 0) goto L_0x003d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = defpackage.oc8.e
            android.os.Bundle r4 = r1.a
            r2.putBundle(r3, r4)
            java.lang.String r3 = defpackage.oc8.f
            boolean r4 = r1.b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.oc8.g
            boolean r4 = r1.c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.oc8.h
            boolean r1 = r1.d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = defpackage.wf7.i
            r0.putBundle(r1, r2)
        L_0x003d:
            iad r1 = r9.f
            if (r1 == 0) goto L_0x004a
            android.os.Bundle r1 = r1.b()
            java.lang.String r2 = defpackage.wf7.l
            r0.putBundle(r2, r1)
        L_0x004a:
            java.lang.String r1 = defpackage.wf7.k
            int r2 = r9.d
            r0.putInt(r1, r2)
            java.lang.Object r9 = r9.c
            if (r9 != 0) goto L_0x0056
            goto L_0x0099
        L_0x0056:
            r1 = 1
            if (r2 == r1) goto L_0x009f
            java.lang.String r1 = defpackage.wf7.j
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0090
            r3 = 3
            if (r2 == r3) goto L_0x0066
            r9 = 4
            if (r2 == r9) goto L_0x009f
            goto L_0x0099
        L_0x0066:
            pu0 r2 = new pu0
            zw6 r9 = (defpackage.zw6) r9
            ww6 r3 = defpackage.zw6.i()
            r5 = r4
        L_0x006f:
            int r6 = r9.size()
            if (r5 >= r6) goto L_0x0085
            java.lang.Object r6 = r9.get(r5)
            tb8 r6 = (defpackage.tb8) r6
            android.os.Bundle r6 = r6.d(r4)
            r3.a(r6)
            int r5 = r5 + 1
            goto L_0x006f
        L_0x0085:
            ffc r9 = r3.j()
            r2.<init>(r9)
            r0.putBinder(r1, r2)
            goto L_0x0099
        L_0x0090:
            tb8 r9 = (defpackage.tb8) r9
            android.os.Bundle r9 = r9.d(r4)
            r0.putBundle(r1, r9)
        L_0x0099:
            kr6 r7 = r7.a
            r7.M(r8, r0)
            return
        L_0x009f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj8.f(int, wf7):void");
    }

    public final void h(int i, k3b k3b) {
        this.a.A(i, k3b.f());
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a.asBinder()});
    }

    public final void j(int i, sad sad) {
        this.a.F0(i, sad.b());
    }

    public final void k(int i, qad qad, boolean z, boolean z2, int i2) {
        this.a.D(i, qad.a(z, z2).c(i2));
    }

    public final void onDisconnected() {
        this.a.c(0);
    }
}
