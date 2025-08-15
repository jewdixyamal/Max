package defpackage;

import java.util.Locale;

/* renamed from: sef  reason: default package */
public final /* synthetic */ class sef implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lef b;

    public /* synthetic */ sef(lef lef, int i) {
        this.a = i;
        this.b = lef;
    }

    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        hm9.p("wef", "removeFromRepository: failed conversionData = " + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                qef qef = (qef) obj;
                lef lef = this.b;
                String str = lef.a;
                ref ref = lef.b;
                mqb mqb = ref.a;
                qef.getClass();
                xlc a2 = xlc.a(5, "SELECT * FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?");
                if (str == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str);
                }
                a2.j(2, (long) mqb.b);
                a2.h(3, (double) ref.b);
                a2.h(4, (double) ref.c);
                a2.j(5, ref.d ? 1 : 0);
                return new t28(new oef(qef, 1, a2));
            default:
                qef qef2 = (qef) obj;
                lef lef2 = this.b;
                String str2 = lef2.a;
                ref ref2 = lef2.b;
                mqb mqb2 = ref2.a;
                qef2.getClass();
                return new sa3(2, new pef(qef2, str2, mqb2, ref2.b, ref2.c, ref2.d));
        }
    }
}
