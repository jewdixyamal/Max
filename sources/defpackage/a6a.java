package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.NativeLibraryLoader;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.FfmpegLibraryLoader;
import one.me.sdk.media.ffmpeg.WebmConfig;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a6a  reason: default package */
public final class a6a extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ a6a(int i) {
        this.b = i;
    }

    public final Object b(v4 v4Var) {
        Class<ada> cls = ada.class;
        Class<o45> cls2 = o45.class;
        Class<u2a> cls3 = u2a.class;
        Class<x6a> cls4 = x6a.class;
        Class<p7b> cls5 = p7b.class;
        Class<p82> cls6 = p82.class;
        Class<el3> cls7 = el3.class;
        Class<y7d> cls8 = y7d.class;
        Class<cz4> cls9 = cz4.class;
        Class<kke> cls10 = kke.class;
        Class<Context> cls11 = Context.class;
        switch (this.b) {
            case 0:
                return new hda((Context) v4Var.c(cls11), v4Var.d(gj.class), v4Var.d(cls10), v4Var.d(cls9), v4Var.d(ds3.class), v4Var.d(cls8));
            case 1:
                return new rba((Context) v4Var.c(cls11));
            case 2:
                return new cea(v4Var.d(bea.class), v4Var.d(vr7.class), v4Var.d(and.class), v4Var.d(o44.class));
            case 3:
                ((x6a) v4Var.c(cls4)).getClass();
                return new kk5((Context) v4Var.c(cls11));
            case 4:
                return new ada((Context) v4Var.c(cls11), (o45) v4Var.c(cls2), (kk5) v4Var.c(kk5.class), (y7d) v4Var.c(cls8), (f6a) v4Var.c(f6a.class), (uuc) v4Var.c(uuc.class), (kke) v4Var.c(cls10));
            case 5:
                return (af8) v4Var.c(cls);
            case 6:
                return (cj0) v4Var.c(cls);
            case 7:
                return new c6a(v4Var);
            case 8:
                return new f6a(v4Var);
            case 9:
                ue5.a.getClass();
                return ob6.o;
            case 10:
                return new Object();
            case 11:
                ri4 ri4 = (ri4) v4Var.c(ri4.class);
                t2a a = ((u2a) v4Var.c(cls3)).a();
                a.c.clear();
                qyc qyc = (qyc) ((y7d) v4Var.c(cls8));
                qyc.getClass();
                if (v44.a((int) qyc.q(PmsKey.f28debugmode, (long) 0)) != v44.DISABLED) {
                    a.d.add(new ur0(1, "k5c"));
                } else {
                    ri4.e();
                }
                return new k5c(new u2a(a));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new hq6(new qd(new khe(new ot2(v4Var, 8)), (w0f) v4Var.c(w0f.class)));
            case 13:
                return new ame(new khe(new ot2(v4Var, 9)));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new oke(v4Var.d(fme.class), v4Var.d(ame.class), v4Var.d(m7b.class), v4Var.d(zi5.class), v4Var.d(hle.class), v4Var.d(cls2), v4Var.d(gh3.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((xe6) ((u8e) v4Var.c(u8e.class))).a();
                Context context = (Context) v4Var.c(cls11);
                khe d = v4Var.d(oke.class);
                khe d2 = v4Var.d(vx4.class);
                v4Var.d(v7g.class);
                return new ay4(d, d2);
            case 16:
                return new wx4(v4Var.d(cls9), v4Var.d(ji.class));
            case LangUtils.HASH_SEED /*17*/:
                return new cz4((Context) v4Var.c(cls11), v4Var.d(cls10));
            case 18:
                return new g6a(v4Var);
            case 19:
                return (lx4) v4Var.c(cls9);
            case 20:
                return lz7.q((Context) v4Var.c(cls11));
            case 21:
                return new RLottie.Config((Context) v4Var.c(cls11), true, NativeLibraryLoader.Companion.getDefault(), 0.0f, new ob6(14), 8, (z84) null);
            case 22:
                return new WebmConfig.Config((FfmpegLibraryLoader) null, new kj6(14), 1, (z84) null);
            case 23:
                return new jm9((Context) v4Var.c(cls11), new khe(new ot2(v4Var, 10)), new aea((je7) v4Var.d(cls3)), new gaa((Object) v4Var), Runtime.getRuntime().availableProcessors(), new w4d(v4Var), new ot2(v4Var, 12));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                int i = jpc.a0;
                int i2 = jpc.r;
                return new Object();
            case 25:
                Context context2 = (Context) v4Var.c(cls11);
                return new iu6((p7b) v4Var.c(cls5), v4Var.d(cls6), v4Var.d(cls7), v4Var.d(iba.class));
            case 26:
                return new vl((Application) v4Var.c(Application.class), v4Var.d(cls5), new khe(bv3.t0), (x6a) v4Var.c(cls4));
            case 27:
                return new ee3(new bg4(v4Var, v4Var.d(t6b.class), v4Var.d(cls7), v4Var.d(cls6), v4Var.d(tme.class)));
            case 28:
                return new cba(v4Var.d(uca.class), v4Var.d(xie.class), (kke) v4Var.c(cls10));
            default:
                return x6a.a;
        }
    }
}
