package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d07  reason: default package */
public final class d07 implements pi4 {
    public final je7 a;
    public final q0e b;

    public d07(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        AtomicLong atomicLong = ei4.b;
        long incrementAndGet = atomicLong.incrementAndGet();
        long incrementAndGet2 = atomicLong.incrementAndGet();
        long incrementAndGet3 = atomicLong.incrementAndGet();
        ((x6a) je74.getValue()).getClass();
        ((x6a) je74.getValue()).getClass();
        b54 b54 = new b54(incrementAndGet2, new iqe("25.8.1(6392)"), 0, new eqe(m0c.oneme_settings_app_version), (fp3) null, 20);
        b54 b542 = new b54(incrementAndGet, new iqe(String.valueOf(((hyc) ((q33) je72.getValue())).t())), 0, new eqe(m0c.oneme_settings_user_id), (fp3) null, 20);
        String str = (String) ((ti4) ((ri4) je73.getValue())).l.get();
        this.b = r0e.a(y53.M(b54, b542, new b54(incrementAndGet3, new iqe(str == null ? "NULL" : str), 0, new eqe(m0c.oneme_settings_mytracker_id), (fp3) null, 20)));
    }

    public final j0e c() {
        return this.b;
    }

    public final void d(b54 b54) {
        je7 je7 = this.a;
        Context context = (Context) je7.getValue();
        CharSequence b2 = b54.b.b((Context) je7.getValue());
        tpa.o(context, b2 != null ? b2.toString() : null);
    }
}
