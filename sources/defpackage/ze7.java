package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ze7  reason: default package */
public final class ze7 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ ze7(int i) {
        this.b = i;
    }

    public final Object b(v4 v4Var) {
        v4 v4Var2 = v4Var;
        switch (this.b) {
            case 0:
                o45 o45 = (o45) v4Var2.c(o45.class);
                ga4 ga4 = (ga4) v4Var2.c(ga4.class);
                return new sx4((Context) v4Var2.c(Context.class), (hle) v4Var2.c(hle.class), (tx4) v4Var2.c(ay4.class));
            case 1:
                return new vx4(v4Var2.d(t6b.class), v4Var2.d(p82.class), v4Var2.d(el3.class), v4Var2.d(hle.class), v4Var2.d(o45.class), v4Var2.d(sx4.class));
            case 2:
                v4Var2.d(b6d.class);
                kk5 kk5 = (kk5) v4Var2.c(kk5.class);
                return new tme((Context) v4Var2.c(Context.class), (p7b) v4Var2.c(p7b.class), (t7) v4Var2.c(t7.class), (t6b) v4Var2.c(t6b.class), (p82) v4Var2.c(p82.class), (el3) v4Var2.c(el3.class));
            case 3:
                khe d = v4Var2.d(b6d.class);
                v4Var2.d(ep.class);
                v4Var2.d(p7b.class);
                khe d2 = v4Var2.d(o45.class);
                khe d3 = v4Var2.d(au8.class);
                v4Var2.d(p82.class);
                return new f40((Context) v4Var2.c(Context.class), (av0) v4Var2.c(av0.class), d, (uh9) v4Var2.c(uh9.class), d2, d3, v4Var2.d(kke.class));
            case 4:
                return new d64((Context) v4Var2.c(Context.class), v4Var2.d(bea.class), v4Var2.d(p84.class), v4Var2.d(ida.class), v4Var2.d(p82.class), v4Var2.d(pd0.class), v4Var2.d(q33.class), new khe(new ot2(v4Var2, 5)));
            case 5:
                khe d4 = v4Var2.d(eqb.class);
                v4Var2.d(o44.class);
                return new c79(d4, v4Var2.d(rw9.class), v4Var2.d(qx9.class), v4Var2.a(qu7.class));
            case 6:
                return new wke((Context) v4Var2.c(Context.class), v4Var2.d(p82.class));
            case 7:
                return new m65((Context) v4Var2.c(Context.class), v4Var2.d(tke.class), v4Var2.d(hw0.class));
            case 8:
                kk5 kk52 = (kk5) ((zi5) v4Var2.c(zi5.class));
                kk52.getClass();
                return new rpd(kk5.g(kk52.b(), "videoCache"), new re7());
            case 9:
                return new og5(v4Var2.d(ad.class));
            case 10:
                return new lva(v4Var2.d(c34.class), v4Var2.d(pk.class), (av0) v4Var2.c(av0.class), v4Var2.d(m7b.class), new khe(new ot2(v4Var2, 6)), v4Var2.d(el3.class), v4Var2.d(ike.class), (o45) v4Var2.c(o45.class));
            case 11:
                return new oe3((Context) v4Var2.c(Context.class));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new bf7(v4Var, (Context) v4Var2.c(Context.class), ((iba) v4Var2.c(iba.class)).c(), new wmc(v4Var2, false), new khe(new ot2(v4Var2, 4)));
            case 13:
                kxc kxc = (kxc) ((hp) v4Var2.c(hp.class));
                return new zaa(od2.X(od2.F(od2.x(new t03(c37.c(kxc.i), 20)), ((w9a) ((kke) v4Var2.c(kke.class))).c().getImmediate()), j1e.a(pag.a().plus((lx3) (ox3) sd3.h.getValue())), wld.a, od2.d(kxc.e("app.extra.text.size.mode", 1))));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new jpb(v4Var2.d(Context.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ak3 ak3 = (ak3) v4Var2.c(ak3.class);
                return new Object();
            case 16:
                return new cq7(v4Var2.d(p4d.class), v4Var2.d(hle.class), v4Var2.d(oz.class));
            case LangUtils.HASH_SEED /*17*/:
                return new ef7(v4Var2);
            case 18:
                return new qra((Context) v4Var2.c(Context.class));
            case 19:
                return new yd((Context) v4Var2.c(Context.class), (qra) v4Var2.c(qra.class), (af7) v4Var2.c(af7.class));
            case 20:
                m7b m7b = (m7b) v4Var2.c(m7b.class);
                return new nr7((Context) v4Var2.c(Context.class), v4Var2.d(me6.class), v4Var2.d(oe6.class));
            case 21:
                return ex7.b;
            case 22:
                return new bt2((av0) v4Var2.c(av0.class), (kke) v4Var2.c(kke.class));
            case 23:
                return new uq0((yu2) v4Var2.c(yu2.class), (q33) v4Var2.c(q33.class), (bt2) v4Var2.c(bt2.class), (kke) v4Var2.c(kke.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new SQLiteOpenHelper(((Context) v4Var2.c(Context.class)).getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
            case 25:
                return new taa((Context) v4Var2.c(Context.class), v4Var2.d(so4.class), v4Var2.d(fx7.class), v4Var2.d(spd.class));
            case 26:
                return new n29(v4Var2);
            case 27:
                return (x54) v4Var2.c(haa.class);
            case 28:
                return new d6a(v4Var2);
            default:
                khe d5 = v4Var2.d(el3.class);
                v4Var2.d(p82.class);
                return new ida((Context) v4Var2.c(Context.class), (m7b) v4Var2.c(m7b.class), (tx4) v4Var2.c(tx4.class), new xs2(v4Var2.d(ty3.class)), (d6a) v4Var2.c(d6a.class), (o45) v4Var2.c(o45.class), d5, (are) v4Var2.c(are.class), (hda) v4Var2.c(hda.class), v4Var2.d(rj.class));
        }
    }
}
