package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ut6  reason: default package */
public final class ut6 extends i06 {
    public final Object X;
    public final /* synthetic */ int o = 1;

    public ut6(ov6 ov6) {
        super(ov6);
        this.X = new AtomicBoolean(false);
    }

    public void close() {
        switch (this.o) {
            case 1:
                if (!((AtomicBoolean) this.X).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public ut6(ov6 ov6, vt6 vt6) {
        super(ov6);
        this.X = new WeakReference(vt6);
        a(new tt6(0, this));
    }
}
