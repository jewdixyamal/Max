package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.concurrent.SingleCoreActivity;

/* renamed from: dd  reason: default package */
public final class dd implements pi4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public dd(je7 je7, je7 je72, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = je7;
                this.c = je72;
                this.d = new w7c(r0e.a(Collections.singletonList(new b54(ei4.b.incrementAndGet(), new iqe("Пуши заново"), woc.P1, (jqe) null, (fp3) null, 24))));
                return;
            default:
                long incrementAndGet = ei4.b.incrementAndGet();
                this.b = je7;
                this.c = je72;
                this.d = new w7c(r0e.a(Collections.singletonList(new b54(incrementAndGet, new iqe("Отправить аналитику"), woc.V, (jqe) null, (fp3) null, 24))));
                return;
        }
    }

    public final j0e c() {
        switch (this.a) {
            case 0:
                return (w7c) this.d;
            case 1:
                return (w7c) this.d;
            default:
                return (q0e) this.c;
        }
    }

    public final void d(b54 b54) {
        switch (this.a) {
            case 0:
                js7.g((js7) ((je7) this.c).getValue(), true, 2);
                wha wha = (wha) ((je7) this.b).getValue();
                wha.h("Логи отправлены");
                wha.i();
                return;
            case 1:
                gi9 gi9 = new gi9((Object) null);
                Iterator it = ((p82) ((je7) this.b).getValue()).x((un0) null).iterator();
                while (it.hasNext()) {
                    e52 e52 = (e52) it.next();
                    if (e52.b.m > 0) {
                        gi9.a(e52.a);
                    }
                }
                ((cea) ((je7) this.c).getValue()).g(gi9);
                return;
            default:
                Class<mqd> cls = mqd.class;
                hm9.m(cls.getName(), "switch", new Object[0]);
                Context context = (Context) this.b;
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName()), mqd.s(context) ? 2 : 1, 1);
                } catch (Throwable th) {
                    hm9.p(cls.getName(), "fail to update component state", th);
                }
                ((q0e) this.c).m((Object) null, e());
                wha wha2 = (wha) ((v4) this.d).c(wha.class);
                wha2.h("Перезапустите приложение");
                wha2.b("Для применения конфига перезапустите приложение");
                wha2.i();
                return;
        }
    }

    public List e() {
        SpannedString spannedString;
        boolean s = mqd.s((Context) this.b);
        long incrementAndGet = ei4.b.incrementAndGet();
        iqe iqe = new iqe("Включить single-core mode");
        if (s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            tpa.e(spannableStringBuilder, "включено‼️", new ForegroundColorSpan(-65536));
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            tpa.e(spannableStringBuilder2, "выключено", new ForegroundColorSpan(Color.parseColor("#4CAF50")));
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return Collections.singletonList(new b54(incrementAndGet, iqe, 0, new iqe(spannedString), new a54(s), 4));
    }

    public dd(v4 v4Var) {
        this.a = 2;
        this.d = v4Var;
        this.b = (Context) v4Var.c(Context.class);
        this.c = r0e.a(e());
    }
}
