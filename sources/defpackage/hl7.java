package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: hl7  reason: default package */
public abstract class hl7 extends hdc {
    public final iv o;

    public hl7(ema ema) {
        gl7 gl7 = new gl7(this);
        y8 y8Var = new y8((Object) this);
        synchronized (fp3.a) {
            try {
                if (fp3.b == null) {
                    fp3.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        iv ivVar = new iv(y8Var, new qz7((Object) fp3.b, 4, (Object) ema));
        this.o = ivVar;
        ivVar.d.add(gl7);
    }

    public final Object C(int i) {
        return this.o.f.get(i);
    }

    public void D(List list, List list2) {
    }

    public void E(List list) {
        this.o.b(list, (Runnable) null);
    }

    public void F(List list, Runnable runnable) {
        this.o.b(list, runnable);
    }

    public int j() {
        return this.o.f.size();
    }

    public hl7(qz7 qz7) {
        gl7 gl7 = new gl7(this);
        iv ivVar = new iv(new y8((Object) this), qz7);
        this.o = ivVar;
        ivVar.d.add(gl7);
    }
}
