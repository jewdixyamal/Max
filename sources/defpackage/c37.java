package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import androidx.work.WorkRequest;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: c37  reason: default package */
public abstract class c37 {
    public static Context a;
    public static Boolean b;
    public static final long[] c = {WorkRequest.MIN_BACKOFF_MILLIS, 15000};
    public static final float[][] d = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};
    public static final int[] e = {16843848};
    public static ruc f;
    public static boolean g;
    public static final /* synthetic */ int h = 0;
    public static volatile String i;

    public static void A(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void B(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final String C(String str) {
        return (str == null || str.length() == 0) ? "" : w9e.b1(w9e.K0(str, "https://max.ru/joincall/")).toString();
    }

    public static final String D(String str) {
        return (str == null || str.length() == 0) ? "" : wg0.i("https://max.ru/joincall/", str);
    }

    public static ffc E(float[] fArr, zw6 zw6) {
        ww6 ww6 = new ww6();
        for (int i2 = 0; i2 < zw6.size(); i2++) {
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, fArr, 0, (float[]) zw6.get(i2), 0);
            float f2 = fArr2[0];
            float f3 = fArr2[3];
            fArr2[0] = f2 / f3;
            fArr2[1] = fArr2[1] / f3;
            fArr2[2] = fArr2[2] / f3;
            fArr2[3] = 1.0f;
            ww6.d(fArr2);
        }
        return ww6.j();
    }

    public static String F(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static zt0 a(int i2, int i3, int i4) {
        zt0 sg3;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    return i2 != Integer.MAX_VALUE ? i3 == 1 ? new zt0(i2, (m56) null) : new sg3(i2, i3, (m56) null) : new zt0(Integer.MAX_VALUE, (m56) null);
                }
                sg3 = i3 == 1 ? new zt0(0, (m56) null) : new sg3(1, i3, (m56) null);
            } else if (i3 == 1) {
                return new sg3(1, 2, (m56) null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (i3 == 1) {
            e32.l.getClass();
            sg3 = new zt0(d32.b, (m56) null);
        } else {
            sg3 = new sg3(1, i3, (m56) null);
        }
        return sg3;
    }

    public static int b(int i2, double d2) {
        return (Double.hashCode(d2) + i2) * 31;
    }

    public static final kq1 c(r1a r1a) {
        return od2.g(new wpc(r1a, (Continuation) null));
    }

    public static final Long d(long j) {
        return new Long(j);
    }

    public static void e(j43 j43, l20 l20) {
        a8g a8g;
        if (l20.f()) {
            File l = ((y8a) vl.b()).h().l(l20.r);
            if (!l.exists()) {
                synchronized (j43) {
                    a8g = j43.o;
                }
                GifImage gifImage = (GifImage) a8g.a;
                if (gifImage != null) {
                    x10 x10 = l20.b;
                    Bitmap createBitmap = Bitmap.createBitmap(x10.c, x10.o, Bitmap.Config.ARGB_8888);
                    gifImage.d(0).g(x10.c, x10.o, createBitmap);
                    j47.i0(l.getAbsolutePath(), createBitmap, vl.o.a().b);
                    createBitmap.recycle();
                }
            }
        }
    }

    public static float[] f(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        fm9.e("Expecting 4 plane parameters", fArr2.length == 4);
        float f2 = fArr[0];
        float f3 = fArr3[0];
        float f4 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr3[1];
        float f7 = fArr2[1];
        float f8 = fArr[2];
        float f9 = fArr3[2];
        float f10 = fArr2[2];
        float f11 = ((f8 - f9) * f10) + ((f5 - f6) * f7) + ((f2 - f3) * f4);
        float f12 = fArr4[0] - f3;
        float f13 = fArr4[1] - f6;
        float f14 = fArr4[2] - f9;
        float f15 = f11 / ((f10 * f14) + ((f7 * f13) + (f4 * f12)));
        return new float[]{(f12 * f15) + f3, (f13 * f15) + f6, (f14 * f15) + f9, 1.0f};
    }

    public static lsd g(List list, int i2, int i3) {
        boolean z = true;
        fm9.e("inputWidth must be positive", i2 > 0);
        if (i3 <= 0) {
            z = false;
        }
        fm9.e("inputHeight must be positive", z);
        lsd lsd = new lsd(i2, i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            lsd = ((z18) list.get(i4)).d(lsd.a, lsd.b);
        }
        return lsd;
    }

    public static a20 h(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    public static String i(String str, Rect rect, y7d y7d) {
        String str2 = str;
        Rect rect2 = rect;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2, (BitmapFactory.Options) null);
        if (decodeFile != null) {
            int i2 = rect2.left;
            int i3 = rect2.top;
            int width = rect.width();
            int height = rect.height();
            hm9.m("c37", "cropImage: sourceWidth=%d, sourceHeight=%d, x=%d, y=%d, width=%d, height=%d", Integer.valueOf(decodeFile.getWidth()), Integer.valueOf(decodeFile.getHeight()), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(width), Integer.valueOf(height));
            if (i2 + width > decodeFile.getWidth() || i3 + height > decodeFile.getHeight()) {
                ((cba) ((y8a) vl.b()).g()).c(new Exception("wrong image crop params"), true);
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, i2, i3, width, height);
            if (createBitmap != decodeFile) {
                decodeFile.recycle();
            }
            qyc qyc = (qyc) y7d;
            qyc.getClass();
            int q = (int) qyc.q(PmsKey.f84minimagesidesize, (long) 64);
            if (createBitmap.getWidth() < q || createBitmap.getHeight() < q) {
                hm9.p("c37", "Crop width and height must be >= 64", (Throwable) null);
                Locale locale = Locale.ENGLISH;
                ((cba) ((y8a) vl.b()).g()).c(new Exception("Crop rect = " + rect2 + " doesn't fit. Crop width and height must be >= 64"), true);
                double d2 = (double) q;
                int max = Math.max((int) Math.ceil(d2 / ((double) createBitmap.getWidth())), (int) Math.ceil(d2 / ((double) createBitmap.getHeight())));
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth() * max, createBitmap.getHeight() * max, false);
                if (createScaledBitmap != createBitmap) {
                    createBitmap.recycle();
                }
                createBitmap = createScaledBitmap;
            }
            kk5 h2 = ((y8a) vl.b()).h();
            h2.getClass();
            File o = h2.o((String) null, "jpg");
            j47.i0(o.getAbsolutePath(), createBitmap, vl.o.a().b);
            return o.getAbsolutePath();
        }
        hm9.p("c37", "cropImage: failed, no file at path ".concat(str2), (Throwable) null);
        return null;
    }

    public static Object j(hg4 hg4, long j, Continuation continuation) {
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        e5f e5f = e5f.a;
        if (i2 <= 0) {
            return e5f;
        }
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        hg4.scheduleResumeAfterDelay(j, sy1);
        Object m = sy1.m();
        return m == tx3.a ? m : e5f;
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static glc l(l20 l20) {
        k20 k20 = l20.d;
        String str = l20.s;
        if (k20 != null && k20.a > 0) {
            String str2 = k20.h;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return new glc(str2, 13);
            }
        }
        File file = !TextUtils.isEmpty(str) ? new File(str) : null;
        if (file != null) {
            boolean exists = file.exists();
            if (!exists && (k20 == null || k20.a == 0)) {
                return new glc(Boolean.TRUE);
            }
            if (exists) {
                return new glc(file);
            }
        }
        if (k20 != null) {
            File s = ((y8a) vl.b()).h().s(k20.a);
            if (s.exists()) {
                return new glc(s);
            }
        }
        return new glc(Boolean.FALSE);
    }

    public static String m(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String next : queryParameterNames) {
            if (next.equals(ApiProtocol.KEY_TOKEN)) {
                clearQuery.appendQueryParameter(next, "<HIDDEN>");
            } else {
                clearQuery.appendQueryParameter(next, parse.getQueryParameter(next));
            }
        }
        return clearQuery.build().toString();
    }

    public static String n(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ApiProtocol.PARAM_JOIN_LINK)) {
                jSONObject.put(ApiProtocol.PARAM_JOIN_LINK, (Object) "<HIDDEN>");
            }
            if (jSONObject.has("conversation")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                if (jSONObject2.has(ApiProtocol.PARAM_JOIN_LINK)) {
                    jSONObject2.put(ApiProtocol.PARAM_JOIN_LINK, (Object) "<HIDDEN>");
                }
            }
            if (jSONObject.has(ApiProtocol.KEY_ENDPOINT)) {
                jSONObject.put(ApiProtocol.KEY_ENDPOINT, (Object) m(jSONObject.getString(ApiProtocol.KEY_ENDPOINT)));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089 A[SYNTHETIC, Splitter:B:20:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap o(android.net.Uri r15) {
        /*
            java.lang.String r0 = "r"
            vl r1 = defpackage.vl.o
            android.content.ContentResolver r1 = r1.getContentResolver()
            r2 = 1
            r3 = 0
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            ph4 r6 = defpackage.j47.X     // Catch:{ IOException -> 0x007d }
            c65 r6 = new c65     // Catch:{ IOException -> 0x007d }
            r6.<init>((java.io.FileDescriptor) r5)     // Catch:{ IOException -> 0x007d }
            java.lang.String r5 = "Orientation"
            int r5 = r6.e(r2, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Point r6 = defpackage.j47.D(r6, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x007d }
            r7.<init>()     // Catch:{ IOException -> 0x007d }
            r8 = 2048(0x800, float:2.87E-42)
            int r6 = defpackage.j47.I(r6, r8, r8)     // Catch:{ IOException -> 0x007d }
            r7.inSampleSize = r6     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r7)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            int r1 = defpackage.j47.K(r5)     // Catch:{ IOException -> 0x007d }
            if (r1 != 0) goto L_0x0059
            defpackage.s5c.m(r4)
            r3 = r0
            goto L_0x00c1
        L_0x0059:
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ IOException -> 0x007d }
            r13.<init>()     // Catch:{ IOException -> 0x007d }
            float r1 = (float) r1     // Catch:{ IOException -> 0x007d }
            r13.setRotate(r1)     // Catch:{ IOException -> 0x007d }
            int r11 = r0.getWidth()     // Catch:{ IOException -> 0x007d }
            int r12 = r0.getHeight()     // Catch:{ IOException -> 0x007d }
            r10 = 0
            r14 = 1
            r9 = 0
            r8 = r0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x007d }
            r0.recycle()     // Catch:{ IOException -> 0x007d }
            defpackage.s5c.m(r4)
            r3 = r1
            goto L_0x00c1
        L_0x007a:
            r15 = move-exception
            r3 = r4
            goto L_0x00c2
        L_0x007d:
            r0 = move-exception
            goto L_0x0083
        L_0x007f:
            r15 = move-exception
            goto L_0x00c2
        L_0x0081:
            r0 = move-exception
            r4 = r3
        L_0x0083:
            boolean r1 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "c37"
            if (r1 == 0) goto L_0x00bb
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x007a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a6 }
            r0.<init>(r15)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "file by path %s not exists"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x00a6 }
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)     // Catch:{ all -> 0x00a6 }
            defpackage.hm9.k0(r5, r3, r0, r15)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r15 = move-exception
            goto L_0x00b2
        L_0x00a8:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00a6 }
            r0.<init>()     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r15, r0)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "getBitmapFromExternalStorage fail"
            defpackage.hm9.l0(r5, r0, r15)     // Catch:{ all -> 0x007a }
        L_0x00b7:
            defpackage.s5c.m(r4)
            goto L_0x00c1
        L_0x00bb:
            java.lang.String r15 = "getBitmapFromPath: failed to get bitmap"
            defpackage.hm9.p(r5, r15, r0)     // Catch:{ all -> 0x007a }
            goto L_0x00b7
        L_0x00c1:
            return r3
        L_0x00c2:
            defpackage.s5c.m(r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c37.o(android.net.Uri):android.graphics.Bitmap");
    }

    public static final Uri p(Cursor cursor, int i2) {
        Object obj;
        try {
            obj = cursor.getString(i2);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = null;
        }
        String str = (String) obj;
        if (!(str == null || str.length() == 0)) {
            try {
                if (pag.l(str)) {
                    return j47.N(str);
                }
                return null;
            } catch (Throwable th2) {
                hm9.l0("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            }
        }
        return null;
    }

    public static final String q() {
        String str = i;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        i = processName;
        return processName;
    }

    public static cm4 r(long j, Runnable runnable, lx3 lx3) {
        return qa4.a.invokeOnTimeout(j, runnable, lx3);
    }

    public static boolean s(float[] fArr, float[] fArr2) {
        fm9.e("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static void t(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [pde, java.lang.Object, jde] */
    public static jde u(jde jde) {
        if ((jde instanceof pde) || (jde instanceof ode)) {
            return jde;
        }
        if (jde instanceof Serializable) {
            return new ode(jde);
        }
        ? obj = new Object();
        obj.a = jde;
        return obj;
    }

    public static int v(byte[] bArr, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i2 += i3 - 1;
            i4 = -1;
        } else {
            i4 = 1;
        }
        byte b2 = 0;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                return b2;
            }
            b2 = (bArr[i2] & 255) | (b2 << 8);
            i2 += i4;
            i3 = i5;
        }
    }

    public static rx5 w(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), k3c.FontFamily);
                String string = obtainAttributes.getString(k3c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(k3c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(k3c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(k3c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(k3c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(k3c.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(k3c.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), k3c.FontFamilyFont);
                                int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(k3c.FontFamilyFont_fontWeight) ? k3c.FontFamilyFont_fontWeight : k3c.FontFamilyFont_android_fontWeight, HttpStatus.SC_BAD_REQUEST);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(k3c.FontFamilyFont_fontStyle) ? k3c.FontFamilyFont_fontStyle : k3c.FontFamilyFont_android_fontStyle, 0);
                                int i3 = obtainAttributes2.hasValue(k3c.FontFamilyFont_ttcIndex) ? k3c.FontFamilyFont_ttcIndex : k3c.FontFamilyFont_android_ttcIndex;
                                String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(k3c.FontFamilyFont_fontVariationSettings) ? k3c.FontFamilyFont_fontVariationSettings : k3c.FontFamilyFont_android_fontVariationSettings);
                                int i4 = obtainAttributes2.getInt(i3, 0);
                                int i5 = obtainAttributes2.hasValue(k3c.FontFamilyFont_font) ? k3c.FontFamilyFont_font : k3c.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                                String string6 = obtainAttributes2.getString(i5);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    A(xmlResourceParser);
                                }
                                arrayList.add(new tx5(i2, i4, resourceId2, string6, string5, z));
                            } else {
                                A(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new sx5((tx5[]) arrayList.toArray(new tx5[0]));
                }
                while (xmlResourceParser.next() != 3) {
                    A(xmlResourceParser);
                }
                return new ux5(new bg4(string, string2, string3, x(resources2, resourceId)), integer, integer2, string4);
            }
            A(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List x(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (qx5.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void y(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(z7b.h(15, i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void z(View view, float f2) {
        int integer = view.getResources().getInteger(jyb.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, tsb.state_liftable, -tsb.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f2}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
