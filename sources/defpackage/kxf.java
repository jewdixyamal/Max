package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kxf  reason: default package */
public final class kxf implements pa5 {
    public Object X;
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object o;

    public kxf(bwf bwf, c8d c8d, pl8 pl8, sl1 sl1, boolean z) {
        this.a = bwf;
        this.c = c8d;
        this.o = pl8;
        this.X = sl1;
        this.b = z;
    }

    public static String a(kxf kxf, String str) {
        kxf.getClass();
        byte[] decode = Base64.decode(str, 0);
        kxf.d().init(2, kxf.e(), new IvParameterSpec(ys.Z(0, decode, kxf.d().getBlockSize())));
        return new String(kxf.d().doFinal(ys.Z(kxf.d().getBlockSize(), decode, decode.length)), a52.a);
    }

    public yze B(int i, int i2) {
        ua8 ua8 = new ua8();
        if (i2 == 1) {
            ((ArrayList) this.c).add(ua8);
        } else if (i2 != 2) {
            ((ArrayList) this.o).add(ua8);
        } else {
            ((ArrayList) this.a).add(ua8);
        }
        return ua8;
    }

    public void J(v1d v1d) {
        this.X = v1d;
    }

    public String b(String str) {
        d().init(1, e());
        byte[] doFinal = d().doFinal(str.getBytes(a52.a));
        byte[] iv = d().getIV();
        byte[] bArr = new byte[(iv.length + doFinal.length)];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public void c() {
        ((a4c) this.o).log("Condition", "Condition # " + ((String) this.a) + " - 🔥 " + ((AtomicLong) this.X).incrementAndGet());
        synchronized (this) {
            try {
                if (!this.b) {
                    this.b = true;
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((a4c) this.o).log("Condition", "Condition # " + ((String) this.a) + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.X).incrementAndGet());
                        ((Runnable) pair.second).run();
                    }
                    ((ArrayList) this.c).clear();
                } else {
                    throw new IllegalStateException("Is already fired");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Cipher d() {
        return (Cipher) ((khe) this.X).getValue();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.security.KeyStore$Entry] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.crypto.SecretKey e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.o
            khe r0 = (defpackage.khe) r0
            java.lang.Object r0 = r0.getValue()
            java.security.KeyStore r0 = (java.security.KeyStore) r0
            java.lang.Object r1 = r4.a
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.security.KeyStore$Entry r0 = r0.getEntry(r1, r2)
            boolean r3 = r0 instanceof java.security.KeyStore.SecretKeyEntry
            if (r3 == 0) goto L_0x001a
            r2 = r0
            java.security.KeyStore$SecretKeyEntry r2 = (java.security.KeyStore.SecretKeyEntry) r2
        L_0x001a:
            if (r2 == 0) goto L_0x0022
            javax.crypto.SecretKey r0 = r2.getSecretKey()
            if (r0 != 0) goto L_0x0069
        L_0x0022:
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 3
            r0.<init>(r1, r2)
            java.lang.String r1 = "CBC"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r1)
            java.lang.String r1 = "PKCS7Padding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r1)
            boolean r4 = r4.b
            r1 = 1
            if (r4 == 0) goto L_0x004e
            r0.setUserAuthenticationRequired(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r4 < r2) goto L_0x0052
            r0.setUserAuthenticationParameters(120, 2)
            goto L_0x0052
        L_0x004e:
            r4 = 0
            r0.setUserAuthenticationRequired(r4)
        L_0x0052:
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setRandomizedEncryptionRequired(r1)
            android.security.keystore.KeyGenParameterSpec r4 = r4.build()
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            r0.init(r4)
            javax.crypto.SecretKey r0 = r0.generateKey()
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxf.e():javax.crypto.SecretKey");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v17, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(org.json.JSONObject r22) {
        /*
            r21 = this;
            r1 = r21
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r1.c
            r2 = r0
            c8d r2 = (defpackage.c8d) r2
            r2.getClass()
            r0 = r22
            l0f r0 = r2.j(r0)     // Catch:{ JSONException -> 0x0016 }
            goto L_0x0024
        L_0x0016:
            r0 = move-exception
            r4 = r0
            java.lang.Object r0 = r2.a
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r2 = "RoomPartsUpdateParser"
            java.lang.String r5 = "Room participants update parse error"
            r0.logException(r2, r5, r4)
            r0 = 0
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.Object r1 = r1.X
            sl1 r1 = (defpackage.sl1) r1
            kg1 r2 = r1.b
            fg1 r4 = r2.a
            bg1 r4 = r4.a
            java.lang.Object r5 = r0.X
            java.util.List r5 = (java.util.List) r5
            boolean r4 = defpackage.x53.c0(r5, r4)
            java.lang.Object r6 = r0.c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.o
            zad r7 = (defpackage.zad) r7
            r2.m(r7, r6)
            id1 r6 = r1.e
            java.lang.Object r8 = r0.Y
            eqa r8 = (defpackage.eqa) r8
            if (r8 == 0) goto L_0x006b
            java.util.List r9 = r8.a
            r2.g(r7, r9)
            java.util.List r8 = r8.b
            java.util.Iterator r8 = r8.iterator()
        L_0x0057:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x006b
            java.lang.Object r9 = r8.next()
            dg1 r9 = (defpackage.dg1) r9
            hqa r10 = r6.n
            bg1 r11 = r9.b
            r10.onStateChanged(r11, r9)
            goto L_0x0057
        L_0x006b:
            boolean r8 = r7 instanceof defpackage.yad
            va8 r9 = r1.c
            int r0 = r0.b
            if (r8 != 0) goto L_0x0076
            r21 = r5
            goto L_0x00b5
        L_0x0076:
            r11 = r7
            yad r11 = (defpackage.yad) r11
            pq9 r12 = new pq9
            r12.<init>()
            pq9 r13 = new pq9
            r13.<init>()
            pq9 r14 = new pq9
            r14.<init>()
            pq9 r15 = new pq9
            r15.<init>()
            pq9 r16 = new pq9
            r16.<init>()
            pq9 r18 = new pq9
            r18.<init>()
            pq9 r19 = new pq9
            r19.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            wmc r3 = new wmc
            r21 = r5
            r5 = 0
            r3.<init>(r10, r5)
            x30 r5 = new x30
            r20 = 1
            r10 = r5
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.m(r5)
        L_0x00b5:
            java.lang.String r3 = "get-rooms"
            java.lang.String r5 = "command"
            java.lang.String r10 = "Signaling is not ready or released"
            imc r11 = r1.g
            if (r4 == 0) goto L_0x012e
            zad r4 = r2.k
            boolean r4 = defpackage.tpa.f(r7, r4)
            if (r4 == 0) goto L_0x00c8
            goto L_0x012e
        L_0x00c8:
            zad r4 = r2.k
            boolean r4 = defpackage.tpa.f(r4, r7)
            if (r4 == 0) goto L_0x00d1
            goto L_0x00eb
        L_0x00d1:
            r2.n(r7)
            ebd r4 = r6.f
            nl1 r6 = new nl1
            boolean r12 = r7 instanceof defpackage.yad
            if (r12 == 0) goto L_0x00e4
            r12 = r7
            yad r12 = (defpackage.yad) r12
            tad r12 = r9.x(r12)
            goto L_0x00e5
        L_0x00e4:
            r12 = 0
        L_0x00e5:
            r6.<init>(r7, r12)
            r4.onCurrentParticipantActiveRoomChanged(r6)
        L_0x00eb:
            fg1 r4 = r2.a
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x012e
            om8 r4 = new om8
            r6 = 27
            r4.<init>(r6, r1)
            om8 r6 = new om8
            r12 = 28
            r6.<init>(r12, r1)
            java.lang.Object r12 = r11.c
            k56 r12 = (defpackage.k56) r12
            java.lang.Object r12 = r12.invoke()
            rod r12 = (defpackage.rod) r12
            if (r12 != 0) goto L_0x0116
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r10)
            r6.invoke(r3)
            goto L_0x0189
        L_0x0116:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            r10.put((java.lang.String) r5, (java.lang.Object) r3)
            hy0 r3 = new hy0
            r5 = 1
            r3.<init>(r11, r6, r4, r5)
            nt r4 = new nt
            r5 = 6
            r4.<init>(r11, r6, r5)
            r12.j(r10, r3, r4)
            goto L_0x0189
        L_0x012e:
            if (r8 == 0) goto L_0x0189
            r4 = r7
            yad r4 = (defpackage.yad) r4
            tad r4 = r9.x(r4)
            if (r4 == 0) goto L_0x0189
            bg1 r4 = r4.f
            if (r4 == 0) goto L_0x0189
            zad r6 = r2.k
            java.util.Map r6 = r2.d(r6)
            java.util.Set r6 = r6.keySet()
            boolean r4 = r6.contains(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0189
            om8 r4 = new om8
            r6 = 27
            r4.<init>(r6, r1)
            om8 r6 = new om8
            r12 = 28
            r6.<init>(r12, r1)
            java.lang.Object r12 = r11.c
            k56 r12 = (defpackage.k56) r12
            java.lang.Object r12 = r12.invoke()
            rod r12 = (defpackage.rod) r12
            if (r12 != 0) goto L_0x0172
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r10)
            r6.invoke(r3)
            goto L_0x0189
        L_0x0172:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            r10.put((java.lang.String) r5, (java.lang.Object) r3)
            hy0 r3 = new hy0
            r5 = 1
            r3.<init>(r11, r6, r4, r5)
            nt r4 = new nt
            r5 = 6
            r4.<init>(r11, r6, r5)
            r12.j(r10, r3, r4)
        L_0x0189:
            zad r3 = r2.k
            java.util.Map r3 = r2.d(r3)
            java.util.Set r3 = r3.keySet()
            int r3 = r3.size()
            int r3 = r3 + 1
            zad r2 = r2.k
            boolean r2 = defpackage.tpa.f(r7, r2)
            if (r2 == 0) goto L_0x01c4
            if (r0 == r3) goto L_0x01c4
            boolean r2 = r21.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x01c4
            w4d r2 = new w4d
            r3 = 15
            r2.<init>((int) r3, (java.lang.Object) r7)
            ey3 r3 = new ey3
            r4 = 1
            r3.<init>(r1, r4, r7)
            om8 r4 = new om8
            r5 = 26
            r4.<init>(r5, r1)
            h7b r1 = r1.f
            r1.w(r2, r3, r4)
        L_0x01c4:
            if (r8 == 0) goto L_0x0203
            r11 = r7
            yad r11 = (defpackage.yad) r11
            pq9 r12 = new pq9
            r12.<init>()
            pq9 r13 = new pq9
            r13.<init>()
            pq9 r14 = new pq9
            r14.<init>()
            pq9 r15 = new pq9
            r15.<init>()
            pq9 r16 = new pq9
            r16.<init>()
            pq9 r18 = new pq9
            r18.<init>()
            pq9 r19 = new pq9
            r19.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            wmc r1 = new wmc
            r2 = 0
            r1.<init>(r0, r2)
            x30 r0 = new x30
            r20 = 1
            r10 = r0
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.m(r0)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxf.f(org.json.JSONObject):void");
    }

    public void g(JSONObject jSONObject) {
        cbd cbd;
        if (this.b) {
            bwf bwf = (bwf) this.a;
            bwf.getClass();
            try {
                cbd = bwf.a(jSONObject);
            } catch (JSONException e) {
                ((a4c) bwf.a).logException("SessionRoomParser", "Can't parse room update notification", e);
                cbd = null;
            }
            if (cbd != null) {
                ((sl1) this.X).d(cbd);
            }
        }
    }

    public void h(JSONObject jSONObject) {
        hh2 hh2;
        if (this.b) {
            bwf bwf = (bwf) this.a;
            bwf.getClass();
            try {
                hh2 = bwf.f(jSONObject);
            } catch (JSONException e) {
                ((a4c) bwf.a).logException("SessionRoomParser", "Can't parse rooms update notification", e);
                hh2 = null;
            }
            if (hh2 != null) {
                sl1 sl1 = (sl1) this.X;
                sl1.getClass();
                for (cbd d : hh2.a) {
                    sl1.d(d);
                }
            }
        }
    }

    public a8g i(String str) {
        d().init(1, e());
        return new a8g(d());
    }

    public void w() {
        this.b = true;
    }

    public kxf(String str, a4c a4c) {
        this.b = false;
        this.c = new ArrayList();
        this.X = new AtomicLong();
        this.a = str;
        this.o = a4c;
    }

    public kxf(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = kxf.class.getName();
        this.o = new khe(new bse(19));
        this.X = new khe(new bse(20));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [lh4, java.lang.Object] */
    public kxf(ta8 ta8) {
        ta8 ta82 = ta8;
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        ta82.S(this);
        ? obj = new Object();
        while (true) {
            sa8 sa8 = ta82.b;
            sa4 sa4 = sa8.b;
            if (sa4 != null) {
                int g = ta82.a.g(sa4, obj);
                boolean z = this.b;
                if (z && ((v1d) this.X) != null) {
                    return;
                }
                if (g == 1) {
                    long j = obj.a;
                    Uri uri = sa8.a.getUri();
                    if (uri != null) {
                        sa8.close();
                        sa8.G(new a34(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j, -1, (String) null, 0, (Object) null));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (g == -1 && z) {
                    return;
                } else {
                    if (g == -1) {
                        throw new RuntimeException("Invalid media specified=" + ta82.c);
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }
}
