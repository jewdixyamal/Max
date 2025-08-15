package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.SparseBooleanArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oo0  reason: default package */
public final class oo0 implements vuc {
    public final Bitmap a;
    public int b;
    public final int c;
    public final int d;
    public final Serializable e;
    public final Object f;

    public oo0(String str, Bitmap bitmap) {
        this.a = bitmap;
        this.e = str;
        this.b = bitmap.getByteCount();
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        this.f = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public int a() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        defpackage.v3c.i(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.ContentResolver r2, android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L_0x001d
            android.graphics.Bitmap r1 = r1.a     // Catch:{ all -> 0x0016 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0016 }
            r0 = 100
            r1.compress(r3, r0, r2)     // Catch:{ all -> 0x0016 }
            r1 = 0
            defpackage.v3c.i(r2, r1)
            goto L_0x001d
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r3 = move-exception
            defpackage.v3c.i(r2, r1)
            throw r3
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo0.b(android.content.ContentResolver, android.net.Uri):void");
    }

    public Uri c() {
        return (Uri) this.f;
    }

    public String d() {
        return (String) this.e;
    }

    public Integer e() {
        return Integer.valueOf(this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        defpackage.v3c.i(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.File r3) {
        /*
            r2 = this;
            java.io.File r3 = r3.getAbsoluteFile()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            android.graphics.Bitmap r2 = r2.a     // Catch:{ all -> 0x0017 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0017 }
            r1 = 100
            r2.compress(r3, r1, r0)     // Catch:{ all -> 0x0017 }
            r2 = 0
            defpackage.v3c.i(r0, r2)
            return
        L_0x0017:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r3 = move-exception
            defpackage.v3c.i(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo0.f(java.io.File):void");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, c8d] */
    public c8d g() {
        ArrayList arrayList;
        int i;
        boolean z;
        int i2;
        char c2;
        float f2;
        int max;
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            int i3 = this.c;
            double d2 = -1.0d;
            if (i3 > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                if (height > i3) {
                    d2 = Math.sqrt(((double) i3) / ((double) height));
                }
            } else {
                int i4 = this.d;
                if (i4 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i4) {
                    d2 = ((double) i4) / ((double) max);
                }
            }
            int i5 = 0;
            Bitmap createScaledBitmap = d2 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d2), (int) Math.ceil(((double) bitmap.getHeight()) * d2), false);
            int width = createScaledBitmap.getWidth();
            int height2 = createScaledBitmap.getHeight();
            int[] iArr = new int[(width * height2)];
            createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            int i6 = this.b;
            ArrayList arrayList2 = (ArrayList) this.f;
            o23 o23 = new o23(iArr, i6, arrayList2.isEmpty() ? null : (npa[]) arrayList2.toArray(new npa[arrayList2.size()]));
            if (createScaledBitmap != bitmap) {
                createScaledBitmap.recycle();
            }
            ArrayList arrayList3 = (ArrayList) o23.c;
            ArrayList arrayList4 = (ArrayList) this.e;
            ? obj = new Object();
            obj.a = arrayList3;
            obj.c = new SparseBooleanArray();
            obj.b = new qpd(0);
            int size = arrayList3.size();
            int i7 = Integer.MIN_VALUE;
            opa opa = null;
            for (int i8 = 0; i8 < size; i8++) {
                opa opa2 = (opa) arrayList3.get(i8);
                int i9 = opa2.e;
                if (i9 > i7) {
                    opa = opa2;
                    i7 = i9;
                }
            }
            obj.o = opa;
            int size2 = arrayList4.size();
            int i10 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) obj.c;
                if (i10 < size2) {
                    bne bne = (bne) arrayList4.get(i10);
                    float[] fArr = bne.c;
                    int length = fArr.length;
                    boolean z2 = false;
                    float f3 = 0.0f;
                    for (int i11 = i5; i11 < length; i11++) {
                        float f4 = fArr[i11];
                        if (f4 > 0.0f) {
                            f3 += f4;
                        }
                    }
                    if (f3 != 0.0f) {
                        int length2 = fArr.length;
                        for (int i12 = i5; i12 < length2; i12++) {
                            float f5 = fArr[i12];
                            if (f5 > 0.0f) {
                                fArr[i12] = f5 / f3;
                            }
                        }
                    }
                    List list = (List) obj.a;
                    int size3 = list.size();
                    int i13 = i5;
                    float f6 = 0.0f;
                    opa opa3 = null;
                    while (i13 < size3) {
                        opa opa4 = (opa) list.get(i13);
                        float[] b2 = opa4.b();
                        float f7 = b2[1];
                        float[] fArr2 = bne.a;
                        if (f7 >= fArr2[i5] && f7 <= fArr2[2]) {
                            float f8 = b2[2];
                            float[] fArr3 = bne.b;
                            if (f8 >= fArr3[i5] && f8 <= fArr3[2]) {
                                if (!sparseBooleanArray.get(opa4.d)) {
                                    float[] b3 = opa4.b();
                                    opa opa5 = (opa) obj.o;
                                    if (opa5 != null) {
                                        i2 = opa5.e;
                                        arrayList = arrayList4;
                                    } else {
                                        arrayList = arrayList4;
                                        i2 = 1;
                                    }
                                    float[] fArr4 = bne.c;
                                    i = 0;
                                    float f9 = fArr4[0];
                                    if (f9 > 0.0f) {
                                        c2 = 1;
                                        f2 = (1.0f - Math.abs(b3[1] - fArr2[1])) * f9;
                                    } else {
                                        c2 = 1;
                                        f2 = 0.0f;
                                    }
                                    float f10 = fArr4[c2];
                                    float abs = f10 > 0.0f ? (1.0f - Math.abs(b3[2] - fArr3[c2])) * f10 : 0.0f;
                                    float f11 = fArr4[2];
                                    z = false;
                                    float f12 = f2 + abs + (f11 > 0.0f ? f11 * (((float) opa4.e) / ((float) i2)) : 0.0f);
                                    if (opa3 == null || f12 > f6) {
                                        f6 = f12;
                                        opa3 = opa4;
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    i = i5;
                                    z = false;
                                }
                                i13++;
                                z2 = z;
                                i5 = i;
                                arrayList4 = arrayList;
                            }
                        }
                        arrayList = arrayList4;
                        i = i5;
                        z = z2;
                        i13++;
                        z2 = z;
                        i5 = i;
                        arrayList4 = arrayList;
                    }
                    ArrayList arrayList5 = arrayList4;
                    int i14 = i5;
                    if (opa3 != null) {
                        sparseBooleanArray.append(opa3.d, true);
                    }
                    ((us) obj.b).put(bne, opa3);
                    i10++;
                    i5 = i14;
                    arrayList4 = arrayList5;
                } else {
                    sparseBooleanArray.clear();
                    return obj;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public Integer getHeight() {
        return Integer.valueOf(this.d);
    }

    public Integer getWidth() {
        return Integer.valueOf(this.c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public oo0(Bitmap bitmap, int i) {
        this(Environment.DIRECTORY_PICTURES, bitmap);
        switch (i) {
            case 1:
                ArrayList arrayList = new ArrayList();
                this.e = arrayList;
                this.b = 16;
                this.c = 12544;
                this.d = -1;
                ArrayList arrayList2 = new ArrayList();
                this.f = arrayList2;
                if (!bitmap.isRecycled()) {
                    arrayList2.add(c8d.Y);
                    this.a = bitmap;
                    arrayList.add(bne.d);
                    arrayList.add(bne.e);
                    arrayList.add(bne.f);
                    arrayList.add(bne.g);
                    arrayList.add(bne.h);
                    arrayList.add(bne.i);
                    return;
                }
                throw new IllegalArgumentException("Bitmap is not valid");
            default:
                return;
        }
    }
}
