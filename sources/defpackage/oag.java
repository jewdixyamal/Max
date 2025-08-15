package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.google.android.exoplayer2.ParserException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: oag  reason: default package */
public abstract class oag {
    public static final o97 a = new o97("DISK_USAGE", 1);
    public static final byte[] b = {48, 49, 53, 0};
    public static final byte[] c = {48, 49, 48, 0};
    public static final byte[] d = {48, 48, 57, 0};
    public static final byte[] e = {48, 48, 53, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 50, 0};

    public static void A(File file, File file2) {
        file.getClass();
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileNotFoundException(file.getAbsolutePath()) : new IOException(file2.getAbsolutePath());
            IOException iOException = new IOException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
            iOException.initCause(fileNotFoundException);
            throw iOException;
        }
    }

    public static b11 B(int i, ra4 ra4, yaf yaf) {
        b11 b2 = b11.b(ra4, yaf);
        while (true) {
            int i2 = b2.b;
            if (i2 == i) {
                return b2;
            }
            long j = b2.c + 8;
            if (j <= 2147483647L) {
                ra4.z((int) j);
                b2 = b11.b(ra4, yaf);
            } else {
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw ParserException.c(sb.toString());
            }
        }
    }

    public static final Object C(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, a66 a66) {
        Object obj;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            f8.c(2, a66);
            obj = a66.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            obj = new lb3(th, false);
        }
        tx3 tx3 = tx3.a;
        if (obj == tx3 || (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(obj)) == a97.b) {
            return tx3;
        }
        if (!(makeCompletingOnce$kotlinx_coroutines_core instanceof lb3)) {
            return a97.a(makeCompletingOnce$kotlinx_coroutines_core);
        }
        throw ((lb3) makeCompletingOnce$kotlinx_coroutines_core).a;
    }

    public static final List D(gi9 gi9) {
        return Collections.unmodifiableList(F(gi9));
    }

    public static final long[] E(gi9 gi9) {
        long[] jArr = new long[gi9.d];
        long[] jArr2 = gi9.b;
        long[] jArr3 = gi9.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            jArr[i2] = jArr2[(i << 3) + i4];
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jArr;
    }

    public static final ArrayList F(gi9 gi9) {
        ArrayList arrayList = new ArrayList(gi9.d);
        long[] jArr = gi9.b;
        long[] jArr2 = gi9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            arrayList.add(Long.valueOf(jArr[(i << 3) + i3]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public static final gi9 G(Collection collection) {
        gi9 gi9 = new gi9(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gi9.a(((Number) it.next()).longValue());
        }
        return gi9;
    }

    public static BiometricPrompt.CryptoObject H(a8g a8g) {
        IdentityCredential identityCredential;
        if (a8g == null) {
            return null;
        }
        Cipher cipher = (Cipher) a8g.b;
        if (cipher != null) {
            return tz3.b(cipher);
        }
        Signature signature = (Signature) a8g.a;
        if (signature != null) {
            return tz3.a(signature);
        }
        Mac mac = (Mac) a8g.c;
        if (mac != null) {
            return tz3.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) a8g.o) == null) {
            return null;
        }
        return uz3.a(identityCredential);
    }

    public static int I(Intent intent, int i) {
        boolean z = (33554432 & i) != 0;
        if (Build.VERSION.SDK_INT < 34) {
            return i;
        }
        String str = intent.getPackage();
        return ((str == null || str.length() == 0 || intent.getComponent() == null) && z) ? i | 16777216 : i;
    }

    public static final uc0 a(CharSequence charSequence, Long l) {
        long j = 0;
        if ((l == null || l.longValue() == 0) && charSequence == null) {
            return uc0.c;
        }
        if (l != null) {
            j = l.longValue();
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return new uc0(charSequence, j);
    }

    public static void b(CaptureRequest.Builder builder, ce3 ce3) {
        re6 u = wd6.w(ce3).u();
        for (aa0 aa0 : u.g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aa0.c;
            try {
                builder.set(key, u.h(aa0));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i, oq0 oq0) {
        Map map;
        if (i != 3 || !oq0.a) {
            if (i != 4) {
                oq0.getClass();
            } else if (oq0.b) {
                HashMap hashMap = new HashMap();
                hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                map = Collections.unmodifiableMap(hashMap);
            }
            map = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence != null ? charSequence.equals(charSequence2) : charSequence2 == null;
    }

    public static CaptureRequest e(kz1 kz1, CameraDevice cameraDevice, Map map, boolean z, oq0 oq0) {
        CaptureRequest.Builder builder;
        pv1 pv1;
        if (cameraDevice == null) {
            return null;
        }
        List<xf4> unmodifiableList = Collections.unmodifiableList(kz1.a);
        ArrayList arrayList = new ArrayList();
        for (xf4 xf4 : unmodifiableList) {
            Surface surface = (Surface) map.get(xf4);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = kz1.c;
        if (i == 5 && (pv1 = kz1.h) != null && (pv1.y() instanceof TotalCaptureResult)) {
            builder = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) pv1.y());
        } else if (i == 5) {
            builder = cameraDevice.createCaptureRequest(z ? 1 : 2);
        } else {
            builder = cameraDevice.createCaptureRequest(i);
        }
        c(builder, i, oq0);
        aa0 aa0 = kz1.k;
        Range range = vb0.f;
        ce3 ce3 = kz1.b;
        Range range2 = (Range) ce3.f(aa0, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Range range3 = (Range) ce3.f(aa0, range);
            Objects.requireNonNull(range3);
            builder.set(key, range3);
        }
        if (kz1.b() == 1 || kz1.c() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (kz1.b() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (kz1.c() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        aa0 aa02 = kz1.i;
        if (ce3.o(aa02)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) ce3.h(aa02));
        }
        aa0 aa03 = kz1.j;
        if (ce3.o(aa03)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ce3.h(aa03)).byteValue()));
        }
        b(builder, ce3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(kz1.g);
        return builder.build();
    }

    public static t6d f(String str, pag pag, r6d[] r6dArr) {
        if (!(!w9e.C0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!pag.equals(nae.e)) {
            bg4 bg4 = new bg4(str);
            return new t6d(str, pag, ((ArrayList) bg4.o).size(), ys.m0(r6dArr), bg4);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static boolean g(ra4 ra4) {
        yaf yaf = new yaf(8);
        int i = b11.b(ra4, yaf).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ra4.q(yaf.a, 0, 4, false);
        yaf.H(0);
        return yaf.h() == 1463899717;
    }

    public static final Object h(on5 on5, k56 k56, c66 c66, Continuation continuation, mn5[] mn5Arr) {
        x63 x63 = new x63(on5, k56, c66, (Continuation) null, mn5Arr);
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        Object C = C(scopeCoroutine, scopeCoroutine, x63);
        return C == tx3.a ? C : e5f.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a A[LOOP:1: B:10:0x005a->B:13:0x006c, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0035 A[LOOP:0: B:3:0x0035->B:6:0x0047, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(android.content.Context r3, defpackage.m7b r4) {
        /*
            r3.getResources()
            int r3 = defpackage.q6c.a
            p7b r4 = (defpackage.p7b) r4
            z7d r3 = r4.b
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f105reactionsmax
            r1 = 8
            long r1 = (long) r1
            long r0 = r3.q(r0, r1)
            int r3 = (int) r0
            defpackage.q6c.a = r3
            android.util.Size r3 = new android.util.Size
            r0 = 160(0xa0, float:2.24E-43)
            r3.<init>(r0, r0)
            defpackage.q6c.b = r3
            z7d r3 = r4.b
            r3.getClass()
            java.util.Set r3 = java.util.Collections.emptySet()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "REACTION_BADGE"
            boolean r4 = defpackage.eae.i0(r0, r4)
            if (r4 == 0) goto L_0x0035
        L_0x0049:
            int r3 = defpackage.q6c.a
            java.util.Set r3 = java.util.Collections.emptySet()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0056
            goto L_0x006e
        L_0x0056:
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r3.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "REACTION_SELECT_PANEL"
            boolean r4 = defpackage.eae.i0(r0, r4)
            if (r4 == 0) goto L_0x005a
        L_0x006e:
            int r3 = defpackage.q6c.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.i(android.content.Context, m7b):void");
    }

    public static final gi9 j(gi9 gi9) {
        gi9 gi92 = new gi9(gi9.d);
        long[] jArr = gi9.b;
        long[] jArr2 = gi9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            gi92.a(jArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return gi92;
    }

    public static a8g k() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b2 = sz3.b("androidxBiometric", 3);
            sz3.d(b2);
            sz3.e(b2);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            sz3.c(instance2, sz3.a(b2));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new a8g(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static l7 l(n99 n99) {
        long j;
        n99 n992 = n99;
        n992.k(4);
        int readUnsignedShort = n99.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            n992.k(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int j2 = n99.j();
                n992.k(4);
                j = n99.o();
                n992.k(4);
                if (1835365473 == j2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                n992.k((int) (j - n99.e()));
                n992.k(12);
                long o = n99.o();
                for (int i2 = 0; ((long) i2) < o; i2++) {
                    int j3 = n99.j();
                    long o2 = n99.o();
                    long o3 = n99.o();
                    if (1164798569 == j3 || 1701669481 == j3) {
                        return new l7(o2 + j, o3, 7);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final int m(int i) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i) != 0) ? i : i | 33554432;
    }

    public static final int n(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (z2) {
            z |= true;
        }
        if (z3) {
            z |= true;
        }
        if (z4) {
            z |= true;
        }
        if (z5) {
            z |= true;
        }
        boolean z11 = z | true;
        if (z6) {
            z11 = z | true;
        }
        if (z7) {
            z11 |= true;
        }
        if (z8) {
            z11 |= true;
        }
        if (z9) {
            z11 |= true;
        }
        if (z10) {
            z11 |= true;
        }
        if (!z11) {
            return -1;
        }
        return z11 ? 1 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fi6 o(javax.net.ssl.SSLSession r6) {
        /*
            nz4 r0 = defpackage.nz4.a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L_0x0090
            int r2 = r1.hashCode()
            r3 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r2 == r3) goto L_0x0020
            r3 = 1208658923(0x480aabeb, float:141999.67)
            if (r2 == r3) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
            goto L_0x0028
        L_0x0020:
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
        L_0x0028:
            qq9 r2 = defpackage.u13.t
            u13 r1 = r2.i(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L_0x0078
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0070
            awe r2 = defpackage.z04.w(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.util.List r3 = defpackage.naf.k(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r3 = r0
        L_0x0053:
            fi6 r4 = new fi6
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L_0x0066
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.security.cert.Certificate[] r6 = (java.security.cert.Certificate[]) r6
            java.util.List r0 = defpackage.naf.k(r6)
        L_0x0066:
            ie r6 = new ie
            r5 = 3
            r6.<init>((int) r5, (java.lang.Object) r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L_0x0070:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L_0x0078:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0084:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L_0x0090:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.o(javax.net.ssl.SSLSession):fi6");
    }

    public static final PendingIntent p(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, I(intent, m(134217728)));
    }

    public static final int q(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static ColorStateList r(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static final boolean s(int i, int i2) {
        return (i & i2) == i2;
    }

    public static boolean t(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean u(CharSequence charSequence) {
        return !t(charSequence);
    }

    public static String v(Collection collection) {
        if (collection == null) {
            return null;
        }
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StaticLayout w(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, zoe zoe) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(pag.m(zoe)).setBreakStrategy(0).setHyphenationFrequency(0).setIndents((int[]) null, (int[]) null);
        indents.setJustificationMode(0);
        indents.setUseLineSpacingFromFallbacks(false);
        return indents.build();
    }

    public static String x(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return "";
        }
        int length = charSequence.length() / 4;
        if (length == 0) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        sb.append(charSequence.subSequence(length, charSequence.length()));
        return sb.toString();
    }

    public static void y(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    String absolutePath = file.getAbsolutePath();
                    IOException iOException = new IOException(file.getAbsolutePath());
                    IOException iOException2 = new IOException(absolutePath);
                    iOException2.initCause(iOException);
                    throw iOException2;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(file.getAbsolutePath());
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [jy7, m99] */
    public static m99 z(FileInputStream fileInputStream) {
        bw4 bw4 = new bw4(fileInputStream);
        l7 l = l(bw4);
        bw4.k((int) (l.b - bw4.a));
        long j = l.c;
        ByteBuffer allocate = ByteBuffer.allocate((int) j);
        int read = fileInputStream.read(allocate.array());
        if (((long) read) == j) {
            ? jy7 = new jy7();
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            int position = allocate.position() + allocate.getInt(allocate.position());
            jy7.o = allocate;
            jy7.a = position;
            int i = position - allocate.getInt(position);
            jy7.b = i;
            jy7.c = ((ByteBuffer) jy7.o).getShort(i);
            return jy7;
        }
        throw new IOException("Needed " + j + " bytes, got " + read);
    }
}
