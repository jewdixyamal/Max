package defpackage;

import java.util.Locale;

/* renamed from: uef  reason: default package */
public final /* synthetic */ class uef implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kef b;

    public /* synthetic */ uef(kef kef, int i) {
        this.a = i;
        this.b = kef;
    }

    public void accept(Object obj) {
        kef kef = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                Locale locale = Locale.ENGLISH;
                hm9.p("wef", "putConversionInRepository: failed, videoConversion=" + kef, th);
                return;
            default:
                kj6.r(kef.d);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, nef] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, mef] */
    public Object apply(Object obj) {
        qef qef = (qef) obj;
        kef kef = this.b;
        mef mef = null;
        if (kef != null) {
            ? obj2 = new Object();
            lef lef = kef.a;
            if (lef != null) {
                ? obj3 = new Object();
                obj3.a = lef.a;
                ref ref = lef.b;
                obj3.b = ref.a;
                obj3.c = ref.b;
                obj3.d = ref.c;
                obj3.e = ref.d;
                mef = obj3;
            }
            obj2.a = mef;
            obj2.c = kef.c;
            obj2.d = kef.d;
            obj2.b = kef.b;
            mef = obj2;
        }
        qef.getClass();
        return new sa3(2, new oef(qef, 0, mef));
    }
}
