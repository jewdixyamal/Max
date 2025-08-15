package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;

/* renamed from: jh2  reason: default package */
public final /* synthetic */ class jh2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ jh2(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        StackTraceElement[] stackTrace;
        e5f e5f = e5f.a;
        boolean z = true;
        long j = this.b;
        switch (this.a) {
            case 0:
                u82 u82 = (u82) obj;
                x82 x82 = u82.r;
                if (x82 == null) {
                    x82 = x82.g;
                }
                w82 a2 = x82.a();
                a2.c = j;
                u82.r = a2.a();
                return e5f;
            case 1:
                return Long.valueOf(j);
            case 2:
                if (((e52) obj).b.a != j) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                Context context = (Context) obj;
                int i = ActProfilePhoto.Y0;
                e52 e52 = (e52) ((jz2) ((iy2) ((y8a) ((ed3) vl.o.c.getValue())).getAccessor().c(iy2.class))).m(j).a.getValue();
                if (e52 != null) {
                    kk0 kk0 = kk0.c;
                    jk0 jk0 = jk0.a;
                    k92 k92 = e52.b;
                    k92.b(kk0, jk0);
                    String str = k92.i;
                    if (!oag.t(str)) {
                        ju0.t(str, kk0.X, jk0.b);
                    }
                    e6 e6Var = new e6(nu0.l(new c6(e52, 0)), e52.q());
                    Intent intent = new Intent(context, ActProfilePhoto.class);
                    intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", e6Var);
                    context.startActivity(intent);
                }
                return e5f;
            case 4:
                Context context2 = (Context) obj;
                int i2 = ActContactAvatars.h1;
                Intent intent2 = new Intent(context2, ActContactAvatars.class);
                intent2.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
                context2.startActivity(intent2);
                return e5f;
            case 5:
                return Boolean.valueOf(tpa.f(tpa.v((RLottieImageView) obj, wxb.tag_reaction_effects_view), Long.valueOf(j)));
            case 6:
                if (((gza) obj).a != j) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                urf urf = (urf) obj;
                int i3 = ThreadExecutorStuckException.a;
                StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
                sb.append(urf.a);
                sb.append("',\n\trunningThread='");
                String str2 = null;
                Thread thread = urf.d;
                String name = thread != null ? thread.getName() : null;
                if (name == null) {
                    name = "";
                }
                sb.append(name);
                long b2 = urf.b(j);
                int i4 = ft4.o;
                if (ft4.c(b2, z7.R(0, kt4.NANOSECONDS)) > 0) {
                    sb.append("',\n\texecutionTime=");
                    sb.append(ft4.e(b2));
                }
                long j2 = urf.c;
                long j3 = urf.b;
                if (!ft4.d(j2, j3)) {
                    j = j2;
                }
                long e = ft4.e(ft4.g(j, j3));
                if (e > 0) {
                    sb.append(",\n\tqueueTime=");
                    sb.append(e);
                }
                if (thread != Thread.currentThread()) {
                    sb.append(",\n\tstate=" + (thread != null ? thread.getState() : null));
                    sb.append(",\n\tlocked_stacktrace=\n");
                    if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (!eae.o0(stackTraceElement.getClassName(), "java.util.concurrent", false) && !eae.o0(stackTraceElement.getClassName(), "kotlinx.coroutines", false)) {
                                arrayList.add(stackTraceElement);
                            }
                        }
                        str2 = x53.n0(x53.y0(arrayList, 3), "\n\t\t\t", "\t\t", (String) null, (m56) null, 60);
                    }
                    sb.append(str2);
                }
                List list = urf.e;
                if (!list.isEmpty()) {
                    sb.append("\n\tsubmit_stacktrace=\n\t");
                    sb.append(x53.n0(x53.y0(list, 5), "\n\t\t", (String) null, (String) null, (m56) null, 62));
                }
                sb.append("\n)");
                return sb.toString();
        }
    }
}
