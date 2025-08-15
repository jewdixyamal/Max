package defpackage;

import android.view.View;
import java.util.BitSet;

/* renamed from: db5  reason: default package */
public final class db5 extends hqd {
    public final void B(ol7 ol7, Object obj) {
        fb5 fb5 = (fb5) ol7;
        eb5 eb5 = obj instanceof eb5 ? (eb5) obj : null;
        if (eb5 != null) {
            BitSet bitSet = (BitSet) eb5.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z || bitSet.get(5)) {
                ((m62) view).c(fb5.b, fb5.s0, Long.valueOf(fb5.a));
            }
            if (bitSet.get(1)) {
                ((m62) view).setOnline(fb5.c);
            }
            if (bitSet.get(2)) {
                ((m62) view).setTitle(fb5.X);
            }
            if (bitSet.get(3)) {
                ((m62) view).setSubtitle(fb5.Y);
            }
            bitSet.get(4);
            if (bitSet.get(6)) {
                ((m62) view).setVerified(fb5.o);
            }
        }
    }

    /* renamed from: E */
    public final void A(fb5 fb5) {
        m62 m62 = (m62) this.a;
        long j = fb5.a;
        m62.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        m62.setTitle(fb5.X);
        m62.setSubtitle(fb5.Y);
        m62.c(fb5.b, fb5.s0, Long.valueOf(j));
        m62.setOnline(fb5.c);
        m62.setVerified(fb5.o);
    }
}
