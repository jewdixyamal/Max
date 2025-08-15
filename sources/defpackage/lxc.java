package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lxc  reason: default package */
public final class lxc implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ lxc(int i) {
        this.a = i;
    }

    public final Object a(v4 v4Var) {
        v4 v4Var2 = v4Var;
        switch (this.a) {
            case 0:
                return new gb6((pk) v4Var2.c(pk.class), (av0) v4Var2.c(av0.class), (p82) v4Var2.c(p82.class));
            case 1:
                return new q6f(v4Var2.d(pk.class), v4Var2.d(hp.class), v4Var2.d(q33.class), v4Var2.d(y7d.class), v4Var2.d(qe5.class), v4Var2.d(p67.class), v4Var2.d(ie3.class));
            case 2:
                return new i6f(v4Var2.d(pk.class), v4Var2.d(hp.class), v4Var2.d(kke.class));
            case 3:
                return new t6f(v4Var2.d(pk.class), v4Var2.d(hp.class), v4Var2.d(kke.class));
            case 4:
                return new uba((Context) v4Var2.c(Context.class), (ida) v4Var2.c(ida.class));
            case 5:
                return ogd.a;
            case 6:
                return ghd.a;
            case 7:
                return new jqd(new iqe("Сброс UserSettings.SAFE_MODE"), gpc.t0, new fyc(v4Var2, 13));
            case 8:
                return new jid(0, v4Var2.d(qe5.class));
            case 9:
                return new e7d("Включить новый экран кэширования", PmsKey.f95newsettingsstoragescreenenabled, false);
            case 10:
                return new ie8(10);
            case 11:
                return tkd.b;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new dd(v4Var2);
            case 13:
                return oyd.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return r4e.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return i5e.a;
            case 16:
                return q6e.a;
            case LangUtils.HASH_SEED /*17*/:
                return a7e.a;
            case 18:
                return new e7d("Новый файловый загрузчик", PmsKey.f96newuploaderenabled, false);
            case 19:
                return new zve(new khe(bv3.x0), v4Var2.d(ct0.class), (w0f) v4Var2.c(w0f.class));
            case 20:
                return (qu7) v4Var2.c(xie.class);
            case 21:
                return new e7d("WebApp biometry", PmsKey.f132webappbiometryenabled, false);
            case 22:
                return new jid(1, v4Var2.d(q33.class));
            case 23:
                khe d = v4Var2.d(q33.class);
                return new hp7(new iqe("Полноэкранный режим веб-аппов"), new e09(0, (q33) d.getValue(), q33.class, "isWebAppFullscreen", "isWebAppFullscreen()Z", 0, 14), new om8(1, (q33) d.getValue(), q33.class, "setWebAppFullscreen", "setWebAppFullscreen(Z)V", 0, 21), woc.U1, 16);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new lyf(ja7.d, v4Var2.d(iwf.class), v4Var2.d(y83.class));
            case 25:
                return new s2g(ja7.d, v4Var2.d(iwf.class));
            case 26:
                return new xxf(v4Var2.d(iwf.class));
            case 27:
                return new f2g(ja7.d, v4Var2.d(iwf.class), v4Var2.d(y83.class));
            case 28:
                return new dxf(ja7.d, v4Var2.d(iwf.class), v4Var2.d(y83.class), v4Var2.d(y7d.class));
            default:
                return new e7d("Скачивание файла из мини-аппа", PmsKey.f56jsdownloaddelegate, false);
        }
    }
}
