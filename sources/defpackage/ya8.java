package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;

/* renamed from: ya8  reason: default package */
public final class ya8 {
    public String a;
    public Uri b;
    public String c;
    public za8 d;
    public s74 e;
    public List f;
    public String g;
    public zw6 h;
    public xa8 i;
    public Object j;
    public long k;
    public gd8 l;
    public fb8 m;
    public lb8 n;

    public final tb8 a() {
        ib8 ib8;
        s74 s74 = this.e;
        fm9.k(((Uri) s74.e) == null || ((UUID) s74.d) != null);
        Uri uri = this.b;
        eb8 eb8 = null;
        if (uri != null) {
            s74 s742 = this.e;
            if (((UUID) s742.d) != null) {
                eb8 = s742.a();
            }
            ib8 = new ib8(uri, this.c, eb8, this.i, this.f, this.g, this.h, this.j, this.k);
        } else {
            ib8 = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        db8 c2 = this.d.c();
        hb8 a2 = this.m.a();
        gd8 gd8 = this.l;
        if (gd8 == null) {
            gd8 = gd8.J;
        }
        return new tb8(str2, c2, ib8, a2, gd8, this.n);
    }

    public final void b(bb8 bb8) {
        this.d = bb8.a();
    }
}
