package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jab  reason: default package */
public final /* synthetic */ class jab implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kab b;

    public /* synthetic */ jab(kab kab, int i) {
        this.a = i;
        this.b = kab;
    }

    public final Object invoke() {
        kab kab = this.b;
        switch (this.a) {
            case 0:
                f46.I();
                return new r9((dab) kab.p.getValue(), 1);
            case 1:
                f46.I();
                return new r9((dab) kab.u.getValue(), 1);
            case 2:
                f46.I();
                return kab.h((dab) kab.r.getValue());
            case 3:
                f46.I();
                aab aab = kab.e;
                kab.b.getClass();
                return new sse((dab) kab.r.getValue(), aab, 0);
            case 4:
                f46.I();
                kab.b.getClass();
                return new r9((dab) kab.p.getValue(), 2);
            case 5:
                f46.I();
                return kab.j(kab.c);
            case 6:
                f46.I();
                kab.b.getClass();
                return new r9((dab) kab.t.getValue(), 2);
            case 7:
                f46.I();
                aab aab2 = kab.e;
                gab gab = kab.b;
                return new sse(kab.k(new j24(gab.j.h(), gab.k, 1)), aab2, 0);
            case 8:
                f46.I();
                aab aab3 = kab.e;
                gab gab2 = kab.b;
                return new sse(kab.k(new zo7(gab2.j.h(), gab2.k, gab2.a, 0)), aab3, 0);
            case 9:
                gab gab3 = kab.b;
                j24 j24 = new j24(gab3.j.h(), gab3.k, 1);
                gab gab4 = kab.b;
                return kab.i(j24, new nte[]{new gp7(gab4.j.j(), gab4.k, gab4.a)});
            case 10:
                gab gab5 = kab.b;
                return kab.g(new tq7(gab5.j.h(), gab5.a, 1));
            case 11:
                gab gab6 = kab.b;
                ExecutorService h = gab6.j.h();
                ContentResolver contentResolver = gab6.a;
                y7g y7g = gab6.k;
                zo7 zo7 = new zo7(h, y7g, contentResolver, 0);
                o55 o55 = gab6.j;
                return kab.i(zo7, new nte[]{new ap7(o55.h(), y7g, gab6.a), new gp7(o55.j(), y7g, gab6.a)});
            case Protos.Attaches.Attach.PRESENT /*12*/:
                gab gab7 = kab.b;
                return kab.g(new tq7(gab7.j.d(), gab7.a, 0));
            case 13:
                gab gab8 = kab.b;
                zo7 zo72 = new zo7(gab8.j.h(), gab8.k, gab8.a, 1);
                gab gab9 = kab.b;
                return kab.i(zo72, new nte[]{new gp7(gab9.j.j(), gab9.k, gab9.a)});
            case Protos.Attaches.Attach.LOCATION /*14*/:
                gab gab10 = kab.b;
                so7 so7 = new so7(gab10.j.h(), gab10.k, gab10.b, 1);
                gab gab11 = kab.b;
                return kab.i(so7, new nte[]{new gp7(gab11.j.j(), gab11.k, gab11.a)});
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                gab gab12 = kab.b;
                so7 so72 = new so7(gab12.j.h(), gab12.k, gab12.c, 0);
                gab gab13 = kab.b;
                return kab.i(so72, new nte[]{new gp7(gab13.j.j(), gab13.k, gab13.a)});
            case 16:
                gab gab14 = kab.b;
                gab14.getClass();
                return kab.h(gab14.b(new r9(new j24(qq1.a, gab14.k, 0), 0), true, kab.h));
            default:
                f46.I();
                return new r9((dab) kab.t.getValue(), 1);
        }
    }
}
