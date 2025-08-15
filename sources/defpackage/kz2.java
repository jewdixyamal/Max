package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* renamed from: kz2  reason: default package */
public final class kz2 {
    public final Context a;
    public final u7b b;
    public final w7b c;

    public kz2(Context context, u7b u7b, w7b w7b) {
        this.a = context;
        this.b = u7b;
        this.c = w7b;
    }

    public final nn3 a(uj3 uj3) {
        CharSequence charSequence;
        uj3 uj32 = uj3;
        boolean z = false;
        int i = this.b.b(uj3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = uj32.p(kk0.b);
        if (uj3.k() != 0 || uj3.w()) {
            z = true;
        }
        if (z) {
            charSequence = null;
        } else {
            boolean z3 = uj32.Y;
            Context context = this.a;
            charSequence = z3 ? context.getString(dpc.F) : (!uj3.t() || !uj3.v()) ? uj3.t() ? context.getString(jpc.p) : this.c.b(uj32) : context.getString(jpc.O2);
        }
        long n = uj3.n();
        String d = uj3.d();
        if (d == null) {
            d = "";
        }
        return new nn3(n, d, bre.b(uj3.g()), Collections.singletonList(Long.valueOf(uj3.o())), charSequence, (CharSequence) null, p != null ? Uri.parse(p) : null, z2, uj3.u(), uj3.m(), false, (pua) null, 0, uj3.t(), 27648);
    }

    public final v8c b(uj3 uj3) {
        int i = this.b.b(uj3.n()).a;
        return new v8c(uj3.n(), uj3.e(), uj3.p(kk0.c), uj3.m(), i == 10 || i == 20 || i == 40, uj3.u(), false, 192);
    }
}
