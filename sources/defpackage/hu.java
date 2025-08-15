package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: hu  reason: default package */
public final class hu extends th0 {
    public final long[] X;
    public final long Y;

    public hu(long j, int i, long[] jArr, long j2) {
        super(j, i);
        this.X = jArr;
        this.Y = j2;
    }

    public final byte[] f() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = b.p(this.o);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.X;
        assetsListModify.modifyTime = this.Y;
        return qw8.toByteArray(assetsListModify);
    }

    public final iua getType() {
        return iua.TYPE_ASSETS_LIST_MODIFY;
    }

    public final dle i() {
        au auVar = new au((sla) null, 3);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.X;
            if (jArr != null) {
                auVar.p("type", au1.d(i));
                auVar.h("ids", jArr);
                long j = this.Y;
                if (j >= 0) {
                    auVar.i(j, "updateTime");
                }
                return auVar;
            }
            throw new IllegalArgumentException("ids must not be null");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(gle gle) {
        iu iuVar = (iu) gle;
        pl plVar = null;
        if (iuVar.c) {
            v(iuVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new pi0(this.a));
            return;
        }
        g(new pke("asset.task.failed", "failed to modify asset list", (String) null));
    }
}
