package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.sdk.arch.Widget;

/* renamed from: kw5  reason: default package */
public final class kw5 extends p04 {
    public static final nd2 A0 = new nd2(11);
    public final uu3 w0;
    public final b x0;
    public final jw5 y0;
    public List z0 = nz4.a;

    public kw5(uu3 uu3, b bVar, jw5 jw5) {
        super(uu3, 0);
        this.w0 = uu3;
        this.x0 = bVar;
        this.y0 = jw5;
    }

    public final void E(znc znc, int i) {
        if (!znc.n()) {
            Widget e = this.y0.e(((av5) this.z0.get(i)).a, this.x0);
            e.setTargetController(this.w0);
            e.setRetainViewMode(tu3.b);
            znc.R(new coc(e, (String) null, (zu3) null, (zu3) null, false, -1));
        }
    }

    public final void M(List list) {
        if (!this.z0.isEmpty() || !(!list.isEmpty())) {
            wj4 e = lz7.e(new b81(1, this.z0, list));
            this.z0 = list;
            e.a(new y8((Object) this));
            return;
        }
        this.z0 = list;
        p(0, list.size());
    }

    public final int j() {
        return this.z0.size();
    }

    public final long k(int i) {
        av5 av5 = (av5) x53.j0(i, this.z0);
        String str = av5 != null ? av5.a : null;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
