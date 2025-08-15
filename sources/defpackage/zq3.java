package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.logout.a;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zq3  reason: default package */
public final class zq3 implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq3(int i) {
        this.a = i;
    }

    public final Object a(v4 v4Var) {
        v4 v4Var2 = v4Var;
        switch (this.a) {
            case 0:
                return new lr3(0, v4Var2.d(y7d.class));
            case 1:
                return new jqd((Context) v4Var2.c(Context.class), v4Var2.d(f64.class));
            case 2:
                q33 q33 = (q33) v4Var2.c(q33.class);
                eqe eqe = new eqe(m0c.oneme_settings_iar_time_condition);
                f fVar = new f(1, q33, q33.class, "setDisableInAppReviewTimeCondition", "setDisableInAppReviewTimeCondition(Z)V", 0, 15);
                return new hp7(eqe, new e11(0, q33, q33.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z", 0, 20), fVar, 0, 24);
            case 3:
                q33 q332 = (q33) v4Var2.c(q33.class);
                eqe eqe2 = new eqe(m0c.oneme_settings_iar_market_build_condition);
                f fVar2 = new f(1, q332, q33.class, "setEnableInAppReviewNotFromMarketBuild", "setEnableInAppReviewNotFromMarketBuild(Z)V", 0, 16);
                return new hp7(eqe2, new e11(0, q332, q33.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z", 0, 21), fVar2, 0, 24);
            case 4:
                q33 q333 = (q33) v4Var2.c(q33.class);
                eqe eqe3 = new eqe(m0c.oneme_settings_web_app_ssl);
                f fVar3 = new f(1, q333, q33.class, "setDisableWebAppSsl", "setDisableWebAppSsl(Z)V", 0, 17);
                return new hp7(eqe3, new e11(0, q333, q33.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z", 0, 22), fVar3, 0, 24);
            case 5:
                return new f11(1);
            case 6:
                return new ie8(1);
            case 7:
                return new d07(v4Var2.d(Context.class), v4Var2.d(q33.class), v4Var2.d(ri4.class), v4Var2.d(x6a.class));
            case 8:
                return new d7d(v4Var2.d(f64.class), (q33) v4Var2.c(q33.class));
            case 9:
                return new qkd(v4Var2.d(Context.class), v4Var2.d(kke.class));
            case 10:
                return new oi4();
            case 11:
                return new ate(v4Var2.d(kke.class));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new ij6(v4Var2.d(Context.class), v4Var2.d(kk5.class), v4Var2.d(kke.class), v4Var2.d(wha.class));
            case 13:
                return new dd(v4Var2.d(wha.class), v4Var2.d(js7.class), 0);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new dd(v4Var2.d(p82.class), v4Var2.d(cea.class), 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return gh5.b;
            case 16:
                return new ie8(2);
            case LangUtils.HASH_SEED /*17*/:
                return new ie8(3);
            case 18:
                khe d = v4Var2.d(hp.class);
                khe d2 = v4Var2.d(are.class);
                khe d3 = v4Var2.d(q33.class);
                khe d4 = v4Var2.d(kke.class);
                khe d5 = v4Var2.d(Context.class);
                khe d6 = v4Var2.d(zu8.class);
                v4Var2.d(iy2.class);
                return new kz(d, d2, d3, d4, d5, d6, v4Var2.d(ak3.class), v4Var2.d(ida.class));
            case 19:
                return je6.a;
            case 20:
                return new ie8(4);
            case 21:
                cy6 cy6 = (cy6) v4Var2.c(cy6.class);
                cy6.getClass();
                if (((f5a) tx6.a.getAccessor().c(f5a.class)).d()) {
                    return cy6.c;
                }
                cy6.c = null;
                return null;
            case 22:
                return new wa9((eca) v4Var2.c(eca.class), (kke) v4Var2.c(kke.class), (a) v4Var2.c(a.class), v4Var2.d(nob.class), v4Var2.d(io0.class));
            case 23:
                return (qu2) v4Var2.c(wa9.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new ie8(5);
            case 25:
                return new ib6(v4Var2.d(ds3.class), v4Var2.d(b9a.class));
            case 26:
                return new oc6(v4Var2.d(Context.class), v4Var2.d(blb.class), v4Var2.d(kk5.class), v4Var2.d(y7d.class), v4Var2.d(kke.class), v4Var2.d(q33.class));
            case 27:
                return new ie8(6);
            case 28:
                return new Object();
            default:
                return new vj7(v4Var2.d(el3.class), v4Var2.d(p82.class), v4Var2.d(iy2.class), v4Var2.d(fl7.class), v4Var2.d(pk.class), v4Var2.d(au8.class), v4Var2.d(kke.class), v4Var2.d(hc2.class), v4Var2.d(gc2.class), v4Var2.d(ki7.class), v4Var2.d(q33.class), v4Var2.d(qe5.class), v4Var2.d(n6a.class), v4Var2.d(f64.class), v4Var2.d(ab6.class), v4Var2.d(ta2.class), v4Var2.d(f5a.class));
        }
    }
}
