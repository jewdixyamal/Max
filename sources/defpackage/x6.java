package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: x6  reason: default package */
public final class x6 implements efb {
    public final int a;
    public final vfd b;
    public final int c;

    public /* synthetic */ x6(int i, vfd vfd) {
        this(i, vfd, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.x6) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.x6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            x6 r5 = (defpackage.x6) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            vfd r1 = r4.b
            vfd r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r4 = r4.c
            int r5 = r5.c
            boolean r4 = defpackage.dy7.o(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = ((defpackage.x6) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.ol7 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.x6
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            x6 r3 = (defpackage.x6) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 != r3) goto L_0x000f
            r1 = 1
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6.h(ol7):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.c) + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int l() {
        return this.c;
    }

    public final boolean t(Object obj) {
        ol7 ol7 = (ol7) obj;
        if ((ol7 instanceof x6) && !(((x6) ol7).b.Z instanceof ffd)) {
            return equals(ol7);
        }
        return false;
    }

    public final String toString() {
        String J = dy7.J(this.c);
        return "ActionItem(actionId=" + this.a + ", model=" + this.b + ", itemViewType=" + J + ")";
    }

    public x6(int i, vfd vfd, int i2) {
        this.a = i;
        this.b = vfd;
        this.c = i2;
    }
}
