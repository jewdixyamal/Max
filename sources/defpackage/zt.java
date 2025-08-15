package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: zt  reason: default package */
public final class zt extends th0 {
    public final long X;

    public zt(int i, long j, long j2) {
        super(j, i);
        this.X = j2;
    }

    public final byte[] f() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = b.p(this.o);
        assetsAdd.id = this.X;
        assetsAdd.requestId = this.a;
        return qw8.toByteArray(assetsAdd);
    }

    public final iua getType() {
        return iua.TYPE_ASSETS_ADD;
    }

    public final dle i() {
        au auVar = new au((sla) null, 0);
        int i = this.o;
        if (i != 0) {
            long j = this.X;
            if (j != 0) {
                auVar.p("type", au1.d(i));
                auVar.i(j, "id");
                return auVar;
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(gle gle) {
        bu buVar = (bu) gle;
        pl plVar = null;
        if (buVar.c) {
            v(buVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new pi0(this.a));
            return;
        }
        g(new pke("asset.task.failed", "failed to add asset", (String) null));
    }
}
