package defpackage;

import java.util.Locale;

/* renamed from: jd5  reason: default package */
public final /* synthetic */ class jd5 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ jd5(md5 md5, long j, int i) {
        this.a = i;
        this.b = md5;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        md5 md5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        md5.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                hm9.p("md5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker "), j, " to cache"), th);
                md5.c();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("md5", "onNotifUpdated: failed for id: " + j, th);
                md5.c();
                return;
        }
    }
}
