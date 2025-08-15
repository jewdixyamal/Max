package defpackage;

import android.content.Context;

/* renamed from: id2  reason: default package */
public final class id2 extends mw7 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id2(int i, int i2, Object obj) {
        super(i);
        this.g = i2;
        this.h = obj;
    }

    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                e52 e52 = ((gd2) obj).a;
                es8 es8 = e52.c;
                if (es8 == null) {
                    return null;
                }
                return ((ld2) this.h).e(e52, es8, 2, false);
            case 1:
                kpa kpa = (kpa) obj;
                return new tc0(j5a.a, oag.a((CharSequence) kpa.a, (Long) kpa.b), qp4.u0.b((Context) this.h).i());
            default:
                return null;
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 2:
                fdf fdf = (fdf) obj3;
                fdf fdf2 = (fdf) obj2;
                String str = (String) obj;
                gdf gdf = (gdf) this.h;
                if (z) {
                    String str2 = gdf.e;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        us7 us7 = us7.X;
                        long j = fdf2.b;
                        String str3 = fdf2.a;
                        int g2 = gdf.s.g();
                        boolean b = fdf2.c.b();
                        StringBuilder j2 = z7b.j("Player autoplay. State evicted, should free player, \n                                |msgId:", j, ", \n                                |attachId:", str3);
                        j2.append("\n                                |states count:");
                        j2.append(g2);
                        j2.append("\n                                |playing:");
                        j2.append(b);
                        ir6.d(us7, str2, x9e.c0(j2.toString()), (Throwable) null);
                    }
                    fdf2.o.a(fdf2.c);
                    cmf cmf = (cmf) fdf2.Y.get();
                    if (cmf != null) {
                        cmf.u();
                        return;
                    }
                    return;
                }
                gdf.getClass();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public id2(ld2 ld2) {
        super(500);
        this.g = 0;
        this.h = ld2;
    }
}
