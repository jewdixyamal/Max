package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: tn3  reason: default package */
public final class tn3 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tn3(Object obj, Continuation continuation, yn3 yn3) {
        super(2, continuation);
        this.X = obj;
        this.Y = yn3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tn3(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        CharSequence charSequence;
        od2.a0(obj);
        uj3 uj3 = (uj3) this.X;
        yn3 yn3 = this.Y;
        r7b b = ((u7b) yn3.e.getValue()).b(uj3.n());
        boolean e = ((u7b) yn3.e.getValue()).e(uj3.n());
        String p = uj3.p(kk0.b);
        if (uj3.k() != 0 || uj3.w()) {
            charSequence = null;
        } else {
            boolean z = uj3.Y;
            Context context = yn3.c;
            charSequence = z ? context.getString(dpc.F) : (!uj3.t() || !uj3.v()) ? uj3.t() ? context.getString(jpc.p) : ((w7b) yn3.f.getValue()).b(uj3) : context.getString(jpc.O2);
        }
        long n = uj3.n();
        String d = uj3.d();
        if (d != null) {
            return new nn3(n, d, bre.b(uj3.g()), Collections.singletonList(new Long(uj3.o())), charSequence, (CharSequence) null, p != null ? Uri.parse(p) : null, e, uj3.u(), uj3.m(), uj3.Y, (pua) null, b.b, uj3.t(), 14336);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
