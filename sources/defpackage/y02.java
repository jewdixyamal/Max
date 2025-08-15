package defpackage;

import java.util.ArrayDeque;

/* renamed from: y02  reason: default package */
public final class y02 extends jbe {
    public final /* synthetic */ int Y;
    public Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02() {
        super(2);
        this.Y = 0;
    }

    public final void v() {
        switch (this.Y) {
            case 0:
                v02 v02 = (v02) this.Z;
                v02.getClass();
                a12 a12 = (a12) v02.b;
                a12.getClass();
                this.b = 0;
                this.o = null;
                a12.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((ay) this.Z).Y;
                np8.f(arrayDeque.size() < 2);
                np8.d(!arrayDeque.contains(this));
                this.b = 0;
                this.o = null;
                arrayDeque.addFirst(this);
                return;
            default:
                fqd fqd = (fqd) this.Z;
                synchronized (fqd.b) {
                    this.b = 0;
                    this.o = null;
                    int i = fqd.s0;
                    fqd.s0 = i + 1;
                    fqd.Y[i] = this;
                    if (!fqd.c.isEmpty() && fqd.s0 > 0) {
                        fqd.b.notify();
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02(cbe cbe, int i) {
        super(2);
        this.Y = i;
        this.Z = cbe;
    }
}
