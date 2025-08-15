package defpackage;

import android.content.Context;
import android.text.Spannable;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: pb6  reason: default package */
public final class pb6 {
    public final je7 a;
    public final je7 b;

    public pb6(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final CharSequence a(String str, List list) {
        ida ida = (ida) this.a.getValue();
        Pattern pattern = bre.a;
        if (!oag.t(str)) {
            str = bre.i.matcher(str).replaceAll("\n");
        }
        Spannable l = qx7.l(kp.z(ida.a(ida.k(ida.j.e(str), list, true, (int) (ck4.e(i4f.f.g(du4.b)) * fk4.d().getDisplayMetrics().density), true), false, false, false, true, list, true)), qp4.u0.b((Context) this.b.getValue()).i().a().d(true).d.b, 24);
        return l == null ? "" : l;
    }
}
