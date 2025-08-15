package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* renamed from: g16  reason: default package */
public final class g16 implements ug7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ q16 b;
    public final /* synthetic */ gh7 c;
    public final /* synthetic */ c o;

    public g16(c cVar, String str, q16 q16, gh7 gh7) {
        this.o = cVar;
        this.a = str;
        this.b = q16;
        this.c = gh7;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        Bundle bundle;
        eg7 eg72 = eg7.ON_START;
        c cVar = this.o;
        String str = this.a;
        if (eg7 == eg72 && (bundle = (Bundle) cVar.l.get(str)) != null) {
            this.b.b(str, bundle);
            cVar.l.remove(str);
        }
        if (eg7 == eg7.ON_DESTROY) {
            this.c.f(this);
            cVar.m.remove(str);
        }
    }
}
