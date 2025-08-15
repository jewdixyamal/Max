package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: md5  reason: default package */
public final class md5 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;
    public final hc3 h = new Object();
    public final xpb i = new xpb();
    public final ml0 j = ml0.z(Collections.emptyList());

    /* JADX WARNING: type inference failed for: r0v0, types: [hc3, java.lang.Object] */
    public md5(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
        this.e = rm45;
        this.f = rm46;
        this.g = rm47;
    }

    public final e0a a() {
        ml0 ml0 = this.j;
        ml0.getClass();
        return new e0a(new mz9(ml0, 0), new nc5(23), 3);
    }

    public final void b(long j2) {
        hm9.m("md5", "loadFromMarker: marker=%d", Long.valueOf(j2));
        hd5 hd5 = (hd5) this.g.get();
        hd5.getClass();
        drd K = ((k4a) hd5.a).K(new au(0, "FAVORITE_STICKERS", j2, 50, (String) null), hd5.c);
        fme fme = hd5.b;
        fme.getClass();
        za3 k = new qa3(new rqd(K.j(new dme(fme, 1, 0)).h(new gd1(12, gu.class)).h(new nc5(16)), new kd5(this, 5), 2).h(new nc5(24)), 2, new kd5(this, 6)).k((ztc) this.d.get());
        iq1 iq1 = new iq1(new c10(j2, 22), 0, new mc5(j2, 5));
        k.i(iq1);
        this.h.a(iq1);
    }

    public final void c() {
        hm9.m("md5", "reloadFavoritesFromServer: ", new Object[0]);
        ((hyc) ((q33) this.e.get())).l("user.favoritesLastSync", 0L);
        hd5 hd5 = (hd5) this.g.get();
        hd5.getClass();
        hm9.m("hd5", "assetsUpdate: request, sync=%d", 0L);
        za3 k = new qa3(hd5.e.a(y53.M(iua.TYPE_ASSETS_ADD, iua.TYPE_ASSETS_REMOVE, iua.TYPE_ASSETS_MOVE, iua.TYPE_ASSETS_LIST_MODIFY)), 0, new sa3(1, new i82(hd5))).k(hd5.c);
        iq1 iq1 = new iq1(new c10(), 0, new mc5());
        k.i(iq1);
        hd5.g.a(iq1);
    }

    public final db3 d(List list) {
        hm9.m("md5", "removeFromFavorites: ids=%s", list);
        return new qa3(new qa3(((hc5) this.a.get()).a(), 2, new z72(8, list)), 0, e(nd7.j(list))).f(new ic5(3, list)).g(new z72(16, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, long[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.za3 e(long[] r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = "md5"
            java.lang.String r2 = "removeFromFavorites: stickerIds=%s"
            defpackage.hm9.m(r1, r2, r0)
            rm4 r3 = r3.g
            java.lang.Object r3 = r3.get()
            hd5 r3 = (defpackage.hd5) r3
            r3.getClass()
            bd5 r0 = new bd5
            r1 = 1
            r0.<init>(r3, r4, r1)
            oqd r4 = new oqd
            r1 = 0
            r4.<init>(r0, r1)
            gd1 r0 = new gd1
            java.lang.Class<pu> r1 = defpackage.pu.class
            r2 = 12
            r0.<init>(r2, r1)
            uqd r4 = r4.h(r0)
            nc5 r0 = new nc5
            r1 = 17
            r0.<init>(r1)
            qa3 r1 = new qa3
            r2 = 2
            r1.<init>(r4, r2, r0)
            ztc r3 = r3.d
            za3 r3 = r1.k(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md5.e(long[]):za3");
    }

    public final void f(long j2) {
        hm9.m("md5", "setSectionUpdateTime: %d", Long.valueOf(j2));
        ((hyc) ((q33) this.e.get())).l("user.favorites.stickers.updateTime", Long.valueOf(j2));
    }
}
