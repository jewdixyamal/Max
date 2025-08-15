package defpackage;

import java.util.Locale;

/* renamed from: lc5  reason: default package */
public final /* synthetic */ class lc5 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ lc5(sc5 sc5, long j, int i) {
        this.a = i;
        this.b = sc5;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        sc5 sc5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        sc5.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "onNotifUpdated: failed for id: " + j, th);
                sc5.f();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("sc5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker set "), j, " to cache"), th);
                sc5.f();
                return;
        }
    }
}
