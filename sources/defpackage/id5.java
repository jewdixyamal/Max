package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: id5  reason: default package */
public final /* synthetic */ class id5 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ id5(md5 md5, List list, int i) {
        this.a = i;
        this.b = md5;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        md5 md5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        md5.getClass();
        switch (i) {
            case 0:
                hm9.p("md5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", new Object[]{list}), th);
                md5.c();
                return;
            default:
                hm9.p("md5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", new Object[]{list}), th);
                md5.c();
                return;
        }
    }
}
