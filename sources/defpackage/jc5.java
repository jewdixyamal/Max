package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: jc5  reason: default package */
public final /* synthetic */ class jc5 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ jc5(sc5 sc5, List list, int i) {
        this.a = i;
        this.b = sc5;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        sc5 sc5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        sc5.getClass();
        switch (i) {
            case 0:
                hm9.p("sc5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", new Object[]{list}), th);
                sc5.f();
                return;
            default:
                hm9.p("sc5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", new Object[]{list}), th);
                sc5.f();
                return;
        }
    }
}
