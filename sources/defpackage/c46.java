package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Arrays;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* renamed from: c46  reason: default package */
public final class c46 implements lu6 {
    public static final khe c = new khe(new fh5(12));
    public static final khe d = new khe(new fh5(13));
    public final je7 a;
    public final je7 b;

    public c46(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(defpackage.qec r5, java.lang.String r6) {
        /*
            java.util.regex.Pattern r0 = r5.a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            r0 = 0
            boolean r0 = r6.find(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0017
        L_0x0010:
            qz7 r0 = new qz7
            r2 = 24
            r0.<init>((int) r2, (java.lang.Object) r6)
        L_0x0017:
            if (r0 == 0) goto L_0x0034
            java.lang.Object r6 = r0.c
            r08 r6 = (defpackage.r08) r6
            if (r6 != 0) goto L_0x0026
            r08 r6 = new r08
            r6.<init>((defpackage.qz7) r0)
            r0.c = r6
        L_0x0026:
            java.lang.Object r6 = r0.c
            r08 r6 = (defpackage.r08) r6
            if (r6 == 0) goto L_0x0034
            r0 = 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0035
        L_0x0034:
            r6 = r1
        L_0x0035:
            if (r6 == 0) goto L_0x0040
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0041
        L_0x0040:
            r6 = r1
        L_0x0041:
            if (r6 == 0) goto L_0x0048
            int r5 = r6.intValue()
            return r5
        L_0x0048:
            java.lang.Class<c46> r6 = defpackage.c46.class
            java.lang.String r6 = r6.getName()
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0053
            goto L_0x006c
        L_0x0053:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x006c
            us7 r2 = defpackage.us7.Z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't determine SVG size by regex "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.d(r2, r6, r5, r1)
        L_0x006c:
            r5 = 100
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c46.b(qec, java.lang.String):int");
    }

    /* JADX INFO: finally extract failed */
    public final l43 a(g05 g05, int i, pqb pqb, ju6 ju6) {
        Throwable th;
        Bitmap bitmap;
        Object obj;
        int i2 = i;
        v84 a2 = ((m5b) this.a.getValue()).b().a(i2);
        try {
            Object e0 = a2.e0();
            byte[] bArr = (byte[]) e0;
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
            byte[] bArr2 = (byte[]) e0;
            ((qq8) o43.o(g05.a).e0()).S(0, 0, i2, bArr2);
            String str = new String(bArr2, 0, i2, a52.a);
            v3c.i(a2, (Throwable) null);
            int b2 = b((qec) c.getValue(), str);
            int b3 = b((qec) d.getValue(), str);
            o43 c2 = ((s2b) this.b.getValue()).c(b2, b3, ju6.a);
            try {
                bitmap = (Bitmap) c2.e0();
                bitmap.eraseColor(0);
                obj = QrCodeGenerator.nativeRenderSvg(str, b2, b3);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                try {
                    throw th3;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    v3c.i(c2, th3);
                    throw th5;
                }
            }
            if (obj instanceof njc) {
                obj = null;
            }
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                bitmap.setPixels(iArr, 0, b2, 0, 0, b2, b3);
            }
            CloseableStaticBitmap of = CloseableStaticBitmap.of(c2, pqb, 0);
            v3c.i(c2, (Throwable) null);
            return of;
        } catch (Throwable th6) {
            Throwable th7 = th6;
            v3c.i(a2, th);
            throw th7;
        }
    }
}
