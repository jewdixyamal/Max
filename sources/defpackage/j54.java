package defpackage;

import android.graphics.Bitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j54  reason: default package */
public abstract class j54 extends rg4 {
    public final eab c;
    public final hab d;
    public final ju6 e;
    public boolean f;
    public final n87 g;
    public int h;
    public final /* synthetic */ k54 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j54(k54 k54, fi0 fi0, eab eab, boolean z, int i2) {
        super(fi0);
        this.i = k54;
        this.c = eab;
        oj0 oj0 = (oj0) eab;
        this.d = oj0.c;
        this.e = oj0.a.h;
        this.g = new n87(k54.b, new ui0((Object) this, (Object) k54, i2, 4));
        oj0.a(new i54(this, z));
    }

    public final void d() {
        p();
    }

    public final void f(Throwable th) {
        q(th);
    }

    public final void h(int i2, Object obj) {
        g05 g05 = (g05) obj;
        f46.I();
        boolean a = fi0.a(i2);
        eab eab = this.c;
        if (a) {
            if (g05 == null) {
                oj0 oj0 = (oj0) eab;
                tpa.f(oj0.Y.get("cached_value_found"), Boolean.TRUE);
                oj0.w0.v.getClass();
                q(new Exception("Encoded image is null."));
                return;
            } else if (!g05.e0()) {
                q(new Exception("Encoded image is not valid."));
                return;
            }
        }
        if (u(g05, i2)) {
            boolean l = fi0.l(i2, 4);
            if (a || l || ((oj0) eab).f()) {
                this.g.c();
            }
        }
    }

    public final void j(float f2) {
        super.j(f2 * 0.99f);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [dx6, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v8, types: [dx6, java.util.HashMap] */
    public final dx6 m(l43 l43, long j, pqb pqb, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        l43 l432 = l43;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        String str9 = null;
        if (!this.d.i(this.c, "DecodeProducer")) {
            return null;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(((hx6) pqb).b);
        String valueOf3 = String.valueOf(z);
        if (!(l432 == null || (extras = l43.getExtras()) == null || (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) == null)) {
            str9 = obj.toString();
        }
        boolean z2 = l432 instanceof CloseableStaticBitmap;
        Object obj2 = HasExtraData.KEY_NON_FATAL_DECODE_ERROR;
        String str10 = str9;
        if (z2) {
            Bitmap underlyingBitmap = ((CloseableStaticBitmap) l432).getUnderlyingBitmap();
            Bitmap bitmap = underlyingBitmap;
            String str11 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
            HashMap hashMap = new HashMap(8);
            hashMap.put("bitmapSize", str11);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str6);
            hashMap.put("imageFormat", str5);
            hashMap.put("requestedImageSize", str7);
            hashMap.put("sampleSize", str4);
            int byteCount = bitmap.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            hashMap.put("byteCount", sb.toString());
            if (str10 != null) {
                hashMap.put(obj2, str10);
            }
            return new HashMap(hashMap);
        }
        String str12 = str8;
        String str13 = str10;
        HashMap hashMap2 = new HashMap(7);
        hashMap2.put("queueTime", valueOf);
        hashMap2.put("hasGoodQuality", valueOf2);
        hashMap2.put("isFinal", valueOf3);
        hashMap2.put("encodedImageSize", str6);
        hashMap2.put("imageFormat", str5);
        hashMap2.put("requestedImageSize", str7);
        hashMap2.put("sampleSize", str12);
        if (str10 != null) {
            hashMap2.put(obj2, str10);
        }
        return new HashMap(hashMap2);
    }

    public abstract int n(g05 g05);

    public abstract hx6 o();

    public final void p() {
        s(true);
        this.b.c();
    }

    public final void q(Throwable th) {
        s(true);
        this.b.e(th);
    }

    public final l43 r(g05 g05, int i2, pqb pqb) {
        k54 k54 = this.i;
        k54.getClass();
        return k54.c.a(g05, i2, pqb, this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0029
            boolean r2 = r1.f     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0008
            goto L_0x0029
        L_0x0008:
            fi0 r2 = r1.b     // Catch:{ all -> 0x0026 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.i(r0)     // Catch:{ all -> 0x0026 }
            r2 = 1
            r1.f = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)
            n87 r2 = r1.g
            monitor-enter(r2)
            g05 r1 = r2.e     // Catch:{ all -> 0x0023 }
            r0 = 0
            r2.e = r0     // Catch:{ all -> 0x0023 }
            r0 = 0
            r2.f = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            defpackage.g05.d(r1)
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0029:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j54.s(boolean):void");
    }

    public final void t(g05 g05, l43 l43, int i2) {
        g05.o0();
        Integer valueOf = Integer.valueOf(g05.Y);
        oj0 oj0 = (oj0) this.c;
        oj0.putExtra(HasExtraData.KEY_ENCODED_WIDTH, valueOf);
        g05.o0();
        oj0.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(g05.Z));
        oj0.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(g05.o()));
        g05.o0();
        oj0.putExtra(HasExtraData.KEY_COLOR_SPACE, g05.u0);
        if (l43 instanceof CloseableStaticBitmap) {
            oj0.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) l43).getUnderlyingBitmap().getConfig()));
        }
        if (l43 != null) {
            l43.putExtras(oj0.Y);
        }
        oj0.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i2));
    }

    public abstract boolean u(g05 g05, int i2);
}
