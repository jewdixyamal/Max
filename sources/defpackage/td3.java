package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.Collections;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: td3  reason: default package */
public final class td3 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ td3(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r12v46, types: [die, java.lang.Object, o55] */
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                ztc ztc = (ztc) ((jle) ((hle) sd3.g.getValue())).e.getValue();
                return new Object();
            case 1:
                ztc ztc2 = (ztc) ((jle) ((hle) sd3.g.getValue())).d.getValue();
                return new Object();
            case 2:
                hle hle = (hle) sd3.g.getValue();
                hle.getClass();
                return new euc(((jle) hle).a());
            case 3:
                return new fuc((ztc) ((jle) ((hle) sd3.g.getValue())).h.getValue());
            case 4:
                return new p67(((w9a) ((kke) sd3.i.getValue())).b());
            case 5:
                return new o67(((w9a) ((kke) sd3.i.getValue())).b());
            case 6:
                khe d = v4Var.d(oq3.class);
                khe d2 = v4Var.d(xc4.class);
                khe d3 = v4Var.d(q33.class);
                return new yn3(v4Var.d(kke.class), v4Var.d(ds3.class), d2, v4Var.d(u7b.class), v4Var.d(w7b.class), d, v4Var.d(blb.class), d3, (rta) v4Var.c(rta.class), (Context) v4Var.c(Context.class), (tm3) v4Var.c(tm3.class));
            case 7:
                return new l67(v4Var.d(q33.class), v4Var.d(an9.class), v4Var.d(ad.class));
            case 8:
                return new a64(v4Var.a(b64.class));
            case 9:
                return new f64(v4Var.d(a64.class), new khe(new ot2(v4Var, 2)), v4Var.d(h64.class), v4Var.d(x54.class));
            case 10:
                return new d06(v4Var.d(q33.class), v4Var.d(ds3.class), v4Var.d(kz.class), v4Var.d(iy2.class), v4Var.d(cb6.class));
            case 11:
                return new vy5(v4Var);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                h7b h7b = new h7b(29, false);
                h7b.c = "legacy";
                h7b.b = new n5b(1048576, 2097152, new SparseIntArray(), -1);
                return new m5b(new bg7(h7b));
            case 13:
                return ((m5b) v4Var.c(m5b.class)).a();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jv6 jv6 = (jv6) v4Var.c(jv6.class);
                jv6.getClass();
                return new kv6(jv6);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Class<Context> cls = Context.class;
                Context context = (Context) v4Var.c(cls);
                khe d4 = v4Var.d(kk5.class);
                tk4 tk4 = new tk4(context);
                tk4.a = "fresco";
                tk4.b = new x24(2, d4);
                tk4.c = 314572800;
                tk4.d = 104857600;
                tk4.e = 52428800;
                uk4 uk4 = new uk4(tk4);
                jv6 jv62 = new jv6(context);
                jv62.f = new ble(v4Var.d(u2a.class));
                Class<m5b> cls2 = m5b.class;
                jv62.g = (m5b) v4Var.c(cls2);
                jv62.e = uk4;
                jv62.i = uk4;
                qz7 qz7 = new qz7(22, false);
                qz7.o(kp.c, d46.a, new c46(v4Var.d(cls2), v4Var.d(s2b.class)));
                qz7.o(fp3.c, cp7.a, new dp7((Context) v4Var.c(cls), ((w9a) ((kke) v4Var.c(kke.class))).c()));
                jv62.j = new va8(qz7);
                jv62.c = bp4.a;
                jv62.a = new o84(0);
                jv62.h = Collections.singleton(new vhc());
                khe d5 = v4Var.d(iba.class);
                ? obj = new Object();
                obj.a = d5;
                obj.b = new khe(new v36(obj, 0));
                obj.c = new khe(new v36(obj, 1));
                obj.o = new khe(new v36(obj, 2));
                new khe(new v36(obj, 3));
                jv62.d = obj;
                return jv62;
            case 16:
                v4Var.c(b46.class);
                return lv6.g();
            case LangUtils.HASH_SEED /*17*/:
                return ((lv6) v4Var.c(lv6.class)).f();
            case 18:
                return ((lv6) v4Var.c(lv6.class)).i();
            case 19:
                return ((lv6) v4Var.c(lv6.class)).h();
            case 20:
                return new xe6((Context) v4Var.c(Context.class), v4Var.d(iba.class), v4Var.d(y7d.class));
            case 21:
                return new ay6();
            case 22:
                return new xp((Context) v4Var.c(Context.class));
            case 23:
                return new cy6((Context) v4Var.c(Context.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return by6.a;
            case 25:
                return new eca(v4Var.d(zi5.class), v4Var.d(iv6.class), v4Var.d(m5b.class), v4Var.d(nob.class), v4Var.d(io0.class), v4Var.d(kke.class));
            case 26:
                return new j07(v4Var);
            case 27:
                return new nob((Context) v4Var.c(Context.class), v4Var.d(lv6.class), v4Var.d(io0.class));
            case 28:
                return new k67(v4Var.d(y7d.class), v4Var.d(q33.class), v4Var.d(l67.class));
            default:
                return new Object();
        }
    }
}
