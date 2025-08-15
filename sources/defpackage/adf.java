package defpackage;

/* renamed from: adf  reason: default package */
public final /* synthetic */ class adf implements a66 {
    public final /* synthetic */ gdf a;
    public final /* synthetic */ fdf b;
    public final /* synthetic */ dkf c;
    public final /* synthetic */ gef o;

    public /* synthetic */ adf(gdf gdf, fdf fdf, dkf dkf, gef gef) {
        this.a = gdf;
        this.b = fdf;
        this.c = dkf;
        this.o = gef;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        cmf cmf;
        gdf gdf = this.a;
        fdf fdf = this.b;
        dkf dkf = this.c;
        gef gef = this.o;
        o00 o00 = (o00) obj;
        long longValue = ((Long) obj2).longValue();
        String str = fdf.a;
        if (o00 instanceof wgf) {
            String str2 = gdf.e;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                int g = gdf.s.g();
                boolean b2 = dkf.b();
                StringBuilder j = z7b.j("Player autoplay. stop autoplay to start a video message, \n                                |msgId:", longValue, ", \n                                |attachId:", str);
                j.append("\n                                |states count:");
                j.append(g);
                j.append("\n                                |playing:");
                j.append(b2);
                ir6.d(us7, str2, x9e.c0(j.toString()), (Throwable) null);
            }
            hm9.m(dkf.c, "Player. Clear", new Object[0]);
            u75 u75 = dkf.o;
            u75.w2();
            u75.p2((Object) null);
            u75.k2(0, 0);
            dkf.Y = null;
            dkf.Z = null;
            ((f4b) gdf.g.getValue()).a(dkf);
            fdf fdf2 = (fdf) gdf.s.e(str);
            if (!(fdf2 == null || (cmf = (cmf) fdf2.Y.get()) == null)) {
                cmf.u();
            }
            obj3 = new ddf(longValue, (wgf) o00);
        } else {
            obj3 = new cdf(longValue, str, o00, dkf.F0(), o00 instanceof vqd ? 0 : dkf.G0(), gef.c0());
        }
        gdf.c.invoke(obj3);
        return e5f.a;
    }
}
