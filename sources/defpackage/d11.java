package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: d11  reason: default package */
public final class d11 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ d11(int i) {
        this.b = i;
    }

    public final Object b(v4 v4Var) {
        v4 v4Var2 = v4Var;
        Class<ya1> cls = ya1.class;
        Class<fw3> cls2 = fw3.class;
        Class<xb9> cls3 = xb9.class;
        Class<bt1> cls4 = bt1.class;
        Class<tg1> cls5 = tg1.class;
        Class<y7d> cls6 = y7d.class;
        Class<q33> cls7 = q33.class;
        Class<iy2> cls8 = iy2.class;
        Class<ida> cls9 = ida.class;
        Class<ld2> cls10 = ld2.class;
        Class<jr1> cls11 = jr1.class;
        Class<kr1> cls12 = kr1.class;
        Class<Context> cls13 = Context.class;
        Class<kke> cls14 = kke.class;
        Class<tm3> cls15 = tm3.class;
        switch (this.b) {
            case 0:
                return new l31((jr1) v4Var2.c(cls11), v4Var2.d(cls8), v4Var2.d(pk.class), v4Var2.d(cs1.class), v4Var2.d(cls9), v4Var2.d(cls14), v4Var2.d(el3.class), v4Var2.d(cls15), v4Var2.d(cls3));
            case 1:
                return new Object();
            case 2:
                return new jr1(v4Var2.d(cls14), v4Var2.d(ox3.class));
            case 3:
                return new vvc(v4Var2.d(cls2), v4Var2.d(cls11), v4Var2.d(ez0.class), v4Var2.d(cls4), (so1) v4Var2.c(so1.class), v4Var2.d(cls15));
            case 4:
                return new lkc(v4Var2.d(cls13), v4Var2.d(cls6));
            case 5:
                return new vs1(v4Var2.d(cls13), v4Var2.d(bea.class), v4Var2.d(p84.class), v4Var2.d(cls14), v4Var2.d(cls));
            case 6:
                return new qs1(v4Var2.d(vs1.class), v4Var2.d(cls), v4Var2.d(lqf.class));
            case 7:
                return new xuc(v4Var2.d(cls2));
            case 8:
                return new so1(v4Var2.d(cls14), v4Var2.d(ds3.class), v4Var2.d(cls7), v4Var2.d(cls3), v4Var2.d(blb.class));
            case 9:
                v4Var2.d(cls13);
                return new cb5(v4Var2.d(cls11), v4Var2.d(cls14), v4Var2.d(cls5), v4Var2.d(aa1.class), v4Var2.d(cls12));
            case 10:
                return new ba1(v4Var2.d(cls13), v4Var2.d(os1.class));
            case 11:
                return new q71(v4Var2.d(cls12), v4Var2.d(lkc.class));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new ty0(v4Var2.d(cls12), v4Var2.d(eua.class), v4Var2.d(cls4));
            case 13:
                return new ya1(v4Var2.d(Application.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                n31 n31 = n31.a;
                kr1 d = n31.d();
                zi1 zi1 = zi1.a;
                os1 c = n31.c();
                je7 je7 = yi1.a;
                return new l91(d, (nb5) zi1.getAccessor().c(nb5.class), (z01) n31.getAccessor().c(z01.class), c, zi1.getAccessor().d(cls5), zi1.getAccessor().d(q71.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new Object();
            case 16:
                return new vaa(v4Var2.d(o45.class), v4Var2.d(au8.class), v4Var2.d(cls6));
            case LangUtils.HASH_SEED /*17*/:
                return new vd2(v4Var2);
            case 18:
                return new jt2((q33) v4Var2.c(cls7));
            case 19:
                khe d2 = v4Var2.d(cls9);
                v4Var2.d(kr2.class);
                khe d3 = v4Var2.d(mz6.class);
                khe d4 = v4Var2.d(t00.class);
                khe d5 = v4Var2.d(are.class);
                v4Var2.d(x6a.class);
                khe d6 = v4Var2.d(ak3.class);
                v4Var2.d(cls8);
                return new ld2((Context) v4Var2.c(cls13), d2, d3, d4, d5, d6, (kke) v4Var2.c(cls14), v4Var2.d(ty3.class), new ot2(v4Var2, 1));
            case 20:
                return (lr2) v4Var2.c(cls10);
            case 21:
                return (d4f) v4Var2.c(cls10);
            case 22:
                return new rt2(v4Var2);
            case 23:
                return new nba((ta2) v4Var2.c(ta2.class), (kke) v4Var2.c(cls14), (yu2) v4Var2.c(yu2.class), (av0) v4Var2.c(av0.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new fx7(((w9a) ((kke) sd3.i.getValue())).c());
            case 25:
                return new qqd(0, (Object) ((w9a) ((kke) sd3.i.getValue())).e());
            case 26:
                return new p94(((w9a) ((kke) sd3.i.getValue())).a());
            case 27:
                return (iba) sd3.f.getValue();
            case 28:
                return (hle) sd3.g.getValue();
            default:
                return (kke) sd3.i.getValue();
        }
    }
}
