package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ppd  reason: default package */
public abstract class ppd extends hl7 {
    public ppd(Executor executor) {
        super(new qz7((Object) executor, 4, (Object) new y34(9)));
        super.A(true);
    }

    public final ol7 G(int i) {
        if (i < 0 || i >= this.o.f.size()) {
            return null;
        }
        return (ol7) C(i);
    }

    /* renamed from: H */
    public void r(hqd hqd, int i) {
        hqd.A((ol7) C(i));
    }

    /* renamed from: I */
    public void y(hqd hqd) {
        hqd.D();
    }

    public long k(int i) {
        return ((ol7) C(i)).getItemId();
    }

    public int l(int i) {
        return ((ol7) C(i)).l();
    }
}
