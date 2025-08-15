package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: by8  reason: default package */
public final class by8 {
    public final e52 a;
    public final es8 b;
    public final je7 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public by8(e52 e52, es8 es8, khe khe) {
        this.a = e52;
        this.b = es8;
        this.c = khe;
    }

    public final Layout a() {
        return (Layout) this.c.getValue();
    }

    public final void b(Layout layout) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            dy8 dy8 = (dy8) ((ay8) it.next());
            dy8.getClass();
            if (Looper.getMainLooper().isCurrentThread()) {
                dy8.setLayout(this);
            } else {
                Handler handler = dy8.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new h76(dy8, 12, this));
                } else {
                    dy8.post(new i76((Object) dy8, 10, (Object) this));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by8)) {
            return false;
        }
        by8 by8 = (by8) obj;
        if (a() != by8.a()) {
            return false;
        }
        Long l = null;
        e52 e52 = this.a;
        Long valueOf = e52 != null ? Long.valueOf(e52.a) : null;
        e52 e522 = by8.a;
        if (e522 != null) {
            l = Long.valueOf(e522.a);
        }
        return tpa.f(valueOf, l) && this.b.a.b == by8.b.a.b;
    }

    public final int hashCode() {
        e52 e52 = this.a;
        Long valueOf = e52 != null ? Long.valueOf(e52.a) : null;
        return a().hashCode() + h4f.m((valueOf != null ? valueOf.hashCode() : 0) * 31, 31, this.b.a.b);
    }
}
