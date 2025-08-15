package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: a77  reason: default package */
public final class a77 extends e77 {
    public final y67 Y;

    public a77(y67 y67) {
        super(3, 0);
        this.Y = y67;
    }

    public final void a(RecyclerView recyclerView, dec dec) {
        super.a(recyclerView, dec);
        if (dec instanceof g77) {
            y9f y9f = (y9f) ((g77) dec);
            ((x9f) y9f.a).animate().translationZ(0.0f);
            re6 re6 = y9f.F0;
            if (re6 != null) {
                iw5 m0 = ((FoldersListScreen) re6.b).m0();
                int g = y9f.g() - 1;
                String str = m0.s0;
                if (str != null && str.length() != 0) {
                    j47.T(m0.a, ((w9a) m0.c).c().getImmediate(), (vx3) null, new hw5(m0, str, g, (Continuation) null), 2);
                    m0.s0 = null;
                }
            }
        }
    }

    public final boolean i(dec dec, dec dec2) {
        this.Y.W(dec.h(), dec2.h());
        return true;
    }

    public final void j(dec dec, int i) {
        if (i != 0 && (dec instanceof g77)) {
            ((x9f) ((y9f) ((g77) dec)).a).animate().translationZ(fk4.d().getDisplayMetrics().density * 20.0f);
        }
    }
}
