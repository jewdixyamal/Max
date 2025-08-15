package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: b7g  reason: default package */
public final class b7g extends Binder {
    public final fd7 c;

    public b7g(fd7 fd7) {
        this.c = fd7;
    }

    public final void a(c7g c7g) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Intent intent = c7g.a;
            f25 f25 = (f25) this.c.a;
            f25.getClass();
            qne qne = new qne();
            f25.a.execute(new v05((Object) f25, (Object) intent, (Object) qne, 2));
            qne.a.b(new cs(2), new gte(20, (Object) c7g));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
