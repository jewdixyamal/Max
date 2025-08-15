package defpackage;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: vje  reason: default package */
public final class vje implements h06 {
    public final ArrayList X;
    public boolean Y = false;
    public final ArrayDeque a = new ArrayDeque();
    public final o9g b;
    public jc6 c;
    public yhc o;

    public vje(o9g o9g) {
        kq0.e();
        this.b = o9g;
        this.X = new ArrayList();
    }

    public final void a(ov6 ov6) {
        ju0.D().execute(new uje(this, 1));
    }

    public final void b() {
        kq0.e();
        Exception exc = new Exception("Camera is closed.", (Throwable) null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fc0 fc0 = (fc0) it.next();
            fc0.getClass();
            fc0.b.execute(new flc(fc0, 26, exc));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.X).iterator();
        while (it2.hasNext()) {
            yhc yhc = (yhc) it2.next();
            yhc.getClass();
            kq0.e();
            if (!yhc.d.b.isDone()) {
                kq0.e();
                yhc.g = true;
                bm7 bm7 = yhc.i;
                Objects.requireNonNull(bm7);
                bm7.cancel(true);
                yhc.e.d(exc);
                yhc.f.b((Object) null);
                kq0.e();
                fc0 fc02 = yhc.a;
                fc02.getClass();
                fc02.b.execute(new flc(fc02, 26, exc));
            }
        }
    }

    public final void c() {
        fc0 fc0;
        boolean z = false;
        kq0.e();
        if (this.o == null && !this.Y) {
            jc6 jc6 = this.c;
            jc6.getClass();
            kq0.e();
            if (((l84) jc6.c).A() != 0 && (fc0 = (fc0) this.a.poll()) != null) {
                yhc yhc = new yhc(fc0, this);
                c54.p((String) null, !(this.o != null));
                this.o = yhc;
                kq0.e();
                yhc.c.b.d(new uje(this, 0), ju0.k());
                this.X.add(yhc);
                kq0.e();
                yhc.d.b.d(new flc(this, 25, yhc), ju0.k());
                jc6 jc62 = this.c;
                kq0.e();
                oq1 oq1 = yhc.c;
                jc62.getClass();
                kq0.e();
                iz1 iz1 = (iz1) ((gu6) jc62.a).f(gu6.o, new iz1(Arrays.asList(new tz1[]{new tz1()})));
                Objects.requireNonNull(iz1);
                int i = jc6.Y;
                jc6.Y = i + 1;
                ArrayList arrayList = new ArrayList();
                String valueOf = String.valueOf(iz1.hashCode());
                List<tz1> list = iz1.a;
                Objects.requireNonNull(list);
                for (tz1 tz1 : list) {
                    u40 u40 = new u40();
                    kz1 kz1 = (kz1) jc62.b;
                    u40.c = kz1.c;
                    u40.c(kz1.b);
                    u40.a(fc0.i);
                    y90 y90 = (y90) jc62.X;
                    fw6 fw6 = y90.b;
                    Objects.requireNonNull(fw6);
                    ((HashSet) u40.e).add(fw6);
                    u40.a = y90.c != null ? true : z;
                    if (f46.V(y90.e)) {
                        if (((ImageCaptureRotationOptionQuirk) wi4.a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
                            aa0 aa0 = kz1.i;
                        } else {
                            ((mi9) u40.f).j(kz1.i, Integer.valueOf(fc0.f));
                        }
                        aa0 aa02 = kz1.j;
                        e1f.b(fc0.d, y90.d);
                        ((mi9) u40.f).j(aa02, Integer.valueOf(fc0.g));
                    }
                    u40.c(tz1.a.b);
                    ((ui9) u40.g).a.put(valueOf, 0);
                    ((ui9) u40.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
                    u40.b(y90.a);
                    arrayList.add(u40.d());
                    z = false;
                }
                h7b h7b = new h7b(arrayList, yhc, false, 10);
                x9b x9b = new x9b(iz1, fc0.d, fc0.f, fc0.g, fc0.e, yhc, oq1, i);
                jc6 jc63 = this.c;
                jc63.getClass();
                kq0.e();
                ((y90) jc63.X).j.accept(x9b);
                kq0.e();
                fu6 fu6 = (fu6) this.b.b;
                synchronized (fu6.q) {
                    try {
                        if (fu6.q.get() == null) {
                            fu6.q.set(Integer.valueOf(fu6.H()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                fu6 fu62 = (fu6) this.b.b;
                fu62.getClass();
                kq0.e();
                k12 K = kq0.K(fu62.d().i(arrayList, fu62.p, fu62.r), new re6(15, (Object) new mu1(6)), ju0.k());
                kq0.a(K, new bdb(this, h7b, false, 8), ju0.D());
                kq0.e();
                c54.p("CaptureRequestFuture can only be set once.", yhc.i == null);
                yhc.i = K;
            }
        }
    }
}
