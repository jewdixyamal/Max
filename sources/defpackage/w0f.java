package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: w0f  reason: default package */
public final class w0f {
    public final /* synthetic */ je7 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 d;
    public final /* synthetic */ je7 e;
    public final /* synthetic */ je7 f;
    public final /* synthetic */ je7 g;

    public w0f(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, khe khe) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = khe;
        this.f = je75;
        this.g = je76;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [e47, java.lang.Object] */
    public final void a(em5 em5) {
        ad adVar = (ad) this.a.getValue();
        zh3 b2 = ((gh3) this.b.getValue()).b();
        boolean d2 = ((ri4) this.c.getValue()).d();
        if (!adVar.a().c()) {
            ? obj = new Object();
            obj.c = "NET";
            obj.o = (String) em5.e;
            int i = em5.d;
            if (i != 0) {
                obj.a(Integer.valueOf(i), "sent");
            }
            long j = em5.c;
            if (j != 0) {
                obj.a(Long.valueOf(j), "respTime");
            }
            if (em5.b) {
                obj.a(Boolean.TRUE, "error");
            }
            String str = (String) em5.f;
            if (!oag.t(str)) {
                obj.a(str, "value");
            }
            obj.a(Boolean.valueOf(d2), "background");
            obj.a(b2.a(), "conn");
            adVar.j(obj.c());
        }
    }

    public final long b() {
        ((ri4) this.c.getValue()).getClass();
        return SystemClock.elapsedRealtime();
    }

    public final zh3 c() {
        return ((gh3) this.b.getValue()).b();
    }

    public final void d(String str) {
        ((cba) ((o45) this.d.getValue())).c(new Exception(str), true);
    }

    public final void e(Throwable th) {
        ((cba) ((o45) this.d.getValue())).c(new ExceptionHandler$HandledException((String) null, th, 1, "ONEME-11028"), true);
    }

    public final boolean f(String str, String str2) {
        qyc qyc = (qyc) ((cj0) ((af8) this.g.getValue())).c;
        qyc.getClass();
        int q = (int) qyc.q(PmsKey.f85minstickersize, (long) 432);
        int q2 = (int) qyc.q(PmsKey.f75maxstickersize, (long) 512);
        ph4 ph4 = j47.X;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int height = decodeFile.getHeight();
        int width = decodeFile.getWidth();
        if (height >= q && height <= q2 && width >= q && width <= q2) {
            return false;
        }
        Bitmap e0 = j47.e0(q, q2, decodeFile);
        int e2 = new c65(str).e(1, "Orientation");
        try {
            j47.h0(str2, e0, 100, Bitmap.CompressFormat.PNG);
            e0.recycle();
            decodeFile.recycle();
            c65 c65 = new c65(str2);
            c65.F("Orientation", String.valueOf(e2));
            c65.B();
            return true;
        } catch (Throwable th) {
            if (e0 != null) {
                e0.recycle();
            }
            decodeFile.recycle();
            throw th;
        }
    }
}
