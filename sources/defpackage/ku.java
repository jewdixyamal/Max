package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ku  reason: default package */
public final class ku extends th0 {
    public final long X;
    public final long Y;
    public final int Z;

    public ku(long j, int i, long j2, long j3, int i2) {
        super(j, i);
        this.X = j2;
        this.Y = j3;
        this.Z = i2;
    }

    public final byte[] f() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = b.p(this.o);
        assetsMove.id = this.X;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.Y;
        assetsMove.position = this.Z;
        return qw8.toByteArray(assetsMove);
    }

    public final iua getType() {
        return iua.TYPE_ASSETS_MOVE;
    }

    public final dle i() {
        au auVar = new au((sla) null, 4);
        int i = this.o;
        if (i != 0) {
            long j = this.X;
            if (j != 0) {
                long j2 = this.Y;
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                int i3 = this.Z;
                if (i2 > 0 || i3 >= 0) {
                    auVar.p("type", au1.d(i));
                    auVar.i(j, "id");
                    if (i2 > 0) {
                        auVar.i(j2, "prevId");
                    } else {
                        auVar.e(i3, "position");
                    }
                    return auVar;
                }
                throw new IllegalArgumentException("prevId or position must be set");
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(gle gle) {
        lu luVar = (lu) gle;
        pl plVar = null;
        if (luVar.c) {
            v(luVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new pi0(this.a));
            return;
        }
        g(new pke("asset.task.failed", "failed to move asset", (String) null));
    }
}
