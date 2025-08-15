package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: k6a  reason: default package */
public final class k6a implements pi4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final q0e i = r0e.a(e());

    public k6a(v4 v4Var) {
        this.a = v4Var.d(Context.class);
        this.b = v4Var.d(xie.class);
        this.c = v4Var.d(q33.class);
        this.d = v4Var.d(u8e.class);
        AtomicLong atomicLong = ei4.b;
        this.e = atomicLong.incrementAndGet();
        this.f = atomicLong.incrementAndGet();
        this.g = atomicLong.incrementAndGet();
        this.h = atomicLong.incrementAndGet();
    }

    public final j0e c() {
        return this.i;
    }

    public final void d(b54 b54) {
        long j = b54.a;
        if (ei4.a(j, this.e)) {
            String d2 = ((xie) this.b.getValue()).d();
            tpa.o((Context) this.a.getValue(), d2);
            hm9.m("PushToken", "Current pushToken: \"" + d2 + "\"", new Object[0]);
        } else if (ei4.a(j, this.f)) {
            try {
                j47.T(zd6.a, (lx3) null, (vx3) null, new j6a(this, (Continuation) null), 3);
            } catch (Throwable th) {
                hm9.l0("PushToken", "Refresh current token failed", th);
            }
        } else if (ei4.a(j, this.g)) {
            t33 t33 = (t33) f();
            t33.j("ok_push_disabled", !((t33) f()).G());
            t33.m = null;
            this.i.m((Object) null, e());
        } else if (ei4.a(j, this.h)) {
            ((hyc) f()).j("server.useTls", !((t33) f()).d("server.useTls", true));
            this.i.m((Object) null, e());
        }
    }

    public final List e() {
        String str;
        iqe iqe = new iqe("Скопировать Push token");
        String d2 = ((xie) this.b.getValue()).d();
        if (d2 == null || (str = "...".concat(w9e.Z0(10, d2))) == null) {
            str = "null";
        }
        return y53.M(new b54(this.e, iqe, 0, new iqe(str), (fp3) null, 20), new b54(this.f, new iqe("Обновить Push token"), 0, new iqe(((xe6) ((u8e) this.d.getValue())).f), (fp3) null, 20), new b54(this.g, new iqe("Показывать пуши из сокета"), 0, (jqe) null, new a54(!((t33) f()).G()), 12), new b54(this.h, new iqe("Использовать ssl"), 0, (jqe) null, new a54(((t33) f()).d("server.useTls", true)), 12));
    }

    public final q33 f() {
        return (q33) this.c.getValue();
    }
}
