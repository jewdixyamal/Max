package defpackage;

import java.util.Locale;

/* renamed from: bc5  reason: default package */
public final /* synthetic */ class bc5 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bc5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public void accept(Object obj) {
        boolean z = this.c;
        long j = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 2:
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "markAsFavorite: failed for setId=" + j + " favorite=" + z, th);
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("md5", "markAsFavorite: failed for stickerId=" + j + " favorite=" + z, th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new sa3(1, new cc5((od5) obj, this.b, this.c, 0));
            case 1:
                return new qa3(((wc5) obj).a(), 2, new bc5(3, this.b, this.c));
            default:
                return new sa3(1, new cc5((fd5) obj, this.b, this.c, 1));
        }
    }
}
