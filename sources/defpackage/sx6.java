package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.HashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sx6  reason: default package */
public final class sx6 extends ckc {
    public final /* synthetic */ int b;

    public /* synthetic */ sx6(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r9v21, types: [tk7, java.lang.Object] */
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new lu0(v4Var.d(r79.class));
            case 1:
                return (ch9) v4Var.c(uh9.class);
            case 2:
                Resources resources = (Resources) v4Var.c(Resources.class);
                return new Object();
            case 3:
                return new xe5(v4Var.d(ri4.class), v4Var.d(f5a.class), v4Var.d(ds3.class), v4Var.d(q33.class), v4Var.d(y7d.class), v4Var.d(Context.class));
            case 4:
                return new d80(v4Var.d(ad.class), v4Var.d(q33.class), v4Var.d(an9.class));
            case 5:
                Context context = (Context) v4Var.c(Context.class);
                va4 va4 = new va4();
                synchronized (va4) {
                    va4.a = true;
                }
                oc4 oc4 = new oc4(context, va4);
                q24 l68 = new l68(v4Var);
                oc4.b = l68;
                od odVar = oc4.a;
                if (l68 != ((q24) odVar.X)) {
                    odVar.X = l68;
                    ((HashMap) odVar.c).clear();
                    ((HashMap) odVar.o).clear();
                }
                return oc4;
            case 6:
                return new jb4();
            case 7:
                return new so4((Context) v4Var.c(Context.class), (e34) v4Var.c(wxd.class), (gw0) v4Var.c(spd.class), (q24) v4Var.c(jb4.class), ((iba) v4Var.c(iba.class)).c());
            case 8:
                return new spd(new File(au1.g(((Context) v4Var.c(Context.class)).getCacheDir().getAbsolutePath(), "/media")), new te7(mz7.a0(new kpa(ub8.X, 524288000L), new kpa(ub8.c, 52428800L))), (e34) v4Var.c(wxd.class), false);
            case 9:
                return new do8((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 10:
                return new pc4(v4Var.d(u7b.class), v4Var.d(q33.class), v4Var.d(y7b.class));
            case 11:
                return new o29(v4Var);
            case Protos.Attaches.Attach.PRESENT:
                return new Object();
            case 13:
                return new o89(v4Var.d(kke.class), v4Var.d(s8g.class), v4Var.d(xb6.class), v4Var.d(x19.class), v4Var.d(dc6.class));
            case Protos.Attaches.Attach.LOCATION:
                return new kaa((Context) v4Var.c(Context.class), (p84) v4Var.c(p84.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new ji(new fi(), (Context) v4Var.c(Context.class));
            case 16:
                ? obj = new Object();
                obj.a = "https";
                obj.b = "max";
                obj.c = "api.oneme.ru";
                obj.d = "443";
                obj.e = "max.ru";
                obj.f = "api-test.oneme.ru";
                obj.g = "api-tg.oneme.ru";
                obj.h = "api";
                obj.i = "chat";
                obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.l = "joincall";
                obj.m = "u";
                obj.n = "stickerset";
                obj.o = "startapp";
                obj.p = ":folder";
                return new fl7(obj);
            case LangUtils.HASH_SEED:
                return new lca((Context) v4Var.c(Context.class), v4Var.d(al.class));
            case 18:
                return new l6a(v4Var);
            case 19:
                return (b99) v4Var.c(zke.class);
            case 20:
                return new i8a((kke) v4Var.c(kke.class), v4Var.d(gj.class), (ox3) v4Var.c(ox3.class));
            case 21:
                return new d8a(v4Var.d(wxc.class));
            case 22:
                return new dc6(v4Var.d(ida.class), v4Var.d(iy2.class), v4Var.d(ad.class));
            case 23:
                return new dv4(v4Var.d(dc6.class), v4Var.d(r79.class), v4Var.d(kke.class), v4Var.d(s8g.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new sy5(v4Var.d(s8g.class), v4Var.d(xb6.class), v4Var.d(dc6.class));
            case 25:
                return new bz5(v4Var.d(xb6.class), v4Var.d(s8g.class), v4Var.d(dc6.class));
            case 26:
                return new xb6(v4Var.d(kke.class), v4Var.d(iy2.class), v4Var.d(tp7.class), v4Var.d(q33.class));
            case 27:
                return new n8c((Context) v4Var.c(Context.class));
            case 28:
                return new tda(v4Var.d(m7b.class), v4Var.d(kk5.class), v4Var.d(kaa.class), v4Var.d(gt9.class), (Context) v4Var.c(Context.class));
            default:
                return new Object();
        }
    }
}
