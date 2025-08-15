package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* renamed from: hb5  reason: default package */
public final class hb5 extends hqd {
    public m56 F0;
    public m56 G0;

    public final void B(ol7 ol7, Object obj) {
        fb5 fb5 = (fb5) ol7;
        eb5 eb5 = obj instanceof eb5 ? (eb5) obj : null;
        if (eb5 != null) {
            BitSet bitSet = (BitSet) eb5.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                lk3 lk3 = (lk3) view;
                Uri uri = fb5.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                lk3.O(fb5.a, fb5.s0, uri.toString());
            }
            if (bitSet.get(2)) {
                ((lk3) view).setName(fb5.X);
            }
            boolean z2 = bitSet.get(3);
            CharSequence charSequence = fb5.Y;
            if (z2) {
                ((lk3) view).setMessage(charSequence);
            }
            if (bitSet.get(4)) {
                lk3 lk32 = (lk3) view;
                if (fb5.Z) {
                    tu0.K(lk32, 300, new gb5(this, fb5, 2));
                    lk32.setMessage(charSequence);
                    lk32.N();
                    return;
                }
                tu0.K(lk32, 300, new gb5(this, fb5, 3));
                if (charSequence != null) {
                    lk32.P(charSequence, new yf3(this, 8, fb5));
                    lk32.setMessage((CharSequence) null);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final void D() {
        this.F0 = null;
        this.G0 = null;
    }

    /* renamed from: E */
    public final void A(fb5 fb5) {
        lk3 lk3 = (lk3) this.a;
        long j = fb5.a;
        lk3.setId((int) (j >> 32));
        if (fb5.Z) {
            lk3.setMessage(fb5.Y);
        } else {
            lk3.setMessage((CharSequence) null);
        }
        lk3.setName(fb5.X);
        Uri uri = fb5.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        lk3.O(j, fb5.s0, uri.toString());
    }
}
