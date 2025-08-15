package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: sc5  reason: default package */
public final class sc5 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final xpb Z = new xpb();
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final ml0 s0 = ml0.z(Collections.emptyList());
    public final hc3 t0 = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [hc3, java.lang.Object] */
    public sc5(je7 je7, je7 je72, je7 je73, khe khe, khe khe2, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.Y = je73;
        this.c = khe;
        this.o = khe2;
        this.X = je74;
    }

    public final void a() {
        hm9.m("sc5", "clear: ", new Object[0]);
        dd5 dd5 = (dd5) this.Y.getValue();
        dd5.getClass();
        hm9.m("dd5", "cancelRequests: ", new Object[0]);
        dd5.f.clear();
        dd5.g.d();
        this.t0.d();
        nd7.U(new qa3(b(), 2, new nc5(4)).l(), ft.e, new nc5(5), new fa4(2));
        this.s0.e(Collections.emptyList());
    }

    public final q1a b() {
        je7 je7 = this.a;
        Objects.requireNonNull(je7);
        return new q1a(2, new l5(4, je7));
    }

    public final void c(long j) {
        long j2 = j;
        hm9.m("sc5", "loadFromMarker: marker=%d", Long.valueOf(j));
        dd5 dd5 = (dd5) this.Y.getValue();
        dd5.getClass();
        au auVar = r1;
        au auVar2 = new au(0, "FAVORITE_STICKER_SETS", j, 50, (String) null);
        drd K = ((k4a) dd5.a).K(auVar, dd5.c);
        fme fme = dd5.b;
        fme.getClass();
        za3 k = new qa3(new rqd(K.j(new dme(fme, 1, 0)).h(new gd1(12, gu.class)).h(new nc5(12)), new kc5(this, 5), 2).h(new nc5(6)), 2, new kc5(this, 6)).k((ztc) this.o.getValue());
        iq1 iq1 = new iq1(new c10(j2, 17), 0, new mc5(j2, 1));
        k.i(iq1);
        this.t0.a(iq1);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [long[], java.io.Serializable] */
    public final db3 d(long j, boolean z) {
        za3 za3;
        hm9.m("sc5", "markAsFavorite: setId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
        qa3 qa3 = new qa3(z ? new qa3(new uqd(b(), new nc5(3), 0), 2, new kc5(this, 4)) : wa3.a, 0, new qa3(b(), 2, new bc5(1, j, z)));
        je7 je7 = this.Y;
        if (z) {
            dd5 dd5 = (dd5) je7.getValue();
            dd5.getClass();
            za3 = new qa3(new oqd(new zc5(dd5, j, 0), 0).h(new gd1(12, cu.class)), 2, new nc5(13)).k(dd5.d);
        } else {
            dd5 dd52 = (dd5) je7.getValue();
            dd52.getClass();
            za3 = new qa3(new oqd(new bd5(dd52, new long[]{j}, 0), 0).h(new gd1(12, pu.class)), 2, new nc5(15)).k(dd52.d);
        }
        return new qa3(qa3, 0, za3).f(new oc5(0, j, z)).g(new bc5(2, j, z));
    }

    public final void e(ArrayList arrayList) {
        List list;
        List<m3e> list2 = (List) this.s0.A();
        if (!nd7.D(list2)) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list2) {
                    try {
                        if (arrayList.contains(Long.valueOf(((m3e) next).a))) {
                            arrayList2.add(next);
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                list = arrayList2;
            } else {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(list2.size());
                for (m3e m3e : list2) {
                    try {
                        arrayList3.add(Long.valueOf(m3e.a));
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
                this.Z.e(arrayList3);
            }
        }
    }

    public final void f() {
        hm9.m("sc5", "reloadFavoritesFromServer: ", new Object[0]);
        ((hyc) ((zle) this.X.getValue()).a).l("user.favoritesLastSync", 0L);
        h(0);
    }

    public final void g(long j) {
        hm9.m("sc5", "setSectionUpdateTime: %d", Long.valueOf(j));
        ((hyc) ((zle) this.X.getValue()).a).l("user.favorites.stickerSets.updateTime", Long.valueOf(j));
    }

    public final void h(long j) {
        dd5 dd5 = (dd5) this.Y.getValue();
        dd5.getClass();
        hm9.m("dd5", "assetsUpdate: request, sync=%d", Long.valueOf(j));
        za3 k = new qa3(dd5.e.a(y53.M(iua.TYPE_ASSETS_ADD, iua.TYPE_ASSETS_REMOVE, iua.TYPE_ASSETS_MOVE, iua.TYPE_ASSETS_LIST_MODIFY)), 0, new sa3(1, new i82(dd5, j, 2))).k(dd5.c);
        iq1 iq1 = new iq1(new c10(j, 18), 0, new mc5(j, 2));
        k.i(iq1);
        dd5.g.a(iq1);
    }

    public final void i() {
        long j = ((hyc) ((zle) this.X.getValue()).a).g.getLong("user.favoritesLastSync", 0);
        hm9.m("sc5", "updateFavoritesFromServerFromLastSync: last sync =%d", Long.valueOf(j));
        h(j);
    }
}
