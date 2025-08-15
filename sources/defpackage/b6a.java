package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.logging.Logger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b6a  reason: default package */
public final class b6a extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ b6a(int i) {
        this.b = i;
    }

    public final Object b(v4 v4Var) {
        v4 v4Var2 = v4Var;
        Class<av0> cls = av0.class;
        Class<f5a> cls2 = f5a.class;
        Class<pk> cls3 = pk.class;
        Class<n4b> cls4 = n4b.class;
        Class<n65> cls5 = n65.class;
        Class<o45> cls6 = o45.class;
        Class<zi5> cls7 = zi5.class;
        Class<ox3> cls8 = ox3.class;
        Class<iy2> cls9 = iy2.class;
        Class<t33> cls10 = t33.class;
        Class<q33> cls11 = q33.class;
        Class<Application> cls12 = Application.class;
        Class<kk5> cls13 = kk5.class;
        Class<kke> cls14 = kke.class;
        Class<np> cls15 = np.class;
        Class<Context> cls16 = Context.class;
        Class<hbd> cls17 = hbd.class;
        switch (this.b) {
            case 0:
                return (ox3) sd3.h.getValue();
            case 1:
                qec qec = new qec("^TTSession#.*$");
                return new uca((oca) v4Var2.c(cls15), new pca(y53.M(new qca("all-logs", (qec) null, qec, 0, 26), new qca("important-logs", qec, (qec) null, 2048, 12), new qca("missed-contacts", new qec("^MissedContactsController.*$"), (qec) null, 4096, 12), new qca("calls-sdk-logs", new qec("^CallsSdk.*$"), (qec) null, 4096, 12), new qca("analytics", new qec("^LogController.*$"), (qec) null, 8192, 12)), v4Var2.d(cls13), new ot2(v4Var2, 13), new ot2(v4Var2, 14)));
            case 2:
                Context context = (Context) v4Var2.c(cls16);
                Logger logger = zua.h;
                if (context != null) {
                    ey1 ey1 = new ey1(3, context.getAssets());
                    qc4 qc4 = new qc4(ey1);
                    return new zua(new imc(qc4.b, ey1, qc4.a), m6d.q());
                }
                throw new IllegalArgumentException("context could not be null.");
            case 3:
                Context context2 = (Context) v4Var2.c(cls16);
                v4Var2.d(au8.class);
                v4Var2.d(p82.class);
                v4Var2.d(cls17);
                v4Var2.d(zp.class);
                v4Var2.d(cls10);
                v4Var2.d(cls3);
                v4Var2.d(cls);
                v4Var2.d(cls13);
                ((x6a) v4Var2.c(x6a.class)).getClass();
                int i = ft4.o;
                ft4.e(z7.R(12, kt4.HOURS));
                v4Var2.d(haa.class);
                v4Var2.d(cls14);
                return new Object();
            case 4:
                return (ty3) v4Var2.c(cls15);
            case 5:
                return (cd) v4Var2.c(op.class);
            case 6:
                return new and((Context) v4Var2.c(cls16), v4Var2.d(cls2), v4Var2.d(cls9), v4Var2.d(cls8), v4Var2.d(cls11), v4Var2.d(cls14), v4Var2.d(al.class), v4Var2.d(gt9.class));
            case 7:
                return new gt9((Context) v4Var2.c(cls16), v4Var2.d(iv6.class));
            case 8:
                return new zf0((Context) v4Var2.c(cls16), (iy2) v4Var2.c(cls9), (ci0) v4Var2.c(ci0.class), (kke) v4Var2.c(cls14), (ox3) v4Var2.c(cls8));
            case 9:
                return new vh3((kke) v4Var2.c(cls14), (hbd) v4Var2.c(cls17));
            case 10:
                return ((Application) v4Var2.c(cls12)).getResources();
            case 11:
                return new qf7((av0) v4Var2.c(cls), (mz6) v4Var2.c(mz6.class), v4Var2.d(lr2.class), (kke) v4Var2.c(cls14));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new n6a(v4Var2);
            case 13:
                return new djc(v4Var2.d(s8g.class), v4Var2.d(jy8.class), (kke) v4Var2.c(cls14), (ox3) v4Var2.c(cls8));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new z4(((Context) v4Var2.c(cls16)).getString(yzb.account_auth_type));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ho9 ho9 = new ho9();
                ho9.a = Math.min(100, 50);
                Class<iba> cls18 = iba.class;
                ho9.d = ((iba) v4Var2.c(cls18)).c();
                ho9.b = ((iba) v4Var2.c(cls18)).a();
                ho9.c = (a) v4Var2.c(a.class);
                return new me3(ho9);
            case 16:
                return new jaa(v4Var2.d(cls2));
            case LangUtils.HASH_SEED /*17*/:
                return (h64) v4Var2.c(jaa.class);
            case 18:
                haa haa = new haa(v4Var2.d(qe5.class));
                haa.e = new r61(v4Var2);
                return haa;
            case 19:
                return new eua((Context) v4Var2.c(cls16), (acf) v4Var2.c(acf.class));
            case 20:
                return new rta((Application) v4Var2.c(cls12));
            case 21:
                return new rff((Context) v4Var2.c(cls16), v4Var2.d(ad.class), (q33) v4Var2.c(cls11), (pk) v4Var2.c(cls3), (zi5) v4Var2.c(cls7), (ief) v4Var2.c(ief.class), (kke) v4Var2.c(cls14), v4Var2.d(r79.class), v4Var2.d(cls9));
            case 22:
                return new y4b((Application) v4Var2.c(cls12), (o45) v4Var2.c(cls6), (n65) v4Var2.c(cls5), v4Var2.d(cls11), (n4b) v4Var2.c(cls4));
            case 23:
                return new jrd((Application) v4Var2.c(cls12), (o45) v4Var2.c(cls6), (n65) v4Var2.c(cls5), v4Var2.d(cls11), (n4b) v4Var2.c(cls4));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new n65((Context) v4Var2.c(cls16), v4Var2.d(gw0.class));
            case 25:
                kk5 kk5 = (kk5) ((zi5) v4Var2.c(cls7));
                kk5.getClass();
                return new spd(kk5.g(kk5.b(), "videoCache"), new se7(104857600), (e34) null, true);
            case 26:
                return new Object();
            case 27:
                return new n4b((y7d) v4Var2.c(y7d.class));
            case 28:
                return (hyc) v4Var2.c(cls10);
            default:
                return (q33) v4Var2.c(cls10);
        }
    }
}
