package defpackage;

import android.net.Uri;

/* renamed from: l00  reason: default package */
public final class l00 extends dq7 {
    public die Y;

    public final void a() {
        super.a();
        die die = this.Y;
        if (die != null) {
            cqc.b((sd7) die.o);
        }
        this.Y = null;
    }

    public final void c() {
        Uri uri;
        p4d p4d = this.b;
        up7 up7 = this.X;
        awa e = p4d.e(up7);
        if (e == null) {
            uri = Uri.parse(up7.o);
        } else {
            uri = e.b;
            if (uri == null && (uri = e.a) == null) {
                uri = Uri.parse(up7.o);
            }
        }
        this.a.N(up7, uri, 0, e != null ? e.X : null);
    }
}
