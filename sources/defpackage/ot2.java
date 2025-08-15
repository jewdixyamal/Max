package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ot2  reason: default package */
public final class ot2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ ot2(v4 v4Var, int i) {
        this.a = i;
        this.b = v4Var;
    }

    public final Object invoke() {
        boolean z = false;
        Class<iba> cls = iba.class;
        Class<q33> cls2 = q33.class;
        Class<hle> cls3 = hle.class;
        v4 v4Var = this.b;
        switch (this.a) {
            case 0:
                return new tya(v4Var.d(cls2), v4Var.d(w7b.class), v4Var.d(u7b.class));
            case 1:
                return Long.valueOf(((hyc) ((q33) v4Var.c(cls2))).t());
            case 2:
                return (tmc) v4Var.c(tmc.class);
            case 3:
                return ((jle) ((hle) v4Var.c(cls3))).a();
            case 4:
                return new cf7(v4Var);
            case 5:
                return ((jle) ((hle) v4Var.c(cls3))).a();
            case 6:
                return ((jle) ((hle) v4Var.c(cls3))).a();
            case 7:
                mw0 mw0 = new mw0();
                mw0.a = (gw0) v4Var.c(spd.class);
                mw0.d = new h94((Context) v4Var.c(Context.class), (q24) v4Var.c(jb4.class));
                mw0.c = true;
                mw0.e = 2;
                return mw0;
            case 8:
                return ((k5c) v4Var.c(k5c.class)).a;
            case 9:
                return ((hq6) v4Var.c(hq6.class)).a;
            case 10:
                return ((iba) v4Var.c(cls)).c();
            case 11:
                iba iba = (iba) v4Var.c(cls);
                bc7[] bc7Arr = iba.p;
                return iba.h(iba.i(iba.b().a(5, "rlottie"), "rlottie"), "rlottie");
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (((vi4) v4Var.c(vi4.class)).compareTo(vi4.X) >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                qyc qyc = (qyc) ((y7d) v4Var.c(y7d.class));
                Integer num = (Integer) ((ml0) qyc.i.getValue()).A();
                return v44.a(num != null ? num.intValue() : (int) qyc.q(PmsKey.f28debugmode, (long) 0));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new z45(((w9a) ((kke) v4Var.c(kke.class))).d().f(1, "file-logging", 1, 5));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                iba iba2 = (iba) v4Var.c(cls);
                iba2.getClass();
                bc7 bc7 = iba.p[4];
                return iba2.e(iba2.j);
            case 16:
                hle hle = (hle) v4Var.c(cls3);
                hle.getClass();
                return ((jle) hle).a();
            case LangUtils.HASH_SEED /*17*/:
                return ((jle) ((hle) v4Var.c(cls3))).b();
            case 18:
                return (ScheduledExecutorService) ((iba) v4Var.c(cls)).l.getValue();
            case 19:
                return new uxc(v4Var);
            case 20:
                return ((jle) ((hle) v4Var.c(cls3))).a();
            case 21:
                return ((hyc) ((q33) v4Var.c(cls2))).v();
            case 22:
                ((ri4) v4Var.c(ri4.class)).e();
                return j4a.a;
            case 23:
                return ((jle) ((hle) v4Var.c(cls3))).b();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return Long.valueOf(((hyc) ((q33) v4Var.c(cls2))).t());
            case 25:
                return ((iba) v4Var.c(cls)).c();
            case 26:
                return new zxc(v4Var);
            case 27:
                return ((OneMeRoomDatabase) ((pfa) v4Var.c(pfa.class)).m()).X();
            case 28:
                return Long.valueOf(((hyc) ((q33) v4Var.c(cls2))).t());
            default:
                return ((jle) ((hle) v4Var.c(cls3))).a();
        }
    }
}
