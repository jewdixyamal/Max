package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: nu  reason: default package */
public final class nu extends th0 {
    public final long[] X;

    public nu(int i, long j, long[] jArr) {
        super(j, i);
        this.X = jArr;
    }

    public final byte[] f() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = b.p(this.o);
        assetsRemove.ids = this.X;
        assetsRemove.requestId = this.a;
        return qw8.toByteArray(assetsRemove);
    }

    public final iua getType() {
        return iua.TYPE_ASSETS_REMOVE;
    }

    public final dle i() {
        au auVar = new au((sla) null, 5);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.X;
            if (jArr == null || jArr.length == 0) {
                throw new IllegalArgumentException("ids must not be null or empty");
            }
            auVar.p("type", au1.d(i));
            auVar.h("ids", jArr);
            return auVar;
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(gle gle) {
        ou ouVar = (ou) gle;
        pl plVar = null;
        if (ouVar.c) {
            v(ouVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new pi0(this.a));
            return;
        }
        g(new pke("asset.task.failed", "failed to remove asset", (String) null));
    }
}
