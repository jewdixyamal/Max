package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g27  reason: default package */
public final /* synthetic */ class g27 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ g27(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        String str;
        boolean z = true;
        switch (this.a) {
            case 0:
                return ote.s(((TamErrorException) obj).a);
            case 1:
                return Boolean.valueOf(eae.o0((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 2:
                return new ef5(3, (String) ((Map.Entry) obj).getValue());
            case 3:
                return Boolean.valueOf(eae.o0((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                return new df5(3, -1, f46.Q((String) entry.getKey()), 0, (String) entry.getValue());
            case 5:
                pke pke = ((TamErrorException) obj).a;
                c67.E0.getClass();
                if (pke instanceof gke) {
                    String str2 = ((gke) pke).b;
                    return (tpa.f(str2, "service.unavailable") || tpa.f(str2, "service.timeout")) ? new h57(new eqe(yoc.R), new eqe(yoc.Q)) : new h57(new eqe(yoc.P), new eqe(yoc.O));
                }
                String str3 = pke.b;
                if (tpa.f(str3, "contact.not.found") || tpa.f(str3, "not.found")) {
                    return i57.a;
                }
                if (tpa.f(str3, "too.many.requests")) {
                    return j57.a;
                }
                String str4 = pke.o;
                return new g57((str4 == null || str4.length() == 0) ? new eqe(jpc.F) : new iqe(str4));
            case 6:
                return ((zp7) obj).b;
            case 7:
                ms7 ms7 = (ms7) obj;
                String str5 = ms7.d;
                return new ps7(1, 0, ms7, tpa.f(str5, "COLD_START") || tpa.f(str5, "WARM_START"));
            case 8:
                return obj.toString();
            case 9:
                return Long.toString(((Long) obj).longValue());
            case 10:
                Intent intent = (Intent) obj;
                return e5f.a;
            case 11:
                return new EnhancedAnimatedVectorDrawable((Context) obj, vca.b);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new EnhancedAnimatedVectorDrawable((Context) obj, vca.d);
            case 13:
                return Long.valueOf(((kn8) obj).a);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                uj3 uj3 = (uj3) obj;
                if (!uj3.Y && !i24.r(uj3) && uj3.k() == 0 && (!uj3.t() || !uj3.v())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((pxa) obj).c.toString();
            case 16:
                return ((pxa) obj).c.toString();
            case LangUtils.HASH_SEED /*17*/:
                return Boolean.valueOf(((View) obj).isClickable());
            case 18:
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 19:
                return new iw8((Context) obj);
            case 20:
                if (((hx8) obj).a.a != d6c.EMOJI) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                bc7[] bc7Arr = MessageWriteWidget.F0;
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 22:
                if (((gs8) obj) != gs8.Z) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                rw8 rw8 = (rw8) obj;
                return new sx9(rw8.c, rw8.e, rw8.i, ks4.MESSAGES_LIMIT);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                rw8 rw82 = (rw8) obj;
                return new sx9(rw82.c, rw82.e, rw82.i, ks4.NOTIFICATIONS_LIMIT);
            case 25:
                return Boolean.valueOf(((ql2) obj).f.isEmpty());
            case 26:
                return ((rw8) obj).l;
            case 27:
                dv9 dv9 = (dv9) obj;
                if (!dv9.b || (str = dv9.a) == null || str.length() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                return ((dx8) obj).b.b;
            default:
                if (((yq3) obj).a != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
