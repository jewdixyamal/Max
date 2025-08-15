package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: gp7  reason: default package */
public final class gp7 implements nte {
    public final Executor a;
    public final y7g b;
    public final ContentResolver c;

    public gp7(Executor executor, y7g y7g, ContentResolver contentResolver) {
        this.a = executor;
        this.b = y7g;
        this.c = contentResolver;
    }

    public final void a(fi0 fi0, eab eab) {
        oj0 oj0 = (oj0) eab;
        hab hab = oj0.c;
        oj0.h("local", "exif");
        ep7 ep7 = new ep7(this, fi0, hab, eab, oj0.a);
        oj0.a(new fp7(ep7, 0));
        this.a.execute(ep7);
    }

    public final boolean b(jic jic) {
        return tu0.p(512, 512, jic);
    }
}
