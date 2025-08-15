package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: av  reason: default package */
public final /* synthetic */ class av implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;

    public /* synthetic */ av(tf2 tf2, int i) {
        this.a = i;
        this.b = tf2;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                this.b.t0.c();
                return;
            case 1:
                tf2 tf2 = this.b;
                hm9.p(tf2.a, "loadPrev: exception", th);
                tf2.Y.a(new HandledException(th));
                return;
            case 2:
                this.b.s0.c();
                return;
            default:
                tf2 tf22 = this.b;
                hm9.p(tf22.a, "load: exception", th);
                tf22.Y.a(new HandledException(th));
                return;
        }
    }
}
